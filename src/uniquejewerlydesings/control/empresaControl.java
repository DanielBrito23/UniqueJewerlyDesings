/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquejewerlydesings.control;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import uniquejewerlydesings.DBmodelo.empresaDB;
import uniquejewerlydesings.DBmodelo.proveedorDB;
import uniquejewerlydesings.modelo.empresa;
import uniquejewerlydesings.modelo.persona;
import uniquejewerlydesings.vista.RegistroEmpresa;

/**
 *
 * @author corin
 */
public class empresaControl {

    private empresa empresaModelo;
    private empresaDB empresaDB;
    private RegistroEmpresa vistaEmpresa;
    private proveedorDB db;
    persona persona = new persona();
    ArrayList<persona> listaPersonaArray;

    DefaultComboBoxModel comboBox;

    public empresaControl(empresa empresaModelo, empresaDB empresaDB, RegistroEmpresa vistaEmpresa, proveedorDB db) {
        this.empresaModelo = empresaModelo;
        this.empresaDB = empresaDB;
        this.vistaEmpresa = vistaEmpresa;
        this.db = db;
    }

    public void iniciarControl() throws SQLException {
        //abrir la ventana
        vistaEmpresa.setVisible(true);
        vistaEmpresa.setLocationRelativeTo(null);
        vistaEmpresa.getTxtidpro().setText(String.valueOf(idpro()));
        vistaEmpresa.getTxtid().setText(String.valueOf(idempre()));
        //acciones a los botones de la vistaPersona
        vistaEmpresa.getBtnguardar().addActionListener(e -> ingreso());
        llenarComboInstiEduc();
    }

    public void ingreso() {
        if (vistaEmpresa.getTxtnombreemp().getText().equals("") || vistaEmpresa.getTxtdirecemp().getText().equals("") || vistaEmpresa.getTxtemailemp().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty data please enter");
        } else {
            empresaDB.setId_proveedor(Integer.parseInt(vistaEmpresa.getTxtidpro().getText()));
            empresaDB.setId_empresa(Integer.parseInt(vistaEmpresa.getTxtid().getText()));
            empresaDB.setNombre_empresa(vistaEmpresa.getTxtnombreemp().getText());
            empresaDB.setDireccion_empresa(vistaEmpresa.getTxtdirecemp().getText());
            empresaDB.setCorreo_empresa(vistaEmpresa.getTxtemailemp().getText());
            empresaDB.setId_persona(vistaEmpresa.getComboPersonas().getSelectedIndex());
            if (empresaDB.insertarEmpresa()) {
                JOptionPane.showMessageDialog(null, "Added successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Data entry error");
            }
        }
    }

    public int idempre() {
        int id = empresaDB.id_autoempre();
        return id;
    }

    public int idpro() {
        int id = db.id_auto();
        return id;

    }

    public void llenarComboInstiEduc() {
        try {
            comboBox = new DefaultComboBoxModel();
            empresaDB = new empresaDB();
            listaPersonaArray = empresaDB.listaPersonas();
            for (persona p : listaPersonaArray) {
                comboBox.addElement(p.getNombres());
                // como recoger este numero y poner en el insert
                System.out.println(p.getId_persona());
            }
            vistaEmpresa.getComboPersonas().setModel(comboBox);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
