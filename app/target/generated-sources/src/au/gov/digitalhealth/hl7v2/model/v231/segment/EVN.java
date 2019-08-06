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
 *<p>Represents an HL7 EVN message segment (event type segment). 
 * This segment has the following fields:</p>
 * <ul>
     * <li>EVN-1: Event Type Code (ID) <b> </b>
     * <li>EVN-2: Recorded Date/Time (TS) <b> </b>
     * <li>EVN-3: Date/Time Planned Event (TS) <b>optional repeating</b>
     * <li>EVN-4: Event Reason Code (IS) <b>optional repeating</b>
     * <li>EVN-5: Operator ID (XCN) <b>optional repeating</b>
     * <li>EVN-6: Event Occurred (TS) <b>optional repeating</b>
 * </ul>
 */
@SuppressWarnings("unused")
public class EVN extends AbstractSegment {

    /** 
     * Creates a new EVN segment
     */
    public EVN(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                              this.add(ID.class, true, 1, 3, new Object[]{ getMessage(), new Integer(3) }, "Event Type Code");
                                  this.add(TS.class, true, 1, 26, new Object[]{ getMessage() }, "Recorded Date/Time");
                                  this.add(TS.class, false, -1, 26, new Object[]{ getMessage() }, "Date/Time Planned Event");
                                              this.add(IS.class, false, -1, 3, new Object[]{ getMessage(), new Integer(62) }, "Event Reason Code");
                                  this.add(XCN.class, false, -1, 75, new Object[]{ getMessage() }, "Operator ID");
                                  this.add(TS.class, false, -1, 26, new Object[]{ getMessage() }, "Event Occurred");
       } catch(HL7Exception e) {
          log.error("Unexpected error creating EVN - this is probably a bug in the source code generator.", e);
       }
    }



    /**
     * Returns
     * EVN-1: "Event Type Code" - creates it if necessary
     */
    public ID getEventTypeCode() { 
		ID retVal = this.getTypedField(1, 0);
		return retVal;
    }
    
    /**
     * Returns
     * EVN-1: "Event Type Code" - creates it if necessary
     */
    public ID getEvn1_EventTypeCode() { 
		ID retVal = this.getTypedField(1, 0);
		return retVal;
    }



    /**
     * Returns
     * EVN-2: "Recorded Date/Time" - creates it if necessary
     */
    public TS getRecordedDateTime() { 
		TS retVal = this.getTypedField(2, 0);
		return retVal;
    }
    
    /**
     * Returns
     * EVN-2: "Recorded Date/Time" - creates it if necessary
     */
    public TS getEvn2_RecordedDateTime() { 
		TS retVal = this.getTypedField(2, 0);
		return retVal;
    }


    /**
     * Returns all repetitions of Date/Time Planned Event (EVN-3).
     */
    public TS[] getDateTimePlannedEvent() {
    	TS[] retVal = this.getTypedField(3, new TS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Date/Time Planned Event (EVN-3).
     */
    public TS[] getEvn3_DateTimePlannedEvent() {
    	TS[] retVal = this.getTypedField(3, new TS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Date/Time Planned Event (EVN-3).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getDateTimePlannedEventReps() {
    	return this.getReps(3);
    }


    /**
     * Returns a specific repetition of
     * EVN-3: "Date/Time Planned Event" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getDateTimePlannedEvent(int rep) { 
		TS retVal = this.getTypedField(3, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * EVN-3: "Date/Time Planned Event" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getEvn3_DateTimePlannedEvent(int rep) { 
		TS retVal = this.getTypedField(3, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Date/Time Planned Event (EVN-3).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getEvn3_DateTimePlannedEventReps() {
    	return this.getReps(3);
    }


    /**
     * Inserts a repetition of
     * EVN-3: "Date/Time Planned Event" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertDateTimePlannedEvent(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(3, rep);
    }


    /**
     * Inserts a repetition of
     * EVN-3: "Date/Time Planned Event" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertEvn3_DateTimePlannedEvent(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(3, rep);
    }


    /**
     * Removes a repetition of
     * EVN-3: "Date/Time Planned Event" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeDateTimePlannedEvent(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(3, rep);
    }


    /**
     * Removes a repetition of
     * EVN-3: "Date/Time Planned Event" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeEvn3_DateTimePlannedEvent(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(3, rep);
    }



    /**
     * Returns all repetitions of Event Reason Code (EVN-4).
     */
    public IS[] getEventReasonCode() {
    	IS[] retVal = this.getTypedField(4, new IS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Event Reason Code (EVN-4).
     */
    public IS[] getEvn4_EventReasonCode() {
    	IS[] retVal = this.getTypedField(4, new IS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Event Reason Code (EVN-4).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getEventReasonCodeReps() {
    	return this.getReps(4);
    }


    /**
     * Returns a specific repetition of
     * EVN-4: "Event Reason Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getEventReasonCode(int rep) { 
		IS retVal = this.getTypedField(4, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * EVN-4: "Event Reason Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getEvn4_EventReasonCode(int rep) { 
		IS retVal = this.getTypedField(4, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Event Reason Code (EVN-4).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getEvn4_EventReasonCodeReps() {
    	return this.getReps(4);
    }


    /**
     * Inserts a repetition of
     * EVN-4: "Event Reason Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertEventReasonCode(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(4, rep);
    }


    /**
     * Inserts a repetition of
     * EVN-4: "Event Reason Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertEvn4_EventReasonCode(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(4, rep);
    }


    /**
     * Removes a repetition of
     * EVN-4: "Event Reason Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeEventReasonCode(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(4, rep);
    }


    /**
     * Removes a repetition of
     * EVN-4: "Event Reason Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeEvn4_EventReasonCode(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(4, rep);
    }



    /**
     * Returns all repetitions of Operator ID (EVN-5).
     */
    public XCN[] getOperatorID() {
    	XCN[] retVal = this.getTypedField(5, new XCN[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Operator ID (EVN-5).
     */
    public XCN[] getEvn5_OperatorID() {
    	XCN[] retVal = this.getTypedField(5, new XCN[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Operator ID (EVN-5).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOperatorIDReps() {
    	return this.getReps(5);
    }


    /**
     * Returns a specific repetition of
     * EVN-5: "Operator ID" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getOperatorID(int rep) { 
		XCN retVal = this.getTypedField(5, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * EVN-5: "Operator ID" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getEvn5_OperatorID(int rep) { 
		XCN retVal = this.getTypedField(5, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Operator ID (EVN-5).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getEvn5_OperatorIDReps() {
    	return this.getReps(5);
    }


    /**
     * Inserts a repetition of
     * EVN-5: "Operator ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertOperatorID(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(5, rep);
    }


    /**
     * Inserts a repetition of
     * EVN-5: "Operator ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertEvn5_OperatorID(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(5, rep);
    }


    /**
     * Removes a repetition of
     * EVN-5: "Operator ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeOperatorID(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(5, rep);
    }


    /**
     * Removes a repetition of
     * EVN-5: "Operator ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeEvn5_OperatorID(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(5, rep);
    }



    /**
     * Returns all repetitions of Event Occurred (EVN-6).
     */
    public TS[] getEventOccurred() {
    	TS[] retVal = this.getTypedField(6, new TS[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Event Occurred (EVN-6).
     */
    public TS[] getEvn6_EventOccurred() {
    	TS[] retVal = this.getTypedField(6, new TS[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Event Occurred (EVN-6).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getEventOccurredReps() {
    	return this.getReps(6);
    }


    /**
     * Returns a specific repetition of
     * EVN-6: "Event Occurred" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getEventOccurred(int rep) { 
		TS retVal = this.getTypedField(6, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * EVN-6: "Event Occurred" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getEvn6_EventOccurred(int rep) { 
		TS retVal = this.getTypedField(6, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Event Occurred (EVN-6).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getEvn6_EventOccurredReps() {
    	return this.getReps(6);
    }


    /**
     * Inserts a repetition of
     * EVN-6: "Event Occurred" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertEventOccurred(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(6, rep);
    }


    /**
     * Inserts a repetition of
     * EVN-6: "Event Occurred" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertEvn6_EventOccurred(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(6, rep);
    }


    /**
     * Removes a repetition of
     * EVN-6: "Event Occurred" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeEventOccurred(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(6, rep);
    }


    /**
     * Removes a repetition of
     * EVN-6: "Event Occurred" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeEvn6_EventOccurred(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(6, rep);
    }






    /** {@inheritDoc} */   
    protected Type createNewTypeWithoutReflection(int field) {
       switch (field) {
          case 0: return new ID(getMessage(), new Integer( 3 ));
          case 1: return new TS(getMessage());
          case 2: return new TS(getMessage());
          case 3: return new IS(getMessage(), new Integer( 62 ));
          case 4: return new XCN(getMessage());
          case 5: return new TS(getMessage());
          default: return null;
       }
   }


}

