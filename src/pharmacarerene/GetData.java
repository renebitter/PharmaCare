//package pharmacarerene;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//
//public class GetData {
//    public static getDoctor(int id) throws Exception {
//         String sql = "SELECT * FROM Doctor WHERE idDoctor = ?";
//         Connection connection = DButils.getConnection();
//         try (PreparedStatement ps = connection.prepareStatement(sql)) {
//             ps.setInt(1, id);
//             ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                 String Name = rs.getString("name");
//                 String address = rs.getString("address");
//                 int age = rs.getInt("age");
//                 String course = rs.getString("course");
//                 String gdb = rs.getString("grades");
//                 rs.close();
//                 
//                 String[] g = gdb.split(",");
//                 DoctorId s = new DoctorId(id, name, address, age);
//                 s.setCourse(course);
//                 double[] grades = new double[g.length];
// 
//                 for (int i=0; i<g.length; i++)
//                     grades[i] = Double.parseDouble(g[i]);
//                     
//                 s.setGrades(grades);
// 
//                 return s;
//              } else {
//                 rs.close();
//                 return null;
//             }
//         } catch (Exception e) {
//             throw new Exception(e);
//         }
//     }
//}
