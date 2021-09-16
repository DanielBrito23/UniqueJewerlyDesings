/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquejewerlydesings.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author corin
 */
public class Conexion {
        private Connection con;
    private final static String cadConexion= "jdbc:postgresql://localhost:5432/joyeria";
    String usuario = "postgres";
    //String pass= "0350015830";
    String  pass = "1256";
    Statement st;
    private ResultSet rs;//Resultados de la consulta
    
  public Conexion(){
        //fijar clase de conexion
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con= DriverManager.getConnection(cadConexion, usuario, pass);
            JOptionPane.showMessageDialog(null,"conectado base");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"error");
        }
        
    }
    // se cambia el void por un sql Exeption para que asi podamos saber si se guardo o no los datos
   
    //ayuda a enlazar, ejecuatar sentencias preparadas por eso estan los parametros como el string
    
    public PreparedStatement getPs (String sql){
        try {
            return con.prepareStatement(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public SQLException noQuery(PreparedStatement ps){
        try {
            int res=ps.executeUpdate();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return ex;
        }
    }
    
    
    public SQLException noQuery(String sql){
        try {
            st= con.createStatement();
            st.execute(sql);
            st.close();
            return null; //al momento de agregar el SQLEXception se debe que si no hay problema salga null
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return ex; //al momento de agregar el SQLEXception se debe que si hay problema salga error "ex"
        }
    }
    
    public ResultSet query(String sql){
        try {
            st=con.createStatement();
             rs=st.executeQuery(sql);
             return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
}

   
}
