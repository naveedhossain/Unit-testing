package Model;

import java.sql.*;  

public class Connection{
    java.sql.Connection c;
    public Statement s;
    public Connection(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///naveed","root","");    
            s =c.createStatement(); 
     
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  