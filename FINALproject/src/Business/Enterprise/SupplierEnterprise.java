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

public class SupplierEnterprise extends Enterprise{
    
    public SupplierEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Supplier);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
