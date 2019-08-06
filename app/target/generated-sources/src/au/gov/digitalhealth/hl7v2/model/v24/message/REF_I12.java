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


package au.gov.digitalhealth.hl7v2.model.v24.message;

import au.gov.digitalhealth.hl7v2.model.v24.group.*;
import au.gov.digitalhealth.hl7v2.model.v24.segment.*;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.parser.DefaultModelClassFactory;
import ca.uhn.hl7v2.model.*;


/**
 * <p>Represents a REF_I12 message structure (see chapter ). This structure contains the 
 * following elements: </p>
 * <ul>
		                 * <li>1: MSH (Message Header) <b> </b> </li>
		                 * <li>2: RF1 (Referral Information) <b> </b> </li>
		                 * <li>3: REF_I12_PROVIDER_CONTACT (PROVIDER_CONTACT) <b> repeating</b> </li>
		                 * <li>4: PID (Patient identification) <b> </b> </li>
		                 * <li>5: AL1 (Patient allergy information) <b>optional repeating</b> </li>
		                 * <li>6: REF_I12_OBSERVATION (OBSERVATION) <b> repeating</b> </li>
		                 * <li>7: REF_I12_PATIENT_VISIT (PATIENT_VISIT) <b> </b> </li>
		                 * <li>8: REF_I12_ORM_O01_ORDER (ORM_O01_ORDER) <b>optional repeating</b> </li>
 * </ul>
 */
//@SuppressWarnings("unused")
public class REF_I12 extends AbstractMessage  {

    /**
     * Creates a new REF_I12 message with DefaultModelClassFactory. 
     */ 
    public REF_I12() { 
       this(new DefaultModelClassFactory());
    }

    /** 
     * Creates a new REF_I12 message with custom ModelClassFactory.
     */
    public REF_I12(ModelClassFactory factory) {
       super(factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                          this.add(MSH.class, true, false);
	                          this.add(RF1.class, true, false);
	                          this.add(REF_I12_PROVIDER_CONTACT.class, true, true);
	                          this.add(PID.class, true, false);
	                          this.add(AL1.class, false, true);
	                          this.add(REF_I12_OBSERVATION.class, true, true);
	                          this.add(REF_I12_PATIENT_VISIT.class, true, false);
	                          this.add(REF_I12_ORM_O01_ORDER.class, false, true);
	       } catch(HL7Exception e) {
          log.error("Unexpected error creating REF_I12 - this is probably a bug in the source code generator.", e);
       }
    }


    /** 
     * Returns "2.4"
     */
    public String getVersion() {
       return "2.4";
    }




    /**
     * <p>
     * Returns
     * MSH (Message Header) - creates it if necessary
     * </p>
     * 
     *
     */
    public MSH getMSH() { 
       return getTyped("MSH", MSH.class);
    }





    /**
     * <p>
     * Returns
     * RF1 (Referral Information) - creates it if necessary
     * </p>
     * 
     *
     */
    public RF1 getRF1() { 
       return getTyped("RF1", RF1.class);
    }





    /**
     * <p>
     * Returns
     * the first repetition of 
     * PROVIDER_CONTACT (PROVIDER_CONTACT) - creates it if necessary
     * </p>
     * 
     *
     */
    public REF_I12_PROVIDER_CONTACT getPROVIDER_CONTACT() { 
       return getTyped("PROVIDER_CONTACT", REF_I12_PROVIDER_CONTACT.class);
    }


    /**
     * <p>
     * Returns a specific repetition of
     * PROVIDER_CONTACT (PROVIDER_CONTACT) - creates it if necessary
     * </p>
     * 
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public REF_I12_PROVIDER_CONTACT getPROVIDER_CONTACT(int rep) { 
       return getTyped("PROVIDER_CONTACT", rep, REF_I12_PROVIDER_CONTACT.class);
    }

    /** 
     * <p>
     * Returns the number of existing repetitions of PROVIDER_CONTACT 
     * </p>
     * 
     */ 
    public int getPROVIDER_CONTACTReps() { 
    	return getReps("PROVIDER_CONTACT");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of PROVIDER_CONTACT.
     * <p>
     * <p>
     * Note that unlike {@link #getPROVIDER_CONTACT()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     * 
     */ 
    public java.util.List<REF_I12_PROVIDER_CONTACT> getPROVIDER_CONTACTAll() throws HL7Exception {
    	return getAllAsList("PROVIDER_CONTACT", REF_I12_PROVIDER_CONTACT.class);
    } 

    /**
     * <p>
     * Inserts a specific repetition of PROVIDER_CONTACT (PROVIDER_CONTACT)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertPROVIDER_CONTACT(REF_I12_PROVIDER_CONTACT structure, int rep) throws HL7Exception { 
       super.insertRepetition( "PROVIDER_CONTACT", structure, rep);
    }


    /**
     * <p>
     * Inserts a specific repetition of PROVIDER_CONTACT (PROVIDER_CONTACT)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public REF_I12_PROVIDER_CONTACT insertPROVIDER_CONTACT(int rep) throws HL7Exception { 
       return (REF_I12_PROVIDER_CONTACT)super.insertRepetition("PROVIDER_CONTACT", rep);
    }


    /**
     * <p>
     * Removes a specific repetition of PROVIDER_CONTACT (PROVIDER_CONTACT)
     * </p>
     * 
     *
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public REF_I12_PROVIDER_CONTACT removePROVIDER_CONTACT(int rep) throws HL7Exception { 
       return (REF_I12_PROVIDER_CONTACT)super.removeRepetition("PROVIDER_CONTACT", rep);
    }




    /**
     * <p>
     * Returns
     * PID (Patient identification) - creates it if necessary
     * </p>
     * 
     *
     */
    public PID getPID() { 
       return getTyped("PID", PID.class);
    }





    /**
     * <p>
     * Returns
     * the first repetition of 
     * AL1 (Patient allergy information) - creates it if necessary
     * </p>
     * 
     *
     */
    public AL1 getAL1() { 
       return getTyped("AL1", AL1.class);
    }


    /**
     * <p>
     * Returns a specific repetition of
     * AL1 (Patient allergy information) - creates it if necessary
     * </p>
     * 
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public AL1 getAL1(int rep) { 
       return getTyped("AL1", rep, AL1.class);
    }

    /** 
     * <p>
     * Returns the number of existing repetitions of AL1 
     * </p>
     * 
     */ 
    public int getAL1Reps() { 
    	return getReps("AL1");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of AL1.
     * <p>
     * <p>
     * Note that unlike {@link #getAL1()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     * 
     */ 
    public java.util.List<AL1> getAL1All() throws HL7Exception {
    	return getAllAsList("AL1", AL1.class);
    } 

    /**
     * <p>
     * Inserts a specific repetition of AL1 (Patient allergy information)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertAL1(AL1 structure, int rep) throws HL7Exception { 
       super.insertRepetition( "AL1", structure, rep);
    }


    /**
     * <p>
     * Inserts a specific repetition of AL1 (Patient allergy information)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public AL1 insertAL1(int rep) throws HL7Exception { 
       return (AL1)super.insertRepetition("AL1", rep);
    }


    /**
     * <p>
     * Removes a specific repetition of AL1 (Patient allergy information)
     * </p>
     * 
     *
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public AL1 removeAL1(int rep) throws HL7Exception { 
       return (AL1)super.removeRepetition("AL1", rep);
    }




    /**
     * <p>
     * Returns
     * the first repetition of 
     * OBSERVATION (OBSERVATION) - creates it if necessary
     * </p>
     * 
     *
     */
    public REF_I12_OBSERVATION getOBSERVATION() { 
       return getTyped("OBSERVATION", REF_I12_OBSERVATION.class);
    }


    /**
     * <p>
     * Returns a specific repetition of
     * OBSERVATION (OBSERVATION) - creates it if necessary
     * </p>
     * 
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public REF_I12_OBSERVATION getOBSERVATION(int rep) { 
       return getTyped("OBSERVATION", rep, REF_I12_OBSERVATION.class);
    }

    /** 
     * <p>
     * Returns the number of existing repetitions of OBSERVATION 
     * </p>
     * 
     */ 
    public int getOBSERVATIONReps() { 
    	return getReps("OBSERVATION");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of OBSERVATION.
     * <p>
     * <p>
     * Note that unlike {@link #getOBSERVATION()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     * 
     */ 
    public java.util.List<REF_I12_OBSERVATION> getOBSERVATIONAll() throws HL7Exception {
    	return getAllAsList("OBSERVATION", REF_I12_OBSERVATION.class);
    } 

    /**
     * <p>
     * Inserts a specific repetition of OBSERVATION (OBSERVATION)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertOBSERVATION(REF_I12_OBSERVATION structure, int rep) throws HL7Exception { 
       super.insertRepetition( "OBSERVATION", structure, rep);
    }


    /**
     * <p>
     * Inserts a specific repetition of OBSERVATION (OBSERVATION)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public REF_I12_OBSERVATION insertOBSERVATION(int rep) throws HL7Exception { 
       return (REF_I12_OBSERVATION)super.insertRepetition("OBSERVATION", rep);
    }


    /**
     * <p>
     * Removes a specific repetition of OBSERVATION (OBSERVATION)
     * </p>
     * 
     *
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public REF_I12_OBSERVATION removeOBSERVATION(int rep) throws HL7Exception { 
       return (REF_I12_OBSERVATION)super.removeRepetition("OBSERVATION", rep);
    }




    /**
     * <p>
     * Returns
     * PATIENT_VISIT (PATIENT_VISIT) - creates it if necessary
     * </p>
     * 
     *
     */
    public REF_I12_PATIENT_VISIT getPATIENT_VISIT() { 
       return getTyped("PATIENT_VISIT", REF_I12_PATIENT_VISIT.class);
    }





    /**
     * <p>
     * Returns
     * the first repetition of 
     * ORM_O01_ORDER (ORM_O01_ORDER) - creates it if necessary
     * </p>
     * 
     *
     */
    public REF_I12_ORM_O01_ORDER getORM_O01_ORDER() { 
       return getTyped("ORM_O01_ORDER", REF_I12_ORM_O01_ORDER.class);
    }


    /**
     * <p>
     * Returns a specific repetition of
     * ORM_O01_ORDER (ORM_O01_ORDER) - creates it if necessary
     * </p>
     * 
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public REF_I12_ORM_O01_ORDER getORM_O01_ORDER(int rep) { 
       return getTyped("ORM_O01_ORDER", rep, REF_I12_ORM_O01_ORDER.class);
    }

    /** 
     * <p>
     * Returns the number of existing repetitions of ORM_O01_ORDER 
     * </p>
     * 
     */ 
    public int getORM_O01_ORDERReps() { 
    	return getReps("ORM_O01_ORDER");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of ORM_O01_ORDER.
     * <p>
     * <p>
     * Note that unlike {@link #getORM_O01_ORDER()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     * 
     */ 
    public java.util.List<REF_I12_ORM_O01_ORDER> getORM_O01_ORDERAll() throws HL7Exception {
    	return getAllAsList("ORM_O01_ORDER", REF_I12_ORM_O01_ORDER.class);
    } 

    /**
     * <p>
     * Inserts a specific repetition of ORM_O01_ORDER (ORM_O01_ORDER)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertORM_O01_ORDER(REF_I12_ORM_O01_ORDER structure, int rep) throws HL7Exception { 
       super.insertRepetition( "ORM_O01_ORDER", structure, rep);
    }


    /**
     * <p>
     * Inserts a specific repetition of ORM_O01_ORDER (ORM_O01_ORDER)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public REF_I12_ORM_O01_ORDER insertORM_O01_ORDER(int rep) throws HL7Exception { 
       return (REF_I12_ORM_O01_ORDER)super.insertRepetition("ORM_O01_ORDER", rep);
    }


    /**
     * <p>
     * Removes a specific repetition of ORM_O01_ORDER (ORM_O01_ORDER)
     * </p>
     * 
     *
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public REF_I12_ORM_O01_ORDER removeORM_O01_ORDER(int rep) throws HL7Exception { 
       return (REF_I12_ORM_O01_ORDER)super.removeRepetition("ORM_O01_ORDER", rep);
    }



}

