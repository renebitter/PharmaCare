/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacarerene;

/**
 *
 * @author reneb
 */
public class Drugs {
    
    //Variables
    int idDrug;
    String nameDrug;
    
    
    //Constructor
    Drugs(int idDrug, String nameDrug) {
        
        this.idDrug = idDrug;
        this.nameDrug = nameDrug;
    }
    
    //Methods
    public int idDrug() {
        return this.idDrug;
    }
    
    public String getDrug() {
        return this.nameDrug;
    }
}
