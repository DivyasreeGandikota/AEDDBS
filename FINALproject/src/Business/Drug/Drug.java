/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness.Drug;

/**
 *
 * @author db
 */
public class Drug {
    private int drugId;
    private String drugName;
    private static int counter=0;

    public int getDrugId() {
        return drugId;
    }

    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Drug.counter = counter;
    }
    
    
    public Drug(){
        drugId = counter;
        ++counter;
    }
}
