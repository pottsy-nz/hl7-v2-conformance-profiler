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


package au.gov.digitalhealth.hl7v2.model.v24.segment;

// import au.gov.digitalhealth.hl7v2.model.v24.group.*;
import ca.uhn.hl7v2.model.v24.datatype.*;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.parser.DefaultModelClassFactory;
import ca.uhn.hl7v2.model.AbstractMessage;
import ca.uhn.hl7v2.model.Group;
import ca.uhn.hl7v2.model.Type;
import ca.uhn.hl7v2.model.AbstractSegment;
import ca.uhn.hl7v2.model.Varies;


/**
 *<p>Represents an HL7 OBR message segment (Observation Request). 
 * This segment has the following fields:</p>
 * <ul>
     * <li>OBR-1: Set ID - OBR (SI) <b> </b>
     * <li>OBR-2: Placer Order Number (EI) <b>optional </b>
     * <li>OBR-3: Filler Order Number (EI) <b>optional </b>
     * <li>OBR-4: Universal Service Identifier (CE) <b> </b>
     * <li>OBR-5: Priority (ID) <b>optional repeating</b>
     * <li>OBR-6: Requested Date/Time (TS) <b>optional repeating</b>
     * <li>OBR-7: Observation Date/Time # (TS) <b> </b>
     * <li>OBR-8: Observation End Date/Time # (TS) <b>optional </b>
     * <li>OBR-9: Collection Volume * (CQ) <b>optional repeating</b>
     * <li>OBR-10: Collector Identifier * (XCN) <b>optional repeating</b>
     * <li>OBR-11: Specimen Action Code * (ID) <b>optional repeating</b>
     * <li>OBR-12: Danger Code (CE) <b>optional repeating</b>
     * <li>OBR-13: Relevant Clinical Info. (ST) <b>optional repeating</b>
     * <li>OBR-14: Specimen Received Date/Time * (TS) <b>optional </b>
     * <li>OBR-15: Specimen Source (SPS) <b>optional repeating</b>
     * <li>OBR-16: Ordering Provider (XCN) <b> repeating</b>
     * <li>OBR-17: Order Callback Phone Number (XTN) <b>optional repeating</b>
     * <li>OBR-18: Placer Field 1 (ST) <b>optional repeating</b>
     * <li>OBR-19: Placer Field 2 (ST) <b>optional repeating</b>
     * <li>OBR-20: Filler Field 1 + (ST) <b> </b>
     * <li>OBR-21: Filler Field 2 + (ST) <b>optional repeating</b>
     * <li>OBR-22: Results Rpt/Status Chng - Date/Time + (TS) <b> </b>
     * <li>OBR-23: Charge to Practice + (MOC) <b>optional repeating</b>
     * <li>OBR-24: Diagnostic Serv Sect ID (ID) <b> </b>
     * <li>OBR-25: Result Status + (ID) <b> </b>
     * <li>OBR-26: Parent Result + (PRL) <b>optional repeating</b>
     * <li>OBR-27: Quantity/Timing (TQ) <b> repeating</b>
     * <li>OBR-28: Result Copies To (XCN) <b>optional repeating</b>
     * <li>OBR-29: Parent (EIP) <b>optional repeating</b>
     * <li>OBR-30: Transportation Mode (ID) <b>optional repeating</b>
     * <li>OBR-31: Reason for Study (CE) <b>optional repeating</b>
     * <li>OBR-32: Principal Result Interpreter + (NDL) <b> </b>
     * <li>OBR-33: Assistant Result Interpreter + (NDL) <b>optional repeating</b>
     * <li>OBR-34: Technician + (NDL) <b>optional repeating</b>
     * <li>OBR-35: Transcriptionist + (NDL) <b>optional repeating</b>
     * <li>OBR-36: Scheduled Date/Time + (TS) <b>optional </b>
     * <li>OBR-37: Number of Sample Containers * (NM) <b>optional repeating</b>
     * <li>OBR-38: Transport Logistics of Collected Sample * (CE) <b>optional repeating</b>
     * <li>OBR-39: Collector's Comment * (CE) <b>optional repeating</b>
     * <li>OBR-40: Transport Arrangement Responsibility (CE) <b>optional </b>
     * <li>OBR-41: Transport Arranged (ID) <b>optional repeating</b>
     * <li>OBR-42: Escort Required (ID) <b>optional repeating</b>
     * <li>OBR-43: Planned Patient Transport Comment (CE) <b>optional repeating</b>
     * <li>OBR-44: Procedure Code (CE) <b>optional </b>
     * <li>OBR-45: Procedure Code Modifier (CE) <b>optional repeating</b>
     * <li>OBR-46: Placer Supplemental Service Information (CE) <b>optional repeating</b>
     * <li>OBR-47: Filler Supplemental Service Information (CE) <b>optional repeating</b>
 * </ul>
 */
@SuppressWarnings("unused")
public class OBR extends AbstractSegment {

    /** 
     * Creates a new OBR segment
     */
    public OBR(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(SI.class, true, 1, 4, new Object[]{ getMessage() }, "Set ID - OBR");
                                  this.add(EI.class, false, 1, 250, new Object[]{ getMessage() }, "Placer Order Number");
                                  this.add(EI.class, false, 1, 250, new Object[]{ getMessage() }, "Filler Order Number");
                                  this.add(CE.class, true, 1, 250, new Object[]{ getMessage() }, "Universal Service Identifier");
                                              this.add(ID.class, false, -1, 2, new Object[]{ getMessage(), new Integer(0) }, "Priority");
                                  this.add(TS.class, false, -1, 26, new Object[]{ getMessage() }, "Requested Date/Time");
                                  this.add(TS.class, true, 1, 26, new Object[]{ getMessage() }, "Observation Date/Time #");
                                  this.add(TS.class, false, 1, 26, new Object[]{ getMessage() }, "Observation End Date/Time #");
                                  this.add(CQ.class, false, -1, 250, new Object[]{ getMessage() }, "Collection Volume *");
                                  this.add(XCN.class, false, -1, 250, new Object[]{ getMessage() }, "Collector Identifier *");
                                              this.add(ID.class, false, -1, 1, new Object[]{ getMessage(), new Integer(65) }, "Specimen Action Code *");
                                  this.add(CE.class, false, -1, 250, new Object[]{ getMessage() }, "Danger Code");
                                  this.add(ST.class, false, -1, 300, new Object[]{ getMessage() }, "Relevant Clinical Info.");
                                  this.add(TS.class, false, 1, 26, new Object[]{ getMessage() }, "Specimen Received Date/Time *");
                                  this.add(SPS.class, false, -1, 300, new Object[]{ getMessage() }, "Specimen Source");
                                  this.add(XCN.class, true, -1, 1002, new Object[]{ getMessage() }, "Ordering Provider");
                                  this.add(XTN.class, false, -1, 250, new Object[]{ getMessage() }, "Order Callback Phone Number");
                                  this.add(ST.class, false, -1, 60, new Object[]{ getMessage() }, "Placer Field 1");
                                  this.add(ST.class, false, -1, 60, new Object[]{ getMessage() }, "Placer Field 2");
                                  this.add(ST.class, true, 1, 60, new Object[]{ getMessage() }, "Filler Field 1 +");
                                  this.add(ST.class, false, -1, 60, new Object[]{ getMessage() }, "Filler Field 2 +");
                                  this.add(TS.class, true, 1, 26, new Object[]{ getMessage() }, "Results Rpt/Status Chng - Date/Time +");
                                  this.add(MOC.class, false, -1, 40, new Object[]{ getMessage() }, "Charge to Practice +");
                                              this.add(ID.class, true, 1, 10, new Object[]{ getMessage(), new Integer(74) }, "Diagnostic Serv Sect ID");
                                              this.add(ID.class, true, 1, 1, new Object[]{ getMessage(), new Integer(123) }, "Result Status +");
                                  this.add(PRL.class, false, -1, 400, new Object[]{ getMessage() }, "Parent Result +");
                                  this.add(TQ.class, true, -1, 730, new Object[]{ getMessage() }, "Quantity/Timing");
                                  this.add(XCN.class, false, -1, 1470, new Object[]{ getMessage() }, "Result Copies To");
                                  this.add(EIP.class, false, -1, 200, new Object[]{ getMessage() }, "Parent");
                                              this.add(ID.class, false, -1, 20, new Object[]{ getMessage(), new Integer(124) }, "Transportation Mode");
                                  this.add(CE.class, false, -1, 250, new Object[]{ getMessage() }, "Reason for Study");
                                  this.add(NDL.class, true, 1, 1749, new Object[]{ getMessage() }, "Principal Result Interpreter +");
                                  this.add(NDL.class, false, -1, 1880, new Object[]{ getMessage() }, "Assistant Result Interpreter +");
                                  this.add(NDL.class, false, -1, 2050, new Object[]{ getMessage() }, "Technician +");
                                  this.add(NDL.class, false, -1, 2210, new Object[]{ getMessage() }, "Transcriptionist +");
                                  this.add(TS.class, false, 1, 26, new Object[]{ getMessage() }, "Scheduled Date/Time +");
                                  this.add(NM.class, false, -1, 4, new Object[]{ getMessage() }, "Number of Sample Containers *");
                                  this.add(CE.class, false, 2, 250, new Object[]{ getMessage() }, "Transport Logistics of Collected Sample *");
                                  this.add(CE.class, false, 2, 250, new Object[]{ getMessage() }, "Collector's Comment *");
                                  this.add(CE.class, false, 1, 250, new Object[]{ getMessage() }, "Transport Arrangement Responsibility");
                                              this.add(ID.class, false, -1, 30, new Object[]{ getMessage(), new Integer(224) }, "Transport Arranged");
                                              this.add(ID.class, false, -1, 1, new Object[]{ getMessage(), new Integer(225) }, "Escort Required");
                                  this.add(CE.class, false, 2, 250, new Object[]{ getMessage() }, "Planned Patient Transport Comment");
                                  this.add(CE.class, false, 1, 250, new Object[]{ getMessage() }, "Procedure Code");
                                  this.add(CE.class, false, 2, 250, new Object[]{ getMessage() }, "Procedure Code Modifier");
                                  this.add(CE.class, false, 2, 250, new Object[]{ getMessage() }, "Placer Supplemental Service Information");
                                  this.add(CE.class, false, 2, 250, new Object[]{ getMessage() }, "Filler Supplemental Service Information");
       } catch(HL7Exception e) {
          log.error("Unexpected error creating OBR - this is probably a bug in the source code generator.", e);
       }
    }



    /**
     * Returns
     * OBR-1: "Set ID - OBR" - creates it if necessary
     */
    public SI getSetIDOBR() { 
		SI retVal = this.getTypedField(1, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OBR-1: "Set ID - OBR" - creates it if necessary
     */
    public SI getObr1_SetIDOBR() { 
		SI retVal = this.getTypedField(1, 0);
		return retVal;
    }



    /**
     * Returns
     * OBR-2: "Placer Order Number" - creates it if necessary
     */
    public EI getPlacerOrderNumber() { 
		EI retVal = this.getTypedField(2, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OBR-2: "Placer Order Number" - creates it if necessary
     */
    public EI getObr2_PlacerOrderNumber() { 
		EI retVal = this.getTypedField(2, 0);
		return retVal;
    }



    /**
     * Returns
     * OBR-3: "Filler Order Number" - creates it if necessary
     */
    public EI getFillerOrderNumber() { 
		EI retVal = this.getTypedField(3, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OBR-3: "Filler Order Number" - creates it if necessary
     */
    public EI getObr3_FillerOrderNumber() { 
		EI retVal = this.getTypedField(3, 0);
		return retVal;
    }



    /**
     * Returns
     * OBR-4: "Universal Service Identifier" - creates it if necessary
     */
    public CE getUniversalServiceIdentifier() { 
		CE retVal = this.getTypedField(4, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OBR-4: "Universal Service Identifier" - creates it if necessary
     */
    public CE getObr4_UniversalServiceIdentifier() { 
		CE retVal = this.getTypedField(4, 0);
		return retVal;
    }


    /**
     * Returns all repetitions of Priority (OBR-5).
     */
    public ID[] getPriority() {
    	ID[] retVal = this.getTypedField(5, new ID[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Priority (OBR-5).
     */
    public ID[] getObr5_Priority() {
    	ID[] retVal = this.getTypedField(5, new ID[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Priority (OBR-5).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPriorityReps() {
    	return this.getReps(5);
    }


    /**
     * Returns a specific repetition of
     * OBR-5: "Priority" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getPriority(int rep) { 
		ID retVal = this.getTypedField(5, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-5: "Priority" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getObr5_Priority(int rep) { 
		ID retVal = this.getTypedField(5, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Priority (OBR-5).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr5_PriorityReps() {
    	return this.getReps(5);
    }


    /**
     * Inserts a repetition of
     * OBR-5: "Priority" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertPriority(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(5, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-5: "Priority" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertObr5_Priority(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(5, rep);
    }


    /**
     * Removes a repetition of
     * OBR-5: "Priority" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removePriority(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(5, rep);
    }


    /**
     * Removes a repetition of
     * OBR-5: "Priority" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeObr5_Priority(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(5, rep);
    }



    /**
     * Returns all repetitions of Requested Date/Time (OBR-6).
     */
    public TS[] getRequestedDateTime() {
    	TS[] retVal = this.getTypedField(6, new TS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Requested Date/Time (OBR-6).
     */
    public TS[] getObr6_RequestedDateTime() {
    	TS[] retVal = this.getTypedField(6, new TS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Requested Date/Time (OBR-6).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRequestedDateTimeReps() {
    	return this.getReps(6);
    }


    /**
     * Returns a specific repetition of
     * OBR-6: "Requested Date/Time" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getRequestedDateTime(int rep) { 
		TS retVal = this.getTypedField(6, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-6: "Requested Date/Time" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getObr6_RequestedDateTime(int rep) { 
		TS retVal = this.getTypedField(6, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Requested Date/Time (OBR-6).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr6_RequestedDateTimeReps() {
    	return this.getReps(6);
    }


    /**
     * Inserts a repetition of
     * OBR-6: "Requested Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertRequestedDateTime(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(6, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-6: "Requested Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertObr6_RequestedDateTime(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(6, rep);
    }


    /**
     * Removes a repetition of
     * OBR-6: "Requested Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeRequestedDateTime(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(6, rep);
    }


    /**
     * Removes a repetition of
     * OBR-6: "Requested Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeObr6_RequestedDateTime(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(6, rep);
    }




    /**
     * Returns
     * OBR-7: "Observation Date/Time #" - creates it if necessary
     */
    public TS getObservationDateTime() { 
		TS retVal = this.getTypedField(7, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OBR-7: "Observation Date/Time #" - creates it if necessary
     */
    public TS getObr7_ObservationDateTime() { 
		TS retVal = this.getTypedField(7, 0);
		return retVal;
    }



    /**
     * Returns
     * OBR-8: "Observation End Date/Time #" - creates it if necessary
     */
    public TS getObservationEndDateTime() { 
		TS retVal = this.getTypedField(8, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OBR-8: "Observation End Date/Time #" - creates it if necessary
     */
    public TS getObr8_ObservationEndDateTime() { 
		TS retVal = this.getTypedField(8, 0);
		return retVal;
    }


    /**
     * Returns all repetitions of Collection Volume * (OBR-9).
     */
    public CQ[] getCollectionVolume() {
    	CQ[] retVal = this.getTypedField(9, new CQ[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Collection Volume * (OBR-9).
     */
    public CQ[] getObr9_CollectionVolume() {
    	CQ[] retVal = this.getTypedField(9, new CQ[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Collection Volume * (OBR-9).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getCollectionVolumeReps() {
    	return this.getReps(9);
    }


    /**
     * Returns a specific repetition of
     * OBR-9: "Collection Volume *" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CQ getCollectionVolume(int rep) { 
		CQ retVal = this.getTypedField(9, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-9: "Collection Volume *" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CQ getObr9_CollectionVolume(int rep) { 
		CQ retVal = this.getTypedField(9, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Collection Volume * (OBR-9).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr9_CollectionVolumeReps() {
    	return this.getReps(9);
    }


    /**
     * Inserts a repetition of
     * OBR-9: "Collection Volume *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CQ insertCollectionVolume(int rep) throws HL7Exception { 
        return (CQ) super.insertRepetition(9, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-9: "Collection Volume *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CQ insertObr9_CollectionVolume(int rep) throws HL7Exception { 
        return (CQ) super.insertRepetition(9, rep);
    }


    /**
     * Removes a repetition of
     * OBR-9: "Collection Volume *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CQ removeCollectionVolume(int rep) throws HL7Exception { 
        return (CQ) super.removeRepetition(9, rep);
    }


    /**
     * Removes a repetition of
     * OBR-9: "Collection Volume *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CQ removeObr9_CollectionVolume(int rep) throws HL7Exception { 
        return (CQ) super.removeRepetition(9, rep);
    }



    /**
     * Returns all repetitions of Collector Identifier * (OBR-10).
     */
    public XCN[] getCollectorIdentifier() {
    	XCN[] retVal = this.getTypedField(10, new XCN[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Collector Identifier * (OBR-10).
     */
    public XCN[] getObr10_CollectorIdentifier() {
    	XCN[] retVal = this.getTypedField(10, new XCN[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Collector Identifier * (OBR-10).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getCollectorIdentifierReps() {
    	return this.getReps(10);
    }


    /**
     * Returns a specific repetition of
     * OBR-10: "Collector Identifier *" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getCollectorIdentifier(int rep) { 
		XCN retVal = this.getTypedField(10, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-10: "Collector Identifier *" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getObr10_CollectorIdentifier(int rep) { 
		XCN retVal = this.getTypedField(10, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Collector Identifier * (OBR-10).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr10_CollectorIdentifierReps() {
    	return this.getReps(10);
    }


    /**
     * Inserts a repetition of
     * OBR-10: "Collector Identifier *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertCollectorIdentifier(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(10, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-10: "Collector Identifier *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertObr10_CollectorIdentifier(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(10, rep);
    }


    /**
     * Removes a repetition of
     * OBR-10: "Collector Identifier *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeCollectorIdentifier(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(10, rep);
    }


    /**
     * Removes a repetition of
     * OBR-10: "Collector Identifier *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeObr10_CollectorIdentifier(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(10, rep);
    }



    /**
     * Returns all repetitions of Specimen Action Code * (OBR-11).
     */
    public ID[] getSpecimenActionCode() {
    	ID[] retVal = this.getTypedField(11, new ID[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Specimen Action Code * (OBR-11).
     */
    public ID[] getObr11_SpecimenActionCode() {
    	ID[] retVal = this.getTypedField(11, new ID[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Specimen Action Code * (OBR-11).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getSpecimenActionCodeReps() {
    	return this.getReps(11);
    }


    /**
     * Returns a specific repetition of
     * OBR-11: "Specimen Action Code *" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getSpecimenActionCode(int rep) { 
		ID retVal = this.getTypedField(11, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-11: "Specimen Action Code *" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getObr11_SpecimenActionCode(int rep) { 
		ID retVal = this.getTypedField(11, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Specimen Action Code * (OBR-11).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr11_SpecimenActionCodeReps() {
    	return this.getReps(11);
    }


    /**
     * Inserts a repetition of
     * OBR-11: "Specimen Action Code *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertSpecimenActionCode(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(11, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-11: "Specimen Action Code *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertObr11_SpecimenActionCode(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(11, rep);
    }


    /**
     * Removes a repetition of
     * OBR-11: "Specimen Action Code *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeSpecimenActionCode(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(11, rep);
    }


    /**
     * Removes a repetition of
     * OBR-11: "Specimen Action Code *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeObr11_SpecimenActionCode(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(11, rep);
    }



    /**
     * Returns all repetitions of Danger Code (OBR-12).
     */
    public CE[] getDangerCode() {
    	CE[] retVal = this.getTypedField(12, new CE[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Danger Code (OBR-12).
     */
    public CE[] getObr12_DangerCode() {
    	CE[] retVal = this.getTypedField(12, new CE[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Danger Code (OBR-12).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getDangerCodeReps() {
    	return this.getReps(12);
    }


    /**
     * Returns a specific repetition of
     * OBR-12: "Danger Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getDangerCode(int rep) { 
		CE retVal = this.getTypedField(12, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-12: "Danger Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getObr12_DangerCode(int rep) { 
		CE retVal = this.getTypedField(12, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Danger Code (OBR-12).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr12_DangerCodeReps() {
    	return this.getReps(12);
    }


    /**
     * Inserts a repetition of
     * OBR-12: "Danger Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertDangerCode(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(12, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-12: "Danger Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertObr12_DangerCode(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(12, rep);
    }


    /**
     * Removes a repetition of
     * OBR-12: "Danger Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeDangerCode(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(12, rep);
    }


    /**
     * Removes a repetition of
     * OBR-12: "Danger Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeObr12_DangerCode(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(12, rep);
    }



    /**
     * Returns all repetitions of Relevant Clinical Info. (OBR-13).
     */
    public ST[] getRelevantClinicalInfo() {
    	ST[] retVal = this.getTypedField(13, new ST[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Relevant Clinical Info. (OBR-13).
     */
    public ST[] getObr13_RelevantClinicalInfo() {
    	ST[] retVal = this.getTypedField(13, new ST[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Relevant Clinical Info. (OBR-13).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRelevantClinicalInfoReps() {
    	return this.getReps(13);
    }


    /**
     * Returns a specific repetition of
     * OBR-13: "Relevant Clinical Info." - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getRelevantClinicalInfo(int rep) { 
		ST retVal = this.getTypedField(13, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-13: "Relevant Clinical Info." - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getObr13_RelevantClinicalInfo(int rep) { 
		ST retVal = this.getTypedField(13, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Relevant Clinical Info. (OBR-13).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr13_RelevantClinicalInfoReps() {
    	return this.getReps(13);
    }


    /**
     * Inserts a repetition of
     * OBR-13: "Relevant Clinical Info." at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertRelevantClinicalInfo(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(13, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-13: "Relevant Clinical Info." at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertObr13_RelevantClinicalInfo(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(13, rep);
    }


    /**
     * Removes a repetition of
     * OBR-13: "Relevant Clinical Info." at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeRelevantClinicalInfo(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(13, rep);
    }


    /**
     * Removes a repetition of
     * OBR-13: "Relevant Clinical Info." at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeObr13_RelevantClinicalInfo(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(13, rep);
    }




    /**
     * Returns
     * OBR-14: "Specimen Received Date/Time *" - creates it if necessary
     */
    public TS getSpecimenReceivedDateTime() { 
		TS retVal = this.getTypedField(14, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OBR-14: "Specimen Received Date/Time *" - creates it if necessary
     */
    public TS getObr14_SpecimenReceivedDateTime() { 
		TS retVal = this.getTypedField(14, 0);
		return retVal;
    }


    /**
     * Returns all repetitions of Specimen Source (OBR-15).
     */
    public SPS[] getSpecimenSource() {
    	SPS[] retVal = this.getTypedField(15, new SPS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Specimen Source (OBR-15).
     */
    public SPS[] getObr15_SpecimenSource() {
    	SPS[] retVal = this.getTypedField(15, new SPS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Specimen Source (OBR-15).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getSpecimenSourceReps() {
    	return this.getReps(15);
    }


    /**
     * Returns a specific repetition of
     * OBR-15: "Specimen Source" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public SPS getSpecimenSource(int rep) { 
		SPS retVal = this.getTypedField(15, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-15: "Specimen Source" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public SPS getObr15_SpecimenSource(int rep) { 
		SPS retVal = this.getTypedField(15, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Specimen Source (OBR-15).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr15_SpecimenSourceReps() {
    	return this.getReps(15);
    }


    /**
     * Inserts a repetition of
     * OBR-15: "Specimen Source" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public SPS insertSpecimenSource(int rep) throws HL7Exception { 
        return (SPS) super.insertRepetition(15, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-15: "Specimen Source" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public SPS insertObr15_SpecimenSource(int rep) throws HL7Exception { 
        return (SPS) super.insertRepetition(15, rep);
    }


    /**
     * Removes a repetition of
     * OBR-15: "Specimen Source" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public SPS removeSpecimenSource(int rep) throws HL7Exception { 
        return (SPS) super.removeRepetition(15, rep);
    }


    /**
     * Removes a repetition of
     * OBR-15: "Specimen Source" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public SPS removeObr15_SpecimenSource(int rep) throws HL7Exception { 
        return (SPS) super.removeRepetition(15, rep);
    }



    /**
     * Returns all repetitions of Ordering Provider (OBR-16).
     */
    public XCN[] getOrderingProvider() {
    	XCN[] retVal = this.getTypedField(16, new XCN[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Ordering Provider (OBR-16).
     */
    public XCN[] getObr16_OrderingProvider() {
    	XCN[] retVal = this.getTypedField(16, new XCN[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Ordering Provider (OBR-16).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrderingProviderReps() {
    	return this.getReps(16);
    }


    /**
     * Returns a specific repetition of
     * OBR-16: "Ordering Provider" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getOrderingProvider(int rep) { 
		XCN retVal = this.getTypedField(16, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-16: "Ordering Provider" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getObr16_OrderingProvider(int rep) { 
		XCN retVal = this.getTypedField(16, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Ordering Provider (OBR-16).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr16_OrderingProviderReps() {
    	return this.getReps(16);
    }


    /**
     * Inserts a repetition of
     * OBR-16: "Ordering Provider" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertOrderingProvider(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(16, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-16: "Ordering Provider" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertObr16_OrderingProvider(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(16, rep);
    }


    /**
     * Removes a repetition of
     * OBR-16: "Ordering Provider" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeOrderingProvider(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(16, rep);
    }


    /**
     * Removes a repetition of
     * OBR-16: "Ordering Provider" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeObr16_OrderingProvider(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(16, rep);
    }



    /**
     * Returns all repetitions of Order Callback Phone Number (OBR-17).
     */
    public XTN[] getOrderCallbackPhoneNumber() {
    	XTN[] retVal = this.getTypedField(17, new XTN[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Order Callback Phone Number (OBR-17).
     */
    public XTN[] getObr17_OrderCallbackPhoneNumber() {
    	XTN[] retVal = this.getTypedField(17, new XTN[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Order Callback Phone Number (OBR-17).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrderCallbackPhoneNumberReps() {
    	return this.getReps(17);
    }


    /**
     * Returns a specific repetition of
     * OBR-17: "Order Callback Phone Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XTN getOrderCallbackPhoneNumber(int rep) { 
		XTN retVal = this.getTypedField(17, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-17: "Order Callback Phone Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XTN getObr17_OrderCallbackPhoneNumber(int rep) { 
		XTN retVal = this.getTypedField(17, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Order Callback Phone Number (OBR-17).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr17_OrderCallbackPhoneNumberReps() {
    	return this.getReps(17);
    }


    /**
     * Inserts a repetition of
     * OBR-17: "Order Callback Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN insertOrderCallbackPhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.insertRepetition(17, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-17: "Order Callback Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN insertObr17_OrderCallbackPhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.insertRepetition(17, rep);
    }


    /**
     * Removes a repetition of
     * OBR-17: "Order Callback Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN removeOrderCallbackPhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.removeRepetition(17, rep);
    }


    /**
     * Removes a repetition of
     * OBR-17: "Order Callback Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN removeObr17_OrderCallbackPhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.removeRepetition(17, rep);
    }



    /**
     * Returns all repetitions of Placer Field 1 (OBR-18).
     */
    public ST[] getPlacerField1() {
    	ST[] retVal = this.getTypedField(18, new ST[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Placer Field 1 (OBR-18).
     */
    public ST[] getObr18_PlacerField1() {
    	ST[] retVal = this.getTypedField(18, new ST[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Placer Field 1 (OBR-18).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPlacerField1Reps() {
    	return this.getReps(18);
    }


    /**
     * Returns a specific repetition of
     * OBR-18: "Placer Field 1" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getPlacerField1(int rep) { 
		ST retVal = this.getTypedField(18, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-18: "Placer Field 1" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getObr18_PlacerField1(int rep) { 
		ST retVal = this.getTypedField(18, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Placer Field 1 (OBR-18).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr18_PlacerField1Reps() {
    	return this.getReps(18);
    }


    /**
     * Inserts a repetition of
     * OBR-18: "Placer Field 1" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertPlacerField1(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(18, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-18: "Placer Field 1" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertObr18_PlacerField1(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(18, rep);
    }


    /**
     * Removes a repetition of
     * OBR-18: "Placer Field 1" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removePlacerField1(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(18, rep);
    }


    /**
     * Removes a repetition of
     * OBR-18: "Placer Field 1" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeObr18_PlacerField1(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(18, rep);
    }



    /**
     * Returns all repetitions of Placer Field 2 (OBR-19).
     */
    public ST[] getPlacerField2() {
    	ST[] retVal = this.getTypedField(19, new ST[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Placer Field 2 (OBR-19).
     */
    public ST[] getObr19_PlacerField2() {
    	ST[] retVal = this.getTypedField(19, new ST[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Placer Field 2 (OBR-19).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPlacerField2Reps() {
    	return this.getReps(19);
    }


    /**
     * Returns a specific repetition of
     * OBR-19: "Placer Field 2" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getPlacerField2(int rep) { 
		ST retVal = this.getTypedField(19, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-19: "Placer Field 2" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getObr19_PlacerField2(int rep) { 
		ST retVal = this.getTypedField(19, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Placer Field 2 (OBR-19).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr19_PlacerField2Reps() {
    	return this.getReps(19);
    }


    /**
     * Inserts a repetition of
     * OBR-19: "Placer Field 2" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertPlacerField2(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(19, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-19: "Placer Field 2" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertObr19_PlacerField2(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(19, rep);
    }


    /**
     * Removes a repetition of
     * OBR-19: "Placer Field 2" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removePlacerField2(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(19, rep);
    }


    /**
     * Removes a repetition of
     * OBR-19: "Placer Field 2" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeObr19_PlacerField2(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(19, rep);
    }




    /**
     * Returns
     * OBR-20: "Filler Field 1 +" - creates it if necessary
     */
    public ST getFillerField1() { 
		ST retVal = this.getTypedField(20, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OBR-20: "Filler Field 1 +" - creates it if necessary
     */
    public ST getObr20_FillerField1() { 
		ST retVal = this.getTypedField(20, 0);
		return retVal;
    }


    /**
     * Returns all repetitions of Filler Field 2 + (OBR-21).
     */
    public ST[] getFillerField2() {
    	ST[] retVal = this.getTypedField(21, new ST[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Filler Field 2 + (OBR-21).
     */
    public ST[] getObr21_FillerField2() {
    	ST[] retVal = this.getTypedField(21, new ST[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Filler Field 2 + (OBR-21).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getFillerField2Reps() {
    	return this.getReps(21);
    }


    /**
     * Returns a specific repetition of
     * OBR-21: "Filler Field 2 +" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getFillerField2(int rep) { 
		ST retVal = this.getTypedField(21, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-21: "Filler Field 2 +" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getObr21_FillerField2(int rep) { 
		ST retVal = this.getTypedField(21, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Filler Field 2 + (OBR-21).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr21_FillerField2Reps() {
    	return this.getReps(21);
    }


    /**
     * Inserts a repetition of
     * OBR-21: "Filler Field 2 +" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertFillerField2(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(21, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-21: "Filler Field 2 +" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertObr21_FillerField2(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(21, rep);
    }


    /**
     * Removes a repetition of
     * OBR-21: "Filler Field 2 +" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeFillerField2(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(21, rep);
    }


    /**
     * Removes a repetition of
     * OBR-21: "Filler Field 2 +" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeObr21_FillerField2(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(21, rep);
    }




    /**
     * Returns
     * OBR-22: "Results Rpt/Status Chng - Date/Time +" - creates it if necessary
     */
    public TS getResultsRptStatusChngDateTime() { 
		TS retVal = this.getTypedField(22, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OBR-22: "Results Rpt/Status Chng - Date/Time +" - creates it if necessary
     */
    public TS getObr22_ResultsRptStatusChngDateTime() { 
		TS retVal = this.getTypedField(22, 0);
		return retVal;
    }


    /**
     * Returns all repetitions of Charge to Practice + (OBR-23).
     */
    public MOC[] getChargeToPractice() {
    	MOC[] retVal = this.getTypedField(23, new MOC[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Charge to Practice + (OBR-23).
     */
    public MOC[] getObr23_ChargeToPractice() {
    	MOC[] retVal = this.getTypedField(23, new MOC[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Charge to Practice + (OBR-23).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getChargeToPracticeReps() {
    	return this.getReps(23);
    }


    /**
     * Returns a specific repetition of
     * OBR-23: "Charge to Practice +" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public MOC getChargeToPractice(int rep) { 
		MOC retVal = this.getTypedField(23, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-23: "Charge to Practice +" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public MOC getObr23_ChargeToPractice(int rep) { 
		MOC retVal = this.getTypedField(23, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Charge to Practice + (OBR-23).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr23_ChargeToPracticeReps() {
    	return this.getReps(23);
    }


    /**
     * Inserts a repetition of
     * OBR-23: "Charge to Practice +" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public MOC insertChargeToPractice(int rep) throws HL7Exception { 
        return (MOC) super.insertRepetition(23, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-23: "Charge to Practice +" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public MOC insertObr23_ChargeToPractice(int rep) throws HL7Exception { 
        return (MOC) super.insertRepetition(23, rep);
    }


    /**
     * Removes a repetition of
     * OBR-23: "Charge to Practice +" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public MOC removeChargeToPractice(int rep) throws HL7Exception { 
        return (MOC) super.removeRepetition(23, rep);
    }


    /**
     * Removes a repetition of
     * OBR-23: "Charge to Practice +" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public MOC removeObr23_ChargeToPractice(int rep) throws HL7Exception { 
        return (MOC) super.removeRepetition(23, rep);
    }




    /**
     * Returns
     * OBR-24: "Diagnostic Serv Sect ID" - creates it if necessary
     */
    public ID getDiagnosticServSectID() { 
		ID retVal = this.getTypedField(24, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OBR-24: "Diagnostic Serv Sect ID" - creates it if necessary
     */
    public ID getObr24_DiagnosticServSectID() { 
		ID retVal = this.getTypedField(24, 0);
		return retVal;
    }



    /**
     * Returns
     * OBR-25: "Result Status +" - creates it if necessary
     */
    public ID getResultStatus() { 
		ID retVal = this.getTypedField(25, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OBR-25: "Result Status +" - creates it if necessary
     */
    public ID getObr25_ResultStatus() { 
		ID retVal = this.getTypedField(25, 0);
		return retVal;
    }


    /**
     * Returns all repetitions of Parent Result + (OBR-26).
     */
    public PRL[] getParentResult() {
    	PRL[] retVal = this.getTypedField(26, new PRL[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Parent Result + (OBR-26).
     */
    public PRL[] getObr26_ParentResult() {
    	PRL[] retVal = this.getTypedField(26, new PRL[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Parent Result + (OBR-26).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getParentResultReps() {
    	return this.getReps(26);
    }


    /**
     * Returns a specific repetition of
     * OBR-26: "Parent Result +" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public PRL getParentResult(int rep) { 
		PRL retVal = this.getTypedField(26, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-26: "Parent Result +" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public PRL getObr26_ParentResult(int rep) { 
		PRL retVal = this.getTypedField(26, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Parent Result + (OBR-26).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr26_ParentResultReps() {
    	return this.getReps(26);
    }


    /**
     * Inserts a repetition of
     * OBR-26: "Parent Result +" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PRL insertParentResult(int rep) throws HL7Exception { 
        return (PRL) super.insertRepetition(26, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-26: "Parent Result +" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PRL insertObr26_ParentResult(int rep) throws HL7Exception { 
        return (PRL) super.insertRepetition(26, rep);
    }


    /**
     * Removes a repetition of
     * OBR-26: "Parent Result +" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PRL removeParentResult(int rep) throws HL7Exception { 
        return (PRL) super.removeRepetition(26, rep);
    }


    /**
     * Removes a repetition of
     * OBR-26: "Parent Result +" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PRL removeObr26_ParentResult(int rep) throws HL7Exception { 
        return (PRL) super.removeRepetition(26, rep);
    }



    /**
     * Returns all repetitions of Quantity/Timing (OBR-27).
     */
    public TQ[] getQuantityTiming() {
    	TQ[] retVal = this.getTypedField(27, new TQ[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Quantity/Timing (OBR-27).
     */
    public TQ[] getObr27_QuantityTiming() {
    	TQ[] retVal = this.getTypedField(27, new TQ[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Quantity/Timing (OBR-27).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getQuantityTimingReps() {
    	return this.getReps(27);
    }


    /**
     * Returns a specific repetition of
     * OBR-27: "Quantity/Timing" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TQ getQuantityTiming(int rep) { 
		TQ retVal = this.getTypedField(27, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-27: "Quantity/Timing" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TQ getObr27_QuantityTiming(int rep) { 
		TQ retVal = this.getTypedField(27, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Quantity/Timing (OBR-27).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr27_QuantityTimingReps() {
    	return this.getReps(27);
    }


    /**
     * Inserts a repetition of
     * OBR-27: "Quantity/Timing" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TQ insertQuantityTiming(int rep) throws HL7Exception { 
        return (TQ) super.insertRepetition(27, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-27: "Quantity/Timing" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TQ insertObr27_QuantityTiming(int rep) throws HL7Exception { 
        return (TQ) super.insertRepetition(27, rep);
    }


    /**
     * Removes a repetition of
     * OBR-27: "Quantity/Timing" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TQ removeQuantityTiming(int rep) throws HL7Exception { 
        return (TQ) super.removeRepetition(27, rep);
    }


    /**
     * Removes a repetition of
     * OBR-27: "Quantity/Timing" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TQ removeObr27_QuantityTiming(int rep) throws HL7Exception { 
        return (TQ) super.removeRepetition(27, rep);
    }



    /**
     * Returns all repetitions of Result Copies To (OBR-28).
     */
    public XCN[] getResultCopiesTo() {
    	XCN[] retVal = this.getTypedField(28, new XCN[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Result Copies To (OBR-28).
     */
    public XCN[] getObr28_ResultCopiesTo() {
    	XCN[] retVal = this.getTypedField(28, new XCN[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Result Copies To (OBR-28).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getResultCopiesToReps() {
    	return this.getReps(28);
    }


    /**
     * Returns a specific repetition of
     * OBR-28: "Result Copies To" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getResultCopiesTo(int rep) { 
		XCN retVal = this.getTypedField(28, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-28: "Result Copies To" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getObr28_ResultCopiesTo(int rep) { 
		XCN retVal = this.getTypedField(28, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Result Copies To (OBR-28).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr28_ResultCopiesToReps() {
    	return this.getReps(28);
    }


    /**
     * Inserts a repetition of
     * OBR-28: "Result Copies To" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertResultCopiesTo(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(28, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-28: "Result Copies To" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertObr28_ResultCopiesTo(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(28, rep);
    }


    /**
     * Removes a repetition of
     * OBR-28: "Result Copies To" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeResultCopiesTo(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(28, rep);
    }


    /**
     * Removes a repetition of
     * OBR-28: "Result Copies To" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeObr28_ResultCopiesTo(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(28, rep);
    }



    /**
     * Returns all repetitions of Parent (OBR-29).
     */
    public EIP[] getOBRParent() {
    	EIP[] retVal = this.getTypedField(29, new EIP[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Parent (OBR-29).
     */
    public EIP[] getObr29_Parent() {
    	EIP[] retVal = this.getTypedField(29, new EIP[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Parent (OBR-29).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOBRParentReps() {
    	return this.getReps(29);
    }


    /**
     * Returns a specific repetition of
     * OBR-29: "Parent" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public EIP getOBRParent(int rep) { 
		EIP retVal = this.getTypedField(29, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-29: "Parent" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public EIP getObr29_Parent(int rep) { 
		EIP retVal = this.getTypedField(29, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Parent (OBR-29).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr29_ParentReps() {
    	return this.getReps(29);
    }


    /**
     * Inserts a repetition of
     * OBR-29: "Parent" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EIP insertOBRParent(int rep) throws HL7Exception { 
        return (EIP) super.insertRepetition(29, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-29: "Parent" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EIP insertObr29_Parent(int rep) throws HL7Exception { 
        return (EIP) super.insertRepetition(29, rep);
    }


    /**
     * Removes a repetition of
     * OBR-29: "Parent" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EIP removeOBRParent(int rep) throws HL7Exception { 
        return (EIP) super.removeRepetition(29, rep);
    }


    /**
     * Removes a repetition of
     * OBR-29: "Parent" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EIP removeObr29_Parent(int rep) throws HL7Exception { 
        return (EIP) super.removeRepetition(29, rep);
    }



    /**
     * Returns all repetitions of Transportation Mode (OBR-30).
     */
    public ID[] getTransportationMode() {
    	ID[] retVal = this.getTypedField(30, new ID[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Transportation Mode (OBR-30).
     */
    public ID[] getObr30_TransportationMode() {
    	ID[] retVal = this.getTypedField(30, new ID[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Transportation Mode (OBR-30).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTransportationModeReps() {
    	return this.getReps(30);
    }


    /**
     * Returns a specific repetition of
     * OBR-30: "Transportation Mode" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getTransportationMode(int rep) { 
		ID retVal = this.getTypedField(30, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-30: "Transportation Mode" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getObr30_TransportationMode(int rep) { 
		ID retVal = this.getTypedField(30, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Transportation Mode (OBR-30).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr30_TransportationModeReps() {
    	return this.getReps(30);
    }


    /**
     * Inserts a repetition of
     * OBR-30: "Transportation Mode" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertTransportationMode(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(30, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-30: "Transportation Mode" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertObr30_TransportationMode(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(30, rep);
    }


    /**
     * Removes a repetition of
     * OBR-30: "Transportation Mode" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeTransportationMode(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(30, rep);
    }


    /**
     * Removes a repetition of
     * OBR-30: "Transportation Mode" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeObr30_TransportationMode(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(30, rep);
    }



    /**
     * Returns all repetitions of Reason for Study (OBR-31).
     */
    public CE[] getReasonForStudy() {
    	CE[] retVal = this.getTypedField(31, new CE[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Reason for Study (OBR-31).
     */
    public CE[] getObr31_ReasonForStudy() {
    	CE[] retVal = this.getTypedField(31, new CE[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Reason for Study (OBR-31).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getReasonForStudyReps() {
    	return this.getReps(31);
    }


    /**
     * Returns a specific repetition of
     * OBR-31: "Reason for Study" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getReasonForStudy(int rep) { 
		CE retVal = this.getTypedField(31, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-31: "Reason for Study" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getObr31_ReasonForStudy(int rep) { 
		CE retVal = this.getTypedField(31, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Reason for Study (OBR-31).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr31_ReasonForStudyReps() {
    	return this.getReps(31);
    }


    /**
     * Inserts a repetition of
     * OBR-31: "Reason for Study" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertReasonForStudy(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(31, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-31: "Reason for Study" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertObr31_ReasonForStudy(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(31, rep);
    }


    /**
     * Removes a repetition of
     * OBR-31: "Reason for Study" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeReasonForStudy(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(31, rep);
    }


    /**
     * Removes a repetition of
     * OBR-31: "Reason for Study" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeObr31_ReasonForStudy(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(31, rep);
    }




    /**
     * Returns
     * OBR-32: "Principal Result Interpreter +" - creates it if necessary
     */
    public NDL getPrincipalResultInterpreter() { 
		NDL retVal = this.getTypedField(32, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OBR-32: "Principal Result Interpreter +" - creates it if necessary
     */
    public NDL getObr32_PrincipalResultInterpreter() { 
		NDL retVal = this.getTypedField(32, 0);
		return retVal;
    }


    /**
     * Returns all repetitions of Assistant Result Interpreter + (OBR-33).
     */
    public NDL[] getAssistantResultInterpreter() {
    	NDL[] retVal = this.getTypedField(33, new NDL[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Assistant Result Interpreter + (OBR-33).
     */
    public NDL[] getObr33_AssistantResultInterpreter() {
    	NDL[] retVal = this.getTypedField(33, new NDL[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Assistant Result Interpreter + (OBR-33).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getAssistantResultInterpreterReps() {
    	return this.getReps(33);
    }


    /**
     * Returns a specific repetition of
     * OBR-33: "Assistant Result Interpreter +" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NDL getAssistantResultInterpreter(int rep) { 
		NDL retVal = this.getTypedField(33, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-33: "Assistant Result Interpreter +" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NDL getObr33_AssistantResultInterpreter(int rep) { 
		NDL retVal = this.getTypedField(33, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Assistant Result Interpreter + (OBR-33).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr33_AssistantResultInterpreterReps() {
    	return this.getReps(33);
    }


    /**
     * Inserts a repetition of
     * OBR-33: "Assistant Result Interpreter +" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NDL insertAssistantResultInterpreter(int rep) throws HL7Exception { 
        return (NDL) super.insertRepetition(33, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-33: "Assistant Result Interpreter +" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NDL insertObr33_AssistantResultInterpreter(int rep) throws HL7Exception { 
        return (NDL) super.insertRepetition(33, rep);
    }


    /**
     * Removes a repetition of
     * OBR-33: "Assistant Result Interpreter +" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NDL removeAssistantResultInterpreter(int rep) throws HL7Exception { 
        return (NDL) super.removeRepetition(33, rep);
    }


    /**
     * Removes a repetition of
     * OBR-33: "Assistant Result Interpreter +" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NDL removeObr33_AssistantResultInterpreter(int rep) throws HL7Exception { 
        return (NDL) super.removeRepetition(33, rep);
    }



    /**
     * Returns all repetitions of Technician + (OBR-34).
     */
    public NDL[] getTechnician() {
    	NDL[] retVal = this.getTypedField(34, new NDL[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Technician + (OBR-34).
     */
    public NDL[] getObr34_Technician() {
    	NDL[] retVal = this.getTypedField(34, new NDL[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Technician + (OBR-34).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTechnicianReps() {
    	return this.getReps(34);
    }


    /**
     * Returns a specific repetition of
     * OBR-34: "Technician +" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NDL getTechnician(int rep) { 
		NDL retVal = this.getTypedField(34, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-34: "Technician +" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NDL getObr34_Technician(int rep) { 
		NDL retVal = this.getTypedField(34, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Technician + (OBR-34).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr34_TechnicianReps() {
    	return this.getReps(34);
    }


    /**
     * Inserts a repetition of
     * OBR-34: "Technician +" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NDL insertTechnician(int rep) throws HL7Exception { 
        return (NDL) super.insertRepetition(34, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-34: "Technician +" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NDL insertObr34_Technician(int rep) throws HL7Exception { 
        return (NDL) super.insertRepetition(34, rep);
    }


    /**
     * Removes a repetition of
     * OBR-34: "Technician +" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NDL removeTechnician(int rep) throws HL7Exception { 
        return (NDL) super.removeRepetition(34, rep);
    }


    /**
     * Removes a repetition of
     * OBR-34: "Technician +" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NDL removeObr34_Technician(int rep) throws HL7Exception { 
        return (NDL) super.removeRepetition(34, rep);
    }



    /**
     * Returns all repetitions of Transcriptionist + (OBR-35).
     */
    public NDL[] getTranscriptionist() {
    	NDL[] retVal = this.getTypedField(35, new NDL[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Transcriptionist + (OBR-35).
     */
    public NDL[] getObr35_Transcriptionist() {
    	NDL[] retVal = this.getTypedField(35, new NDL[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Transcriptionist + (OBR-35).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTranscriptionistReps() {
    	return this.getReps(35);
    }


    /**
     * Returns a specific repetition of
     * OBR-35: "Transcriptionist +" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NDL getTranscriptionist(int rep) { 
		NDL retVal = this.getTypedField(35, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-35: "Transcriptionist +" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NDL getObr35_Transcriptionist(int rep) { 
		NDL retVal = this.getTypedField(35, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Transcriptionist + (OBR-35).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr35_TranscriptionistReps() {
    	return this.getReps(35);
    }


    /**
     * Inserts a repetition of
     * OBR-35: "Transcriptionist +" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NDL insertTranscriptionist(int rep) throws HL7Exception { 
        return (NDL) super.insertRepetition(35, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-35: "Transcriptionist +" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NDL insertObr35_Transcriptionist(int rep) throws HL7Exception { 
        return (NDL) super.insertRepetition(35, rep);
    }


    /**
     * Removes a repetition of
     * OBR-35: "Transcriptionist +" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NDL removeTranscriptionist(int rep) throws HL7Exception { 
        return (NDL) super.removeRepetition(35, rep);
    }


    /**
     * Removes a repetition of
     * OBR-35: "Transcriptionist +" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NDL removeObr35_Transcriptionist(int rep) throws HL7Exception { 
        return (NDL) super.removeRepetition(35, rep);
    }




    /**
     * Returns
     * OBR-36: "Scheduled Date/Time +" - creates it if necessary
     */
    public TS getScheduledDateTime() { 
		TS retVal = this.getTypedField(36, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OBR-36: "Scheduled Date/Time +" - creates it if necessary
     */
    public TS getObr36_ScheduledDateTime() { 
		TS retVal = this.getTypedField(36, 0);
		return retVal;
    }


    /**
     * Returns all repetitions of Number of Sample Containers * (OBR-37).
     */
    public NM[] getNumberOfSampleContainers() {
    	NM[] retVal = this.getTypedField(37, new NM[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Number of Sample Containers * (OBR-37).
     */
    public NM[] getObr37_NumberOfSampleContainers() {
    	NM[] retVal = this.getTypedField(37, new NM[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Number of Sample Containers * (OBR-37).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNumberOfSampleContainersReps() {
    	return this.getReps(37);
    }


    /**
     * Returns a specific repetition of
     * OBR-37: "Number of Sample Containers *" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getNumberOfSampleContainers(int rep) { 
		NM retVal = this.getTypedField(37, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-37: "Number of Sample Containers *" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getObr37_NumberOfSampleContainers(int rep) { 
		NM retVal = this.getTypedField(37, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Number of Sample Containers * (OBR-37).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr37_NumberOfSampleContainersReps() {
    	return this.getReps(37);
    }


    /**
     * Inserts a repetition of
     * OBR-37: "Number of Sample Containers *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertNumberOfSampleContainers(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(37, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-37: "Number of Sample Containers *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertObr37_NumberOfSampleContainers(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(37, rep);
    }


    /**
     * Removes a repetition of
     * OBR-37: "Number of Sample Containers *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeNumberOfSampleContainers(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(37, rep);
    }


    /**
     * Removes a repetition of
     * OBR-37: "Number of Sample Containers *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeObr37_NumberOfSampleContainers(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(37, rep);
    }



    /**
     * Returns all repetitions of Transport Logistics of Collected Sample * (OBR-38).
     */
    public CE[] getTransportLogisticsOfCollectedSample() {
    	CE[] retVal = this.getTypedField(38, new CE[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Transport Logistics of Collected Sample * (OBR-38).
     */
    public CE[] getObr38_TransportLogisticsOfCollectedSample() {
    	CE[] retVal = this.getTypedField(38, new CE[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Transport Logistics of Collected Sample * (OBR-38).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTransportLogisticsOfCollectedSampleReps() {
    	return this.getReps(38);
    }


    /**
     * Returns a specific repetition of
     * OBR-38: "Transport Logistics of Collected Sample *" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getTransportLogisticsOfCollectedSample(int rep) { 
		CE retVal = this.getTypedField(38, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-38: "Transport Logistics of Collected Sample *" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getObr38_TransportLogisticsOfCollectedSample(int rep) { 
		CE retVal = this.getTypedField(38, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Transport Logistics of Collected Sample * (OBR-38).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr38_TransportLogisticsOfCollectedSampleReps() {
    	return this.getReps(38);
    }


    /**
     * Inserts a repetition of
     * OBR-38: "Transport Logistics of Collected Sample *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertTransportLogisticsOfCollectedSample(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(38, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-38: "Transport Logistics of Collected Sample *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertObr38_TransportLogisticsOfCollectedSample(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(38, rep);
    }


    /**
     * Removes a repetition of
     * OBR-38: "Transport Logistics of Collected Sample *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeTransportLogisticsOfCollectedSample(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(38, rep);
    }


    /**
     * Removes a repetition of
     * OBR-38: "Transport Logistics of Collected Sample *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeObr38_TransportLogisticsOfCollectedSample(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(38, rep);
    }



    /**
     * Returns all repetitions of Collector's Comment * (OBR-39).
     */
    public CE[] getCollectorSComment() {
    	CE[] retVal = this.getTypedField(39, new CE[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Collector's Comment * (OBR-39).
     */
    public CE[] getObr39_CollectorSComment() {
    	CE[] retVal = this.getTypedField(39, new CE[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Collector's Comment * (OBR-39).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getCollectorSCommentReps() {
    	return this.getReps(39);
    }


    /**
     * Returns a specific repetition of
     * OBR-39: "Collector's Comment *" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getCollectorSComment(int rep) { 
		CE retVal = this.getTypedField(39, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-39: "Collector's Comment *" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getObr39_CollectorSComment(int rep) { 
		CE retVal = this.getTypedField(39, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Collector's Comment * (OBR-39).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr39_CollectorSCommentReps() {
    	return this.getReps(39);
    }


    /**
     * Inserts a repetition of
     * OBR-39: "Collector's Comment *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertCollectorSComment(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(39, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-39: "Collector's Comment *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertObr39_CollectorSComment(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(39, rep);
    }


    /**
     * Removes a repetition of
     * OBR-39: "Collector's Comment *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeCollectorSComment(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(39, rep);
    }


    /**
     * Removes a repetition of
     * OBR-39: "Collector's Comment *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeObr39_CollectorSComment(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(39, rep);
    }




    /**
     * Returns
     * OBR-40: "Transport Arrangement Responsibility" - creates it if necessary
     */
    public CE getTransportArrangementResponsibility() { 
		CE retVal = this.getTypedField(40, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OBR-40: "Transport Arrangement Responsibility" - creates it if necessary
     */
    public CE getObr40_TransportArrangementResponsibility() { 
		CE retVal = this.getTypedField(40, 0);
		return retVal;
    }


    /**
     * Returns all repetitions of Transport Arranged (OBR-41).
     */
    public ID[] getTransportArranged() {
    	ID[] retVal = this.getTypedField(41, new ID[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Transport Arranged (OBR-41).
     */
    public ID[] getObr41_TransportArranged() {
    	ID[] retVal = this.getTypedField(41, new ID[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Transport Arranged (OBR-41).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTransportArrangedReps() {
    	return this.getReps(41);
    }


    /**
     * Returns a specific repetition of
     * OBR-41: "Transport Arranged" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getTransportArranged(int rep) { 
		ID retVal = this.getTypedField(41, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-41: "Transport Arranged" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getObr41_TransportArranged(int rep) { 
		ID retVal = this.getTypedField(41, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Transport Arranged (OBR-41).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr41_TransportArrangedReps() {
    	return this.getReps(41);
    }


    /**
     * Inserts a repetition of
     * OBR-41: "Transport Arranged" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertTransportArranged(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(41, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-41: "Transport Arranged" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertObr41_TransportArranged(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(41, rep);
    }


    /**
     * Removes a repetition of
     * OBR-41: "Transport Arranged" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeTransportArranged(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(41, rep);
    }


    /**
     * Removes a repetition of
     * OBR-41: "Transport Arranged" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeObr41_TransportArranged(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(41, rep);
    }



    /**
     * Returns all repetitions of Escort Required (OBR-42).
     */
    public ID[] getEscortRequired() {
    	ID[] retVal = this.getTypedField(42, new ID[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Escort Required (OBR-42).
     */
    public ID[] getObr42_EscortRequired() {
    	ID[] retVal = this.getTypedField(42, new ID[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Escort Required (OBR-42).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getEscortRequiredReps() {
    	return this.getReps(42);
    }


    /**
     * Returns a specific repetition of
     * OBR-42: "Escort Required" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getEscortRequired(int rep) { 
		ID retVal = this.getTypedField(42, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-42: "Escort Required" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getObr42_EscortRequired(int rep) { 
		ID retVal = this.getTypedField(42, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Escort Required (OBR-42).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr42_EscortRequiredReps() {
    	return this.getReps(42);
    }


    /**
     * Inserts a repetition of
     * OBR-42: "Escort Required" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertEscortRequired(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(42, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-42: "Escort Required" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertObr42_EscortRequired(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(42, rep);
    }


    /**
     * Removes a repetition of
     * OBR-42: "Escort Required" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeEscortRequired(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(42, rep);
    }


    /**
     * Removes a repetition of
     * OBR-42: "Escort Required" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeObr42_EscortRequired(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(42, rep);
    }



    /**
     * Returns all repetitions of Planned Patient Transport Comment (OBR-43).
     */
    public CE[] getPlannedPatientTransportComment() {
    	CE[] retVal = this.getTypedField(43, new CE[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Planned Patient Transport Comment (OBR-43).
     */
    public CE[] getObr43_PlannedPatientTransportComment() {
    	CE[] retVal = this.getTypedField(43, new CE[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Planned Patient Transport Comment (OBR-43).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPlannedPatientTransportCommentReps() {
    	return this.getReps(43);
    }


    /**
     * Returns a specific repetition of
     * OBR-43: "Planned Patient Transport Comment" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPlannedPatientTransportComment(int rep) { 
		CE retVal = this.getTypedField(43, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-43: "Planned Patient Transport Comment" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getObr43_PlannedPatientTransportComment(int rep) { 
		CE retVal = this.getTypedField(43, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Planned Patient Transport Comment (OBR-43).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr43_PlannedPatientTransportCommentReps() {
    	return this.getReps(43);
    }


    /**
     * Inserts a repetition of
     * OBR-43: "Planned Patient Transport Comment" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPlannedPatientTransportComment(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(43, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-43: "Planned Patient Transport Comment" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertObr43_PlannedPatientTransportComment(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(43, rep);
    }


    /**
     * Removes a repetition of
     * OBR-43: "Planned Patient Transport Comment" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePlannedPatientTransportComment(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(43, rep);
    }


    /**
     * Removes a repetition of
     * OBR-43: "Planned Patient Transport Comment" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeObr43_PlannedPatientTransportComment(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(43, rep);
    }




    /**
     * Returns
     * OBR-44: "Procedure Code" - creates it if necessary
     */
    public CE getProcedureCode() { 
		CE retVal = this.getTypedField(44, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OBR-44: "Procedure Code" - creates it if necessary
     */
    public CE getObr44_ProcedureCode() { 
		CE retVal = this.getTypedField(44, 0);
		return retVal;
    }


    /**
     * Returns all repetitions of Procedure Code Modifier (OBR-45).
     */
    public CE[] getProcedureCodeModifier() {
    	CE[] retVal = this.getTypedField(45, new CE[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Procedure Code Modifier (OBR-45).
     */
    public CE[] getObr45_ProcedureCodeModifier() {
    	CE[] retVal = this.getTypedField(45, new CE[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Procedure Code Modifier (OBR-45).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getProcedureCodeModifierReps() {
    	return this.getReps(45);
    }


    /**
     * Returns a specific repetition of
     * OBR-45: "Procedure Code Modifier" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getProcedureCodeModifier(int rep) { 
		CE retVal = this.getTypedField(45, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-45: "Procedure Code Modifier" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getObr45_ProcedureCodeModifier(int rep) { 
		CE retVal = this.getTypedField(45, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Procedure Code Modifier (OBR-45).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr45_ProcedureCodeModifierReps() {
    	return this.getReps(45);
    }


    /**
     * Inserts a repetition of
     * OBR-45: "Procedure Code Modifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertProcedureCodeModifier(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(45, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-45: "Procedure Code Modifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertObr45_ProcedureCodeModifier(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(45, rep);
    }


    /**
     * Removes a repetition of
     * OBR-45: "Procedure Code Modifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeProcedureCodeModifier(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(45, rep);
    }


    /**
     * Removes a repetition of
     * OBR-45: "Procedure Code Modifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeObr45_ProcedureCodeModifier(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(45, rep);
    }



    /**
     * Returns all repetitions of Placer Supplemental Service Information (OBR-46).
     */
    public CE[] getPlacerSupplementalServiceInformation() {
    	CE[] retVal = this.getTypedField(46, new CE[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Placer Supplemental Service Information (OBR-46).
     */
    public CE[] getObr46_PlacerSupplementalServiceInformation() {
    	CE[] retVal = this.getTypedField(46, new CE[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Placer Supplemental Service Information (OBR-46).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPlacerSupplementalServiceInformationReps() {
    	return this.getReps(46);
    }


    /**
     * Returns a specific repetition of
     * OBR-46: "Placer Supplemental Service Information" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPlacerSupplementalServiceInformation(int rep) { 
		CE retVal = this.getTypedField(46, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-46: "Placer Supplemental Service Information" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getObr46_PlacerSupplementalServiceInformation(int rep) { 
		CE retVal = this.getTypedField(46, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Placer Supplemental Service Information (OBR-46).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr46_PlacerSupplementalServiceInformationReps() {
    	return this.getReps(46);
    }


    /**
     * Inserts a repetition of
     * OBR-46: "Placer Supplemental Service Information" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPlacerSupplementalServiceInformation(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(46, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-46: "Placer Supplemental Service Information" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertObr46_PlacerSupplementalServiceInformation(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(46, rep);
    }


    /**
     * Removes a repetition of
     * OBR-46: "Placer Supplemental Service Information" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePlacerSupplementalServiceInformation(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(46, rep);
    }


    /**
     * Removes a repetition of
     * OBR-46: "Placer Supplemental Service Information" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeObr46_PlacerSupplementalServiceInformation(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(46, rep);
    }



    /**
     * Returns all repetitions of Filler Supplemental Service Information (OBR-47).
     */
    public CE[] getFillerSupplementalServiceInformation() {
    	CE[] retVal = this.getTypedField(47, new CE[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Filler Supplemental Service Information (OBR-47).
     */
    public CE[] getObr47_FillerSupplementalServiceInformation() {
    	CE[] retVal = this.getTypedField(47, new CE[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Filler Supplemental Service Information (OBR-47).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getFillerSupplementalServiceInformationReps() {
    	return this.getReps(47);
    }


    /**
     * Returns a specific repetition of
     * OBR-47: "Filler Supplemental Service Information" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getFillerSupplementalServiceInformation(int rep) { 
		CE retVal = this.getTypedField(47, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OBR-47: "Filler Supplemental Service Information" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getObr47_FillerSupplementalServiceInformation(int rep) { 
		CE retVal = this.getTypedField(47, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Filler Supplemental Service Information (OBR-47).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr47_FillerSupplementalServiceInformationReps() {
    	return this.getReps(47);
    }


    /**
     * Inserts a repetition of
     * OBR-47: "Filler Supplemental Service Information" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertFillerSupplementalServiceInformation(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(47, rep);
    }


    /**
     * Inserts a repetition of
     * OBR-47: "Filler Supplemental Service Information" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertObr47_FillerSupplementalServiceInformation(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(47, rep);
    }


    /**
     * Removes a repetition of
     * OBR-47: "Filler Supplemental Service Information" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeFillerSupplementalServiceInformation(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(47, rep);
    }


    /**
     * Removes a repetition of
     * OBR-47: "Filler Supplemental Service Information" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeObr47_FillerSupplementalServiceInformation(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(47, rep);
    }






    /** {@inheritDoc} */   
    protected Type createNewTypeWithoutReflection(int field) {
       switch (field) {
          case 0: return new SI(getMessage());
          case 1: return new EI(getMessage());
          case 2: return new EI(getMessage());
          case 3: return new CE(getMessage());
          case 4: return new ID(getMessage(), new Integer( 0 ));
          case 5: return new TS(getMessage());
          case 6: return new TS(getMessage());
          case 7: return new TS(getMessage());
          case 8: return new CQ(getMessage());
          case 9: return new XCN(getMessage());
          case 10: return new ID(getMessage(), new Integer( 65 ));
          case 11: return new CE(getMessage());
          case 12: return new ST(getMessage());
          case 13: return new TS(getMessage());
          case 14: return new SPS(getMessage());
          case 15: return new XCN(getMessage());
          case 16: return new XTN(getMessage());
          case 17: return new ST(getMessage());
          case 18: return new ST(getMessage());
          case 19: return new ST(getMessage());
          case 20: return new ST(getMessage());
          case 21: return new TS(getMessage());
          case 22: return new MOC(getMessage());
          case 23: return new ID(getMessage(), new Integer( 74 ));
          case 24: return new ID(getMessage(), new Integer( 123 ));
          case 25: return new PRL(getMessage());
          case 26: return new TQ(getMessage());
          case 27: return new XCN(getMessage());
          case 28: return new EIP(getMessage());
          case 29: return new ID(getMessage(), new Integer( 124 ));
          case 30: return new CE(getMessage());
          case 31: return new NDL(getMessage());
          case 32: return new NDL(getMessage());
          case 33: return new NDL(getMessage());
          case 34: return new NDL(getMessage());
          case 35: return new TS(getMessage());
          case 36: return new NM(getMessage());
          case 37: return new CE(getMessage());
          case 38: return new CE(getMessage());
          case 39: return new CE(getMessage());
          case 40: return new ID(getMessage(), new Integer( 224 ));
          case 41: return new ID(getMessage(), new Integer( 225 ));
          case 42: return new CE(getMessage());
          case 43: return new CE(getMessage());
          case 44: return new CE(getMessage());
          case 45: return new CE(getMessage());
          case 46: return new CE(getMessage());
          default: return null;
       }
   }


}

