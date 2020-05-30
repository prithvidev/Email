package email;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class myconnection {
    

Connection con;
public myconnection()
{
try{

Class.forName("com.mysql.jdbc.Driver");
System.out.println("Searching for connection class...");
}   catch (ClassNotFoundException ex) {
       System.out.println("Class not found and unale to connect..."+ ex.getLocalizedMessage());}
try{
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","Prithvi@03012000");
}   catch (SQLException ex1) {
        ex1.printStackTrace();
    }
}
public Connection getRegisterConnection(){
return con;
}

    Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


