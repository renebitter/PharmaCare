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
                 // set the db url, username, and password
                 //TODO: Ask for user input
                 String url = "jdbc:mysql://lamp.tafe.mst:3306/Pharmacare";
                 String username = "rene";
                 String password = "gc1t#123";
 
                 // get and return connection
                 connection = DriverManager.getConnection(
                         url, username, password);
                 return connection;
             } catch (SQLException e) {
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
