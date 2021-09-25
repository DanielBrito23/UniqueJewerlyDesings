
package uniquejewerlydesings.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class Conexion {

    private static String cadenaConexion= "jdbc:postgresql://localhost:5432/joyeria";
    private static String pgUsuario="postgres";
    private static String pgPass="1256";
    private static Connection con=null;//conexion
    private Statement st;// comando:sql
    private ResultSet rs;//Resultados de la consulta
    
    public static Connection getConnection(){
        //fijar clase de conexion
        try {
            Class.forName("org.postgresql.Driver");
             con= DriverManager.getConnection(cadenaConexion, pgUsuario, pgPass);
             con.setAutoCommit(false);
             if(con!=null){
                 System.out.println("   CONECTADO EXITOSA"); 
             }else{
                 System.out.println("conexion erronea");
             }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "conexion Erronea " + e.getMessage() );
        }
       return con;
        
    }
   
    public void desconectar(){
        try {
            con.close();
        } catch (Exception e) {
            System.out.println("Error al desconectar "+e.getMessage());
        }
    }
    
    public static void main(String[] args) {
     Conexion conex =new Conexion();
     conex.getConnection();
    }
}
