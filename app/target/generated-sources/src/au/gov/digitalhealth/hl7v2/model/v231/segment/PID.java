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
 *<p>Represents an HL7 PID message segment (patient identification segment). 
 * This segment has the following fields:</p>
 * <ul>
     * <li>PID-1: Set ID - PID (SI) <b> </b>
     * <li>PID-2: Patient ID (CX) <b>optional repeating</b>
     * <li>PID-3: Patient Identifier List (CX) <b> repeating</b>
     * <li>PID-4: Alternate Patient ID - PID (CX) <b>optional repeating</b>
     * <li>PID-5: Patient Name (XPN) <b> repeating</b>
     * <li>PID-6: Mother's Maiden Name (XPN) <b>optional repeating</b>
     * <li>PID-7: Date/Time Of Birth (TS) <b>optional </b>
     * <li>PID-8: Sex (IS) <b>optional </b>
     * <li>PID-9: Patient Alias (XPN) <b>optional repeating</b>
     * <li>PID-10: Race (CE) <b>optional repeating</b>
     * <li>PID-11: Patient Address (XAD) <b> repeating</b>
     * <li>PID-12: County Code (IS) <b>optional repeating</b>
     * <li>PID-13: Phone Number - Home (XTN) <b>optional repeating</b>
     * <li>PID-14: Phone Number - Business (XTN) <b>optional repeating</b>
     * <li>PID-15: Primary Language (CE) <b>optional repeating</b>
     * <li>PID-16: Marital Status (CE) <b>optional repeating</b>
     * <li>PID-17: Religion (CE) <b>optional repeating</b>
     * <li>PID-18: Patient Account Number (CX) <b>optional repeating</b>
     * <li>PID-19: SSN Number - Patient (ST) <b>optional repeating</b>
     * <li>PID-20: Driver's License Number - Patient (DLN) <b>optional repeating</b>
     * <li>PID-21: Mother's Identifier (CX) <b>optional repeating</b>
     * <li>PID-22: Ethnic Group (CE) <b>optional repeating</b>
     * <li>PID-23: Birth Place (ST) <b>optional repeating</b>
     * <li>PID-24: Multiple Birth Indicator (ID) <b>optional repeating</b>
     * <li>PID-25: Birth Order (NM) <b>optional repeating</b>
     * <li>PID-26: Citizenship (CE) <b>optional repeating</b>
     * <li>PID-27: Veterans Military Status (CE) <b>optional repeating</b>
     * <li>PID-28: Nationality (CE) <b>optional repeating</b>
     * <li>PID-29: Patient Death Date and Time (TS) <b>optional repeating</b>
     * <li>PID-30: Patient Death Indicator (ID) <b>optional repeating</b>
 * </ul>
 */
@SuppressWarnings("unused")
public class PID extends AbstractSegment {

    /** 
     * Creates a new PID segment
     */
    public PID(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(SI.class, true, 1, 4, new Object[]{ getMessage() }, "Set ID - PID");
                                  this.add(CX.class, false, -1, 36, new Object[]{ getMessage() }, "Patient ID");
                                  this.add(CX.class, true, -1, 60, new Object[]{ getMessage() }, "Patient Identifier List");
                                  this.add(CX.class, false, -1, 36, new Object[]{ getMessage() }, "Alternate Patient ID - PID");
                                  this.add(XPN.class, true, -1, 200, new Object[]{ getMessage() }, "Patient Name");
                                  this.add(XPN.class, false, -1, 48, new Object[]{ getMessage() }, "Mother's Maiden Name");
                                  this.add(TS.class, false, 1, 26, new Object[]{ getMessage() }, "Date/Time Of Birth");
                                              this.add(IS.class, false, 1, 1, new Object[]{ getMessage(), new Integer(1) }, "Sex");
                                  this.add(XPN.class, false, -1, 48, new Object[]{ getMessage() }, "Patient Alias");
                                  this.add(CE.class, false, -1, 80, new Object[]{ getMessage() }, "Race");
                                  this.add(XAD.class, true, -1, 250, new Object[]{ getMessage() }, "Patient Address");
                                              this.add(IS.class, false, -1, 4, new Object[]{ getMessage(), new Integer(289) }, "County Code");
                                  this.add(XTN.class, false, -1, 40, new Object[]{ getMessage() }, "Phone Number - Home");
                                  this.add(XTN.class, false, -1, 40, new Object[]{ getMessage() }, "Phone Number - Business");
                                  this.add(CE.class, false, -1, 60, new Object[]{ getMessage() }, "Primary Language");
                                  this.add(CE.class, false, -1, 80, new Object[]{ getMessage() }, "Marital Status");
                                  this.add(CE.class, false, -1, 80, new Object[]{ getMessage() }, "Religion");
                                  this.add(CX.class, false, -1, 36, new Object[]{ getMessage() }, "Patient Account Number");
                                  this.add(ST.class, false, -1, 16, new Object[]{ getMessage() }, "SSN Number - Patient");
                                  this.add(DLN.class, false, -1, 25, new Object[]{ getMessage() }, "Driver's License Number - Patient");
                                  this.add(CX.class, false, -1, 36, new Object[]{ getMessage() }, "Mother's Identifier");
                                  this.add(CE.class, false, -1, 80, new Object[]{ getMessage() }, "Ethnic Group");
                                  this.add(ST.class, false, -1, 60, new Object[]{ getMessage() }, "Birth Place");
                                              this.add(ID.class, false, -1, 1, new Object[]{ getMessage(), new Integer(136) }, "Multiple Birth Indicator");
                                  this.add(NM.class, false, -1, 2, new Object[]{ getMessage() }, "Birth Order");
                                  this.add(CE.class, false, -1, 80, new Object[]{ getMessage() }, "Citizenship");
                                  this.add(CE.class, false, -1, 60, new Object[]{ getMessage() }, "Veterans Military Status");
                                  this.add(CE.class, false, -1, 80, new Object[]{ getMessage() }, "Nationality");
                                  this.add(TS.class, false, -1, 26, new Object[]{ getMessage() }, "Patient Death Date and Time");
                                              this.add(ID.class, false, -1, 1, new Object[]{ getMessage(), new Integer(136) }, "Patient Death Indicator");
       } catch(HL7Exception e) {
          log.error("Unexpected error creating PID - this is probably a bug in the source code generator.", e);
       }
    }



    /**
     * Returns
     * PID-1: "Set ID - PID" - creates it if necessary
     */
    public SI getSetIDPID() { 
		SI retVal = this.getTypedField(1, 0);
		return retVal;
    }
    
    /**
     * Returns
     * PID-1: "Set ID - PID" - creates it if necessary
     */
    public SI getPid1_SetIDPID() { 
		SI retVal = this.getTypedField(1, 0);
		return retVal;
    }


    /**
     * Returns all repetitions of Patient ID (PID-2).
     */
    public CX[] getPatientID() {
    	CX[] retVal = this.getTypedField(2, new CX[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Patient ID (PID-2).
     */
    public CX[] getPid2_PatientID() {
    	CX[] retVal = this.getTypedField(2, new CX[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Patient ID (PID-2).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPatientIDReps() {
    	return this.getReps(2);
    }


    /**
     * Returns a specific repetition of
     * PID-2: "Patient ID" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getPatientID(int rep) { 
		CX retVal = this.getTypedField(2, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PID-2: "Patient ID" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getPid2_PatientID(int rep) { 
		CX retVal = this.getTypedField(2, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Patient ID (PID-2).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid2_PatientIDReps() {
    	return this.getReps(2);
    }


    /**
     * Inserts a repetition of
     * PID-2: "Patient ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertPatientID(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(2, rep);
    }


    /**
     * Inserts a repetition of
     * PID-2: "Patient ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertPid2_PatientID(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(2, rep);
    }


    /**
     * Removes a repetition of
     * PID-2: "Patient ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removePatientID(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(2, rep);
    }


    /**
     * Removes a repetition of
     * PID-2: "Patient ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removePid2_PatientID(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(2, rep);
    }



    /**
     * Returns all repetitions of Patient Identifier List (PID-3).
     */
    public CX[] getPatientIdentifierList() {
    	CX[] retVal = this.getTypedField(3, new CX[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Patient Identifier List (PID-3).
     */
    public CX[] getPid3_PatientIdentifierList() {
    	CX[] retVal = this.getTypedField(3, new CX[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Patient Identifier List (PID-3).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPatientIdentifierListReps() {
    	return this.getReps(3);
    }


    /**
     * Returns a specific repetition of
     * PID-3: "Patient Identifier List" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getPatientIdentifierList(int rep) { 
		CX retVal = this.getTypedField(3, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PID-3: "Patient Identifier List" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getPid3_PatientIdentifierList(int rep) { 
		CX retVal = this.getTypedField(3, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Patient Identifier List (PID-3).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid3_PatientIdentifierListReps() {
    	return this.getReps(3);
    }


    /**
     * Inserts a repetition of
     * PID-3: "Patient Identifier List" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertPatientIdentifierList(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(3, rep);
    }


    /**
     * Inserts a repetition of
     * PID-3: "Patient Identifier List" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertPid3_PatientIdentifierList(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(3, rep);
    }


    /**
     * Removes a repetition of
     * PID-3: "Patient Identifier List" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removePatientIdentifierList(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(3, rep);
    }


    /**
     * Removes a repetition of
     * PID-3: "Patient Identifier List" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removePid3_PatientIdentifierList(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(3, rep);
    }



    /**
     * Returns all repetitions of Alternate Patient ID - PID (PID-4).
     */
    public CX[] getAlternatePatientIDPID() {
    	CX[] retVal = this.getTypedField(4, new CX[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Alternate Patient ID - PID (PID-4).
     */
    public CX[] getPid4_AlternatePatientIDPID() {
    	CX[] retVal = this.getTypedField(4, new CX[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Alternate Patient ID - PID (PID-4).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getAlternatePatientIDPIDReps() {
    	return this.getReps(4);
    }


    /**
     * Returns a specific repetition of
     * PID-4: "Alternate Patient ID - PID" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getAlternatePatientIDPID(int rep) { 
		CX retVal = this.getTypedField(4, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PID-4: "Alternate Patient ID - PID" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getPid4_AlternatePatientIDPID(int rep) { 
		CX retVal = this.getTypedField(4, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Alternate Patient ID - PID (PID-4).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid4_AlternatePatientIDPIDReps() {
    	return this.getReps(4);
    }


    /**
     * Inserts a repetition of
     * PID-4: "Alternate Patient ID - PID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertAlternatePatientIDPID(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(4, rep);
    }


    /**
     * Inserts a repetition of
     * PID-4: "Alternate Patient ID - PID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertPid4_AlternatePatientIDPID(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(4, rep);
    }


    /**
     * Removes a repetition of
     * PID-4: "Alternate Patient ID - PID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removeAlternatePatientIDPID(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(4, rep);
    }


    /**
     * Removes a repetition of
     * PID-4: "Alternate Patient ID - PID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removePid4_AlternatePatientIDPID(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(4, rep);
    }



    /**
     * Returns all repetitions of Patient Name (PID-5).
     */
    public XPN[] getPatientName() {
    	XPN[] retVal = this.getTypedField(5, new XPN[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Patient Name (PID-5).
     */
    public XPN[] getPid5_PatientName() {
    	XPN[] retVal = this.getTypedField(5, new XPN[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Patient Name (PID-5).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPatientNameReps() {
    	return this.getReps(5);
    }


    /**
     * Returns a specific repetition of
     * PID-5: "Patient Name" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XPN getPatientName(int rep) { 
		XPN retVal = this.getTypedField(5, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PID-5: "Patient Name" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XPN getPid5_PatientName(int rep) { 
		XPN retVal = this.getTypedField(5, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Patient Name (PID-5).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid5_PatientNameReps() {
    	return this.getReps(5);
    }


    /**
     * Inserts a repetition of
     * PID-5: "Patient Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN insertPatientName(int rep) throws HL7Exception { 
        return (XPN) super.insertRepetition(5, rep);
    }


    /**
     * Inserts a repetition of
     * PID-5: "Patient Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN insertPid5_PatientName(int rep) throws HL7Exception { 
        return (XPN) super.insertRepetition(5, rep);
    }


    /**
     * Removes a repetition of
     * PID-5: "Patient Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN removePatientName(int rep) throws HL7Exception { 
        return (XPN) super.removeRepetition(5, rep);
    }


    /**
     * Removes a repetition of
     * PID-5: "Patient Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN removePid5_PatientName(int rep) throws HL7Exception { 
        return (XPN) super.removeRepetition(5, rep);
    }



    /**
     * Returns all repetitions of Mother's Maiden Name (PID-6).
     */
    public XPN[] getMotherSMaidenName() {
    	XPN[] retVal = this.getTypedField(6, new XPN[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Mother's Maiden Name (PID-6).
     */
    public XPN[] getPid6_MotherSMaidenName() {
    	XPN[] retVal = this.getTypedField(6, new XPN[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Mother's Maiden Name (PID-6).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getMotherSMaidenNameReps() {
    	return this.getReps(6);
    }


    /**
     * Returns a specific repetition of
     * PID-6: "Mother's Maiden Name" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XPN getMotherSMaidenName(int rep) { 
		XPN retVal = this.getTypedField(6, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PID-6: "Mother's Maiden Name" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XPN getPid6_MotherSMaidenName(int rep) { 
		XPN retVal = this.getTypedField(6, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Mother's Maiden Name (PID-6).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid6_MotherSMaidenNameReps() {
    	return this.getReps(6);
    }


    /**
     * Inserts a repetition of
     * PID-6: "Mother's Maiden Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN insertMotherSMaidenName(int rep) throws HL7Exception { 
        return (XPN) super.insertRepetition(6, rep);
    }


    /**
     * Inserts a repetition of
     * PID-6: "Mother's Maiden Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN insertPid6_MotherSMaidenName(int rep) throws HL7Exception { 
        return (XPN) super.insertRepetition(6, rep);
    }


    /**
     * Removes a repetition of
     * PID-6: "Mother's Maiden Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN removeMotherSMaidenName(int rep) throws HL7Exception { 
        return (XPN) super.removeRepetition(6, rep);
    }


    /**
     * Removes a repetition of
     * PID-6: "Mother's Maiden Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN removePid6_MotherSMaidenName(int rep) throws HL7Exception { 
        return (XPN) super.removeRepetition(6, rep);
    }




    /**
     * Returns
     * PID-7: "Date/Time Of Birth" - creates it if necessary
     */
    public TS getDateTimeOfBirth() { 
		TS retVal = this.getTypedField(7, 0);
		return retVal;
    }
    
    /**
     * Returns
     * PID-7: "Date/Time Of Birth" - creates it if necessary
     */
    public TS getPid7_DateTimeOfBirth() { 
		TS retVal = this.getTypedField(7, 0);
		return retVal;
    }



    /**
     * Returns
     * PID-8: "Sex" - creates it if necessary
     */
    public IS getSex() { 
		IS retVal = this.getTypedField(8, 0);
		return retVal;
    }
    
    /**
     * Returns
     * PID-8: "Sex" - creates it if necessary
     */
    public IS getPid8_Sex() { 
		IS retVal = this.getTypedField(8, 0);
		return retVal;
    }


    /**
     * Returns all repetitions of Patient Alias (PID-9).
     */
    public XPN[] getPatientAlias() {
    	XPN[] retVal = this.getTypedField(9, new XPN[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Patient Alias (PID-9).
     */
    public XPN[] getPid9_PatientAlias() {
    	XPN[] retVal = this.getTypedField(9, new XPN[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Patient Alias (PID-9).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPatientAliasReps() {
    	return this.getReps(9);
    }


    /**
     * Returns a specific repetition of
     * PID-9: "Patient Alias" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XPN getPatientAlias(int rep) { 
		XPN retVal = this.getTypedField(9, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PID-9: "Patient Alias" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XPN getPid9_PatientAlias(int rep) { 
		XPN retVal = this.getTypedField(9, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Patient Alias (PID-9).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid9_PatientAliasReps() {
    	return this.getReps(9);
    }


    /**
     * Inserts a repetition of
     * PID-9: "Patient Alias" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN insertPatientAlias(int rep) throws HL7Exception { 
        return (XPN) super.insertRepetition(9, rep);
    }


    /**
     * Inserts a repetition of
     * PID-9: "Patient Alias" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN insertPid9_PatientAlias(int rep) throws HL7Exception { 
        return (XPN) super.insertRepetition(9, rep);
    }


    /**
     * Removes a repetition of
     * PID-9: "Patient Alias" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN removePatientAlias(int rep) throws HL7Exception { 
        return (XPN) super.removeRepetition(9, rep);
    }


    /**
     * Removes a repetition of
     * PID-9: "Patient Alias" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN removePid9_PatientAlias(int rep) throws HL7Exception { 
        return (XPN) super.removeRepetition(9, rep);
    }



    /**
     * Returns all repetitions of Race (PID-10).
     */
    public CE[] getRace() {
    	CE[] retVal = this.getTypedField(10, new CE[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Race (PID-10).
     */
    public CE[] getPid10_Race() {
    	CE[] retVal = this.getTypedField(10, new CE[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Race (PID-10).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRaceReps() {
    	return this.getReps(10);
    }


    /**
     * Returns a specific repetition of
     * PID-10: "Race" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getRace(int rep) { 
		CE retVal = this.getTypedField(10, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PID-10: "Race" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPid10_Race(int rep) { 
		CE retVal = this.getTypedField(10, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Race (PID-10).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid10_RaceReps() {
    	return this.getReps(10);
    }


    /**
     * Inserts a repetition of
     * PID-10: "Race" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertRace(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(10, rep);
    }


    /**
     * Inserts a repetition of
     * PID-10: "Race" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPid10_Race(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(10, rep);
    }


    /**
     * Removes a repetition of
     * PID-10: "Race" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeRace(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(10, rep);
    }


    /**
     * Removes a repetition of
     * PID-10: "Race" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePid10_Race(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(10, rep);
    }



    /**
     * Returns all repetitions of Patient Address (PID-11).
     */
    public XAD[] getPatientAddress() {
    	XAD[] retVal = this.getTypedField(11, new XAD[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Patient Address (PID-11).
     */
    public XAD[] getPid11_PatientAddress() {
    	XAD[] retVal = this.getTypedField(11, new XAD[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Patient Address (PID-11).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPatientAddressReps() {
    	return this.getReps(11);
    }


    /**
     * Returns a specific repetition of
     * PID-11: "Patient Address" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XAD getPatientAddress(int rep) { 
		XAD retVal = this.getTypedField(11, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PID-11: "Patient Address" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XAD getPid11_PatientAddress(int rep) { 
		XAD retVal = this.getTypedField(11, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Patient Address (PID-11).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid11_PatientAddressReps() {
    	return this.getReps(11);
    }


    /**
     * Inserts a repetition of
     * PID-11: "Patient Address" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XAD insertPatientAddress(int rep) throws HL7Exception { 
        return (XAD) super.insertRepetition(11, rep);
    }


    /**
     * Inserts a repetition of
     * PID-11: "Patient Address" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XAD insertPid11_PatientAddress(int rep) throws HL7Exception { 
        return (XAD) super.insertRepetition(11, rep);
    }


    /**
     * Removes a repetition of
     * PID-11: "Patient Address" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XAD removePatientAddress(int rep) throws HL7Exception { 
        return (XAD) super.removeRepetition(11, rep);
    }


    /**
     * Removes a repetition of
     * PID-11: "Patient Address" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XAD removePid11_PatientAddress(int rep) throws HL7Exception { 
        return (XAD) super.removeRepetition(11, rep);
    }



    /**
     * Returns all repetitions of County Code (PID-12).
     */
    public IS[] getCountyCode() {
    	IS[] retVal = this.getTypedField(12, new IS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of County Code (PID-12).
     */
    public IS[] getPid12_CountyCode() {
    	IS[] retVal = this.getTypedField(12, new IS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of County Code (PID-12).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getCountyCodeReps() {
    	return this.getReps(12);
    }


    /**
     * Returns a specific repetition of
     * PID-12: "County Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getCountyCode(int rep) { 
		IS retVal = this.getTypedField(12, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PID-12: "County Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getPid12_CountyCode(int rep) { 
		IS retVal = this.getTypedField(12, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of County Code (PID-12).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid12_CountyCodeReps() {
    	return this.getReps(12);
    }


    /**
     * Inserts a repetition of
     * PID-12: "County Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertCountyCode(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(12, rep);
    }


    /**
     * Inserts a repetition of
     * PID-12: "County Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertPid12_CountyCode(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(12, rep);
    }


    /**
     * Removes a repetition of
     * PID-12: "County Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeCountyCode(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(12, rep);
    }


    /**
     * Removes a repetition of
     * PID-12: "County Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removePid12_CountyCode(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(12, rep);
    }



    /**
     * Returns all repetitions of Phone Number - Home (PID-13).
     */
    public XTN[] getPhoneNumberHome() {
    	XTN[] retVal = this.getTypedField(13, new XTN[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Phone Number - Home (PID-13).
     */
    public XTN[] getPid13_PhoneNumberHome() {
    	XTN[] retVal = this.getTypedField(13, new XTN[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Phone Number - Home (PID-13).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPhoneNumberHomeReps() {
    	return this.getReps(13);
    }


    /**
     * Returns a specific repetition of
     * PID-13: "Phone Number - Home" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XTN getPhoneNumberHome(int rep) { 
		XTN retVal = this.getTypedField(13, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PID-13: "Phone Number - Home" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XTN getPid13_PhoneNumberHome(int rep) { 
		XTN retVal = this.getTypedField(13, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Phone Number - Home (PID-13).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid13_PhoneNumberHomeReps() {
    	return this.getReps(13);
    }


    /**
     * Inserts a repetition of
     * PID-13: "Phone Number - Home" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN insertPhoneNumberHome(int rep) throws HL7Exception { 
        return (XTN) super.insertRepetition(13, rep);
    }


    /**
     * Inserts a repetition of
     * PID-13: "Phone Number - Home" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN insertPid13_PhoneNumberHome(int rep) throws HL7Exception { 
        return (XTN) super.insertRepetition(13, rep);
    }


    /**
     * Removes a repetition of
     * PID-13: "Phone Number - Home" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN removePhoneNumberHome(int rep) throws HL7Exception { 
        return (XTN) super.removeRepetition(13, rep);
    }


    /**
     * Removes a repetition of
     * PID-13: "Phone Number - Home" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN removePid13_PhoneNumberHome(int rep) throws HL7Exception { 
        return (XTN) super.removeRepetition(13, rep);
    }



    /**
     * Returns all repetitions of Phone Number - Business (PID-14).
     */
    public XTN[] getPhoneNumberBusiness() {
    	XTN[] retVal = this.getTypedField(14, new XTN[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Phone Number - Business (PID-14).
     */
    public XTN[] getPid14_PhoneNumberBusiness() {
    	XTN[] retVal = this.getTypedField(14, new XTN[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Phone Number - Business (PID-14).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPhoneNumberBusinessReps() {
    	return this.getReps(14);
    }


    /**
     * Returns a specific repetition of
     * PID-14: "Phone Number - Business" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XTN getPhoneNumberBusiness(int rep) { 
		XTN retVal = this.getTypedField(14, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PID-14: "Phone Number - Business" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XTN getPid14_PhoneNumberBusiness(int rep) { 
		XTN retVal = this.getTypedField(14, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Phone Number - Business (PID-14).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid14_PhoneNumberBusinessReps() {
    	return this.getReps(14);
    }


    /**
     * Inserts a repetition of
     * PID-14: "Phone Number - Business" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN insertPhoneNumberBusiness(int rep) throws HL7Exception { 
        return (XTN) super.insertRepetition(14, rep);
    }


    /**
     * Inserts a repetition of
     * PID-14: "Phone Number - Business" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN insertPid14_PhoneNumberBusiness(int rep) throws HL7Exception { 
        return (XTN) super.insertRepetition(14, rep);
    }


    /**
     * Removes a repetition of
     * PID-14: "Phone Number - Business" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN removePhoneNumberBusiness(int rep) throws HL7Exception { 
        return (XTN) super.removeRepetition(14, rep);
    }


    /**
     * Removes a repetition of
     * PID-14: "Phone Number - Business" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN removePid14_PhoneNumberBusiness(int rep) throws HL7Exception { 
        return (XTN) super.removeRepetition(14, rep);
    }



    /**
     * Returns all repetitions of Primary Language (PID-15).
     */
    public CE[] getPrimaryLanguage() {
    	CE[] retVal = this.getTypedField(15, new CE[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Primary Language (PID-15).
     */
    public CE[] getPid15_PrimaryLanguage() {
    	CE[] retVal = this.getTypedField(15, new CE[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Primary Language (PID-15).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPrimaryLanguageReps() {
    	return this.getReps(15);
    }


    /**
     * Returns a specific repetition of
     * PID-15: "Primary Language" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPrimaryLanguage(int rep) { 
		CE retVal = this.getTypedField(15, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PID-15: "Primary Language" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPid15_PrimaryLanguage(int rep) { 
		CE retVal = this.getTypedField(15, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Primary Language (PID-15).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid15_PrimaryLanguageReps() {
    	return this.getReps(15);
    }


    /**
     * Inserts a repetition of
     * PID-15: "Primary Language" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPrimaryLanguage(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(15, rep);
    }


    /**
     * Inserts a repetition of
     * PID-15: "Primary Language" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPid15_PrimaryLanguage(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(15, rep);
    }


    /**
     * Removes a repetition of
     * PID-15: "Primary Language" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePrimaryLanguage(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(15, rep);
    }


    /**
     * Removes a repetition of
     * PID-15: "Primary Language" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePid15_PrimaryLanguage(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(15, rep);
    }



    /**
     * Returns all repetitions of Marital Status (PID-16).
     */
    public CE[] getMaritalStatus() {
    	CE[] retVal = this.getTypedField(16, new CE[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Marital Status (PID-16).
     */
    public CE[] getPid16_MaritalStatus() {
    	CE[] retVal = this.getTypedField(16, new CE[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Marital Status (PID-16).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getMaritalStatusReps() {
    	return this.getReps(16);
    }


    /**
     * Returns a specific repetition of
     * PID-16: "Marital Status" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getMaritalStatus(int rep) { 
		CE retVal = this.getTypedField(16, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PID-16: "Marital Status" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPid16_MaritalStatus(int rep) { 
		CE retVal = this.getTypedField(16, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Marital Status (PID-16).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid16_MaritalStatusReps() {
    	return this.getReps(16);
    }


    /**
     * Inserts a repetition of
     * PID-16: "Marital Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertMaritalStatus(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(16, rep);
    }


    /**
     * Inserts a repetition of
     * PID-16: "Marital Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPid16_MaritalStatus(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(16, rep);
    }


    /**
     * Removes a repetition of
     * PID-16: "Marital Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeMaritalStatus(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(16, rep);
    }


    /**
     * Removes a repetition of
     * PID-16: "Marital Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePid16_MaritalStatus(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(16, rep);
    }



    /**
     * Returns all repetitions of Religion (PID-17).
     */
    public CE[] getReligion() {
    	CE[] retVal = this.getTypedField(17, new CE[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Religion (PID-17).
     */
    public CE[] getPid17_Religion() {
    	CE[] retVal = this.getTypedField(17, new CE[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Religion (PID-17).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getReligionReps() {
    	return this.getReps(17);
    }


    /**
     * Returns a specific repetition of
     * PID-17: "Religion" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getReligion(int rep) { 
		CE retVal = this.getTypedField(17, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PID-17: "Religion" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPid17_Religion(int rep) { 
		CE retVal = this.getTypedField(17, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Religion (PID-17).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid17_ReligionReps() {
    	return this.getReps(17);
    }


    /**
     * Inserts a repetition of
     * PID-17: "Religion" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertReligion(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(17, rep);
    }


    /**
     * Inserts a repetition of
     * PID-17: "Religion" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPid17_Religion(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(17, rep);
    }


    /**
     * Removes a repetition of
     * PID-17: "Religion" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeReligion(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(17, rep);
    }


    /**
     * Removes a repetition of
     * PID-17: "Religion" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePid17_Religion(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(17, rep);
    }



    /**
     * Returns all repetitions of Patient Account Number (PID-18).
     */
    public CX[] getPatientAccountNumber() {
    	CX[] retVal = this.getTypedField(18, new CX[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Patient Account Number (PID-18).
     */
    public CX[] getPid18_PatientAccountNumber() {
    	CX[] retVal = this.getTypedField(18, new CX[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Patient Account Number (PID-18).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPatientAccountNumberReps() {
    	return this.getReps(18);
    }


    /**
     * Returns a specific repetition of
     * PID-18: "Patient Account Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getPatientAccountNumber(int rep) { 
		CX retVal = this.getTypedField(18, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PID-18: "Patient Account Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getPid18_PatientAccountNumber(int rep) { 
		CX retVal = this.getTypedField(18, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Patient Account Number (PID-18).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid18_PatientAccountNumberReps() {
    	return this.getReps(18);
    }


    /**
     * Inserts a repetition of
     * PID-18: "Patient Account Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertPatientAccountNumber(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(18, rep);
    }


    /**
     * Inserts a repetition of
     * PID-18: "Patient Account Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertPid18_PatientAccountNumber(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(18, rep);
    }


    /**
     * Removes a repetition of
     * PID-18: "Patient Account Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removePatientAccountNumber(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(18, rep);
    }


    /**
     * Removes a repetition of
     * PID-18: "Patient Account Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removePid18_PatientAccountNumber(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(18, rep);
    }



    /**
     * Returns all repetitions of SSN Number - Patient (PID-19).
     */
    public ST[] getSSNNumberPatient() {
    	ST[] retVal = this.getTypedField(19, new ST[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of SSN Number - Patient (PID-19).
     */
    public ST[] getPid19_SSNNumberPatient() {
    	ST[] retVal = this.getTypedField(19, new ST[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of SSN Number - Patient (PID-19).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getSSNNumberPatientReps() {
    	return this.getReps(19);
    }


    /**
     * Returns a specific repetition of
     * PID-19: "SSN Number - Patient" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getSSNNumberPatient(int rep) { 
		ST retVal = this.getTypedField(19, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PID-19: "SSN Number - Patient" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getPid19_SSNNumberPatient(int rep) { 
		ST retVal = this.getTypedField(19, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of SSN Number - Patient (PID-19).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid19_SSNNumberPatientReps() {
    	return this.getReps(19);
    }


    /**
     * Inserts a repetition of
     * PID-19: "SSN Number - Patient" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertSSNNumberPatient(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(19, rep);
    }


    /**
     * Inserts a repetition of
     * PID-19: "SSN Number - Patient" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertPid19_SSNNumberPatient(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(19, rep);
    }


    /**
     * Removes a repetition of
     * PID-19: "SSN Number - Patient" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeSSNNumberPatient(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(19, rep);
    }


    /**
     * Removes a repetition of
     * PID-19: "SSN Number - Patient" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removePid19_SSNNumberPatient(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(19, rep);
    }



    /**
     * Returns all repetitions of Driver's License Number - Patient (PID-20).
     */
    public DLN[] getDriverSLicenseNumberPatient() {
    	DLN[] retVal = this.getTypedField(20, new DLN[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Driver's License Number - Patient (PID-20).
     */
    public DLN[] getPid20_DriverSLicenseNumberPatient() {
    	DLN[] retVal = this.getTypedField(20, new DLN[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Driver's License Number - Patient (PID-20).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getDriverSLicenseNumberPatientReps() {
    	return this.getReps(20);
    }


    /**
     * Returns a specific repetition of
     * PID-20: "Driver's License Number - Patient" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public DLN getDriverSLicenseNumberPatient(int rep) { 
		DLN retVal = this.getTypedField(20, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PID-20: "Driver's License Number - Patient" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public DLN getPid20_DriverSLicenseNumberPatient(int rep) { 
		DLN retVal = this.getTypedField(20, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Driver's License Number - Patient (PID-20).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid20_DriverSLicenseNumberPatientReps() {
    	return this.getReps(20);
    }


    /**
     * Inserts a repetition of
     * PID-20: "Driver's License Number - Patient" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DLN insertDriverSLicenseNumberPatient(int rep) throws HL7Exception { 
        return (DLN) super.insertRepetition(20, rep);
    }


    /**
     * Inserts a repetition of
     * PID-20: "Driver's License Number - Patient" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DLN insertPid20_DriverSLicenseNumberPatient(int rep) throws HL7Exception { 
        return (DLN) super.insertRepetition(20, rep);
    }


    /**
     * Removes a repetition of
     * PID-20: "Driver's License Number - Patient" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DLN removeDriverSLicenseNumberPatient(int rep) throws HL7Exception { 
        return (DLN) super.removeRepetition(20, rep);
    }


    /**
     * Removes a repetition of
     * PID-20: "Driver's License Number - Patient" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DLN removePid20_DriverSLicenseNumberPatient(int rep) throws HL7Exception { 
        return (DLN) super.removeRepetition(20, rep);
    }



    /**
     * Returns all repetitions of Mother's Identifier (PID-21).
     */
    public CX[] getMotherSIdentifier() {
    	CX[] retVal = this.getTypedField(21, new CX[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Mother's Identifier (PID-21).
     */
    public CX[] getPid21_MotherSIdentifier() {
    	CX[] retVal = this.getTypedField(21, new CX[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Mother's Identifier (PID-21).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getMotherSIdentifierReps() {
    	return this.getReps(21);
    }


    /**
     * Returns a specific repetition of
     * PID-21: "Mother's Identifier" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getMotherSIdentifier(int rep) { 
		CX retVal = this.getTypedField(21, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PID-21: "Mother's Identifier" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getPid21_MotherSIdentifier(int rep) { 
		CX retVal = this.getTypedField(21, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Mother's Identifier (PID-21).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid21_MotherSIdentifierReps() {
    	return this.getReps(21);
    }


    /**
     * Inserts a repetition of
     * PID-21: "Mother's Identifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertMotherSIdentifier(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(21, rep);
    }


    /**
     * Inserts a repetition of
     * PID-21: "Mother's Identifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertPid21_MotherSIdentifier(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(21, rep);
    }


    /**
     * Removes a repetition of
     * PID-21: "Mother's Identifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removeMotherSIdentifier(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(21, rep);
    }


    /**
     * Removes a repetition of
     * PID-21: "Mother's Identifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removePid21_MotherSIdentifier(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(21, rep);
    }



    /**
     * Returns all repetitions of Ethnic Group (PID-22).
     */
    public CE[] getEthnicGroup() {
    	CE[] retVal = this.getTypedField(22, new CE[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Ethnic Group (PID-22).
     */
    public CE[] getPid22_EthnicGroup() {
    	CE[] retVal = this.getTypedField(22, new CE[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Ethnic Group (PID-22).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getEthnicGroupReps() {
    	return this.getReps(22);
    }


    /**
     * Returns a specific repetition of
     * PID-22: "Ethnic Group" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getEthnicGroup(int rep) { 
		CE retVal = this.getTypedField(22, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PID-22: "Ethnic Group" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPid22_EthnicGroup(int rep) { 
		CE retVal = this.getTypedField(22, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Ethnic Group (PID-22).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid22_EthnicGroupReps() {
    	return this.getReps(22);
    }


    /**
     * Inserts a repetition of
     * PID-22: "Ethnic Group" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertEthnicGroup(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(22, rep);
    }


    /**
     * Inserts a repetition of
     * PID-22: "Ethnic Group" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPid22_EthnicGroup(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(22, rep);
    }


    /**
     * Removes a repetition of
     * PID-22: "Ethnic Group" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeEthnicGroup(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(22, rep);
    }


    /**
     * Removes a repetition of
     * PID-22: "Ethnic Group" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePid22_EthnicGroup(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(22, rep);
    }



    /**
     * Returns all repetitions of Birth Place (PID-23).
     */
    public ST[] getBirthPlace() {
    	ST[] retVal = this.getTypedField(23, new ST[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Birth Place (PID-23).
     */
    public ST[] getPid23_BirthPlace() {
    	ST[] retVal = this.getTypedField(23, new ST[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Birth Place (PID-23).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getBirthPlaceReps() {
    	return this.getReps(23);
    }


    /**
     * Returns a specific repetition of
     * PID-23: "Birth Place" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getBirthPlace(int rep) { 
		ST retVal = this.getTypedField(23, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PID-23: "Birth Place" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getPid23_BirthPlace(int rep) { 
		ST retVal = this.getTypedField(23, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Birth Place (PID-23).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid23_BirthPlaceReps() {
    	return this.getReps(23);
    }


    /**
     * Inserts a repetition of
     * PID-23: "Birth Place" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertBirthPlace(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(23, rep);
    }


    /**
     * Inserts a repetition of
     * PID-23: "Birth Place" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertPid23_BirthPlace(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(23, rep);
    }


    /**
     * Removes a repetition of
     * PID-23: "Birth Place" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeBirthPlace(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(23, rep);
    }


    /**
     * Removes a repetition of
     * PID-23: "Birth Place" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removePid23_BirthPlace(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(23, rep);
    }



    /**
     * Returns all repetitions of Multiple Birth Indicator (PID-24).
     */
    public ID[] getMultipleBirthIndicator() {
    	ID[] retVal = this.getTypedField(24, new ID[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Multiple Birth Indicator (PID-24).
     */
    public ID[] getPid24_MultipleBirthIndicator() {
    	ID[] retVal = this.getTypedField(24, new ID[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Multiple Birth Indicator (PID-24).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getMultipleBirthIndicatorReps() {
    	return this.getReps(24);
    }


    /**
     * Returns a specific repetition of
     * PID-24: "Multiple Birth Indicator" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getMultipleBirthIndicator(int rep) { 
		ID retVal = this.getTypedField(24, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PID-24: "Multiple Birth Indicator" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getPid24_MultipleBirthIndicator(int rep) { 
		ID retVal = this.getTypedField(24, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Multiple Birth Indicator (PID-24).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid24_MultipleBirthIndicatorReps() {
    	return this.getReps(24);
    }


    /**
     * Inserts a repetition of
     * PID-24: "Multiple Birth Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertMultipleBirthIndicator(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(24, rep);
    }


    /**
     * Inserts a repetition of
     * PID-24: "Multiple Birth Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertPid24_MultipleBirthIndicator(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(24, rep);
    }


    /**
     * Removes a repetition of
     * PID-24: "Multiple Birth Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeMultipleBirthIndicator(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(24, rep);
    }


    /**
     * Removes a repetition of
     * PID-24: "Multiple Birth Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removePid24_MultipleBirthIndicator(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(24, rep);
    }



    /**
     * Returns all repetitions of Birth Order (PID-25).
     */
    public NM[] getBirthOrder() {
    	NM[] retVal = this.getTypedField(25, new NM[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Birth Order (PID-25).
     */
    public NM[] getPid25_BirthOrder() {
    	NM[] retVal = this.getTypedField(25, new NM[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Birth Order (PID-25).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getBirthOrderReps() {
    	return this.getReps(25);
    }


    /**
     * Returns a specific repetition of
     * PID-25: "Birth Order" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getBirthOrder(int rep) { 
		NM retVal = this.getTypedField(25, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PID-25: "Birth Order" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getPid25_BirthOrder(int rep) { 
		NM retVal = this.getTypedField(25, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Birth Order (PID-25).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid25_BirthOrderReps() {
    	return this.getReps(25);
    }


    /**
     * Inserts a repetition of
     * PID-25: "Birth Order" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertBirthOrder(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(25, rep);
    }


    /**
     * Inserts a repetition of
     * PID-25: "Birth Order" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertPid25_BirthOrder(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(25, rep);
    }


    /**
     * Removes a repetition of
     * PID-25: "Birth Order" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeBirthOrder(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(25, rep);
    }


    /**
     * Removes a repetition of
     * PID-25: "Birth Order" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removePid25_BirthOrder(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(25, rep);
    }



    /**
     * Returns all repetitions of Citizenship (PID-26).
     */
    public CE[] getCitizenship() {
    	CE[] retVal = this.getTypedField(26, new CE[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Citizenship (PID-26).
     */
    public CE[] getPid26_Citizenship() {
    	CE[] retVal = this.getTypedField(26, new CE[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Citizenship (PID-26).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getCitizenshipReps() {
    	return this.getReps(26);
    }


    /**
     * Returns a specific repetition of
     * PID-26: "Citizenship" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getCitizenship(int rep) { 
		CE retVal = this.getTypedField(26, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PID-26: "Citizenship" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPid26_Citizenship(int rep) { 
		CE retVal = this.getTypedField(26, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Citizenship (PID-26).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid26_CitizenshipReps() {
    	return this.getReps(26);
    }


    /**
     * Inserts a repetition of
     * PID-26: "Citizenship" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertCitizenship(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(26, rep);
    }


    /**
     * Inserts a repetition of
     * PID-26: "Citizenship" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPid26_Citizenship(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(26, rep);
    }


    /**
     * Removes a repetition of
     * PID-26: "Citizenship" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeCitizenship(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(26, rep);
    }


    /**
     * Removes a repetition of
     * PID-26: "Citizenship" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePid26_Citizenship(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(26, rep);
    }



    /**
     * Returns all repetitions of Veterans Military Status (PID-27).
     */
    public CE[] getVeteransMilitaryStatus() {
    	CE[] retVal = this.getTypedField(27, new CE[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Veterans Military Status (PID-27).
     */
    public CE[] getPid27_VeteransMilitaryStatus() {
    	CE[] retVal = this.getTypedField(27, new CE[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Veterans Military Status (PID-27).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getVeteransMilitaryStatusReps() {
    	return this.getReps(27);
    }


    /**
     * Returns a specific repetition of
     * PID-27: "Veterans Military Status" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getVeteransMilitaryStatus(int rep) { 
		CE retVal = this.getTypedField(27, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PID-27: "Veterans Military Status" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPid27_VeteransMilitaryStatus(int rep) { 
		CE retVal = this.getTypedField(27, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Veterans Military Status (PID-27).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid27_VeteransMilitaryStatusReps() {
    	return this.getReps(27);
    }


    /**
     * Inserts a repetition of
     * PID-27: "Veterans Military Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertVeteransMilitaryStatus(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(27, rep);
    }


    /**
     * Inserts a repetition of
     * PID-27: "Veterans Military Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPid27_VeteransMilitaryStatus(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(27, rep);
    }


    /**
     * Removes a repetition of
     * PID-27: "Veterans Military Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeVeteransMilitaryStatus(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(27, rep);
    }


    /**
     * Removes a repetition of
     * PID-27: "Veterans Military Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePid27_VeteransMilitaryStatus(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(27, rep);
    }



    /**
     * Returns all repetitions of Nationality (PID-28).
     */
    public CE[] getNationality() {
    	CE[] retVal = this.getTypedField(28, new CE[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Nationality (PID-28).
     */
    public CE[] getPid28_Nationality() {
    	CE[] retVal = this.getTypedField(28, new CE[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Nationality (PID-28).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNationalityReps() {
    	return this.getReps(28);
    }


    /**
     * Returns a specific repetition of
     * PID-28: "Nationality" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getNationality(int rep) { 
		CE retVal = this.getTypedField(28, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PID-28: "Nationality" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPid28_Nationality(int rep) { 
		CE retVal = this.getTypedField(28, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Nationality (PID-28).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid28_NationalityReps() {
    	return this.getReps(28);
    }


    /**
     * Inserts a repetition of
     * PID-28: "Nationality" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertNationality(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(28, rep);
    }


    /**
     * Inserts a repetition of
     * PID-28: "Nationality" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPid28_Nationality(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(28, rep);
    }


    /**
     * Removes a repetition of
     * PID-28: "Nationality" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeNationality(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(28, rep);
    }


    /**
     * Removes a repetition of
     * PID-28: "Nationality" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePid28_Nationality(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(28, rep);
    }



    /**
     * Returns all repetitions of Patient Death Date and Time (PID-29).
     */
    public TS[] getPatientDeathDateAndTime() {
    	TS[] retVal = this.getTypedField(29, new TS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Patient Death Date and Time (PID-29).
     */
    public TS[] getPid29_PatientDeathDateAndTime() {
    	TS[] retVal = this.getTypedField(29, new TS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Patient Death Date and Time (PID-29).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPatientDeathDateAndTimeReps() {
    	return this.getReps(29);
    }


    /**
     * Returns a specific repetition of
     * PID-29: "Patient Death Date and Time" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getPatientDeathDateAndTime(int rep) { 
		TS retVal = this.getTypedField(29, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PID-29: "Patient Death Date and Time" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getPid29_PatientDeathDateAndTime(int rep) { 
		TS retVal = this.getTypedField(29, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Patient Death Date and Time (PID-29).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid29_PatientDeathDateAndTimeReps() {
    	return this.getReps(29);
    }


    /**
     * Inserts a repetition of
     * PID-29: "Patient Death Date and Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertPatientDeathDateAndTime(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(29, rep);
    }


    /**
     * Inserts a repetition of
     * PID-29: "Patient Death Date and Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertPid29_PatientDeathDateAndTime(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(29, rep);
    }


    /**
     * Removes a repetition of
     * PID-29: "Patient Death Date and Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removePatientDeathDateAndTime(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(29, rep);
    }


    /**
     * Removes a repetition of
     * PID-29: "Patient Death Date and Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removePid29_PatientDeathDateAndTime(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(29, rep);
    }



    /**
     * Returns all repetitions of Patient Death Indicator (PID-30).
     */
    public ID[] getPatientDeathIndicator() {
    	ID[] retVal = this.getTypedField(30, new ID[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Patient Death Indicator (PID-30).
     */
    public ID[] getPid30_PatientDeathIndicator() {
    	ID[] retVal = this.getTypedField(30, new ID[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Patient Death Indicator (PID-30).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPatientDeathIndicatorReps() {
    	return this.getReps(30);
    }


    /**
     * Returns a specific repetition of
     * PID-30: "Patient Death Indicator" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getPatientDeathIndicator(int rep) { 
		ID retVal = this.getTypedField(30, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * PID-30: "Patient Death Indicator" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getPid30_PatientDeathIndicator(int rep) { 
		ID retVal = this.getTypedField(30, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Patient Death Indicator (PID-30).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid30_PatientDeathIndicatorReps() {
    	return this.getReps(30);
    }


    /**
     * Inserts a repetition of
     * PID-30: "Patient Death Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertPatientDeathIndicator(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(30, rep);
    }


    /**
     * Inserts a repetition of
     * PID-30: "Patient Death Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertPid30_PatientDeathIndicator(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(30, rep);
    }


    /**
     * Removes a repetition of
     * PID-30: "Patient Death Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removePatientDeathIndicator(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(30, rep);
    }


    /**
     * Removes a repetition of
     * PID-30: "Patient Death Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removePid30_PatientDeathIndicator(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(30, rep);
    }






    /** {@inheritDoc} */   
    protected Type createNewTypeWithoutReflection(int field) {
       switch (field) {
          case 0: return new SI(getMessage());
          case 1: return new CX(getMessage());
          case 2: return new CX(getMessage());
          case 3: return new CX(getMessage());
          case 4: return new XPN(getMessage());
          case 5: return new XPN(getMessage());
          case 6: return new TS(getMessage());
          case 7: return new IS(getMessage(), new Integer( 1 ));
          case 8: return new XPN(getMessage());
          case 9: return new CE(getMessage());
          case 10: return new XAD(getMessage());
          case 11: return new IS(getMessage(), new Integer( 289 ));
          case 12: return new XTN(getMessage());
          case 13: return new XTN(getMessage());
          case 14: return new CE(getMessage());
          case 15: return new CE(getMessage());
          case 16: return new CE(getMessage());
          case 17: return new CX(getMessage());
          case 18: return new ST(getMessage());
          case 19: return new DLN(getMessage());
          case 20: return new CX(getMessage());
          case 21: return new CE(getMessage());
          case 22: return new ST(getMessage());
          case 23: return new ID(getMessage(), new Integer( 136 ));
          case 24: return new NM(getMessage());
          case 25: return new CE(getMessage());
          case 26: return new CE(getMessage());
          case 27: return new CE(getMessage());
          case 28: return new TS(getMessage());
          case 29: return new ID(getMessage(), new Integer( 136 ));
          default: return null;
       }
   }


}

