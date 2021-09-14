/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquejewerlydesings;

import uniquejewerlydesings.modelo.Conexion;
import uniquejewerlydesings.vista.Inicio;

/**
 *
 * @author corin
 */
public class UniqueJewerlyDesings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inicio inicio=new Inicio();
       inicio.setVisible(true);
        Conexion con=new Conexion();
       
    }
    
}
