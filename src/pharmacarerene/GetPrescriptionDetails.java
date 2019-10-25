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
                Date date = rs.getDate("DATE");
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
                                
                p = new Prescription(idPrescription, idDoctor, idPatient, nameDoctor, namePatient, typePatient, nameDrug, dose, frequency, active, dateStart, dateEnd, date);
            }

            rs.close();
            return p;

        } catch (Exception e){
            throw new Exception(e);
        }
    }
}
