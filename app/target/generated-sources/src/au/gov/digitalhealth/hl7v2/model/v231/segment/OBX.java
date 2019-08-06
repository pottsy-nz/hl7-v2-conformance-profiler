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
 *<p>Represents an HL7 OBX message segment (observation/result segment). 
 * This segment has the following fields:</p>
 * <ul>
     * <li>OBX-1: Set ID - OBX (SI) <b> </b>
     * <li>OBX-2: Value Type (ID) <b> </b>
     * <li>OBX-3: Observation Identifier (CE) <b> </b>
     * <li>OBX-4: Observation Sub-ID (ST) <b>optional repeating</b>
     * <li>OBX-5: Observation Value (Varies) <b> </b>
     * <li>OBX-6: Units (CE) <b>optional repeating</b>
     * <li>OBX-7: References Range (ST) <b>optional repeating</b>
     * <li>OBX-8: Abnormal Flags (ID) <b>optional repeating</b>
     * <li>OBX-9: Probability (NM) <b>optional repeating</b>
     * <li>OBX-10: Nature of Abnormal Test (ID) <b>optional repeating</b>
     * <li>OBX-11: Observation Result Status (ID) <b> </b>
     * <li>OBX-12: Date Last Obs Normal Values (TS) <b>optional repeating</b>
     * <li>OBX-13: User Defined Access Checks (ST) <b>optional repeating</b>
     * <li>OBX-14: Date/Time of the Observation (TS) <b>optional repeating</b>
     * <li>OBX-15: Producer's ID (CE) <b>optional repeating</b>
     * <li>OBX-16: Responsible Observer (XCN) <b>optional repeating</b>
     * <li>OBX-17: Observation Method (CE) <b>optional repeating</b>
 * </ul>
 */
@SuppressWarnings("unused")
public class OBX extends AbstractSegment {

    /** 
     * Creates a new OBX segment
     */
    public OBX(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(SI.class, true, 1, 4, new Object[]{ getMessage() }, "Set ID - OBX");
                                              this.add(ID.class, true, 1, 3, new Object[]{ getMessage(), new Integer(125) }, "Value Type");
                                  this.add(CE.class, true, 1, 80, new Object[]{ getMessage() }, "Observation Identifier");
                                  this.add(ST.class, false, -1, 20, new Object[]{ getMessage() }, "Observation Sub-ID");
                                  this.add(Varies.class, true, 1, 16777216, new Object[]{ getMessage() }, "Observation Value");
                                  this.add(CE.class, false, -1, 60, new Object[]{ getMessage() }, "Units");
                                  this.add(ST.class, false, -1, 60, new Object[]{ getMessage() }, "References Range");
                                              this.add(ID.class, false, -1, 5, new Object[]{ getMessage(), new Integer(78) }, "Abnormal Flags");
                                  this.add(NM.class, false, -1, 5, new Object[]{ getMessage() }, "Probability");
                                              this.add(ID.class, false, -1, 2, new Object[]{ getMessage(), new Integer(80) }, "Nature of Abnormal Test");
                                              this.add(ID.class, true, 1, 1, new Object[]{ getMessage(), new Integer(85) }, "Observation Result Status");
                                  this.add(TS.class, false, -1, 26, new Object[]{ getMessage() }, "Date Last Obs Normal Values");
                                  this.add(ST.class, false, -1, 20, new Object[]{ getMessage() }, "User Defined Access Checks");
                                  this.add(TS.class, false, -1, 26, new Object[]{ getMessage() }, "Date/Time of the Observation");
                                  this.add(CE.class, false, -1, 60, new Object[]{ getMessage() }, "Producer's ID");
                                  this.add(XCN.class, false, -1, 80, new Object[]{ getMessage() }, "Responsible Observer");
                                  this.add(CE.class, false, -1, 60, new Object[]{ getMessage() }, "Observation Method");
       } catch(HL7Exception e) {
          log.error("Unexpected error creating OBX - this is probably a bug in the source code generator.", e);
       }
    }



    /**
     * Returns
     * OBX-1: "Set ID - OBX" - creates it if necessary
     */
    public SI getSetIDOBX() { 
		SI retVal = this.getTypedField(1, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OBX-1: "Set ID - OBX" - creates it if necessary
     */
    public SI getObx1_SetIDOBX() { 
		SI retVal = this.getTypedField(1, 0);
		return retVal;
    }



    /**
     * Returns
     * OBX-2: "Value Type" - creates it if necessary
     */
    public ID getValueType() { 
		ID retVal = this.getTypedField(2, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OBX-2: "Value Type" - creates it if necessary
     */
    public ID getObx2_ValueType() { 
		ID retVal = this.getTypedField(2, 0);
		return retVal;
    }



    /**
     * Returns
     * OBX-3: "Observation Identifier" - creates it if necessary
     */
    public CE getObservationIdentifier() { 
		CE retVal = this.getTypedField(3, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OBX-3: "Observation Identifier" - creates it if necessary
     */
    public CE getObx3_ObservationIdentifier() { 
		CE retVal = this.getTypedField(3, 0);
		return retVal;
    }


    /**
     * Returns all repetitions of Observation Sub-ID (OBX-4).
     */
    public ST[] getObservationSubID() {
    	ST[] retVal = this.getTypedField(4, new ST[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Observation Sub-ID (OBX-4).
     */
    public ST[] getObx4_ObservationSubID() {
    	ST[] retVal = this.getTypedField(4, new ST[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Observation Sub-ID (OBX-4).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObservationSubIDReps() {
    	return this.getReps(4);
    }


    /**
     * Returns a specific repetition of
     * OBX-4: "Observation Sub-ID" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getObservationSubID(int rep) { 
		ST retVal = this.getTypedField(4, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBX-4: "Observation Sub-ID" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getObx4_ObservationSubID(int rep) { 
		ST retVal = this.getTypedField(4, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Observation Sub-ID (OBX-4).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObx4_ObservationSubIDReps() {
    	return this.getReps(4);
    }


    /**
     * Inserts a repetition of
     * OBX-4: "Observation Sub-ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertObservationSubID(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(4, rep);
    }


    /**
     * Inserts a repetition of
     * OBX-4: "Observation Sub-ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertObx4_ObservationSubID(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(4, rep);
    }


    /**
     * Removes a repetition of
     * OBX-4: "Observation Sub-ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeObservationSubID(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(4, rep);
    }


    /**
     * Removes a repetition of
     * OBX-4: "Observation Sub-ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeObx4_ObservationSubID(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(4, rep);
    }




    /**
     * Returns
     * OBX-5: "Observation Value" - creates it if necessary
     */
    public Varies getObservationValue() { 
		Varies retVal = this.getTypedField(5, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OBX-5: "Observation Value" - creates it if necessary
     */
    public Varies getObx5_ObservationValue() { 
		Varies retVal = this.getTypedField(5, 0);
		return retVal;
    }


    /**
     * Returns all repetitions of Units (OBX-6).
     */
    public CE[] getUnits() {
    	CE[] retVal = this.getTypedField(6, new CE[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Units (OBX-6).
     */
    public CE[] getObx6_Units() {
    	CE[] retVal = this.getTypedField(6, new CE[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Units (OBX-6).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getUnitsReps() {
    	return this.getReps(6);
    }


    /**
     * Returns a specific repetition of
     * OBX-6: "Units" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getUnits(int rep) { 
		CE retVal = this.getTypedField(6, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBX-6: "Units" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getObx6_Units(int rep) { 
		CE retVal = this.getTypedField(6, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Units (OBX-6).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObx6_UnitsReps() {
    	return this.getReps(6);
    }


    /**
     * Inserts a repetition of
     * OBX-6: "Units" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertUnits(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(6, rep);
    }


    /**
     * Inserts a repetition of
     * OBX-6: "Units" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertObx6_Units(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(6, rep);
    }


    /**
     * Removes a repetition of
     * OBX-6: "Units" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeUnits(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(6, rep);
    }


    /**
     * Removes a repetition of
     * OBX-6: "Units" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeObx6_Units(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(6, rep);
    }



    /**
     * Returns all repetitions of References Range (OBX-7).
     */
    public ST[] getReferencesRange() {
    	ST[] retVal = this.getTypedField(7, new ST[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of References Range (OBX-7).
     */
    public ST[] getObx7_ReferencesRange() {
    	ST[] retVal = this.getTypedField(7, new ST[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of References Range (OBX-7).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getReferencesRangeReps() {
    	return this.getReps(7);
    }


    /**
     * Returns a specific repetition of
     * OBX-7: "References Range" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getReferencesRange(int rep) { 
		ST retVal = this.getTypedField(7, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBX-7: "References Range" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getObx7_ReferencesRange(int rep) { 
		ST retVal = this.getTypedField(7, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of References Range (OBX-7).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObx7_ReferencesRangeReps() {
    	return this.getReps(7);
    }


    /**
     * Inserts a repetition of
     * OBX-7: "References Range" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertReferencesRange(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(7, rep);
    }


    /**
     * Inserts a repetition of
     * OBX-7: "References Range" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertObx7_ReferencesRange(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(7, rep);
    }


    /**
     * Removes a repetition of
     * OBX-7: "References Range" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeReferencesRange(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(7, rep);
    }


    /**
     * Removes a repetition of
     * OBX-7: "References Range" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeObx7_ReferencesRange(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(7, rep);
    }



    /**
     * Returns all repetitions of Abnormal Flags (OBX-8).
     */
    public ID[] getAbnormalFlags() {
    	ID[] retVal = this.getTypedField(8, new ID[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Abnormal Flags (OBX-8).
     */
    public ID[] getObx8_AbnormalFlags() {
    	ID[] retVal = this.getTypedField(8, new ID[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Abnormal Flags (OBX-8).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getAbnormalFlagsReps() {
    	return this.getReps(8);
    }


    /**
     * Returns a specific repetition of
     * OBX-8: "Abnormal Flags" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getAbnormalFlags(int rep) { 
		ID retVal = this.getTypedField(8, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBX-8: "Abnormal Flags" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getObx8_AbnormalFlags(int rep) { 
		ID retVal = this.getTypedField(8, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Abnormal Flags (OBX-8).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObx8_AbnormalFlagsReps() {
    	return this.getReps(8);
    }


    /**
     * Inserts a repetition of
     * OBX-8: "Abnormal Flags" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertAbnormalFlags(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(8, rep);
    }


    /**
     * Inserts a repetition of
     * OBX-8: "Abnormal Flags" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertObx8_AbnormalFlags(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(8, rep);
    }


    /**
     * Removes a repetition of
     * OBX-8: "Abnormal Flags" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeAbnormalFlags(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(8, rep);
    }


    /**
     * Removes a repetition of
     * OBX-8: "Abnormal Flags" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeObx8_AbnormalFlags(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(8, rep);
    }



    /**
     * Returns all repetitions of Probability (OBX-9).
     */
    public NM[] getProbability() {
    	NM[] retVal = this.getTypedField(9, new NM[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Probability (OBX-9).
     */
    public NM[] getObx9_Probability() {
    	NM[] retVal = this.getTypedField(9, new NM[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Probability (OBX-9).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getProbabilityReps() {
    	return this.getReps(9);
    }


    /**
     * Returns a specific repetition of
     * OBX-9: "Probability" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getProbability(int rep) { 
		NM retVal = this.getTypedField(9, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBX-9: "Probability" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getObx9_Probability(int rep) { 
		NM retVal = this.getTypedField(9, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Probability (OBX-9).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObx9_ProbabilityReps() {
    	return this.getReps(9);
    }


    /**
     * Inserts a repetition of
     * OBX-9: "Probability" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertProbability(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(9, rep);
    }


    /**
     * Inserts a repetition of
     * OBX-9: "Probability" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertObx9_Probability(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(9, rep);
    }


    /**
     * Removes a repetition of
     * OBX-9: "Probability" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeProbability(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(9, rep);
    }


    /**
     * Removes a repetition of
     * OBX-9: "Probability" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeObx9_Probability(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(9, rep);
    }



    /**
     * Returns all repetitions of Nature of Abnormal Test (OBX-10).
     */
    public ID[] getNatureOfAbnormalTest() {
    	ID[] retVal = this.getTypedField(10, new ID[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Nature of Abnormal Test (OBX-10).
     */
    public ID[] getObx10_NatureOfAbnormalTest() {
    	ID[] retVal = this.getTypedField(10, new ID[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Nature of Abnormal Test (OBX-10).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNatureOfAbnormalTestReps() {
    	return this.getReps(10);
    }


    /**
     * Returns a specific repetition of
     * OBX-10: "Nature of Abnormal Test" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getNatureOfAbnormalTest(int rep) { 
		ID retVal = this.getTypedField(10, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBX-10: "Nature of Abnormal Test" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getObx10_NatureOfAbnormalTest(int rep) { 
		ID retVal = this.getTypedField(10, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Nature of Abnormal Test (OBX-10).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObx10_NatureOfAbnormalTestReps() {
    	return this.getReps(10);
    }


    /**
     * Inserts a repetition of
     * OBX-10: "Nature of Abnormal Test" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertNatureOfAbnormalTest(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(10, rep);
    }


    /**
     * Inserts a repetition of
     * OBX-10: "Nature of Abnormal Test" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertObx10_NatureOfAbnormalTest(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(10, rep);
    }


    /**
     * Removes a repetition of
     * OBX-10: "Nature of Abnormal Test" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeNatureOfAbnormalTest(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(10, rep);
    }


    /**
     * Removes a repetition of
     * OBX-10: "Nature of Abnormal Test" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeObx10_NatureOfAbnormalTest(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(10, rep);
    }




    /**
     * Returns
     * OBX-11: "Observation Result Status" - creates it if necessary
     */
    public ID getObservationResultStatus() { 
		ID retVal = this.getTypedField(11, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OBX-11: "Observation Result Status" - creates it if necessary
     */
    public ID getObx11_ObservationResultStatus() { 
		ID retVal = this.getTypedField(11, 0);
		return retVal;
    }


    /**
     * Returns all repetitions of Date Last Obs Normal Values (OBX-12).
     */
    public TS[] getDateLastObsNormalValues() {
    	TS[] retVal = this.getTypedField(12, new TS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Date Last Obs Normal Values (OBX-12).
     */
    public TS[] getObx12_DateLastObsNormalValues() {
    	TS[] retVal = this.getTypedField(12, new TS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Date Last Obs Normal Values (OBX-12).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getDateLastObsNormalValuesReps() {
    	return this.getReps(12);
    }


    /**
     * Returns a specific repetition of
     * OBX-12: "Date Last Obs Normal Values" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getDateLastObsNormalValues(int rep) { 
		TS retVal = this.getTypedField(12, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBX-12: "Date Last Obs Normal Values" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getObx12_DateLastObsNormalValues(int rep) { 
		TS retVal = this.getTypedField(12, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Date Last Obs Normal Values (OBX-12).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObx12_DateLastObsNormalValuesReps() {
    	return this.getReps(12);
    }


    /**
     * Inserts a repetition of
     * OBX-12: "Date Last Obs Normal Values" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertDateLastObsNormalValues(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(12, rep);
    }


    /**
     * Inserts a repetition of
     * OBX-12: "Date Last Obs Normal Values" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertObx12_DateLastObsNormalValues(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(12, rep);
    }


    /**
     * Removes a repetition of
     * OBX-12: "Date Last Obs Normal Values" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeDateLastObsNormalValues(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(12, rep);
    }


    /**
     * Removes a repetition of
     * OBX-12: "Date Last Obs Normal Values" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeObx12_DateLastObsNormalValues(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(12, rep);
    }



    /**
     * Returns all repetitions of User Defined Access Checks (OBX-13).
     */
    public ST[] getUserDefinedAccessChecks() {
    	ST[] retVal = this.getTypedField(13, new ST[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of User Defined Access Checks (OBX-13).
     */
    public ST[] getObx13_UserDefinedAccessChecks() {
    	ST[] retVal = this.getTypedField(13, new ST[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of User Defined Access Checks (OBX-13).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getUserDefinedAccessChecksReps() {
    	return this.getReps(13);
    }


    /**
     * Returns a specific repetition of
     * OBX-13: "User Defined Access Checks" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getUserDefinedAccessChecks(int rep) { 
		ST retVal = this.getTypedField(13, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBX-13: "User Defined Access Checks" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getObx13_UserDefinedAccessChecks(int rep) { 
		ST retVal = this.getTypedField(13, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of User Defined Access Checks (OBX-13).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObx13_UserDefinedAccessChecksReps() {
    	return this.getReps(13);
    }


    /**
     * Inserts a repetition of
     * OBX-13: "User Defined Access Checks" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertUserDefinedAccessChecks(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(13, rep);
    }


    /**
     * Inserts a repetition of
     * OBX-13: "User Defined Access Checks" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertObx13_UserDefinedAccessChecks(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(13, rep);
    }


    /**
     * Removes a repetition of
     * OBX-13: "User Defined Access Checks" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeUserDefinedAccessChecks(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(13, rep);
    }


    /**
     * Removes a repetition of
     * OBX-13: "User Defined Access Checks" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeObx13_UserDefinedAccessChecks(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(13, rep);
    }



    /**
     * Returns all repetitions of Date/Time of the Observation (OBX-14).
     */
    public TS[] getDateTimeOfTheObservation() {
    	TS[] retVal = this.getTypedField(14, new TS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Date/Time of the Observation (OBX-14).
     */
    public TS[] getObx14_DateTimeOfTheObservation() {
    	TS[] retVal = this.getTypedField(14, new TS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Date/Time of the Observation (OBX-14).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getDateTimeOfTheObservationReps() {
    	return this.getReps(14);
    }


    /**
     * Returns a specific repetition of
     * OBX-14: "Date/Time of the Observation" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getDateTimeOfTheObservation(int rep) { 
		TS retVal = this.getTypedField(14, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBX-14: "Date/Time of the Observation" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getObx14_DateTimeOfTheObservation(int rep) { 
		TS retVal = this.getTypedField(14, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Date/Time of the Observation (OBX-14).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObx14_DateTimeOfTheObservationReps() {
    	return this.getReps(14);
    }


    /**
     * Inserts a repetition of
     * OBX-14: "Date/Time of the Observation" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertDateTimeOfTheObservation(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(14, rep);
    }


    /**
     * Inserts a repetition of
     * OBX-14: "Date/Time of the Observation" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertObx14_DateTimeOfTheObservation(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(14, rep);
    }


    /**
     * Removes a repetition of
     * OBX-14: "Date/Time of the Observation" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeDateTimeOfTheObservation(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(14, rep);
    }


    /**
     * Removes a repetition of
     * OBX-14: "Date/Time of the Observation" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeObx14_DateTimeOfTheObservation(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(14, rep);
    }



    /**
     * Returns all repetitions of Producer's ID (OBX-15).
     */
    public CE[] getProducerSID() {
    	CE[] retVal = this.getTypedField(15, new CE[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Producer's ID (OBX-15).
     */
    public CE[] getObx15_ProducerSID() {
    	CE[] retVal = this.getTypedField(15, new CE[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Producer's ID (OBX-15).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getProducerSIDReps() {
    	return this.getReps(15);
    }


    /**
     * Returns a specific repetition of
     * OBX-15: "Producer's ID" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getProducerSID(int rep) { 
		CE retVal = this.getTypedField(15, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBX-15: "Producer's ID" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getObx15_ProducerSID(int rep) { 
		CE retVal = this.getTypedField(15, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Producer's ID (OBX-15).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObx15_ProducerSIDReps() {
    	return this.getReps(15);
    }


    /**
     * Inserts a repetition of
     * OBX-15: "Producer's ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertProducerSID(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(15, rep);
    }


    /**
     * Inserts a repetition of
     * OBX-15: "Producer's ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertObx15_ProducerSID(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(15, rep);
    }


    /**
     * Removes a repetition of
     * OBX-15: "Producer's ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeProducerSID(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(15, rep);
    }


    /**
     * Removes a repetition of
     * OBX-15: "Producer's ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeObx15_ProducerSID(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(15, rep);
    }



    /**
     * Returns all repetitions of Responsible Observer (OBX-16).
     */
    public XCN[] getResponsibleObserver() {
    	XCN[] retVal = this.getTypedField(16, new XCN[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Responsible Observer (OBX-16).
     */
    public XCN[] getObx16_ResponsibleObserver() {
    	XCN[] retVal = this.getTypedField(16, new XCN[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Responsible Observer (OBX-16).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getResponsibleObserverReps() {
    	return this.getReps(16);
    }


    /**
     * Returns a specific repetition of
     * OBX-16: "Responsible Observer" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getResponsibleObserver(int rep) { 
		XCN retVal = this.getTypedField(16, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBX-16: "Responsible Observer" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getObx16_ResponsibleObserver(int rep) { 
		XCN retVal = this.getTypedField(16, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Responsible Observer (OBX-16).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObx16_ResponsibleObserverReps() {
    	return this.getReps(16);
    }


    /**
     * Inserts a repetition of
     * OBX-16: "Responsible Observer" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertResponsibleObserver(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(16, rep);
    }


    /**
     * Inserts a repetition of
     * OBX-16: "Responsible Observer" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertObx16_ResponsibleObserver(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(16, rep);
    }


    /**
     * Removes a repetition of
     * OBX-16: "Responsible Observer" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeResponsibleObserver(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(16, rep);
    }


    /**
     * Removes a repetition of
     * OBX-16: "Responsible Observer" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeObx16_ResponsibleObserver(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(16, rep);
    }



    /**
     * Returns all repetitions of Observation Method (OBX-17).
     */
    public CE[] getObservationMethod() {
    	CE[] retVal = this.getTypedField(17, new CE[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Observation Method (OBX-17).
     */
    public CE[] getObx17_ObservationMethod() {
    	CE[] retVal = this.getTypedField(17, new CE[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Observation Method (OBX-17).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObservationMethodReps() {
    	return this.getReps(17);
    }


    /**
     * Returns a specific repetition of
     * OBX-17: "Observation Method" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getObservationMethod(int rep) { 
		CE retVal = this.getTypedField(17, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBX-17: "Observation Method" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getObx17_ObservationMethod(int rep) { 
		CE retVal = this.getTypedField(17, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Observation Method (OBX-17).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObx17_ObservationMethodReps() {
    	return this.getReps(17);
    }


    /**
     * Inserts a repetition of
     * OBX-17: "Observation Method" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertObservationMethod(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(17, rep);
    }


    /**
     * Inserts a repetition of
     * OBX-17: "Observation Method" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertObx17_ObservationMethod(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(17, rep);
    }


    /**
     * Removes a repetition of
     * OBX-17: "Observation Method" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeObservationMethod(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(17, rep);
    }


    /**
     * Removes a repetition of
     * OBX-17: "Observation Method" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeObx17_ObservationMethod(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(17, rep);
    }






    /** {@inheritDoc} */   
    protected Type createNewTypeWithoutReflection(int field) {
       switch (field) {
          case 0: return new SI(getMessage());
          case 1: return new ID(getMessage(), new Integer( 125 ));
          case 2: return new CE(getMessage());
          case 3: return new ST(getMessage());
          case 4: return new Varies(getMessage());
          case 5: return new CE(getMessage());
          case 6: return new ST(getMessage());
          case 7: return new ID(getMessage(), new Integer( 78 ));
          case 8: return new NM(getMessage());
          case 9: return new ID(getMessage(), new Integer( 80 ));
          case 10: return new ID(getMessage(), new Integer( 85 ));
          case 11: return new TS(getMessage());
          case 12: return new ST(getMessage());
          case 13: return new TS(getMessage());
          case 14: return new CE(getMessage());
          case 15: return new XCN(getMessage());
          case 16: return new CE(getMessage());
          default: return null;
       }
   }


}

