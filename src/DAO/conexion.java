package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class conexion {
Connection con; 
   
    public Connection conectar() throws SQLException{
        //System.out.println("Me voy a conectar:");
    
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tacotitos", "root", "");
        //System.out.println("Me conecté:");
        
        return con;
    }
    
    public void desconectar() throws SQLException{
        con.close();
    } 

   
      
  }
  