/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.WorkQueue.InventoryDirectory;
import java.util.ArrayList;

/**
 *
 *  @author db
 */

public class DistributorEnterprise extends Enterprise {
    
    public DistributorEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Distributor);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
