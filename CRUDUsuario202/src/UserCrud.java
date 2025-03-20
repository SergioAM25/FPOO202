/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 52442
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class UserCrud {
    
    private Connection conexion;
    
    public UserCrud(){
        conexion= ConexionMySQL.conectar();
    }
    
    public boolean crearusuario(String nom, String cor, String contra){
        
        String sqlInsert="INSERT INTO usuarios (nombre, correo, contrasena) VALUE(?,?,?)";
        
        try{
            PreparedStatement ps= conexion.prepareStatement(sqlInsert);
            ps.setString(1, nom);
            ps.setString(1, cor);
            ps.setString(1, contra);
            return ps.executeUpdate()>0;
        }
        catch(SQLException e){
            System.out.println("Error al intentar insertar: "+ e.getMessage());
            return false;
        }
    }
    
}
