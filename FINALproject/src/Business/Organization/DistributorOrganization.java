/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;
import javax.management.relation.Role;
import Business.Role.DistributorRole;
import Business.Role.Role;

/**
 *
 * @author bunny
 */
public class DistributorOrganization extends Organization{
    
    public DistributorOrganization() {
        super(Organization.Type.DistributorFoodOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DistributorRole());
        return roles;
    }
    
    
    
    
}
