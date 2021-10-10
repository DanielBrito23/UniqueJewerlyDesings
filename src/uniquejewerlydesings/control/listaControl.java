/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquejewerlydesings.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import uniquejewerlydesings.DBmodelo.personaDB;
import uniquejewerlydesings.modelo.persona;
import uniquejewerlydesings.vista.ListaPersonas;
import uniquejewerlydesings.vista.PersonaIngreso;

/**
 *
 * @author LENOVO
 */
public class listaControl implements ActionListener {

    persona personaModelo = new persona();
    personaDB personaDB = new personaDB();
    ListaPersonas tablaPersona = new ListaPersonas();
    DefaultTableModel modelo = new DefaultTableModel();

    public listaControl(ListaPersonas lista) {
    this.tablaPersona = lista;
    this.tablaPersona.getBtncargar().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tablaPersona.getBtncargar()) {
            listar(tablaPersona.getTabla());
        }
    }

    public void iniciarControl() {
        tablaPersona.setVisible(true);
    }

    public void listar(JTable tabla) {
        modelo = (DefaultTableModel) tabla.getModel();
        List<persona> lista = personaDB.listar();
        Object[] object = new Object[6];
           for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getId_persona();
            object[1] = lista.get(i).getCedula();
            object[2] = lista.get(i).getNombres();
            object[3] = lista.get(i).getDireccion();
            object[4] = lista.get(i).getTelefono();
            object[5] = lista.get(i).getCorreo();
            modelo.addRow(object);
        }
        tablaPersona.getTabla().setModel(modelo);
    }

}
