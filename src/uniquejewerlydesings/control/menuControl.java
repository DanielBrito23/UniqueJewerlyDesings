/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquejewerlydesings.control;

import uniquejewerlydesings.DBmodelo.personaDB;
import uniquejewerlydesings.modelo.Persona;
import uniquejewerlydesings.vista.MenuPrincipal;
import uniquejewerlydesings.vista.PersonaIngreso;

/**
 *
 * @author LENOVO
 */
public class menuControl {
    MenuPrincipal menu = new  MenuPrincipal();
    
    //Registro de persona
    Persona personaModelo = new Persona();
    personaDB personaDB = new personaDB();
    PersonaIngreso vistaPersona = new PersonaIngreso();
    personaControl controlPersona = new personaControl(personaModelo, personaDB, vistaPersona);
    
    public void iniciarControl(){
         menu.setVisible(true);
         
        menu.getBtnNewCustom().addActionListener(e -> controles());
    }
    
    public void controles(){
        controlPersona.iniciarControl();
    }
    
}
