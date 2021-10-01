/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquejewerlydesings.DBmodelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import uniquejewerlydesings.conexion.Conexion;
import uniquejewerlydesings.modelo.Proveedor;

/**
 *
 * @author corin
 */
public class proveedorDB  extends Proveedor{
     Conexion conn;
    PreparedStatement ps;
    ResultSet re = null;
    //Variable asignada para el valor de la consulta SQL
    String sql = "";
    String sql1 = "";

// metodo para ingresar una persona 
    public boolean insertarProveedor() {

        conn = new Conexion();
        sql = "insert into persona (id_persona, cedula, nombres, direccion, telefono, correo) "
                + "values (" + getId_persona() + ", '" + getCedula() + "', '" + getNombres() + "','" + getDireccion() + "','" + getTelefono() + "','" + getCorreo() + "');";
        
        sql="insert into proveedor (id_proveedor,id_persona)" 
                + "values ('" + getId_persona()+ "');";
        System.out.println("insert Persona: " + sql );
//        System.out.println("insert proveedor: " + sql1);
        PreparedStatement ps = conn.getPs(sql);
        if (conn.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
}
