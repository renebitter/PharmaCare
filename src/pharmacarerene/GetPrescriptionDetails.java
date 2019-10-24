package pharmacarerene;

import java.sql.*;
/**
 *
 * @author reneb
 */
public class GetPrescriptionDetails {
    
    public static Prescription getPrescription(int prescriptionNo) throws Exception {

        String sql = "SELECT * FROM PRESCRIPTION WHERE IDPRESCRIPTION = ?";
        try
        {
            Connection db = DButils.getConnection();
            PreparedStatement ps = db.prepareStatement(sql);
            ps.setInt(1, prescriptionNo);
            ResultSet rs = ps.executeQuery();
            Prescription p = null;
            if (rs.next()) {       

                int idPrescription = rs.getInt("IDPRESCRIPTION");
                int idDoctor = rs.getInt("IDDOCTOR");
                int idPatient = rs.getInt("IDPATIENT");
                String nameDoctor = rs.getString("DOCTOR_NAME");
                String namePatient = rs.getString("PATIENT_NAME");
                int typePatient = rs.getInt("PATIENT_TYPE");
                String nameDrug = rs.getString("DRUG_NAME");
                String dose = rs.getString("DOSE");
                String frequency = rs.getString("FREQUENCY");
                int active = rs.getInt("ACTIVE");
                Date dateStart = rs.getDate("START_DATE");
                Date dateEnd = rs.getDate("END_DATE");
                
//                System.out.println(nameDoctor);
                
                p = new Prescription(idPrescription, idDoctor, idPatient, nameDoctor, namePatient, typePatient, nameDrug, dose, frequency, active, dateStart, dateEnd);
            }

            rs.close();
            return p;

        } catch (Exception e){
            throw new Exception(e);
        }
    }
}


//   public static ArrayList<PrescriptionDetails> getPrescriptionDetails(
//   int prescriptionNo) throws Exception {
//
//    String sql = "SELECT * FROM prescriptiondetails WHERE LinkID = ?";
//    try
//    {
//    Connection db = DButils.getConnection();
//    PreparedStatement ps = db.prepareStatement(sql);
//    ps.setInt(1, prescriptionNo);
//    ResultSet rs = ps.executeQuery();
//
//    ArrayList details = new ArrayList <PrescriptionDetails>();
//    while (rs.next()) {
//    String drugName = rs.getString("DrugName");
//    String dose = rs.getString("Dose");
//    String frequency = rs.getString("Frequency");
//    Date sdate = rs.getDate("StartDate");
//    Date edate = rs.getDate("EndDate");
//    Boolean active = rs.getBoolean("Active");
//    PrescriptionDetails pd = new PrescriptionDetails(drugName,
//    dose, frequency, sdate, edate, active);
//    details.add(pd);
//    }
//
//    rs.close();
//    return details;
//
//    } catch (Exception e) {
//    throw new Exception(e);
//    }
//    }

//    private static class Prescription {
//
//        public Prescription() {
//        }
//
//        private Prescription(Date date, int pid, int did, String pname, String ptype, String dname) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//    }
//}
