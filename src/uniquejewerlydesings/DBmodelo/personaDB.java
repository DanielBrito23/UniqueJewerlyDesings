/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquejewerlydesings.DBmodelo;

import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import uniquejewerlydesings.conexion.Conexion;
import uniquejewerlydesings.modelo.persona;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class personaDB extends persona {

    Conexion conn;
    Connection con;
    PreparedStatement ps;
    ResultSet re = null;
    //Variable asignada para el valor de la consulta SQL
    String sql = "";

    persona per;
    ArrayList<persona> listaPersonas;
// metodo para ingresar una persona 

    public boolean insertarPersona() {

        conn = new Conexion();
        sql = "insert into persona (id_persona, cedula, nombres, direccion, telefono, correo) "
                + "values (" + getId_persona() + ", '" + getCedula() + "', '" + getNombres() + "','" + getDireccion() + "','" + getTelefono() + "','" + getCorreo() + "');";

        System.out.println("insert Persona: " + sql);
        PreparedStatement ps = conn.getPs(sql);
        if (conn.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        }
    }

    public int id_autoper() {
        conn = new Conexion();
        int id = 1;
        try {
            ps = conn.conectarBD().prepareStatement("select max(id_persona) from persona");
            re = ps.executeQuery();
            while (re.next()) {
                id = re.getInt(1) + 1;
            }
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        } finally {
            try {
                ps.close();
                re.close();
            } catch (Exception e) {
            }
        }
        return id;
    }

    public List<persona> listaPersonas() throws SQLException {
        List<persona> datos = new ArrayList<persona>();
        String sql = "select * from persona";
        ResultSet rs = conn.query(sql);
        try {
            while (rs.next()) {
                persona p = new persona();
                p.setId_persona(rs.getInt("id_persona"));
                p.setCedula(rs.getString("cedula"));
                p.setNombres(rs.getString("nombres"));
                p.setCorreo(rs.getString("direccion"));
                p.setTelefono(rs.getString("telefono"));
                p.setDireccion(rs.getString("correo"));
                datos.add(p);
            }
            rs.close();
            return datos;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error tabla: " + e.getMessage());
            return null;
        }
    }

}
