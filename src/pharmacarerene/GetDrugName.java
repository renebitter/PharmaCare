package pharmacarerene;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetDrugName {    
    
    public static Drugs getDrugName(int id) throws Exception {

//        String sql = "SELECT * FROM DRUGS WHERE IDDRUGS = ?";
        String sql = "SELECT NAME FROM DRUGS";
        try
        {
            Connection db = DButils.getConnection();
            PreparedStatement ps = db.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Drugs d = null;
            if (rs.next()) {       

                int idDrug = rs.getInt("IDDRUGS");                
                String nameDrug = rs.getString("NAME");
                
                                
                d = new Drugs(idDrug,nameDrug);
            }

            rs.close();
            return d;

        } catch (Exception e){
            throw new Exception(e);
        }
    }
}


