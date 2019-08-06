package au.gov.digitalhealth.hl7v2;

import ca.uhn.hl7v2.conf.parser.ProfileParser;
import ca.uhn.hl7v2.conf.spec.RuntimeProfile;
import ca.uhn.hl7v2.sourcegen.conf.GenerateDataTypesEnum;
import ca.uhn.hl7v2.sourcegen.conf.ProfileSourceGenerator;

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


public class ProfileSourceCodeGenerator
{
    // Define a static logger variable so that it references the
    // Logger instance named "ProfileSourceCodeGenerator".
    static Logger logger = Logger.getLogger(ProfileSourceCodeGenerator.class);

    public static String readFileDataAsString(String fileName) throws Exception
    {
      String data = new String(Files.readAllBytes(Paths.get(fileName)));
      return data;
    }

    public static void printUsage()
    {
        logger.info("Usage: java ProfileSourceCodeGenerator hl7.<version>.<message-type>.<event-type>");
        logger.info("e.g. java -cp \"target/hl7v2-1.0-SNAPSHOT.jar;target/dependency/*\" au.gov.digitalhealth.hl7v2.ProfileSourceCodeGenerator hl7.v24.ref.i12");
    }

    public static void main( String [] args )
    {
        if (args.length != 1)
        {
            printUsage();
            System.exit(0);
        }

        try {

            // Set up and configuration
            String current = new File(".").getCanonicalPath();
            PropertyConfigurator.configure(current+"/log4j.properties");

            InputStream input = new FileInputStream(current+"/config.properties");
            Properties prop = new Properties();
            prop.load(input);

            logger.info("*** Starting Profile Source Code Generator - "+args[0]+" ***");

            // get properties
            String[] split = args[0].split("\\.");
            String xmlProfilePath = current+prop.getProperty(args[0]+".profile.path");
            String targetPath = prop.getProperty(args[0]+".source.path");
            //String targetPath = "target\\generated-sources\\src\\";
            String basePackage = prop.getProperty(split[0]+"."+split[1]);

            logger.info("XML profile: "+xmlProfilePath);
            logger.info("Target path: "+targetPath);
            logger.info("Base package: "+basePackage);

             // load the conformance profile from file
			String profile  = readFileDataAsString(xmlProfilePath); 
			ProfileParser profileParser = new ProfileParser(false);
            RuntimeProfile runtimeProfile = profileParser.parse(profile);

            // generate source based on profile
            ProfileSourceGenerator gen = new ProfileSourceGenerator(
                runtimeProfile, 
                targetPath, 
                basePackage, 
                GenerateDataTypesEnum.ALL, 
                "ca.uhn.hl7v2.sourcegen.templates", 
                "java");
			gen.generate();


		}  catch (Exception e) {
            e.printStackTrace();
        }

        logger.info( "*** Finished Profile Source Code Generator - "+args[0]+" ***");
    }
}
