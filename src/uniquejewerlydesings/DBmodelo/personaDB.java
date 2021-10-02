/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquejewerlydesings.DBmodelo;

import java.sql.PreparedStatement;
import uniquejewerlydesings.conexion.Conexion;
import uniquejewerlydesings.modelo.Persona;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class personaDB extends Persona {

    Conexion conn;
    PreparedStatement ps;
    ResultSet re = null;
    //Variable asignada para el valor de la consulta SQL
    String sql = "";

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

    //metodo para listar a una persona 

}
