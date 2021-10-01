/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquejewerlydesings.control;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import uniquejewerlydesings.DBmodelo.personaDB;
import uniquejewerlydesings.modelo.Persona;
import uniquejewerlydesings.vista.ListaPersonas;

/**
 *
 * @author corin
 */
public class listaPerControl {

    ListaPersonas vistaLis;
    DefaultTableModel modeloTab;
    personaDB db;
    Persona per;

    public void iniciarControl() {
        vistaLis.setVisible(true);
        vistaLis.setLocationRelativeTo(null);
        cargarLista();
//        vistaLis.getBtncargar().addActionListener(e -> cargarLista());

    }

    public listaPerControl(ListaPersonas vistaLis, personaDB db, Persona per) {
        this.vistaLis = vistaLis;
        this.db = db;
        this.per = per;
    }

    

    private void cargarLista() {
        int canFilas = vistaLis.getTabla().getRowCount();
        for (int i = canFilas - 1; i >= 0; i--) {
            if (i > 0) {
                modeloTab.removeRow(i);
            }
        }

        modeloTab = (DefaultTableModel) vistaLis.getTabla().getModel();
        List<Persona> lista;

        try {
            lista = db.listaPersonas();
            int columnas = modeloTab.getColumnCount();
            for (int i = 0; i < lista.size(); i++) {
                modeloTab.addRow(new Object[columnas]);
                vistaLis.getTabla().setValueAt(lista.get(i).getId_persona(), i, 0);
                vistaLis.getTabla().setValueAt(lista.get(i).getCedula(), i, 1);
                vistaLis.getTabla().setValueAt(lista.get(i).getNombres(), i, 2);
                vistaLis.getTabla().setValueAt(lista.get(i).getDireccion(), i, 3);
                vistaLis.getTabla().setValueAt(lista.get(i).getTelefono(), i, 4);
                vistaLis.getTabla().setValueAt(lista.get(i).getCorreo(), i, 5);
            }

        } catch (SQLException ex) {
            Logger.getLogger(listaPerControl.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

}
