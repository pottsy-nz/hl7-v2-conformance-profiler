package au.gov.digitalhealth.hl7v2;

import au.gov.digitalhealth.hl7v2.ProfileValidator;
import au.gov.digitalhealth.net.RestClient;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.AbstractGroup;
import ca.uhn.hl7v2.model.AbstractSegment;
import ca.uhn.hl7v2.model.Varies;
import ca.uhn.hl7v2.model.AbstractMessage;
import ca.uhn.hl7v2.model.primitive.ID;
import ca.uhn.hl7v2.conf.check.ProfileNotFollowedException;
import ca.uhn.hl7v2.conf.parser.ProfileParser;
import ca.uhn.hl7v2.conf.spec.RuntimeProfile;
import ca.uhn.hl7v2.conf.store.ProfileCodeStore;
import ca.uhn.hl7v2.parser.Parser;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.parser.CustomModelClassFactory;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.BasicConfigurator;

import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ConformanceProfiler {
    // Define a static logger variable so that it references 
    static Logger logger = Logger.getLogger(ConformanceProfiler.class);

    public static void printUsage() {
        logger.info("Usage: java ConformanceProfiler hl7.<version>.<message-type>.<event-type>");
        logger.info(
                "e.g. java -cp \"target/hl7v2-1.1-SNAPSHOT.jar;target/dependency/*\" au.gov.digitalhealth.hl7v2.ConformanceProfiler hl7.v231.mdm.t02 \"");
    }

    public static String readFileDataAsString(String fileName) throws Exception {
        String data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

    public static void main(String[] args) {

        if (args.length != 1) {
            printUsage();
            System.exit(0);
        }

        try {
            // Set up and configuration
            String current = new File(".").getCanonicalPath();
            PropertyConfigurator.configure(current + "/log4j.properties");

            InputStream input = new FileInputStream(current + "/config.properties");
            Properties prop = new Properties();
            prop.load(input);

            logger.info("<------ Started Conformance Profiling - "+args[0]+" ------>");

            // get properties
            String xmlProfilePath = current+prop.getProperty(args[0]+".profile.path");
            String xmlCodeStorePath = current+prop.getProperty(args[0]+".codes.path");
            String hl7DataFilePath = current+prop.getProperty(args[0]+".data.path");
            String fhirTerminologyUrl = prop.getProperty("terminology.fhir.baseurl");

            logger.info("--------------------------------------------");
            logger.info("XML profile: "+xmlProfilePath);
            logger.info("XML code store: "+xmlCodeStorePath);
            logger.info("HL7 data: "+hl7DataFilePath);
            logger.info("FHIR terminology server: "+fhirTerminologyUrl);
            logger.info("--------------------------------------------");

            // load the conformance profile from file
            String profile = readFileDataAsString(xmlProfilePath);
            ProfileParser ourProfileParser = new ProfileParser(false);
            RuntimeProfile ourConformanceProfile = ourProfileParser.parse(profile);

            // load the profile code store
            ProfileCodeStore profileCodeStore = new ProfileCodeStore(xmlCodeStorePath);

            // initialise terminology rest client
            RestClient restClient = new RestClient(fhirTerminologyUrl);

            // read HL7 from file
            String message = readFileDataAsString(hl7DataFilePath);

            // setup context, but disable validation during parsing as we will validate in next step
            HapiContext context = new DefaultHapiContext();
            context.getParserConfiguration().setValidating(false);

            // associate the HapiContext with a custom model class factory and parser
            ModelClassFactory cmf = new CustomModelClassFactory("au.gov.digitalhealth.hl7v2.model");
            context.setModelClassFactory(cmf);
            Parser parser = context.getPipeParser();

            // parse the HL7 message from the file data
            AbstractMessage msg = (AbstractMessage) (parser.parse(message));
            logger.info("Message structure: " + msg.getClass());

            // initiate the profile validator and set the required code store and rest client
            ProfileValidator profileValidator = new ProfileValidator();
            profileValidator.setCodeStore(profileCodeStore);
            profileValidator.setRestClient(restClient);

            List<HL7Exception> exceptions = new ArrayList<HL7Exception>();

            // due to various datatypes for OBX-5 not known till runtime need to process differently
            // needs factoring
            if (msg.getClass().getName().equals("au.gov.digitalhealth.hl7v2.model.v231.message.MDM_T02")) {

                AbstractSegment seg = (AbstractSegment) msg.get("OBX");

                ID valueType = (ID) seg.getField(2, 0);
        
                if (valueType.toString().equals("ED")) {
                    Varies variesObject = (Varies) seg.getField(5, 0);
                    ca.uhn.hl7v2.model.v231.datatype.ED encapsuledData = (ca.uhn.hl7v2.model.v231.datatype.ED) variesObject.getData(); 
                    profileValidator.testCodeAgainstTable("OBX-5(2)", "HL70191", encapsuledData.getTypeOfData().toString(), "", exceptions);
                    profileValidator.testCodeAgainstTable("OBX-5(3)", "HL70291", encapsuledData.getDataSubtype().toString(), "", exceptions);
                    profileValidator.testCodeAgainstTable("OBX-5(4)", "HL70299", encapsuledData.getEncoding().toString(), "", exceptions);
                } else {
                    exceptions.add(new ProfileNotFollowedException("Error: OBX value type must be ED"));
                }
            } 

            if (msg.getClass().getName().equals("au.gov.digitalhealth.hl7v2.model.v24.message.REF_I12")) {

                AbstractGroup observationGroup = (AbstractGroup) msg.get("OBSERVATION");
                AbstractGroup resultsNotesGroup = (AbstractGroup) observationGroup.get("RESULTS_NOTES");
                AbstractSegment seg = (AbstractSegment) resultsNotesGroup.get("OBX");

                ID valueType = (ID) seg.getField(2, 0);
        
                if (valueType.toString().equals("ED")) {
                    Varies variesObject = (Varies) seg.getField(5, 0);
                    ca.uhn.hl7v2.model.v24.datatype.ED encapsuledData = (ca.uhn.hl7v2.model.v24.datatype.ED) variesObject.getData(); 
                    profileValidator.testCodeAgainstTable("OBX-5(2)", "HL70191", encapsuledData.getTypeOfData().toString(), "", exceptions);
                    profileValidator.testCodeAgainstTable("OBX-5(3)", "HL70291", encapsuledData.getDataSubtype().toString(), "", exceptions);
                    profileValidator.testCodeAgainstTable("OBX-5(4)", "HL70299", encapsuledData.getEncoding().toString(), "", exceptions);
                }
            } 

            // validate the rest of the message
            HL7Exception[] validationExceptions = profileValidator.validate(msg, ourConformanceProfile.getMessage());

            // concate and display all exceptions that are generated
            logger.info("--------------------------------------------");
            for (HL7Exception hl7Exception : validationExceptions) {
                exceptions.add(hl7Exception);
            }
            logger.info("Found: " + exceptions.size() + " exceptions");
            int errorCount = 0;
            int warnCount = 0;
            for (HL7Exception hl7Exception : exceptions) {
                if (hl7Exception.toString().startsWith("ca.uhn.hl7v2.conf.check.ProfileNotFollowedException: Warn")) {
                    logger.warn(hl7Exception);
                    warnCount++;
                } else {
                    logger.error(hl7Exception);
                    errorCount++;
                }
            }
            logger.info("Found: " + warnCount + " warnings");
            logger.info("Found: " + errorCount + " errors");
            logger.info("--------------------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        } 
        logger.info("<------ Finished Conformance Profiling - "+args[0]+" ------>");
    }
}
