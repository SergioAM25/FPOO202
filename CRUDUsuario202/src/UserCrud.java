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
import java.sql.ResultSet;
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
            ps.setString(2, cor);
            ps.setString(3, contra);
            return ps.executeUpdate()>0;
        }
        catch(SQLException e){
            System.out.println("Error al intentar insertar: "+ e.getMessage());
            return false;
        }
    }
    
    public ResultSet obtenerUsuarioPorID(int id){
        String selectSql="SELECT * FROM Usuarios WHERE id= ?";
        
        try{
            PreparedStatement ps= conexion.prepareStatement(selectSql);
            ps.setInt(1, id);
            return ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error al intentar consultar: "+ e.getMessage());
            return null;
        }
    }// fin obtenerUsuarioPorID
    
    public ResultSet obtenerTodos(){
        String sqlTodos="SELECT * FROM Usuarios";
        
        try{
            PreparedStatement ps= conexion.prepareStatement(sqlTodos);
            return ps.executeQuery();
        }
        catch(SQLException w){
            System.out.println("Error al intentar consultar: "+ w.getMessage());
            return null;
        }
    }
    
    public boolean editarusuario(int id, String nom,String cor, String contra){
        String selectSql = "UPDATE Usuarios SET nombre = ?, correo = ?, contrasena = ? WHERE id = ?";
        try{
            PreparedStatement ps = conexion.prepareStatement(selectSql);
            ps.setString(1, nom);
            ps.setString(2, cor);
            ps.setString(3, contra);
            ps.setInt(4, id);
            return ps.executeUpdate()>0;
        }catch(SQLException e){
            System.out.println("Error al intentar update" + e.getMessage());
            return false;
        }
    }

    public boolean eliminarusuario(int id){
        String deleteSql = "DELETE FROM Usuarios WHERE id = ?";
        try{
            PreparedStatement ps = conexion.prepareStatement(deleteSql);
            ps.setInt(1, id);
            return ps.executeUpdate()>0;
        }catch(SQLException e){
            System.out.println("Error al intentar update" + e.getMessage());
            return false;
        }
    }
}
