/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 *  @author db
 */

public class ShelterEnterprise extends Enterprise {
    
    public ShelterEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Shelter);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
