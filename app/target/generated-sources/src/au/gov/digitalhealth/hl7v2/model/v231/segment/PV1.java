/*
 * This class is an auto-generated source file for a HAPI
 * HL7 v2.x standard structure class.
 *
 * For more information, visit: http://hl7api.sourceforge.net/
 * 
 * The contents of this file are subject to the Mozilla Public License Version 1.1 
 * (the "License"); you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at http://www.mozilla.org/MPL/ 
 * Software distributed under the License is distributed on an "AS IS" basis, 
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for the 
 * specific language governing rights and limitations under the License. 
 * 
 * The Original Code is "[file_name]".  Description: 
 * "[one_line_description]" 
 * 
 * The Initial Developer of the Original Code is University Health Network. Copyright (C) 
 * 2012.  All Rights Reserved. 
 * 
 * Contributor(s): ______________________________________. 
 * 
 * Alternatively, the contents of this file may be used under the terms of the 
 * GNU General Public License (the  "GPL"), in which case the provisions of the GPL are 
 * applicable instead of those above.  If you wish to allow use of your version of this 
 * file only under the terms of the GPL and not to allow others to use your version 
 * of this file under the MPL, indicate your decision by deleting  the provisions above 
 * and replace  them with the notice and other provisions required by the GPL License.  
 * If you do not delete the provisions above, a recipient may use your version of 
 * this file under either the MPL or the GPL. 
 * 
 */


package au.gov.digitalhealth.hl7v2.model.v231.segment;

// import au.gov.digitalhealth.hl7v2.model.v231.group.*;
import ca.uhn.hl7v2.model.v231.datatype.*;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.parser.DefaultModelClassFactory;
import ca.uhn.hl7v2.model.AbstractMessage;
import ca.uhn.hl7v2.model.Group;
import ca.uhn.hl7v2.model.Type;
import ca.uhn.hl7v2.model.AbstractSegment;
import ca.uhn.hl7v2.model.Varies;


/**
 *<p>Represents an HL7 PV1 message segment (patient visit segment-). 
 * This segment has the following fields:</p>
 * <ul>
     * <li>PV1-1: Set ID - PV1 (SI) <b> </b>
     * <li>PV1-2: Patient Class (IS) <b> </b>
     * <li>PV1-3: Assigned Patient Location (PL) <b>optional repeating</b>
     * <li>PV1-4: Admission Type (IS) <b>optional repeating</b>
     * <li>PV1-5: Preadmit Number (CX) <b>optional repeating</b>
     * <li>PV1-6: Prior Patient Location (PL) <b>optional repeating</b>
     * <li>PV1-7: Attending Doctor (XCN) <b>optional repeating</b>
     * <li>PV1-8: Referring Doctor (XCN) <b>optional repeating</b>
     * <li>PV1-9: Consulting Doctor (XCN) <b> repeating</b>
     * <li>PV1-10: Hospital Service (IS) <b>optional repeating</b>
     * <li>PV1-11: Temporary Location (PL) <b>optional repeating</b>
     * <li>PV1-12: Preadmit Test Indicator (IS) <b>optional repeating</b>
     * <li>PV1-13: Re-admission Indicator (IS) <b>optional repeating</b>
     * <li>PV1-14: Admit Source (IS) <b>optional repeating</b>
     * <li>PV1-15: Ambulatory Status (IS) <b>optional repeating</b>
     * <li>PV1-16: VIP Indicator (IS) <b>optional repeating</b>
     * <li>PV1-17: Admitting Doctor (XCN) <b>optional repeating</b>
     * <li>PV1-18: Patient Type (IS) <b>optional repeating</b>
     * <li>PV1-19: Visit Number (CX) <b>optional repeating</b>
     * <li>PV1-20: Financial Class (FC) <b>optional repeating</b>
     * <li>PV1-21: Charge Price Indicator (IS) <b>optional repeating</b>
     * <li>PV1-22: Courtesy Code (IS) <b>optional repeating</b>
     * <li>PV1-23: Credit Rating (IS) <b>optional repeating</b>
     * <li>PV1-24: Contract Code (IS) <b>optional repeating</b>
     * <li>PV1-25: Contract Effective Date (DT) <b>optional repeating</b>
     * <li>PV1-26: Contract Amount (NM) <b>optional repeating</b>
     * <li>PV1-27: Contract Period (NM) <b>optional repeating</b>
     * <li>PV1-28: Interest Code (IS) <b>optional repeating</b>
     * <li>PV1-29: Transfer to Bad Debt Code (IS) <b>optional repeating</b>
     * <li>PV1-30: Transfer to Bad Debt Date (DT) <b>optional repeating</b>
     * <li>PV1-31: Bad Debt Agency Code (IS) <b>optional repeating</b>
     * <li>PV1-32: Bad Debt Transfer Amount (NM) <b>optional repeating</b>
     * <li>PV1-33: Bad Debt Recovery Amount (NM) <b>optional repeating</b>
     * <li>PV1-34: Delete Account Indicator (IS) <b>optional repeating</b>
     * <li>PV1-35: Delete Account Date (DT) <b>optional repeating</b>
     * <li>PV1-36: Discharge Disposition (IS) <b>optional repeating</b>
     * <li>PV1-37: Discharged to Location (DLD) <b>optional repeating</b>
     * <li>PV1-38: Diet Type (CE) <b>optional repeating</b>
     * <li>PV1-39: Servicing Facility (IS) <b>optional repeating</b>
     * <li>PV1-40: Bed Status (IS) <b>optional repeating</b>
     * <li>PV1-41: Account Status (IS) <b>optional repeating</b>
     * <li>PV1-42: Pending Location (PL) <b>optional repeating</b>
     * <li>PV1-43: Prior Temporary Location (PL) <b>optional repeating</b>
     * <li>PV1-44: Admit Date/Time (TS) <b>optional repeating</b>
     * <li>PV1-45: Discharge Date/Time (TS) <b>optional repeating</b>
     * <li>PV1-46: Current Patient Balance (NM) <b>optional repeating</b>
     * <li>PV1-47: Total Charges (NM) <b>optional repeating</b>
     * <li>PV1-48: Total Adjustments (NM) <b>optional repeating</b>
     * <li>PV1-49: Total Payments (NM) <b>optional repeating</b>
     * <li>PV1-50: Alternate Visit ID (CX) <b>optional repeating</b>
     * <li>PV1-51: Visit Indicator (IS) <b>optional repeating</b>
     * <li>PV1-52: Other Healthcare Provider (XCN) <b>optional repeating</b>
 * </ul>
 */
@SuppressWarnings("unused")
public class PV1 extends AbstractSegment {

    /** 
     * Creates a new PV1 segment
     */
    public PV1(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(SI.class, true, 1, 4, new Object[]{ getMessage() }, "Set ID - PV1");
                                              this.add(IS.class, true, 1, 1, new Object[]{ getMessage(), new Integer(4) }, "Patient Class");
                                  this.add(PL.class, false, -1, 80, new Object[]{ getMessage() }, "Assigned Patient Location");
                                              this.add(IS.class, false, -1, 2, new Object[]{ getMessage(), new Integer(7) }, "Admission Type");
                                  this.add(CX.class, false, -1, 36, new Object[]{ getMessage() }, "Preadmit Number");
                                  this.add(PL.class, false, -1, 80, new Object[]{ getMessage() }, "Prior Patient Location");
                                  this.add(XCN.class, false, -1, 75, new Object[]{ getMessage() }, "Attending Doctor");
                                  this.add(XCN.class, false, -1, 75, new Object[]{ getMessage() }, "Referring Doctor");
                                  this.add(XCN.class, true, -1, 200, new Object[]{ getMessage() }, "Consulting Doctor");
                                              this.add(IS.class, false, -1, 3, new Object[]{ getMessage(), new Integer(69) }, "Hospital Service");
                                  this.add(PL.class, false, -1, 80, new Object[]{ getMessage() }, "Temporary Location");
                                              this.add(IS.class, false, -1, 2, new Object[]{ getMessage(), new Integer(87) }, "Preadmit Test Indicator");
                                              this.add(IS.class, false, -1, 2, new Object[]{ getMessage(), new Integer(92) }, "Re-admission Indicator");
                                              this.add(IS.class, false, -1, 3, new Object[]{ getMessage(), new Integer(23) }, "Admit Source");
                                              this.add(IS.class, false, -1, 2, new Object[]{ getMessage(), new Integer(9) }, "Ambulatory Status");
                                              this.add(IS.class, false, -1, 2, new Object[]{ getMessage(), new Integer(99) }, "VIP Indicator");
                                  this.add(XCN.class, false, -1, 75, new Object[]{ getMessage() }, "Admitting Doctor");
                                              this.add(IS.class, false, -1, 2, new Object[]{ getMessage(), new Integer(18) }, "Patient Type");
                                  this.add(CX.class, false, -1, 36, new Object[]{ getMessage() }, "Visit Number");
                                  this.add(FC.class, false, -1, 50, new Object[]{ getMessage() }, "Financial Class");
                                              this.add(IS.class, false, -1, 2, new Object[]{ getMessage(), new Integer(32) }, "Charge Price Indicator");
                                              this.add(IS.class, false, -1, 2, new Object[]{ getMessage(), new Integer(45) }, "Courtesy Code");
                                              this.add(IS.class, false, -1, 2, new Object[]{ getMessage(), new Integer(46) }, "Credit Rating");
                                              this.add(IS.class, false, -1, 2, new Object[]{ getMessage(), new Integer(44) }, "Contract Code");
                                  this.add(DT.class, false, -1, 8, new Object[]{ getMessage() }, "Contract Effective Date");
                                  this.add(NM.class, false, -1, 12, new Object[]{ getMessage() }, "Contract Amount");
                                  this.add(NM.class, false, -1, 3, new Object[]{ getMessage() }, "Contract Period");
                                              this.add(IS.class, false, -1, 2, new Object[]{ getMessage(), new Integer(73) }, "Interest Code");
                                              this.add(IS.class, false, -1, 1, new Object[]{ getMessage(), new Integer(110) }, "Transfer to Bad Debt Code");
                                  this.add(DT.class, false, -1, 8, new Object[]{ getMessage() }, "Transfer to Bad Debt Date");
                                              this.add(IS.class, false, -1, 10, new Object[]{ getMessage(), new Integer(21) }, "Bad Debt Agency Code");
                                  this.add(NM.class, false, -1, 12, new Object[]{ getMessage() }, "Bad Debt Transfer Amount");
                                  this.add(NM.class, false, -1, 12, new Object[]{ getMessage() }, "Bad Debt Recovery Amount");
                                              this.add(IS.class, false, -1, 1, new Object[]{ getMessage(), new Integer(111) }, "Delete Account Indicator");
                                  this.add(DT.class, false, -1, 8, new Object[]{ getMessage() }, "Delete Account Date");
                                              this.add(IS.class, false, -1, 3, new Object[]{ getMessage(), new Integer(112) }, "Discharge Disposition");
                                  this.add(DLD.class, false, -1, 40, new Object[]{ getMessage() }, "Discharged to Location");
                                  this.add(CE.class, false, -1, 80, new Object[]{ getMessage() }, "Diet Type");
                                              this.add(IS.class, false, -1, 2, new Object[]{ getMessage(), new Integer(115) }, "Servicing Facility");
                                              this.add(IS.class, false, -1, 1, new Object[]{ getMessage(), new Integer(116) }, "Bed Status");
                                              this.add(IS.class, false, -1, 2, new Object[]{ getMessage(), new Integer(117) }, "Account Status");
                                  this.add(PL.class, false, -1, 80, new Object[]{ getMessage() }, "Pending Location");
                                  this.add(PL.class, false, -1, 80, new Object[]{ getMessage() }, "Prior Temporary Location");
                                  this.add(TS.class, false, -1, 26, new Object[]{ getMessage() }, "Admit Date/Time");
                                  this.add(TS.class, false, -1, 26, new Object[]{ getMessage() }, "Discharge Date/Time");
                                  this.add(NM.class, false, -1, 12, new Object[]{ getMessage() }, "Current Patient Balance");
                                  this.add(NM.class, false, -1, 12, new Object[]{ getMessage() }, "Total Charges");
                                  this.add(NM.class, false, -1, 12, new Object[]{ getMessage() }, "Total Adjustments");
                                  this.add(NM.class, false, -1, 12, new Object[]{ getMessage() }, "Total Payments");
                                  this.add(CX.class, false, -1, 36, new Object[]{ getMessage() }, "Alternate Visit ID");
                                              this.add(IS.class, false, -1, 1, new Object[]{ getMessage(), new Integer(326) }, "Visit Indicator");
                                  this.add(XCN.class, false, -1, 75, new Object[]{ getMessage() }, "Other Healthcare Provider");
       } catch(HL7Exception e) {
          log.error("Unexpected error creating PV1 - this is probably a bug in the source code generator.", e);
       }
    }



    /**
     * Returns
     * PV1-1: "Set ID - PV1" - creates it if necessary
     */
    public SI getSetIDPV1() { 
		SI retVal = this.getTypedField(1, 0);
		return retVal;
    }
    
    /**
     * Returns
     * PV1-1: "Set ID - PV1" - creates it if necessary
     */
    public SI getPv11_SetIDPV1() { 
		SI retVal = this.getTypedField(1, 0);
		return retVal;
    }



    /**
     * Returns
     * PV1-2: "Patient Class" - creates it if necessary
     */
    public IS getPatientClass() { 
		IS retVal = this.getTypedField(2, 0);
		return retVal;
    }
    
    /**
     * Returns
     * PV1-2: "Patient Class" - creates it if necessary
     */
    public IS getPv12_PatientClass() { 
		IS retVal = this.getTypedField(2, 0);
		return retVal;
    }


    /**
     * Returns all repetitions of Assigned Patient Location (PV1-3).
     */
    public PL[] getAssignedPatientLocation() {
    	PL[] retVal = this.getTypedField(3, new PL[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Assigned Patient Location (PV1-3).
     */
    public PL[] getPv13_AssignedPatientLocation() {
    	PL[] retVal = this.getTypedField(3, new PL[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Assigned Patient Location (PV1-3).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getAssignedPatientLocationReps() {
    	return this.getReps(3);
    }


    /**
     * Returns a specific repetition of
     * PV1-3: "Assigned Patient Location" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public PL getAssignedPatientLocation(int rep) { 
		PL retVal = this.getTypedField(3, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-3: "Assigned Patient Location" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public PL getPv13_AssignedPatientLocation(int rep) { 
		PL retVal = this.getTypedField(3, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Assigned Patient Location (PV1-3).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv13_AssignedPatientLocationReps() {
    	return this.getReps(3);
    }


    /**
     * Inserts a repetition of
     * PV1-3: "Assigned Patient Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PL insertAssignedPatientLocation(int rep) throws HL7Exception { 
        return (PL) super.insertRepetition(3, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-3: "Assigned Patient Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PL insertPv13_AssignedPatientLocation(int rep) throws HL7Exception { 
        return (PL) super.insertRepetition(3, rep);
    }


    /**
     * Removes a repetition of
     * PV1-3: "Assigned Patient Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PL removeAssignedPatientLocation(int rep) throws HL7Exception { 
        return (PL) super.removeRepetition(3, rep);
    }


    /**
     * Removes a repetition of
     * PV1-3: "Assigned Patient Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PL removePv13_AssignedPatientLocation(int rep) throws HL7Exception { 
        return (PL) super.removeRepetition(3, rep);
    }



    /**
     * Returns all repetitions of Admission Type (PV1-4).
     */
    public IS[] getAdmissionType() {
    	IS[] retVal = this.getTypedField(4, new IS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Admission Type (PV1-4).
     */
    public IS[] getPv14_AdmissionType() {
    	IS[] retVal = this.getTypedField(4, new IS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Admission Type (PV1-4).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getAdmissionTypeReps() {
    	return this.getReps(4);
    }


    /**
     * Returns a specific repetition of
     * PV1-4: "Admission Type" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getAdmissionType(int rep) { 
		IS retVal = this.getTypedField(4, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-4: "Admission Type" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getPv14_AdmissionType(int rep) { 
		IS retVal = this.getTypedField(4, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Admission Type (PV1-4).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv14_AdmissionTypeReps() {
    	return this.getReps(4);
    }


    /**
     * Inserts a repetition of
     * PV1-4: "Admission Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertAdmissionType(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(4, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-4: "Admission Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertPv14_AdmissionType(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(4, rep);
    }


    /**
     * Removes a repetition of
     * PV1-4: "Admission Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeAdmissionType(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(4, rep);
    }


    /**
     * Removes a repetition of
     * PV1-4: "Admission Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removePv14_AdmissionType(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(4, rep);
    }



    /**
     * Returns all repetitions of Preadmit Number (PV1-5).
     */
    public CX[] getPreadmitNumber() {
    	CX[] retVal = this.getTypedField(5, new CX[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Preadmit Number (PV1-5).
     */
    public CX[] getPv15_PreadmitNumber() {
    	CX[] retVal = this.getTypedField(5, new CX[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Preadmit Number (PV1-5).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPreadmitNumberReps() {
    	return this.getReps(5);
    }


    /**
     * Returns a specific repetition of
     * PV1-5: "Preadmit Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getPreadmitNumber(int rep) { 
		CX retVal = this.getTypedField(5, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-5: "Preadmit Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getPv15_PreadmitNumber(int rep) { 
		CX retVal = this.getTypedField(5, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Preadmit Number (PV1-5).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv15_PreadmitNumberReps() {
    	return this.getReps(5);
    }


    /**
     * Inserts a repetition of
     * PV1-5: "Preadmit Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertPreadmitNumber(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(5, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-5: "Preadmit Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertPv15_PreadmitNumber(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(5, rep);
    }


    /**
     * Removes a repetition of
     * PV1-5: "Preadmit Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removePreadmitNumber(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(5, rep);
    }


    /**
     * Removes a repetition of
     * PV1-5: "Preadmit Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removePv15_PreadmitNumber(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(5, rep);
    }



    /**
     * Returns all repetitions of Prior Patient Location (PV1-6).
     */
    public PL[] getPriorPatientLocation() {
    	PL[] retVal = this.getTypedField(6, new PL[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Prior Patient Location (PV1-6).
     */
    public PL[] getPv16_PriorPatientLocation() {
    	PL[] retVal = this.getTypedField(6, new PL[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Prior Patient Location (PV1-6).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPriorPatientLocationReps() {
    	return this.getReps(6);
    }


    /**
     * Returns a specific repetition of
     * PV1-6: "Prior Patient Location" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public PL getPriorPatientLocation(int rep) { 
		PL retVal = this.getTypedField(6, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-6: "Prior Patient Location" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public PL getPv16_PriorPatientLocation(int rep) { 
		PL retVal = this.getTypedField(6, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Prior Patient Location (PV1-6).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv16_PriorPatientLocationReps() {
    	return this.getReps(6);
    }


    /**
     * Inserts a repetition of
     * PV1-6: "Prior Patient Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PL insertPriorPatientLocation(int rep) throws HL7Exception { 
        return (PL) super.insertRepetition(6, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-6: "Prior Patient Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PL insertPv16_PriorPatientLocation(int rep) throws HL7Exception { 
        return (PL) super.insertRepetition(6, rep);
    }


    /**
     * Removes a repetition of
     * PV1-6: "Prior Patient Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PL removePriorPatientLocation(int rep) throws HL7Exception { 
        return (PL) super.removeRepetition(6, rep);
    }


    /**
     * Removes a repetition of
     * PV1-6: "Prior Patient Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PL removePv16_PriorPatientLocation(int rep) throws HL7Exception { 
        return (PL) super.removeRepetition(6, rep);
    }



    /**
     * Returns all repetitions of Attending Doctor (PV1-7).
     */
    public XCN[] getAttendingDoctor() {
    	XCN[] retVal = this.getTypedField(7, new XCN[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Attending Doctor (PV1-7).
     */
    public XCN[] getPv17_AttendingDoctor() {
    	XCN[] retVal = this.getTypedField(7, new XCN[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Attending Doctor (PV1-7).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getAttendingDoctorReps() {
    	return this.getReps(7);
    }


    /**
     * Returns a specific repetition of
     * PV1-7: "Attending Doctor" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getAttendingDoctor(int rep) { 
		XCN retVal = this.getTypedField(7, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-7: "Attending Doctor" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getPv17_AttendingDoctor(int rep) { 
		XCN retVal = this.getTypedField(7, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Attending Doctor (PV1-7).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv17_AttendingDoctorReps() {
    	return this.getReps(7);
    }


    /**
     * Inserts a repetition of
     * PV1-7: "Attending Doctor" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertAttendingDoctor(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(7, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-7: "Attending Doctor" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertPv17_AttendingDoctor(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(7, rep);
    }


    /**
     * Removes a repetition of
     * PV1-7: "Attending Doctor" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeAttendingDoctor(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(7, rep);
    }


    /**
     * Removes a repetition of
     * PV1-7: "Attending Doctor" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removePv17_AttendingDoctor(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(7, rep);
    }



    /**
     * Returns all repetitions of Referring Doctor (PV1-8).
     */
    public XCN[] getReferringDoctor() {
    	XCN[] retVal = this.getTypedField(8, new XCN[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Referring Doctor (PV1-8).
     */
    public XCN[] getPv18_ReferringDoctor() {
    	XCN[] retVal = this.getTypedField(8, new XCN[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Referring Doctor (PV1-8).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getReferringDoctorReps() {
    	return this.getReps(8);
    }


    /**
     * Returns a specific repetition of
     * PV1-8: "Referring Doctor" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getReferringDoctor(int rep) { 
		XCN retVal = this.getTypedField(8, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-8: "Referring Doctor" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getPv18_ReferringDoctor(int rep) { 
		XCN retVal = this.getTypedField(8, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Referring Doctor (PV1-8).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv18_ReferringDoctorReps() {
    	return this.getReps(8);
    }


    /**
     * Inserts a repetition of
     * PV1-8: "Referring Doctor" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertReferringDoctor(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(8, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-8: "Referring Doctor" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertPv18_ReferringDoctor(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(8, rep);
    }


    /**
     * Removes a repetition of
     * PV1-8: "Referring Doctor" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeReferringDoctor(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(8, rep);
    }


    /**
     * Removes a repetition of
     * PV1-8: "Referring Doctor" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removePv18_ReferringDoctor(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(8, rep);
    }



    /**
     * Returns all repetitions of Consulting Doctor (PV1-9).
     */
    public XCN[] getConsultingDoctor() {
    	XCN[] retVal = this.getTypedField(9, new XCN[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Consulting Doctor (PV1-9).
     */
    public XCN[] getPv19_ConsultingDoctor() {
    	XCN[] retVal = this.getTypedField(9, new XCN[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Consulting Doctor (PV1-9).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getConsultingDoctorReps() {
    	return this.getReps(9);
    }


    /**
     * Returns a specific repetition of
     * PV1-9: "Consulting Doctor" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getConsultingDoctor(int rep) { 
		XCN retVal = this.getTypedField(9, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-9: "Consulting Doctor" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getPv19_ConsultingDoctor(int rep) { 
		XCN retVal = this.getTypedField(9, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Consulting Doctor (PV1-9).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv19_ConsultingDoctorReps() {
    	return this.getReps(9);
    }


    /**
     * Inserts a repetition of
     * PV1-9: "Consulting Doctor" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertConsultingDoctor(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(9, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-9: "Consulting Doctor" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertPv19_ConsultingDoctor(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(9, rep);
    }


    /**
     * Removes a repetition of
     * PV1-9: "Consulting Doctor" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeConsultingDoctor(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(9, rep);
    }


    /**
     * Removes a repetition of
     * PV1-9: "Consulting Doctor" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removePv19_ConsultingDoctor(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(9, rep);
    }



    /**
     * Returns all repetitions of Hospital Service (PV1-10).
     */
    public IS[] getHospitalService() {
    	IS[] retVal = this.getTypedField(10, new IS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Hospital Service (PV1-10).
     */
    public IS[] getPv110_HospitalService() {
    	IS[] retVal = this.getTypedField(10, new IS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Hospital Service (PV1-10).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getHospitalServiceReps() {
    	return this.getReps(10);
    }


    /**
     * Returns a specific repetition of
     * PV1-10: "Hospital Service" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getHospitalService(int rep) { 
		IS retVal = this.getTypedField(10, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-10: "Hospital Service" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getPv110_HospitalService(int rep) { 
		IS retVal = this.getTypedField(10, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Hospital Service (PV1-10).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv110_HospitalServiceReps() {
    	return this.getReps(10);
    }


    /**
     * Inserts a repetition of
     * PV1-10: "Hospital Service" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertHospitalService(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(10, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-10: "Hospital Service" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertPv110_HospitalService(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(10, rep);
    }


    /**
     * Removes a repetition of
     * PV1-10: "Hospital Service" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeHospitalService(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(10, rep);
    }


    /**
     * Removes a repetition of
     * PV1-10: "Hospital Service" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removePv110_HospitalService(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(10, rep);
    }



    /**
     * Returns all repetitions of Temporary Location (PV1-11).
     */
    public PL[] getTemporaryLocation() {
    	PL[] retVal = this.getTypedField(11, new PL[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Temporary Location (PV1-11).
     */
    public PL[] getPv111_TemporaryLocation() {
    	PL[] retVal = this.getTypedField(11, new PL[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Temporary Location (PV1-11).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTemporaryLocationReps() {
    	return this.getReps(11);
    }


    /**
     * Returns a specific repetition of
     * PV1-11: "Temporary Location" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public PL getTemporaryLocation(int rep) { 
		PL retVal = this.getTypedField(11, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-11: "Temporary Location" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public PL getPv111_TemporaryLocation(int rep) { 
		PL retVal = this.getTypedField(11, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Temporary Location (PV1-11).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv111_TemporaryLocationReps() {
    	return this.getReps(11);
    }


    /**
     * Inserts a repetition of
     * PV1-11: "Temporary Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PL insertTemporaryLocation(int rep) throws HL7Exception { 
        return (PL) super.insertRepetition(11, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-11: "Temporary Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PL insertPv111_TemporaryLocation(int rep) throws HL7Exception { 
        return (PL) super.insertRepetition(11, rep);
    }


    /**
     * Removes a repetition of
     * PV1-11: "Temporary Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PL removeTemporaryLocation(int rep) throws HL7Exception { 
        return (PL) super.removeRepetition(11, rep);
    }


    /**
     * Removes a repetition of
     * PV1-11: "Temporary Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PL removePv111_TemporaryLocation(int rep) throws HL7Exception { 
        return (PL) super.removeRepetition(11, rep);
    }



    /**
     * Returns all repetitions of Preadmit Test Indicator (PV1-12).
     */
    public IS[] getPreadmitTestIndicator() {
    	IS[] retVal = this.getTypedField(12, new IS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Preadmit Test Indicator (PV1-12).
     */
    public IS[] getPv112_PreadmitTestIndicator() {
    	IS[] retVal = this.getTypedField(12, new IS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Preadmit Test Indicator (PV1-12).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPreadmitTestIndicatorReps() {
    	return this.getReps(12);
    }


    /**
     * Returns a specific repetition of
     * PV1-12: "Preadmit Test Indicator" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getPreadmitTestIndicator(int rep) { 
		IS retVal = this.getTypedField(12, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-12: "Preadmit Test Indicator" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getPv112_PreadmitTestIndicator(int rep) { 
		IS retVal = this.getTypedField(12, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Preadmit Test Indicator (PV1-12).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv112_PreadmitTestIndicatorReps() {
    	return this.getReps(12);
    }


    /**
     * Inserts a repetition of
     * PV1-12: "Preadmit Test Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertPreadmitTestIndicator(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(12, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-12: "Preadmit Test Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertPv112_PreadmitTestIndicator(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(12, rep);
    }


    /**
     * Removes a repetition of
     * PV1-12: "Preadmit Test Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removePreadmitTestIndicator(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(12, rep);
    }


    /**
     * Removes a repetition of
     * PV1-12: "Preadmit Test Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removePv112_PreadmitTestIndicator(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(12, rep);
    }



    /**
     * Returns all repetitions of Re-admission Indicator (PV1-13).
     */
    public IS[] getReAdmissionIndicator() {
    	IS[] retVal = this.getTypedField(13, new IS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Re-admission Indicator (PV1-13).
     */
    public IS[] getPv113_ReAdmissionIndicator() {
    	IS[] retVal = this.getTypedField(13, new IS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Re-admission Indicator (PV1-13).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getReAdmissionIndicatorReps() {
    	return this.getReps(13);
    }


    /**
     * Returns a specific repetition of
     * PV1-13: "Re-admission Indicator" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getReAdmissionIndicator(int rep) { 
		IS retVal = this.getTypedField(13, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-13: "Re-admission Indicator" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getPv113_ReAdmissionIndicator(int rep) { 
		IS retVal = this.getTypedField(13, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Re-admission Indicator (PV1-13).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv113_ReAdmissionIndicatorReps() {
    	return this.getReps(13);
    }


    /**
     * Inserts a repetition of
     * PV1-13: "Re-admission Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertReAdmissionIndicator(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(13, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-13: "Re-admission Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertPv113_ReAdmissionIndicator(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(13, rep);
    }


    /**
     * Removes a repetition of
     * PV1-13: "Re-admission Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeReAdmissionIndicator(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(13, rep);
    }


    /**
     * Removes a repetition of
     * PV1-13: "Re-admission Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removePv113_ReAdmissionIndicator(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(13, rep);
    }



    /**
     * Returns all repetitions of Admit Source (PV1-14).
     */
    public IS[] getAdmitSource() {
    	IS[] retVal = this.getTypedField(14, new IS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Admit Source (PV1-14).
     */
    public IS[] getPv114_AdmitSource() {
    	IS[] retVal = this.getTypedField(14, new IS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Admit Source (PV1-14).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getAdmitSourceReps() {
    	return this.getReps(14);
    }


    /**
     * Returns a specific repetition of
     * PV1-14: "Admit Source" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getAdmitSource(int rep) { 
		IS retVal = this.getTypedField(14, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-14: "Admit Source" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getPv114_AdmitSource(int rep) { 
		IS retVal = this.getTypedField(14, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Admit Source (PV1-14).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv114_AdmitSourceReps() {
    	return this.getReps(14);
    }


    /**
     * Inserts a repetition of
     * PV1-14: "Admit Source" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertAdmitSource(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(14, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-14: "Admit Source" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertPv114_AdmitSource(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(14, rep);
    }


    /**
     * Removes a repetition of
     * PV1-14: "Admit Source" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeAdmitSource(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(14, rep);
    }


    /**
     * Removes a repetition of
     * PV1-14: "Admit Source" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removePv114_AdmitSource(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(14, rep);
    }



    /**
     * Returns all repetitions of Ambulatory Status (PV1-15).
     */
    public IS[] getAmbulatoryStatus() {
    	IS[] retVal = this.getTypedField(15, new IS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Ambulatory Status (PV1-15).
     */
    public IS[] getPv115_AmbulatoryStatus() {
    	IS[] retVal = this.getTypedField(15, new IS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Ambulatory Status (PV1-15).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getAmbulatoryStatusReps() {
    	return this.getReps(15);
    }


    /**
     * Returns a specific repetition of
     * PV1-15: "Ambulatory Status" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getAmbulatoryStatus(int rep) { 
		IS retVal = this.getTypedField(15, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-15: "Ambulatory Status" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getPv115_AmbulatoryStatus(int rep) { 
		IS retVal = this.getTypedField(15, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Ambulatory Status (PV1-15).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv115_AmbulatoryStatusReps() {
    	return this.getReps(15);
    }


    /**
     * Inserts a repetition of
     * PV1-15: "Ambulatory Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertAmbulatoryStatus(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(15, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-15: "Ambulatory Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertPv115_AmbulatoryStatus(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(15, rep);
    }


    /**
     * Removes a repetition of
     * PV1-15: "Ambulatory Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeAmbulatoryStatus(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(15, rep);
    }


    /**
     * Removes a repetition of
     * PV1-15: "Ambulatory Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removePv115_AmbulatoryStatus(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(15, rep);
    }



    /**
     * Returns all repetitions of VIP Indicator (PV1-16).
     */
    public IS[] getVIPIndicator() {
    	IS[] retVal = this.getTypedField(16, new IS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of VIP Indicator (PV1-16).
     */
    public IS[] getPv116_VIPIndicator() {
    	IS[] retVal = this.getTypedField(16, new IS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of VIP Indicator (PV1-16).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getVIPIndicatorReps() {
    	return this.getReps(16);
    }


    /**
     * Returns a specific repetition of
     * PV1-16: "VIP Indicator" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getVIPIndicator(int rep) { 
		IS retVal = this.getTypedField(16, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-16: "VIP Indicator" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getPv116_VIPIndicator(int rep) { 
		IS retVal = this.getTypedField(16, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of VIP Indicator (PV1-16).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv116_VIPIndicatorReps() {
    	return this.getReps(16);
    }


    /**
     * Inserts a repetition of
     * PV1-16: "VIP Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertVIPIndicator(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(16, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-16: "VIP Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertPv116_VIPIndicator(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(16, rep);
    }


    /**
     * Removes a repetition of
     * PV1-16: "VIP Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeVIPIndicator(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(16, rep);
    }


    /**
     * Removes a repetition of
     * PV1-16: "VIP Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removePv116_VIPIndicator(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(16, rep);
    }



    /**
     * Returns all repetitions of Admitting Doctor (PV1-17).
     */
    public XCN[] getAdmittingDoctor() {
    	XCN[] retVal = this.getTypedField(17, new XCN[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Admitting Doctor (PV1-17).
     */
    public XCN[] getPv117_AdmittingDoctor() {
    	XCN[] retVal = this.getTypedField(17, new XCN[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Admitting Doctor (PV1-17).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getAdmittingDoctorReps() {
    	return this.getReps(17);
    }


    /**
     * Returns a specific repetition of
     * PV1-17: "Admitting Doctor" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getAdmittingDoctor(int rep) { 
		XCN retVal = this.getTypedField(17, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-17: "Admitting Doctor" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getPv117_AdmittingDoctor(int rep) { 
		XCN retVal = this.getTypedField(17, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Admitting Doctor (PV1-17).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv117_AdmittingDoctorReps() {
    	return this.getReps(17);
    }


    /**
     * Inserts a repetition of
     * PV1-17: "Admitting Doctor" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertAdmittingDoctor(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(17, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-17: "Admitting Doctor" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertPv117_AdmittingDoctor(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(17, rep);
    }


    /**
     * Removes a repetition of
     * PV1-17: "Admitting Doctor" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeAdmittingDoctor(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(17, rep);
    }


    /**
     * Removes a repetition of
     * PV1-17: "Admitting Doctor" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removePv117_AdmittingDoctor(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(17, rep);
    }



    /**
     * Returns all repetitions of Patient Type (PV1-18).
     */
    public IS[] getPatientType() {
    	IS[] retVal = this.getTypedField(18, new IS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Patient Type (PV1-18).
     */
    public IS[] getPv118_PatientType() {
    	IS[] retVal = this.getTypedField(18, new IS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Patient Type (PV1-18).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPatientTypeReps() {
    	return this.getReps(18);
    }


    /**
     * Returns a specific repetition of
     * PV1-18: "Patient Type" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getPatientType(int rep) { 
		IS retVal = this.getTypedField(18, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-18: "Patient Type" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getPv118_PatientType(int rep) { 
		IS retVal = this.getTypedField(18, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Patient Type (PV1-18).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv118_PatientTypeReps() {
    	return this.getReps(18);
    }


    /**
     * Inserts a repetition of
     * PV1-18: "Patient Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertPatientType(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(18, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-18: "Patient Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertPv118_PatientType(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(18, rep);
    }


    /**
     * Removes a repetition of
     * PV1-18: "Patient Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removePatientType(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(18, rep);
    }


    /**
     * Removes a repetition of
     * PV1-18: "Patient Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removePv118_PatientType(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(18, rep);
    }



    /**
     * Returns all repetitions of Visit Number (PV1-19).
     */
    public CX[] getVisitNumber() {
    	CX[] retVal = this.getTypedField(19, new CX[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Visit Number (PV1-19).
     */
    public CX[] getPv119_VisitNumber() {
    	CX[] retVal = this.getTypedField(19, new CX[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Visit Number (PV1-19).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getVisitNumberReps() {
    	return this.getReps(19);
    }


    /**
     * Returns a specific repetition of
     * PV1-19: "Visit Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getVisitNumber(int rep) { 
		CX retVal = this.getTypedField(19, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-19: "Visit Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getPv119_VisitNumber(int rep) { 
		CX retVal = this.getTypedField(19, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Visit Number (PV1-19).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv119_VisitNumberReps() {
    	return this.getReps(19);
    }


    /**
     * Inserts a repetition of
     * PV1-19: "Visit Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertVisitNumber(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(19, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-19: "Visit Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertPv119_VisitNumber(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(19, rep);
    }


    /**
     * Removes a repetition of
     * PV1-19: "Visit Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removeVisitNumber(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(19, rep);
    }


    /**
     * Removes a repetition of
     * PV1-19: "Visit Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removePv119_VisitNumber(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(19, rep);
    }



    /**
     * Returns all repetitions of Financial Class (PV1-20).
     */
    public FC[] getFinancialClass() {
    	FC[] retVal = this.getTypedField(20, new FC[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Financial Class (PV1-20).
     */
    public FC[] getPv120_FinancialClass() {
    	FC[] retVal = this.getTypedField(20, new FC[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Financial Class (PV1-20).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getFinancialClassReps() {
    	return this.getReps(20);
    }


    /**
     * Returns a specific repetition of
     * PV1-20: "Financial Class" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public FC getFinancialClass(int rep) { 
		FC retVal = this.getTypedField(20, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-20: "Financial Class" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public FC getPv120_FinancialClass(int rep) { 
		FC retVal = this.getTypedField(20, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Financial Class (PV1-20).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv120_FinancialClassReps() {
    	return this.getReps(20);
    }


    /**
     * Inserts a repetition of
     * PV1-20: "Financial Class" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public FC insertFinancialClass(int rep) throws HL7Exception { 
        return (FC) super.insertRepetition(20, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-20: "Financial Class" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public FC insertPv120_FinancialClass(int rep) throws HL7Exception { 
        return (FC) super.insertRepetition(20, rep);
    }


    /**
     * Removes a repetition of
     * PV1-20: "Financial Class" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public FC removeFinancialClass(int rep) throws HL7Exception { 
        return (FC) super.removeRepetition(20, rep);
    }


    /**
     * Removes a repetition of
     * PV1-20: "Financial Class" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public FC removePv120_FinancialClass(int rep) throws HL7Exception { 
        return (FC) super.removeRepetition(20, rep);
    }



    /**
     * Returns all repetitions of Charge Price Indicator (PV1-21).
     */
    public IS[] getChargePriceIndicator() {
    	IS[] retVal = this.getTypedField(21, new IS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Charge Price Indicator (PV1-21).
     */
    public IS[] getPv121_ChargePriceIndicator() {
    	IS[] retVal = this.getTypedField(21, new IS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Charge Price Indicator (PV1-21).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getChargePriceIndicatorReps() {
    	return this.getReps(21);
    }


    /**
     * Returns a specific repetition of
     * PV1-21: "Charge Price Indicator" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getChargePriceIndicator(int rep) { 
		IS retVal = this.getTypedField(21, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-21: "Charge Price Indicator" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getPv121_ChargePriceIndicator(int rep) { 
		IS retVal = this.getTypedField(21, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Charge Price Indicator (PV1-21).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv121_ChargePriceIndicatorReps() {
    	return this.getReps(21);
    }


    /**
     * Inserts a repetition of
     * PV1-21: "Charge Price Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertChargePriceIndicator(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(21, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-21: "Charge Price Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertPv121_ChargePriceIndicator(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(21, rep);
    }


    /**
     * Removes a repetition of
     * PV1-21: "Charge Price Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeChargePriceIndicator(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(21, rep);
    }


    /**
     * Removes a repetition of
     * PV1-21: "Charge Price Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removePv121_ChargePriceIndicator(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(21, rep);
    }



    /**
     * Returns all repetitions of Courtesy Code (PV1-22).
     */
    public IS[] getCourtesyCode() {
    	IS[] retVal = this.getTypedField(22, new IS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Courtesy Code (PV1-22).
     */
    public IS[] getPv122_CourtesyCode() {
    	IS[] retVal = this.getTypedField(22, new IS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Courtesy Code (PV1-22).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getCourtesyCodeReps() {
    	return this.getReps(22);
    }


    /**
     * Returns a specific repetition of
     * PV1-22: "Courtesy Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getCourtesyCode(int rep) { 
		IS retVal = this.getTypedField(22, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-22: "Courtesy Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getPv122_CourtesyCode(int rep) { 
		IS retVal = this.getTypedField(22, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Courtesy Code (PV1-22).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv122_CourtesyCodeReps() {
    	return this.getReps(22);
    }


    /**
     * Inserts a repetition of
     * PV1-22: "Courtesy Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertCourtesyCode(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(22, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-22: "Courtesy Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertPv122_CourtesyCode(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(22, rep);
    }


    /**
     * Removes a repetition of
     * PV1-22: "Courtesy Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeCourtesyCode(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(22, rep);
    }


    /**
     * Removes a repetition of
     * PV1-22: "Courtesy Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removePv122_CourtesyCode(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(22, rep);
    }



    /**
     * Returns all repetitions of Credit Rating (PV1-23).
     */
    public IS[] getCreditRating() {
    	IS[] retVal = this.getTypedField(23, new IS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Credit Rating (PV1-23).
     */
    public IS[] getPv123_CreditRating() {
    	IS[] retVal = this.getTypedField(23, new IS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Credit Rating (PV1-23).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getCreditRatingReps() {
    	return this.getReps(23);
    }


    /**
     * Returns a specific repetition of
     * PV1-23: "Credit Rating" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getCreditRating(int rep) { 
		IS retVal = this.getTypedField(23, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-23: "Credit Rating" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getPv123_CreditRating(int rep) { 
		IS retVal = this.getTypedField(23, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Credit Rating (PV1-23).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv123_CreditRatingReps() {
    	return this.getReps(23);
    }


    /**
     * Inserts a repetition of
     * PV1-23: "Credit Rating" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertCreditRating(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(23, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-23: "Credit Rating" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertPv123_CreditRating(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(23, rep);
    }


    /**
     * Removes a repetition of
     * PV1-23: "Credit Rating" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeCreditRating(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(23, rep);
    }


    /**
     * Removes a repetition of
     * PV1-23: "Credit Rating" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removePv123_CreditRating(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(23, rep);
    }



    /**
     * Returns all repetitions of Contract Code (PV1-24).
     */
    public IS[] getContractCode() {
    	IS[] retVal = this.getTypedField(24, new IS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Contract Code (PV1-24).
     */
    public IS[] getPv124_ContractCode() {
    	IS[] retVal = this.getTypedField(24, new IS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Contract Code (PV1-24).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getContractCodeReps() {
    	return this.getReps(24);
    }


    /**
     * Returns a specific repetition of
     * PV1-24: "Contract Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getContractCode(int rep) { 
		IS retVal = this.getTypedField(24, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-24: "Contract Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getPv124_ContractCode(int rep) { 
		IS retVal = this.getTypedField(24, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Contract Code (PV1-24).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv124_ContractCodeReps() {
    	return this.getReps(24);
    }


    /**
     * Inserts a repetition of
     * PV1-24: "Contract Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertContractCode(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(24, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-24: "Contract Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertPv124_ContractCode(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(24, rep);
    }


    /**
     * Removes a repetition of
     * PV1-24: "Contract Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeContractCode(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(24, rep);
    }


    /**
     * Removes a repetition of
     * PV1-24: "Contract Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removePv124_ContractCode(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(24, rep);
    }



    /**
     * Returns all repetitions of Contract Effective Date (PV1-25).
     */
    public DT[] getContractEffectiveDate() {
    	DT[] retVal = this.getTypedField(25, new DT[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Contract Effective Date (PV1-25).
     */
    public DT[] getPv125_ContractEffectiveDate() {
    	DT[] retVal = this.getTypedField(25, new DT[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Contract Effective Date (PV1-25).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getContractEffectiveDateReps() {
    	return this.getReps(25);
    }


    /**
     * Returns a specific repetition of
     * PV1-25: "Contract Effective Date" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public DT getContractEffectiveDate(int rep) { 
		DT retVal = this.getTypedField(25, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-25: "Contract Effective Date" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public DT getPv125_ContractEffectiveDate(int rep) { 
		DT retVal = this.getTypedField(25, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Contract Effective Date (PV1-25).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv125_ContractEffectiveDateReps() {
    	return this.getReps(25);
    }


    /**
     * Inserts a repetition of
     * PV1-25: "Contract Effective Date" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DT insertContractEffectiveDate(int rep) throws HL7Exception { 
        return (DT) super.insertRepetition(25, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-25: "Contract Effective Date" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DT insertPv125_ContractEffectiveDate(int rep) throws HL7Exception { 
        return (DT) super.insertRepetition(25, rep);
    }


    /**
     * Removes a repetition of
     * PV1-25: "Contract Effective Date" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DT removeContractEffectiveDate(int rep) throws HL7Exception { 
        return (DT) super.removeRepetition(25, rep);
    }


    /**
     * Removes a repetition of
     * PV1-25: "Contract Effective Date" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DT removePv125_ContractEffectiveDate(int rep) throws HL7Exception { 
        return (DT) super.removeRepetition(25, rep);
    }



    /**
     * Returns all repetitions of Contract Amount (PV1-26).
     */
    public NM[] getContractAmount() {
    	NM[] retVal = this.getTypedField(26, new NM[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Contract Amount (PV1-26).
     */
    public NM[] getPv126_ContractAmount() {
    	NM[] retVal = this.getTypedField(26, new NM[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Contract Amount (PV1-26).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getContractAmountReps() {
    	return this.getReps(26);
    }


    /**
     * Returns a specific repetition of
     * PV1-26: "Contract Amount" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getContractAmount(int rep) { 
		NM retVal = this.getTypedField(26, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-26: "Contract Amount" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getPv126_ContractAmount(int rep) { 
		NM retVal = this.getTypedField(26, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Contract Amount (PV1-26).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv126_ContractAmountReps() {
    	return this.getReps(26);
    }


    /**
     * Inserts a repetition of
     * PV1-26: "Contract Amount" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertContractAmount(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(26, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-26: "Contract Amount" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertPv126_ContractAmount(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(26, rep);
    }


    /**
     * Removes a repetition of
     * PV1-26: "Contract Amount" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeContractAmount(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(26, rep);
    }


    /**
     * Removes a repetition of
     * PV1-26: "Contract Amount" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removePv126_ContractAmount(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(26, rep);
    }



    /**
     * Returns all repetitions of Contract Period (PV1-27).
     */
    public NM[] getContractPeriod() {
    	NM[] retVal = this.getTypedField(27, new NM[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Contract Period (PV1-27).
     */
    public NM[] getPv127_ContractPeriod() {
    	NM[] retVal = this.getTypedField(27, new NM[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Contract Period (PV1-27).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getContractPeriodReps() {
    	return this.getReps(27);
    }


    /**
     * Returns a specific repetition of
     * PV1-27: "Contract Period" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getContractPeriod(int rep) { 
		NM retVal = this.getTypedField(27, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-27: "Contract Period" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getPv127_ContractPeriod(int rep) { 
		NM retVal = this.getTypedField(27, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Contract Period (PV1-27).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv127_ContractPeriodReps() {
    	return this.getReps(27);
    }


    /**
     * Inserts a repetition of
     * PV1-27: "Contract Period" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertContractPeriod(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(27, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-27: "Contract Period" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertPv127_ContractPeriod(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(27, rep);
    }


    /**
     * Removes a repetition of
     * PV1-27: "Contract Period" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeContractPeriod(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(27, rep);
    }


    /**
     * Removes a repetition of
     * PV1-27: "Contract Period" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removePv127_ContractPeriod(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(27, rep);
    }



    /**
     * Returns all repetitions of Interest Code (PV1-28).
     */
    public IS[] getInterestCode() {
    	IS[] retVal = this.getTypedField(28, new IS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Interest Code (PV1-28).
     */
    public IS[] getPv128_InterestCode() {
    	IS[] retVal = this.getTypedField(28, new IS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Interest Code (PV1-28).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getInterestCodeReps() {
    	return this.getReps(28);
    }


    /**
     * Returns a specific repetition of
     * PV1-28: "Interest Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getInterestCode(int rep) { 
		IS retVal = this.getTypedField(28, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-28: "Interest Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getPv128_InterestCode(int rep) { 
		IS retVal = this.getTypedField(28, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Interest Code (PV1-28).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv128_InterestCodeReps() {
    	return this.getReps(28);
    }


    /**
     * Inserts a repetition of
     * PV1-28: "Interest Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertInterestCode(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(28, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-28: "Interest Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertPv128_InterestCode(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(28, rep);
    }


    /**
     * Removes a repetition of
     * PV1-28: "Interest Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeInterestCode(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(28, rep);
    }


    /**
     * Removes a repetition of
     * PV1-28: "Interest Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removePv128_InterestCode(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(28, rep);
    }



    /**
     * Returns all repetitions of Transfer to Bad Debt Code (PV1-29).
     */
    public IS[] getTransferToBadDebtCode() {
    	IS[] retVal = this.getTypedField(29, new IS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Transfer to Bad Debt Code (PV1-29).
     */
    public IS[] getPv129_TransferToBadDebtCode() {
    	IS[] retVal = this.getTypedField(29, new IS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Transfer to Bad Debt Code (PV1-29).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTransferToBadDebtCodeReps() {
    	return this.getReps(29);
    }


    /**
     * Returns a specific repetition of
     * PV1-29: "Transfer to Bad Debt Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getTransferToBadDebtCode(int rep) { 
		IS retVal = this.getTypedField(29, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-29: "Transfer to Bad Debt Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getPv129_TransferToBadDebtCode(int rep) { 
		IS retVal = this.getTypedField(29, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Transfer to Bad Debt Code (PV1-29).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv129_TransferToBadDebtCodeReps() {
    	return this.getReps(29);
    }


    /**
     * Inserts a repetition of
     * PV1-29: "Transfer to Bad Debt Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertTransferToBadDebtCode(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(29, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-29: "Transfer to Bad Debt Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertPv129_TransferToBadDebtCode(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(29, rep);
    }


    /**
     * Removes a repetition of
     * PV1-29: "Transfer to Bad Debt Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeTransferToBadDebtCode(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(29, rep);
    }


    /**
     * Removes a repetition of
     * PV1-29: "Transfer to Bad Debt Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removePv129_TransferToBadDebtCode(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(29, rep);
    }



    /**
     * Returns all repetitions of Transfer to Bad Debt Date (PV1-30).
     */
    public DT[] getTransferToBadDebtDate() {
    	DT[] retVal = this.getTypedField(30, new DT[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Transfer to Bad Debt Date (PV1-30).
     */
    public DT[] getPv130_TransferToBadDebtDate() {
    	DT[] retVal = this.getTypedField(30, new DT[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Transfer to Bad Debt Date (PV1-30).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTransferToBadDebtDateReps() {
    	return this.getReps(30);
    }


    /**
     * Returns a specific repetition of
     * PV1-30: "Transfer to Bad Debt Date" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public DT getTransferToBadDebtDate(int rep) { 
		DT retVal = this.getTypedField(30, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-30: "Transfer to Bad Debt Date" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public DT getPv130_TransferToBadDebtDate(int rep) { 
		DT retVal = this.getTypedField(30, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Transfer to Bad Debt Date (PV1-30).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv130_TransferToBadDebtDateReps() {
    	return this.getReps(30);
    }


    /**
     * Inserts a repetition of
     * PV1-30: "Transfer to Bad Debt Date" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DT insertTransferToBadDebtDate(int rep) throws HL7Exception { 
        return (DT) super.insertRepetition(30, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-30: "Transfer to Bad Debt Date" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DT insertPv130_TransferToBadDebtDate(int rep) throws HL7Exception { 
        return (DT) super.insertRepetition(30, rep);
    }


    /**
     * Removes a repetition of
     * PV1-30: "Transfer to Bad Debt Date" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DT removeTransferToBadDebtDate(int rep) throws HL7Exception { 
        return (DT) super.removeRepetition(30, rep);
    }


    /**
     * Removes a repetition of
     * PV1-30: "Transfer to Bad Debt Date" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DT removePv130_TransferToBadDebtDate(int rep) throws HL7Exception { 
        return (DT) super.removeRepetition(30, rep);
    }



    /**
     * Returns all repetitions of Bad Debt Agency Code (PV1-31).
     */
    public IS[] getBadDebtAgencyCode() {
    	IS[] retVal = this.getTypedField(31, new IS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Bad Debt Agency Code (PV1-31).
     */
    public IS[] getPv131_BadDebtAgencyCode() {
    	IS[] retVal = this.getTypedField(31, new IS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Bad Debt Agency Code (PV1-31).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getBadDebtAgencyCodeReps() {
    	return this.getReps(31);
    }


    /**
     * Returns a specific repetition of
     * PV1-31: "Bad Debt Agency Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getBadDebtAgencyCode(int rep) { 
		IS retVal = this.getTypedField(31, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-31: "Bad Debt Agency Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getPv131_BadDebtAgencyCode(int rep) { 
		IS retVal = this.getTypedField(31, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Bad Debt Agency Code (PV1-31).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv131_BadDebtAgencyCodeReps() {
    	return this.getReps(31);
    }


    /**
     * Inserts a repetition of
     * PV1-31: "Bad Debt Agency Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertBadDebtAgencyCode(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(31, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-31: "Bad Debt Agency Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertPv131_BadDebtAgencyCode(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(31, rep);
    }


    /**
     * Removes a repetition of
     * PV1-31: "Bad Debt Agency Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeBadDebtAgencyCode(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(31, rep);
    }


    /**
     * Removes a repetition of
     * PV1-31: "Bad Debt Agency Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removePv131_BadDebtAgencyCode(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(31, rep);
    }



    /**
     * Returns all repetitions of Bad Debt Transfer Amount (PV1-32).
     */
    public NM[] getBadDebtTransferAmount() {
    	NM[] retVal = this.getTypedField(32, new NM[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Bad Debt Transfer Amount (PV1-32).
     */
    public NM[] getPv132_BadDebtTransferAmount() {
    	NM[] retVal = this.getTypedField(32, new NM[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Bad Debt Transfer Amount (PV1-32).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getBadDebtTransferAmountReps() {
    	return this.getReps(32);
    }


    /**
     * Returns a specific repetition of
     * PV1-32: "Bad Debt Transfer Amount" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getBadDebtTransferAmount(int rep) { 
		NM retVal = this.getTypedField(32, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-32: "Bad Debt Transfer Amount" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getPv132_BadDebtTransferAmount(int rep) { 
		NM retVal = this.getTypedField(32, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Bad Debt Transfer Amount (PV1-32).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv132_BadDebtTransferAmountReps() {
    	return this.getReps(32);
    }


    /**
     * Inserts a repetition of
     * PV1-32: "Bad Debt Transfer Amount" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertBadDebtTransferAmount(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(32, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-32: "Bad Debt Transfer Amount" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertPv132_BadDebtTransferAmount(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(32, rep);
    }


    /**
     * Removes a repetition of
     * PV1-32: "Bad Debt Transfer Amount" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeBadDebtTransferAmount(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(32, rep);
    }


    /**
     * Removes a repetition of
     * PV1-32: "Bad Debt Transfer Amount" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removePv132_BadDebtTransferAmount(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(32, rep);
    }



    /**
     * Returns all repetitions of Bad Debt Recovery Amount (PV1-33).
     */
    public NM[] getBadDebtRecoveryAmount() {
    	NM[] retVal = this.getTypedField(33, new NM[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Bad Debt Recovery Amount (PV1-33).
     */
    public NM[] getPv133_BadDebtRecoveryAmount() {
    	NM[] retVal = this.getTypedField(33, new NM[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Bad Debt Recovery Amount (PV1-33).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getBadDebtRecoveryAmountReps() {
    	return this.getReps(33);
    }


    /**
     * Returns a specific repetition of
     * PV1-33: "Bad Debt Recovery Amount" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getBadDebtRecoveryAmount(int rep) { 
		NM retVal = this.getTypedField(33, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-33: "Bad Debt Recovery Amount" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getPv133_BadDebtRecoveryAmount(int rep) { 
		NM retVal = this.getTypedField(33, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Bad Debt Recovery Amount (PV1-33).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv133_BadDebtRecoveryAmountReps() {
    	return this.getReps(33);
    }


    /**
     * Inserts a repetition of
     * PV1-33: "Bad Debt Recovery Amount" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertBadDebtRecoveryAmount(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(33, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-33: "Bad Debt Recovery Amount" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertPv133_BadDebtRecoveryAmount(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(33, rep);
    }


    /**
     * Removes a repetition of
     * PV1-33: "Bad Debt Recovery Amount" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeBadDebtRecoveryAmount(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(33, rep);
    }


    /**
     * Removes a repetition of
     * PV1-33: "Bad Debt Recovery Amount" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removePv133_BadDebtRecoveryAmount(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(33, rep);
    }



    /**
     * Returns all repetitions of Delete Account Indicator (PV1-34).
     */
    public IS[] getDeleteAccountIndicator() {
    	IS[] retVal = this.getTypedField(34, new IS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Delete Account Indicator (PV1-34).
     */
    public IS[] getPv134_DeleteAccountIndicator() {
    	IS[] retVal = this.getTypedField(34, new IS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Delete Account Indicator (PV1-34).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getDeleteAccountIndicatorReps() {
    	return this.getReps(34);
    }


    /**
     * Returns a specific repetition of
     * PV1-34: "Delete Account Indicator" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getDeleteAccountIndicator(int rep) { 
		IS retVal = this.getTypedField(34, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-34: "Delete Account Indicator" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getPv134_DeleteAccountIndicator(int rep) { 
		IS retVal = this.getTypedField(34, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Delete Account Indicator (PV1-34).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv134_DeleteAccountIndicatorReps() {
    	return this.getReps(34);
    }


    /**
     * Inserts a repetition of
     * PV1-34: "Delete Account Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertDeleteAccountIndicator(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(34, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-34: "Delete Account Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertPv134_DeleteAccountIndicator(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(34, rep);
    }


    /**
     * Removes a repetition of
     * PV1-34: "Delete Account Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeDeleteAccountIndicator(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(34, rep);
    }


    /**
     * Removes a repetition of
     * PV1-34: "Delete Account Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removePv134_DeleteAccountIndicator(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(34, rep);
    }



    /**
     * Returns all repetitions of Delete Account Date (PV1-35).
     */
    public DT[] getDeleteAccountDate() {
    	DT[] retVal = this.getTypedField(35, new DT[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Delete Account Date (PV1-35).
     */
    public DT[] getPv135_DeleteAccountDate() {
    	DT[] retVal = this.getTypedField(35, new DT[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Delete Account Date (PV1-35).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getDeleteAccountDateReps() {
    	return this.getReps(35);
    }


    /**
     * Returns a specific repetition of
     * PV1-35: "Delete Account Date" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public DT getDeleteAccountDate(int rep) { 
		DT retVal = this.getTypedField(35, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-35: "Delete Account Date" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public DT getPv135_DeleteAccountDate(int rep) { 
		DT retVal = this.getTypedField(35, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Delete Account Date (PV1-35).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv135_DeleteAccountDateReps() {
    	return this.getReps(35);
    }


    /**
     * Inserts a repetition of
     * PV1-35: "Delete Account Date" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DT insertDeleteAccountDate(int rep) throws HL7Exception { 
        return (DT) super.insertRepetition(35, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-35: "Delete Account Date" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DT insertPv135_DeleteAccountDate(int rep) throws HL7Exception { 
        return (DT) super.insertRepetition(35, rep);
    }


    /**
     * Removes a repetition of
     * PV1-35: "Delete Account Date" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DT removeDeleteAccountDate(int rep) throws HL7Exception { 
        return (DT) super.removeRepetition(35, rep);
    }


    /**
     * Removes a repetition of
     * PV1-35: "Delete Account Date" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DT removePv135_DeleteAccountDate(int rep) throws HL7Exception { 
        return (DT) super.removeRepetition(35, rep);
    }



    /**
     * Returns all repetitions of Discharge Disposition (PV1-36).
     */
    public IS[] getDischargeDisposition() {
    	IS[] retVal = this.getTypedField(36, new IS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Discharge Disposition (PV1-36).
     */
    public IS[] getPv136_DischargeDisposition() {
    	IS[] retVal = this.getTypedField(36, new IS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Discharge Disposition (PV1-36).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getDischargeDispositionReps() {
    	return this.getReps(36);
    }


    /**
     * Returns a specific repetition of
     * PV1-36: "Discharge Disposition" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getDischargeDisposition(int rep) { 
		IS retVal = this.getTypedField(36, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-36: "Discharge Disposition" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getPv136_DischargeDisposition(int rep) { 
		IS retVal = this.getTypedField(36, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Discharge Disposition (PV1-36).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv136_DischargeDispositionReps() {
    	return this.getReps(36);
    }


    /**
     * Inserts a repetition of
     * PV1-36: "Discharge Disposition" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertDischargeDisposition(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(36, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-36: "Discharge Disposition" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertPv136_DischargeDisposition(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(36, rep);
    }


    /**
     * Removes a repetition of
     * PV1-36: "Discharge Disposition" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeDischargeDisposition(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(36, rep);
    }


    /**
     * Removes a repetition of
     * PV1-36: "Discharge Disposition" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removePv136_DischargeDisposition(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(36, rep);
    }



    /**
     * Returns all repetitions of Discharged to Location (PV1-37).
     */
    public DLD[] getDischargedToLocation() {
    	DLD[] retVal = this.getTypedField(37, new DLD[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Discharged to Location (PV1-37).
     */
    public DLD[] getPv137_DischargedToLocation() {
    	DLD[] retVal = this.getTypedField(37, new DLD[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Discharged to Location (PV1-37).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getDischargedToLocationReps() {
    	return this.getReps(37);
    }


    /**
     * Returns a specific repetition of
     * PV1-37: "Discharged to Location" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public DLD getDischargedToLocation(int rep) { 
		DLD retVal = this.getTypedField(37, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-37: "Discharged to Location" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public DLD getPv137_DischargedToLocation(int rep) { 
		DLD retVal = this.getTypedField(37, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Discharged to Location (PV1-37).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv137_DischargedToLocationReps() {
    	return this.getReps(37);
    }


    /**
     * Inserts a repetition of
     * PV1-37: "Discharged to Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DLD insertDischargedToLocation(int rep) throws HL7Exception { 
        return (DLD) super.insertRepetition(37, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-37: "Discharged to Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DLD insertPv137_DischargedToLocation(int rep) throws HL7Exception { 
        return (DLD) super.insertRepetition(37, rep);
    }


    /**
     * Removes a repetition of
     * PV1-37: "Discharged to Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DLD removeDischargedToLocation(int rep) throws HL7Exception { 
        return (DLD) super.removeRepetition(37, rep);
    }


    /**
     * Removes a repetition of
     * PV1-37: "Discharged to Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DLD removePv137_DischargedToLocation(int rep) throws HL7Exception { 
        return (DLD) super.removeRepetition(37, rep);
    }



    /**
     * Returns all repetitions of Diet Type (PV1-38).
     */
    public CE[] getDietType() {
    	CE[] retVal = this.getTypedField(38, new CE[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Diet Type (PV1-38).
     */
    public CE[] getPv138_DietType() {
    	CE[] retVal = this.getTypedField(38, new CE[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Diet Type (PV1-38).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getDietTypeReps() {
    	return this.getReps(38);
    }


    /**
     * Returns a specific repetition of
     * PV1-38: "Diet Type" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getDietType(int rep) { 
		CE retVal = this.getTypedField(38, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-38: "Diet Type" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPv138_DietType(int rep) { 
		CE retVal = this.getTypedField(38, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Diet Type (PV1-38).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv138_DietTypeReps() {
    	return this.getReps(38);
    }


    /**
     * Inserts a repetition of
     * PV1-38: "Diet Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertDietType(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(38, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-38: "Diet Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPv138_DietType(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(38, rep);
    }


    /**
     * Removes a repetition of
     * PV1-38: "Diet Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeDietType(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(38, rep);
    }


    /**
     * Removes a repetition of
     * PV1-38: "Diet Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePv138_DietType(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(38, rep);
    }



    /**
     * Returns all repetitions of Servicing Facility (PV1-39).
     */
    public IS[] getServicingFacility() {
    	IS[] retVal = this.getTypedField(39, new IS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Servicing Facility (PV1-39).
     */
    public IS[] getPv139_ServicingFacility() {
    	IS[] retVal = this.getTypedField(39, new IS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Servicing Facility (PV1-39).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getServicingFacilityReps() {
    	return this.getReps(39);
    }


    /**
     * Returns a specific repetition of
     * PV1-39: "Servicing Facility" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getServicingFacility(int rep) { 
		IS retVal = this.getTypedField(39, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-39: "Servicing Facility" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getPv139_ServicingFacility(int rep) { 
		IS retVal = this.getTypedField(39, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Servicing Facility (PV1-39).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv139_ServicingFacilityReps() {
    	return this.getReps(39);
    }


    /**
     * Inserts a repetition of
     * PV1-39: "Servicing Facility" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertServicingFacility(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(39, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-39: "Servicing Facility" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertPv139_ServicingFacility(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(39, rep);
    }


    /**
     * Removes a repetition of
     * PV1-39: "Servicing Facility" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeServicingFacility(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(39, rep);
    }


    /**
     * Removes a repetition of
     * PV1-39: "Servicing Facility" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removePv139_ServicingFacility(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(39, rep);
    }



    /**
     * Returns all repetitions of Bed Status (PV1-40).
     */
    public IS[] getBedStatus() {
    	IS[] retVal = this.getTypedField(40, new IS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Bed Status (PV1-40).
     */
    public IS[] getPv140_BedStatus() {
    	IS[] retVal = this.getTypedField(40, new IS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Bed Status (PV1-40).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getBedStatusReps() {
    	return this.getReps(40);
    }


    /**
     * Returns a specific repetition of
     * PV1-40: "Bed Status" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getBedStatus(int rep) { 
		IS retVal = this.getTypedField(40, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-40: "Bed Status" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getPv140_BedStatus(int rep) { 
		IS retVal = this.getTypedField(40, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Bed Status (PV1-40).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv140_BedStatusReps() {
    	return this.getReps(40);
    }


    /**
     * Inserts a repetition of
     * PV1-40: "Bed Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertBedStatus(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(40, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-40: "Bed Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertPv140_BedStatus(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(40, rep);
    }


    /**
     * Removes a repetition of
     * PV1-40: "Bed Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeBedStatus(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(40, rep);
    }


    /**
     * Removes a repetition of
     * PV1-40: "Bed Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removePv140_BedStatus(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(40, rep);
    }



    /**
     * Returns all repetitions of Account Status (PV1-41).
     */
    public IS[] getAccountStatus() {
    	IS[] retVal = this.getTypedField(41, new IS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Account Status (PV1-41).
     */
    public IS[] getPv141_AccountStatus() {
    	IS[] retVal = this.getTypedField(41, new IS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Account Status (PV1-41).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getAccountStatusReps() {
    	return this.getReps(41);
    }


    /**
     * Returns a specific repetition of
     * PV1-41: "Account Status" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getAccountStatus(int rep) { 
		IS retVal = this.getTypedField(41, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-41: "Account Status" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getPv141_AccountStatus(int rep) { 
		IS retVal = this.getTypedField(41, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Account Status (PV1-41).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv141_AccountStatusReps() {
    	return this.getReps(41);
    }


    /**
     * Inserts a repetition of
     * PV1-41: "Account Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertAccountStatus(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(41, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-41: "Account Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertPv141_AccountStatus(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(41, rep);
    }


    /**
     * Removes a repetition of
     * PV1-41: "Account Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeAccountStatus(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(41, rep);
    }


    /**
     * Removes a repetition of
     * PV1-41: "Account Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removePv141_AccountStatus(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(41, rep);
    }



    /**
     * Returns all repetitions of Pending Location (PV1-42).
     */
    public PL[] getPendingLocation() {
    	PL[] retVal = this.getTypedField(42, new PL[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Pending Location (PV1-42).
     */
    public PL[] getPv142_PendingLocation() {
    	PL[] retVal = this.getTypedField(42, new PL[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Pending Location (PV1-42).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPendingLocationReps() {
    	return this.getReps(42);
    }


    /**
     * Returns a specific repetition of
     * PV1-42: "Pending Location" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public PL getPendingLocation(int rep) { 
		PL retVal = this.getTypedField(42, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-42: "Pending Location" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public PL getPv142_PendingLocation(int rep) { 
		PL retVal = this.getTypedField(42, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Pending Location (PV1-42).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv142_PendingLocationReps() {
    	return this.getReps(42);
    }


    /**
     * Inserts a repetition of
     * PV1-42: "Pending Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PL insertPendingLocation(int rep) throws HL7Exception { 
        return (PL) super.insertRepetition(42, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-42: "Pending Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PL insertPv142_PendingLocation(int rep) throws HL7Exception { 
        return (PL) super.insertRepetition(42, rep);
    }


    /**
     * Removes a repetition of
     * PV1-42: "Pending Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PL removePendingLocation(int rep) throws HL7Exception { 
        return (PL) super.removeRepetition(42, rep);
    }


    /**
     * Removes a repetition of
     * PV1-42: "Pending Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PL removePv142_PendingLocation(int rep) throws HL7Exception { 
        return (PL) super.removeRepetition(42, rep);
    }



    /**
     * Returns all repetitions of Prior Temporary Location (PV1-43).
     */
    public PL[] getPriorTemporaryLocation() {
    	PL[] retVal = this.getTypedField(43, new PL[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Prior Temporary Location (PV1-43).
     */
    public PL[] getPv143_PriorTemporaryLocation() {
    	PL[] retVal = this.getTypedField(43, new PL[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Prior Temporary Location (PV1-43).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPriorTemporaryLocationReps() {
    	return this.getReps(43);
    }


    /**
     * Returns a specific repetition of
     * PV1-43: "Prior Temporary Location" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public PL getPriorTemporaryLocation(int rep) { 
		PL retVal = this.getTypedField(43, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-43: "Prior Temporary Location" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public PL getPv143_PriorTemporaryLocation(int rep) { 
		PL retVal = this.getTypedField(43, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Prior Temporary Location (PV1-43).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv143_PriorTemporaryLocationReps() {
    	return this.getReps(43);
    }


    /**
     * Inserts a repetition of
     * PV1-43: "Prior Temporary Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PL insertPriorTemporaryLocation(int rep) throws HL7Exception { 
        return (PL) super.insertRepetition(43, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-43: "Prior Temporary Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PL insertPv143_PriorTemporaryLocation(int rep) throws HL7Exception { 
        return (PL) super.insertRepetition(43, rep);
    }


    /**
     * Removes a repetition of
     * PV1-43: "Prior Temporary Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PL removePriorTemporaryLocation(int rep) throws HL7Exception { 
        return (PL) super.removeRepetition(43, rep);
    }


    /**
     * Removes a repetition of
     * PV1-43: "Prior Temporary Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PL removePv143_PriorTemporaryLocation(int rep) throws HL7Exception { 
        return (PL) super.removeRepetition(43, rep);
    }



    /**
     * Returns all repetitions of Admit Date/Time (PV1-44).
     */
    public TS[] getAdmitDateTime() {
    	TS[] retVal = this.getTypedField(44, new TS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Admit Date/Time (PV1-44).
     */
    public TS[] getPv144_AdmitDateTime() {
    	TS[] retVal = this.getTypedField(44, new TS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Admit Date/Time (PV1-44).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getAdmitDateTimeReps() {
    	return this.getReps(44);
    }


    /**
     * Returns a specific repetition of
     * PV1-44: "Admit Date/Time" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getAdmitDateTime(int rep) { 
		TS retVal = this.getTypedField(44, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-44: "Admit Date/Time" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getPv144_AdmitDateTime(int rep) { 
		TS retVal = this.getTypedField(44, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Admit Date/Time (PV1-44).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv144_AdmitDateTimeReps() {
    	return this.getReps(44);
    }


    /**
     * Inserts a repetition of
     * PV1-44: "Admit Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertAdmitDateTime(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(44, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-44: "Admit Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertPv144_AdmitDateTime(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(44, rep);
    }


    /**
     * Removes a repetition of
     * PV1-44: "Admit Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeAdmitDateTime(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(44, rep);
    }


    /**
     * Removes a repetition of
     * PV1-44: "Admit Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removePv144_AdmitDateTime(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(44, rep);
    }



    /**
     * Returns all repetitions of Discharge Date/Time (PV1-45).
     */
    public TS[] getDischargeDateTime() {
    	TS[] retVal = this.getTypedField(45, new TS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Discharge Date/Time (PV1-45).
     */
    public TS[] getPv145_DischargeDateTime() {
    	TS[] retVal = this.getTypedField(45, new TS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Discharge Date/Time (PV1-45).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getDischargeDateTimeReps() {
    	return this.getReps(45);
    }


    /**
     * Returns a specific repetition of
     * PV1-45: "Discharge Date/Time" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getDischargeDateTime(int rep) { 
		TS retVal = this.getTypedField(45, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-45: "Discharge Date/Time" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getPv145_DischargeDateTime(int rep) { 
		TS retVal = this.getTypedField(45, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Discharge Date/Time (PV1-45).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv145_DischargeDateTimeReps() {
    	return this.getReps(45);
    }


    /**
     * Inserts a repetition of
     * PV1-45: "Discharge Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertDischargeDateTime(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(45, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-45: "Discharge Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertPv145_DischargeDateTime(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(45, rep);
    }


    /**
     * Removes a repetition of
     * PV1-45: "Discharge Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeDischargeDateTime(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(45, rep);
    }


    /**
     * Removes a repetition of
     * PV1-45: "Discharge Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removePv145_DischargeDateTime(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(45, rep);
    }



    /**
     * Returns all repetitions of Current Patient Balance (PV1-46).
     */
    public NM[] getCurrentPatientBalance() {
    	NM[] retVal = this.getTypedField(46, new NM[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Current Patient Balance (PV1-46).
     */
    public NM[] getPv146_CurrentPatientBalance() {
    	NM[] retVal = this.getTypedField(46, new NM[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Current Patient Balance (PV1-46).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getCurrentPatientBalanceReps() {
    	return this.getReps(46);
    }


    /**
     * Returns a specific repetition of
     * PV1-46: "Current Patient Balance" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getCurrentPatientBalance(int rep) { 
		NM retVal = this.getTypedField(46, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-46: "Current Patient Balance" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getPv146_CurrentPatientBalance(int rep) { 
		NM retVal = this.getTypedField(46, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Current Patient Balance (PV1-46).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv146_CurrentPatientBalanceReps() {
    	return this.getReps(46);
    }


    /**
     * Inserts a repetition of
     * PV1-46: "Current Patient Balance" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertCurrentPatientBalance(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(46, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-46: "Current Patient Balance" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertPv146_CurrentPatientBalance(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(46, rep);
    }


    /**
     * Removes a repetition of
     * PV1-46: "Current Patient Balance" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeCurrentPatientBalance(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(46, rep);
    }


    /**
     * Removes a repetition of
     * PV1-46: "Current Patient Balance" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removePv146_CurrentPatientBalance(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(46, rep);
    }



    /**
     * Returns all repetitions of Total Charges (PV1-47).
     */
    public NM[] getTotalCharges() {
    	NM[] retVal = this.getTypedField(47, new NM[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Total Charges (PV1-47).
     */
    public NM[] getPv147_TotalCharges() {
    	NM[] retVal = this.getTypedField(47, new NM[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Total Charges (PV1-47).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTotalChargesReps() {
    	return this.getReps(47);
    }


    /**
     * Returns a specific repetition of
     * PV1-47: "Total Charges" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getTotalCharges(int rep) { 
		NM retVal = this.getTypedField(47, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-47: "Total Charges" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getPv147_TotalCharges(int rep) { 
		NM retVal = this.getTypedField(47, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Total Charges (PV1-47).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv147_TotalChargesReps() {
    	return this.getReps(47);
    }


    /**
     * Inserts a repetition of
     * PV1-47: "Total Charges" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertTotalCharges(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(47, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-47: "Total Charges" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertPv147_TotalCharges(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(47, rep);
    }


    /**
     * Removes a repetition of
     * PV1-47: "Total Charges" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeTotalCharges(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(47, rep);
    }


    /**
     * Removes a repetition of
     * PV1-47: "Total Charges" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removePv147_TotalCharges(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(47, rep);
    }



    /**
     * Returns all repetitions of Total Adjustments (PV1-48).
     */
    public NM[] getTotalAdjustments() {
    	NM[] retVal = this.getTypedField(48, new NM[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Total Adjustments (PV1-48).
     */
    public NM[] getPv148_TotalAdjustments() {
    	NM[] retVal = this.getTypedField(48, new NM[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Total Adjustments (PV1-48).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTotalAdjustmentsReps() {
    	return this.getReps(48);
    }


    /**
     * Returns a specific repetition of
     * PV1-48: "Total Adjustments" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getTotalAdjustments(int rep) { 
		NM retVal = this.getTypedField(48, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-48: "Total Adjustments" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getPv148_TotalAdjustments(int rep) { 
		NM retVal = this.getTypedField(48, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Total Adjustments (PV1-48).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv148_TotalAdjustmentsReps() {
    	return this.getReps(48);
    }


    /**
     * Inserts a repetition of
     * PV1-48: "Total Adjustments" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertTotalAdjustments(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(48, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-48: "Total Adjustments" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertPv148_TotalAdjustments(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(48, rep);
    }


    /**
     * Removes a repetition of
     * PV1-48: "Total Adjustments" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeTotalAdjustments(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(48, rep);
    }


    /**
     * Removes a repetition of
     * PV1-48: "Total Adjustments" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removePv148_TotalAdjustments(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(48, rep);
    }



    /**
     * Returns all repetitions of Total Payments (PV1-49).
     */
    public NM[] getTotalPayments() {
    	NM[] retVal = this.getTypedField(49, new NM[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Total Payments (PV1-49).
     */
    public NM[] getPv149_TotalPayments() {
    	NM[] retVal = this.getTypedField(49, new NM[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Total Payments (PV1-49).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTotalPaymentsReps() {
    	return this.getReps(49);
    }


    /**
     * Returns a specific repetition of
     * PV1-49: "Total Payments" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getTotalPayments(int rep) { 
		NM retVal = this.getTypedField(49, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-49: "Total Payments" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getPv149_TotalPayments(int rep) { 
		NM retVal = this.getTypedField(49, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Total Payments (PV1-49).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv149_TotalPaymentsReps() {
    	return this.getReps(49);
    }


    /**
     * Inserts a repetition of
     * PV1-49: "Total Payments" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertTotalPayments(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(49, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-49: "Total Payments" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertPv149_TotalPayments(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(49, rep);
    }


    /**
     * Removes a repetition of
     * PV1-49: "Total Payments" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeTotalPayments(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(49, rep);
    }


    /**
     * Removes a repetition of
     * PV1-49: "Total Payments" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removePv149_TotalPayments(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(49, rep);
    }



    /**
     * Returns all repetitions of Alternate Visit ID (PV1-50).
     */
    public CX[] getAlternateVisitID() {
    	CX[] retVal = this.getTypedField(50, new CX[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Alternate Visit ID (PV1-50).
     */
    public CX[] getPv150_AlternateVisitID() {
    	CX[] retVal = this.getTypedField(50, new CX[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Alternate Visit ID (PV1-50).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getAlternateVisitIDReps() {
    	return this.getReps(50);
    }


    /**
     * Returns a specific repetition of
     * PV1-50: "Alternate Visit ID" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getAlternateVisitID(int rep) { 
		CX retVal = this.getTypedField(50, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-50: "Alternate Visit ID" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getPv150_AlternateVisitID(int rep) { 
		CX retVal = this.getTypedField(50, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Alternate Visit ID (PV1-50).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv150_AlternateVisitIDReps() {
    	return this.getReps(50);
    }


    /**
     * Inserts a repetition of
     * PV1-50: "Alternate Visit ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertAlternateVisitID(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(50, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-50: "Alternate Visit ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertPv150_AlternateVisitID(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(50, rep);
    }


    /**
     * Removes a repetition of
     * PV1-50: "Alternate Visit ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removeAlternateVisitID(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(50, rep);
    }


    /**
     * Removes a repetition of
     * PV1-50: "Alternate Visit ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removePv150_AlternateVisitID(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(50, rep);
    }



    /**
     * Returns all repetitions of Visit Indicator (PV1-51).
     */
    public IS[] getVisitIndicator() {
    	IS[] retVal = this.getTypedField(51, new IS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Visit Indicator (PV1-51).
     */
    public IS[] getPv151_VisitIndicator() {
    	IS[] retVal = this.getTypedField(51, new IS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Visit Indicator (PV1-51).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getVisitIndicatorReps() {
    	return this.getReps(51);
    }


    /**
     * Returns a specific repetition of
     * PV1-51: "Visit Indicator" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getVisitIndicator(int rep) { 
		IS retVal = this.getTypedField(51, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-51: "Visit Indicator" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getPv151_VisitIndicator(int rep) { 
		IS retVal = this.getTypedField(51, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Visit Indicator (PV1-51).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv151_VisitIndicatorReps() {
    	return this.getReps(51);
    }


    /**
     * Inserts a repetition of
     * PV1-51: "Visit Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertVisitIndicator(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(51, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-51: "Visit Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertPv151_VisitIndicator(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(51, rep);
    }


    /**
     * Removes a repetition of
     * PV1-51: "Visit Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeVisitIndicator(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(51, rep);
    }


    /**
     * Removes a repetition of
     * PV1-51: "Visit Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removePv151_VisitIndicator(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(51, rep);
    }



    /**
     * Returns all repetitions of Other Healthcare Provider (PV1-52).
     */
    public XCN[] getOtherHealthcareProvider() {
    	XCN[] retVal = this.getTypedField(52, new XCN[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Other Healthcare Provider (PV1-52).
     */
    public XCN[] getPv152_OtherHealthcareProvider() {
    	XCN[] retVal = this.getTypedField(52, new XCN[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Other Healthcare Provider (PV1-52).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOtherHealthcareProviderReps() {
    	return this.getReps(52);
    }


    /**
     * Returns a specific repetition of
     * PV1-52: "Other Healthcare Provider" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getOtherHealthcareProvider(int rep) { 
		XCN retVal = this.getTypedField(52, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PV1-52: "Other Healthcare Provider" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getPv152_OtherHealthcareProvider(int rep) { 
		XCN retVal = this.getTypedField(52, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Other Healthcare Provider (PV1-52).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPv152_OtherHealthcareProviderReps() {
    	return this.getReps(52);
    }


    /**
     * Inserts a repetition of
     * PV1-52: "Other Healthcare Provider" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertOtherHealthcareProvider(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(52, rep);
    }


    /**
     * Inserts a repetition of
     * PV1-52: "Other Healthcare Provider" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertPv152_OtherHealthcareProvider(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(52, rep);
    }


    /**
     * Removes a repetition of
     * PV1-52: "Other Healthcare Provider" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeOtherHealthcareProvider(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(52, rep);
    }


    /**
     * Removes a repetition of
     * PV1-52: "Other Healthcare Provider" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removePv152_OtherHealthcareProvider(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(52, rep);
    }






    /** {@inheritDoc} */   
    protected Type createNewTypeWithoutReflection(int field) {
       switch (field) {
          case 0: return new SI(getMessage());
          case 1: return new IS(getMessage(), new Integer( 4 ));
          case 2: return new PL(getMessage());
          case 3: return new IS(getMessage(), new Integer( 7 ));
          case 4: return new CX(getMessage());
          case 5: return new PL(getMessage());
          case 6: return new XCN(getMessage());
          case 7: return new XCN(getMessage());
          case 8: return new XCN(getMessage());
          case 9: return new IS(getMessage(), new Integer( 69 ));
          case 10: return new PL(getMessage());
          case 11: return new IS(getMessage(), new Integer( 87 ));
          case 12: return new IS(getMessage(), new Integer( 92 ));
          case 13: return new IS(getMessage(), new Integer( 23 ));
          case 14: return new IS(getMessage(), new Integer( 9 ));
          case 15: return new IS(getMessage(), new Integer( 99 ));
          case 16: return new XCN(getMessage());
          case 17: return new IS(getMessage(), new Integer( 18 ));
          case 18: return new CX(getMessage());
          case 19: return new FC(getMessage());
          case 20: return new IS(getMessage(), new Integer( 32 ));
          case 21: return new IS(getMessage(), new Integer( 45 ));
          case 22: return new IS(getMessage(), new Integer( 46 ));
          case 23: return new IS(getMessage(), new Integer( 44 ));
          case 24: return new DT(getMessage());
          case 25: return new NM(getMessage());
          case 26: return new NM(getMessage());
          case 27: return new IS(getMessage(), new Integer( 73 ));
          case 28: return new IS(getMessage(), new Integer( 110 ));
          case 29: return new DT(getMessage());
          case 30: return new IS(getMessage(), new Integer( 21 ));
          case 31: return new NM(getMessage());
          case 32: return new NM(getMessage());
          case 33: return new IS(getMessage(), new Integer( 111 ));
          case 34: return new DT(getMessage());
          case 35: return new IS(getMessage(), new Integer( 112 ));
          case 36: return new DLD(getMessage());
          case 37: return new CE(getMessage());
          case 38: return new IS(getMessage(), new Integer( 115 ));
          case 39: return new IS(getMessage(), new Integer( 116 ));
          case 40: return new IS(getMessage(), new Integer( 117 ));
          case 41: return new PL(getMessage());
          case 42: return new PL(getMessage());
          case 43: return new TS(getMessage());
          case 44: return new TS(getMessage());
          case 45: return new NM(getMessage());
          case 46: return new NM(getMessage());
          case 47: return new NM(getMessage());
          case 48: return new NM(getMessage());
          case 49: return new CX(getMessage());
          case 50: return new IS(getMessage(), new Integer( 326 ));
          case 51: return new XCN(getMessage());
          default: return null;
       }
   }


}

