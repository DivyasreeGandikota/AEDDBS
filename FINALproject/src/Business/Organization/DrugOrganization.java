/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Drug.DrugList;
import Business.Gene.GeneHistory;
import java.util.ArrayList;

/**
 *
 * @author db
 */
public class DrugOrganization {
    
    public DrugOrganization() { }
    
    
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DrugRole());
        return roles;
    }
    
    public void addChemical (ChemicalCompound cdi)
    {
        chemList.add(cdi);
    }
   
}
