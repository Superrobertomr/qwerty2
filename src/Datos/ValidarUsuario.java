/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.SQLException;

/**
 *
 * @author My Little Kid
 */
public class ValidarUsuario {
    
    public ValidarUsuario (){
        
    }
    
    public int VerificarUsuario(String Usuario, String Contrasena) throws SQLException{
       Conexion conector = new Conexion("root","");
       String query = "Select *From Usuarios where Usuario = "+Usuario +" and Contrasena="+Contrasena;
       
       
        int Bandera;
        Bandera = 1;
        return Bandera;        
        
    }
    
}
