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
 *<p>Represents an HL7 RXR message segment (Pharmacy/Treatment Route). 
 * This segment has the following fields:</p>
 * <ul>
     * <li>RXR-1: Route (CE) <b> </b>
     * <li>RXR-2: Administration Site (CE) <b>optional </b>
     * <li>RXR-3: Administration Device (CE) <b>optional </b>
     * <li>RXR-4: Administration Method (CE) <b>optional </b>
     * <li>RXR-5: Routing Instruction (CE) <b>optional </b>
 * </ul>
 */
@SuppressWarnings("unused")
public class RXR extends AbstractSegment {

    /** 
     * Creates a new RXR segment
     */
    public RXR(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(CE.class, true, 1, 250, new Object[]{ getMessage() }, "Route");
                                  this.add(CE.class, false, 1, 250, new Object[]{ getMessage() }, "Administration Site");
                                  this.add(CE.class, false, 1, 250, new Object[]{ getMessage() }, "Administration Device");
                                  this.add(CE.class, false, 1, 250, new Object[]{ getMessage() }, "Administration Method");
                                  this.add(CE.class, false, 1, 250, new Object[]{ getMessage() }, "Routing Instruction");
       } catch(HL7Exception e) {
          log.error("Unexpected error creating RXR - this is probably a bug in the source code generator.", e);
       }
    }



    /**
     * Returns
     * RXR-1: "Route" - creates it if necessary
     */
    public CE getRoute() { 
		CE retVal = this.getTypedField(1, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXR-1: "Route" - creates it if necessary
     */
    public CE getRxr1_Route() { 
		CE retVal = this.getTypedField(1, 0);
		return retVal;
    }



    /**
     * Returns
     * RXR-2: "Administration Site" - creates it if necessary
     */
    public CE getAdministrationSite() { 
		CE retVal = this.getTypedField(2, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXR-2: "Administration Site" - creates it if necessary
     */
    public CE getRxr2_AdministrationSite() { 
		CE retVal = this.getTypedField(2, 0);
		return retVal;
    }



    /**
     * Returns
     * RXR-3: "Administration Device" - creates it if necessary
     */
    public CE getAdministrationDevice() { 
		CE retVal = this.getTypedField(3, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXR-3: "Administration Device" - creates it if necessary
     */
    public CE getRxr3_AdministrationDevice() { 
		CE retVal = this.getTypedField(3, 0);
		return retVal;
    }



    /**
     * Returns
     * RXR-4: "Administration Method" - creates it if necessary
     */
    public CE getAdministrationMethod() { 
		CE retVal = this.getTypedField(4, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXR-4: "Administration Method" - creates it if necessary
     */
    public CE getRxr4_AdministrationMethod() { 
		CE retVal = this.getTypedField(4, 0);
		return retVal;
    }



    /**
     * Returns
     * RXR-5: "Routing Instruction" - creates it if necessary
     */
    public CE getRoutingInstruction() { 
		CE retVal = this.getTypedField(5, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXR-5: "Routing Instruction" - creates it if necessary
     */
    public CE getRxr5_RoutingInstruction() { 
		CE retVal = this.getTypedField(5, 0);
		return retVal;
    }





    /** {@inheritDoc} */   
    protected Type createNewTypeWithoutReflection(int field) {
       switch (field) {
          case 0: return new CE(getMessage());
          case 1: return new CE(getMessage());
          case 2: return new CE(getMessage());
          case 3: return new CE(getMessage());
          case 4: return new CE(getMessage());
          default: return null;
       }
   }


}

