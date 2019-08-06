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


package au.gov.digitalhealth.hl7v2.model.v24.group;

import au.gov.digitalhealth.hl7v2.model.v24.segment.*;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.model.*;

/**
 * <p>Represents a RRI_I12_PROVIDER_CONTACT group structure (PROVIDER_CONTACT).
 * A Group is an ordered collection of message segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements:  
 * </p>
 * <ul>
                         * <li>1: PRD (Provider Data) <b> repeating </b></li>
 * </ul>
 */
//@SuppressWarnings("unused")
public class RRI_I12_PROVIDER_CONTACT extends AbstractGroup {

    /** 
     * Creates a new RRI_I12_PROVIDER_CONTACT group
     */
    public RRI_I12_PROVIDER_CONTACT(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(PRD.class, true, true, false);
       } catch(HL7Exception e) {
          log.error("Unexpected error creating RRI_I12_PROVIDER_CONTACT - this is probably a bug in the source code generator.", e);
       }
    }

    /** 
     * Returns "2.4"
     */
    public String getVersion() {
       return "2.4";
    }



    /**
     * Returns
     * the first repetition of 
     * PRD (Provider Data) - creates it if necessary
     */
    public PRD getPRD() { 
       PRD retVal = getTyped("PRD", PRD.class);
       return retVal;
    }


    /**
     * Returns a specific repetition of
     * PRD (Provider Data) - creates it if necessary
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public PRD getPRD(int rep) { 
       PRD retVal = getTyped("PRD", rep, PRD.class);
       return retVal;
    }

    /** 
     * Returns the number of existing repetitions of PRD 
     */ 
    public int getPRDReps() {  
        return getReps("PRD");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of PRD.
     * <p>
     * <p>
     * Note that unlike {@link #getPRD()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     */ 
    public java.util.List<PRD> getPRDAll() throws HL7Exception {
    	return getAllAsList("PRD", PRD.class);
    } 

    /**
     * Inserts a specific repetition of PRD (Provider Data)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertPRD(PRD structure, int rep) throws HL7Exception { 
       super.insertRepetition("PRD", structure, rep);
    }


    /**
     * Inserts a specific repetition of PRD (Provider Data)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public PRD insertPRD(int rep) throws HL7Exception { 
       return (PRD)super.insertRepetition("PRD", rep);
    }


    /**
     * Removes a specific repetition of PRD (Provider Data)
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public PRD removePRD(int rep) throws HL7Exception { 
       return (PRD)super.removeRepetition("PRD", rep);
    }



}

