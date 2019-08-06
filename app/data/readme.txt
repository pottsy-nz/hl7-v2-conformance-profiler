MP-TestData
=======================================================
In the MP-TestData bundle there are example messages for the following messages in the respective directories:
 - REF_I12
 - RRI_I12
 - MDM_T02
 - ACK_T02

Please note that while the request and response message (e.g. REF and RRI pair, MDM and ACK pair) are using related provider and patient data from an application perspective, the referral (REF^I12) request and specialist letter (MDM^T02) response are not clincally related (the patient and provider data are not correlated).

../REF_I12
========================================================
Detailed and complex Level 1 referral

Only the PDF AUSPDI OBX display segment in the example should be viewable in receiving software that is compliant with Level 1. 
All other display segments (e.g. HTML) in the example should be successfully ignored by non Level 2 compliant viewers)
 
Expectations of the display are provided in the "Referral Clinical information and Letter.pdf"

../RRI_I12
=======================================================
Successful response message to the REF^I12 sample above

../MDM_T02
=======================================================
In this example a Specialist Letter packaged as CDA zip containing a pdf attachment "attachment.pdf"

../ACK_T02
=======================================================
Successful response message to the MDM^T02 sample above

