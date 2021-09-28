/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquejewerlydesings.control;

import javax.swing.JOptionPane;
import uniquejewerlydesings.DBmodelo.personaDB;
import uniquejewerlydesings.modelo.Persona;
import uniquejewerlydesings.vista.PersonaIngreso;

/**
 *
 * @author LENOVO
 */
public class personaControl {

    private Persona personaModelo;
    private personaDB personaDB;
    private PersonaIngreso vistaPersona;

    public personaControl(Persona personaModelo, personaDB personaDB, PersonaIngreso vistaPersona) {
        this.personaModelo = personaModelo;
        this.personaDB = personaDB;
        this.vistaPersona = vistaPersona;
    }

    public void iniciarControl(){
        //abrir la ventana
        vistaPersona.setVisible(true);
        vistaPersona.setLocationRelativeTo(null);
        
        
        //acciones a los botones de la vistaPersona
        vistaPersona.getBtnGuardar().addActionListener(e -> ingresoPersona());
    }
    
    public void ingresoPersona() {
        personaDB.setId_persona(Integer.parseInt(vistaPersona.getTxtID().getText()));
        personaDB.setCedula(vistaPersona.getTxtCedula().getText());
        personaDB.setNombres(vistaPersona.getTxtNombres().getText());
        personaDB.setDireccion(vistaPersona.getTxtDireccion().getText());
        personaDB.setTelefono(vistaPersona.getTxtTelefono().getText());
        personaDB.setCorreo(vistaPersona.getTxtCorreo().getText());
        if (personaDB.insertarPersona()) {
            JOptionPane.showMessageDialog(null, "Datos Agregados correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Error al Ingresar Datos");
        }
    }
    
      
}
