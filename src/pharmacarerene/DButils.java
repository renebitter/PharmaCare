package pharmacarerene;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButils {
    
private static Connection connection;
     
     public static synchronized Connection getConnection() throws Exception {
         
         if (connection != null) {
             return connection;
         }
         else {
             try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb"
                    + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", 
                    "reneb",  "123456" );

                    return connection;
                }
                catch (SQLException e) 
                {
                 throw new Exception(e);
                }            
         }
     }
     
     public static synchronized void closeConnection() throws Exception {
         if (connection != null) {
             try {
                 connection.close();
             } catch (SQLException e) {
                 throw new Exception(e);
             } finally {
                 connection = null;                
             }
         }
     }
 }
