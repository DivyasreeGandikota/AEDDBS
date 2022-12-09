/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness.Drug;

import java.util.ArrayList;

/**
 *
 * @author db
 */
public class DrugList {
    
    private ArrayList<Drug> drugList;
    
    public DrugList(){
        this.drugList = new ArrayList<Drug>();
    }

    public ArrayList<Drug> getDrugList() {
        return drugList;
    }

    public void setDrugList(ArrayList<Drug> drugList) {
        this.drugList = drugList;
    }
    
    public Drug addDrugList() {
       Drug drug = new Drug();
       drugList.add(drug);
       return drug;
   }
}
