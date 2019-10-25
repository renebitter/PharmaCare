package pharmacarerene;

import java.util.Date;

/**
 *
 * @author reneb
 */
public class Prescription { 
    
    // Variables
    
    int idPrescription;
    Date date;
    int idDoctor;
    int idPatient;
    int typePatient;    
    String nameDoctor;
    String namePatient;
    String nameDrug;
    String dose;
    String frequency;
    int active;
    Date dateStart;
    Date dateEnd;
    
    // Constructor
    Prescription(int idPrescription, int idDoctor, int idPatient, 
            String nameDoctor, String namePatient, int typePatient, String nameDrug, 
            String dose, String frequency, int active, Date dateStart, Date dateEnd, Date date) {
               
        this.idPrescription = idPrescription;
        this.date = date;        
        this.idDoctor = idDoctor;
        this.idPatient = idPatient;
        this.typePatient = typePatient; 
        this.nameDoctor = nameDoctor;
        this.namePatient = namePatient;
        this.nameDrug = nameDrug;
        this.dose = dose;
        this.frequency = frequency;
        this.active = active;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        
//        System.out.println(nameDoctor);
    }
           
    // Methods   
    public int getIdPrescription() {
        return this.idPrescription;
    }
    
    public Date getDate() {
        return this.date;
    }
    
    public int getIdDoctor() {
        return this.idDoctor;
    }
    
    public int getIdPatient() {
        return this.idPatient;
    }
            
    public int getTypePatient() {
        return this.typePatient;
    }
    
    public String getNameDoctor() {
        return this.nameDoctor;
    }

    public String getNamePatient() {
        return this.namePatient;
    }
    
    public String getNameDrug() {
        return this.nameDrug;
    }
    
    public String getDose() {
        return this.dose;
    }
    
    public String getFrequency() {
        return this.frequency;
    }
    
    public int getActive() {
        return this.active;
    }
    
    public Date getDateStart() {
        return this.dateStart;
    }
    
    public Date getDateEnd() {
        return this.dateEnd;
    }
}
