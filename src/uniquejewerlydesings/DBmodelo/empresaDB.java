/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquejewerlydesings.DBmodelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import uniquejewerlydesings.conexion.Conexion;
import uniquejewerlydesings.modelo.empresa;

/**
 *
 * @author corin
 */
public class empresaDB extends empresa {

    Conexion conn;
    PreparedStatement ps;
    ResultSet re = null;
    //Variable asignada para el valor de la consulta SQL
    String sql = "";

// metodo para ingresar una empresa 
    public boolean insertarEmpresa() {

        conn = new Conexion();
     
        sql = "insert into empresa (id_empresa,nombre_empresa,direccion_empresa,correo_empresa) "
                + "values (" + getId_empresa() + ",'" + getNombre_empresa() + "', '" + getDireccion_empresa() + "','" + getCorreo_empresa() + "');"
                + "insert into proveedor (id_proveedor,id_empresa)"
                + "values (" + getId_proveedor() +  "," + getId_empresa()+ ");";
        System.out.println("insert empresa: " + sql);
        PreparedStatement ps = conn.getPs(sql);
       
        if (conn.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        }
    }

    public int id_autoempre() {
        conn = new Conexion();
        int id = 1;
        try {
            ps = conn.conectarBD().prepareStatement("select max(id_empresa) from empresa");
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
}
