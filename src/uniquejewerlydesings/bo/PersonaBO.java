/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquejewerlydesings.bo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import uniquejewerlydesings.dao.PersonaDAO;
import uniquejewerlydesings.db.Conexion;
import uniquejewerlydesings.modelo.Persona;

/**
 *
 * @author corin
 */
//capa de negocio
public class PersonaBO {

    private String mensaje = "";
    private PersonaDAO perdao = new PersonaDAO();

    public String agregarPersona(Persona per) {
        //llamar a la clase conexion 

        Connection conn = Conexion.getConnection();
        try {
            //conexio activa1:06:12
            //se envia recibe el dao y hace el trabajo 
            mensaje = perdao.agregarPersona(conn, per);
            //rolback ignora los cambios hechos desde el principio de la transaccion
            //error se detiene no guarda en l base 
            //conn.rollback();
            //comit almacena los datos en el disco duro 

        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();

        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }

        return mensaje;

    }

    public String modificarPersona(Persona per) {
        Connection conn = Conexion.getConnection();
        try {
            //conexio activa1:06:12
            //se envia recibe el dao y hace el trabajo 
            mensaje = perdao.modificarPersona(conn, per);
            //rolback ignora los cambios hechos desde el principio de la transaccion
            //error se detiene no guarda en l base 
            //conn.rollback();
            //comit almacena los datos en el disco duro 

        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();

        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }

        return mensaje;

    }

    public String eliminarPersona(int id) {
        Connection conn = Conexion.getConnection();
        try {
            //conexio activa1:06:12
            //se envia recibe el dao y hace el trabajo 
            mensaje = perdao.eliminarPersona(conn, id);
            //rolback ignora los cambios hechos desde el principio de la transaccion
            //error se detiene no guarda en l base 
            //conn.rollback();
            //comit almacena los datos en el disco duro 

        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();

        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }

        return mensaje;

    }

    public void listarPersona(JTable tabla) {
        Connection conn = Conexion.getConnection();
        perdao.listarPersona(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
    public int getMaxId(){
         Connection conn = Conexion.getConnection();
        int id=perdao.getMaxId(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return id;
    }
}
