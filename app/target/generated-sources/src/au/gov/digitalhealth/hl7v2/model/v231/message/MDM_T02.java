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


package au.gov.digitalhealth.hl7v2.model.v231.message;

import au.gov.digitalhealth.hl7v2.model.v231.segment.*;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.parser.DefaultModelClassFactory;
import ca.uhn.hl7v2.model.*;


/**
 * <p>Represents a MDM_T02 message structure (see chapter ). This structure contains the 
 * following elements: </p>
 * <ul>
		                 * <li>1: MSH (message header segment) <b> </b> </li>
		                 * <li>2: EVN (event type segment) <b> </b> </li>
		                 * <li>3: PID (patient identification segment) <b> </b> </li>
		                 * <li>4: PV1 (patient visit segment-) <b> </b> </li>
		                 * <li>5: TXA (Document notification segment) <b> </b> </li>
		                 * <li>6: OBX (observation/result segment) <b> </b> </li>
 * </ul>
 */
//@SuppressWarnings("unused")
public class MDM_T02 extends AbstractMessage  {

    /**
     * Creates a new MDM_T02 message with DefaultModelClassFactory. 
     */ 
    public MDM_T02() { 
       this(new DefaultModelClassFactory());
    }

    /** 
     * Creates a new MDM_T02 message with custom ModelClassFactory.
     */
    public MDM_T02(ModelClassFactory factory) {
       super(factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                          this.add(MSH.class, true, false);
	                          this.add(EVN.class, true, false);
	                          this.add(PID.class, true, false);
	                          this.add(PV1.class, true, false);
	                          this.add(TXA.class, true, false);
	                          this.add(OBX.class, true, false);
	       } catch(HL7Exception e) {
          log.error("Unexpected error creating MDM_T02 - this is probably a bug in the source code generator.", e);
       }
    }


    /** 
     * Returns "2.3.1"
     */
    public String getVersion() {
       return "2.3.1";
    }




    /**
     * <p>
     * Returns
     * MSH (message header segment) - creates it if necessary
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
     * EVN (event type segment) - creates it if necessary
     * </p>
     * 
     *
     */
    public EVN getEVN() { 
       return getTyped("EVN", EVN.class);
    }





    /**
     * <p>
     * Returns
     * PID (patient identification segment) - creates it if necessary
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
     * PV1 (patient visit segment-) - creates it if necessary
     * </p>
     * 
     *
     */
    public PV1 getPV1() { 
       return getTyped("PV1", PV1.class);
    }





    /**
     * <p>
     * Returns
     * TXA (Document notification segment) - creates it if necessary
     * </p>
     * 
     *
     */
    public TXA getTXA() { 
       return getTyped("TXA", TXA.class);
    }





    /**
     * <p>
     * Returns
     * OBX (observation/result segment) - creates it if necessary
     * </p>
     * 
     *
     */
    public OBX getOBX() { 
       return getTyped("OBX", OBX.class);
    }




}

