/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquejewerlydesings.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import uniquejewerlydesings.modelo.Persona;

/**
 *
 * @author corin
 */
//crear metodos para crear 
public class PersonaDAO {
    
    private String mensaje = "";
    
    public String agregarPersona(Connection con, Persona per) {
        PreparedStatement pst = null;
        String sql = "insert into persona( id_persona, cedula, nombres, direccion, telefono, correo)"
                + "VALUES (?, ?, ?, ?, ?, ?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,per.getId_persona());
            pst.setString(2, per.getCedula());
            pst.setString(3, per.getNombres());
            pst.setString(4, per.getDireccion());
            pst.setString(5, per.getTelefono());
            pst.setString(6, per.getCorreo());
            mensaje = "GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            
            mensaje = "NO SE PUDO GUARDAR CORRECTAMENTE \n" + e.getMessage();
        }
        return mensaje;
        
    }
    
    public String modificarPersona(Connection con, Persona per) {
        PreparedStatement pst = null;
        String sql = "update persona set cedula = ?,nombres = ?,direccion = ?,telefono = ?,correo = ?"
                + "where id_persona = ? ";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, per.getCedula());
            pst.setString(2, per.getNombres());
            pst.setString(3, per.getDireccion());
            pst.setString(4, per.getTelefono());
            pst.setString(5, per.getCorreo());
            pst.setInt(6, per.getId_persona());
            mensaje = "ACTUALIZADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            
            mensaje = "NO SE PUDO ACTUALIZAR CORRECTAMENTE \n" + e.getMessage();
        }
        return mensaje;
        
    }
    
    public String eliminarPersona(Connection con, int id) {
        PreparedStatement pst = null;
        String sql = "delete from persona where id_persona = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            
            mensaje = "ACTUALIZADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            
            mensaje = "NO SE PUDO ACTUALIZAR CORRECTAMENTE \n" + e.getMessage();
        }
        return mensaje;
        
    }
    
    public void listarPersona(Connection con, JTable tabla) {
        DefaultTableModel model;
        String[] columnas = {"ID", "IDENTIFICATION", "NAMES", "ADDRESS", "PHONE NUMBER", "EMAIL"};
        model = new DefaultTableModel(null, columnas);
        String sql = "select * from persona order by id_persona";
        String[] filas = new String[6];
        
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i < 6; i++) {
                    filas[i] = rs.getString(i + 1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se puede listar la tabla");
        }
    }
    
    
    public int getMaxId(Connection con){
        int id=0;
        PreparedStatement pst=null;
        ResultSet rs=null;
        String sql="SELECT Max(id_persona)+1 as id from persona";
        try {
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                id=rs.getInt(1);
            }
            rs.close();
            pst.close();
           
        } catch (SQLException e) {
            System.out.println("error al mostrar id "+ e.getMessage());
        }
        return id;
    }
}
