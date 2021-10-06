/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquejewerlydesings.control;

import javax.swing.JOptionPane;
import uniquejewerlydesings.DBmodelo.empresaDB;
import uniquejewerlydesings.DBmodelo.proveedorDB;
import uniquejewerlydesings.modelo.empresa;
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

    public empresaControl(empresa empresaModelo, empresaDB empresaDB, RegistroEmpresa vistaEmpresa, proveedorDB db) {
        this.empresaModelo = empresaModelo;
        this.empresaDB = empresaDB;
        this.vistaEmpresa = vistaEmpresa;
        this.db = db;
    }
     public void iniciarControl(){
        //abrir la ventana
        vistaEmpresa.setVisible(true);
        vistaEmpresa.setLocationRelativeTo(null);
       vistaEmpresa.getTxtidpro().setText(String.valueOf(idpro()));
        vistaEmpresa.getTxtid().setText(String.valueOf(idempre()));
        //acciones a los botones de la vistaPersona
        vistaEmpresa.getBtnguardar().addActionListener(e -> ingreso());
    }
    
    public void ingreso() {
        empresaDB.setId_proveedor(Integer.parseInt(vistaEmpresa.getTxtidpro().getText()));
        empresaDB.setId_empresa(Integer.parseInt(vistaEmpresa.getTxtid().getText()));
        empresaDB.setNombre_empresa(vistaEmpresa.getTxtnombreemp().getText());
        empresaDB.setDireccion_empresa(vistaEmpresa.getTxtdirecemp().getText());
        empresaDB.setCorreo_empresa(vistaEmpresa.getTxtemailemp().getText());
        if (empresaDB.insertarEmpresa()) {
            JOptionPane.showMessageDialog(null, "Datos Agregados correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Error al Ingresar Datos");
        }
    }
    public int idempre() {
      int id=empresaDB.id_autoempre();
         return id;
    }
    public int idpro(){
        int id=db.id_auto();
         return id;
        
    }
}
