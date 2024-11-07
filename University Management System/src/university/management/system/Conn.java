package university.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");   // step 1 register driver class
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem", "root", "88023@");  // step 2 : creating connetion string
            s = c.createStatement();  // step 3 : creating statement
            
        }catch(Exception e){
            e.printStackTrace(); 
        }
    }
}
