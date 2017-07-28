/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;   //Traduce un String a un codigo SQL para las BUSQUEDAS
/**
 *
 * @author My Little Kid
 */
public class Conexion {

    public static Object Conexion;

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return Usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.Usuario = usuario;
    }

    /**
     * @return the contrasena
     */
    public String getContrasena() {
        return Contrasena;
    }

    /**
     * @param contrasena the contrasena to set
     */
    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }
    private String Usuario;
    private String Contrasena;
    Connection con = null;
    //String URL = ;  //3306 El Intranet del Workbench
    
    //conexion a base de datos DIRECTA
    public Conexion(String Usuario, String Contrasena) throws SQLException{
        this.Usuario = Usuario;
        this.Contrasena = Contrasena;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pv1","root","");
        }catch (ClassCastException e) {
            throw e;
        } catch (SQLException e1) {
            throw e1;
        }
        //(URL, this.Usuario, this.Contrasena);
    }
    
}
