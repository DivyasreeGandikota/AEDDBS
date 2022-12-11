/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.QualityCheckRole.QualityCheckWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author bunny
 */
public class QualityCheckRole {
    
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new QualityCheckWorkAreaJPanel(userProcessContainer, account, (QualityOrganization)organization, enterprise,business);
    }
}
