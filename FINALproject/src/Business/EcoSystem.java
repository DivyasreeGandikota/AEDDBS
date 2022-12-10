/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;

/**
 *
 * @author db
 */
public class EcoSystem {
    
       private static EcoSystem business;
       
        public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
            private EcoSystem(){
                
    }
            
}
