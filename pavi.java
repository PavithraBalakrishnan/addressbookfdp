/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pavi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Administrator
 */
public class pavi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
          
       try {  
        // TODO code application logic here
        
        //step2 create  the connection object  
        Connection con;
 con = DriverManager.getConnection("jdbc:oracle:thin:@172.16.0.70:1521:cas","fdp13","fdp13");  

 if (con != null){
     Statement stmt=con.createStatement();
System.out.println("Connected with status");
    ResultSet rs=stmt.executeQuery("select * from addressbook13");  
      
    while(rs.next()){  
    System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));  
    }  
    con.close();
}
else
{
System.out.println("Not yet Connected");
} }catch(SQLException e){ System.out.println(e);}
        
    
    }    
}
    
    

