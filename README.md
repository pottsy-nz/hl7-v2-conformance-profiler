## Australian Digital Health Agency - HL7 v2 Conformance Profiling
The objective of this toolkit is to provide developers with a technical profile specification and a means for testing conformance of HL7 v2 message payloads as defined in the [Secure Message Industry Offer](https://developer.digitalhealth.gov.au/resources/faqs/provider-directory-service-message-payload-implementation-guide) 

## 1. Setup and configuration
The toolkit requires a [Java](https://www.java.com/en/) for execution and [Maven](https://maven.apache.org/download.cgi) for building.

The ```..app/config.properties``` file contains settings and paths to:
* XML profile - outlines the HL7 v2 message structure
* XML code store - small code sets defined as per HL7 tables
* HL7 data - path to sample HL7 data
* URL to FHIR based terminology server

Conformance profiles and code store tables have been initially generated using 
[Messaging Workbench](http://www.hl7.org/participate/toolsandresources.cfm?ref=nav) - V2 Tools

Usage legend in specification:
* R : Required
* O : Optional
* C : Conditional
* X : Not Supported
* B : Backward

## 2. Run conformance profiler
Validates a HL7 data against an XML profile definition and code set. There is no need to build or compile any sources and the conformance profiler can be run using the following commands
```bash
~/app $ java ConformanceProfiler [hl7.<version>.<message-type>.<event-type>]
```
### hl7.v24.ref.i12
```bash
~/app $ java -cp "target/hl7v2-1.0-SNAPSHOT.jar;target/dependency/*" au.gov.digitalhealth.hl7v2.ConformanceProfiler hl7.v24.ref.i12
```
### hl7.v24.rri.i12
```bash
~/app $ java -cp "target/hl7v2-1.0-SNAPSHOT.jar;target/dependency/*" au.gov.digitalhealth.hl7v2.ConformanceProfiler hl7.v24.rri.i12
```
### hl7.v231.mdm.t02
```bash
~/app $ java -cp "target/hl7v2-1.0-SNAPSHOT.jar;target/dependency/*" au.gov.digitalhealth.hl7v2.ConformanceProfiler hl7.v231.mdm.t02
```
### hl7.v231.ack.t02
```bash
~/app $ java -cp "target/hl7v2-1.0-SNAPSHOT.jar;target/dependency/*" au.gov.digitalhealth.hl7v2.ConformanceProfiler hl7.v231.ack.t02
```

The instructions below provides an outline on how to generate new model source code. _(not required - for information only)_ 

### 1. Build profile source code generator
This step creates the package and copies dependencies required to generate the specific HL7 v2 models
```bash
~/app $ mvn clean package dependency:copy-dependencies
```

### 2. Run profile source code generator
This step creates the specific HL7 v2 models source code for a particular HL7 version, message and event type using a defined XML profile
```
Usage: java ProfileSourceCodeGenerator [hl7.<version>.<message-type>.<event-type>]
```
#### hl7.v24.ref.i12
```bash
~/app $ java -cp "target/hl7v2-1.0-SNAPSHOT.jar;target/dependency/*" au.gov.digitalhealth.hl7v2.ProfileSourceCodeGenerator hl7.v24.ref.i12
```
#### hl7.v24.rri.i12
```bash
~/app $ java -cp "target/hl7v2-1.0-SNAPSHOT.jar;target/dependency/*" au.gov.digitalhealth.hl7v2.ProfileSourceCodeGenerator hl7.v24.rri.i12
```
#### hl7.v231.mdm.t02
```bash
~/app $ java -cp "target/hl7v2-1.0-SNAPSHOT.jar;target/dependency/*" au.gov.digitalhealth.hl7v2.ProfileSourceCodeGenerator hl7.v231.mdm.t02
```
#### hl7.v231.ack.t02
```bash
~/app $ java -cp "target/hl7v2-1.0-SNAPSHOT.jar;target/dependency/*" au.gov.digitalhealth.hl7v2.ProfileSourceCodeGenerator hl7.v231.ack.t02
```

### 3. Compile profile source code 
Now that we have built the specific HL7 v2 models (as above) we will compile and package all of the source code
```bash
~/app $ mvn compile package
```
We can now execute the conformance profiler on the newly defined HL7 models