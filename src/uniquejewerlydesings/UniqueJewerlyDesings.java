/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquejewerlydesings;



import uniquejewerlydesings.DBmodelo.personaDB;
import uniquejewerlydesings.control.personaControl;
import uniquejewerlydesings.modelo.Persona;
import uniquejewerlydesings.vista.Inicio;
import uniquejewerlydesings.vista.PersonaIngreso;

/**
 *
 * @author corin
 */
public class UniqueJewerlyDesings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona personaModelo = new Persona();
        personaDB personaDB = new personaDB ();
        PersonaIngreso vistaPersona = new PersonaIngreso();
        personaControl control = new personaControl(personaModelo, personaDB, vistaPersona);
        control.iniciarControl();
       
       
    }
    
}
