/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquejewerlydesings.control;

import javax.swing.JOptionPane;
import uniquejewerlydesings.DBmodelo.proveedorDB;
import uniquejewerlydesings.modelo.Proveedor;
import uniquejewerlydesings.vista.RegistroProveedor;

/**
 *
 * @author corin
 */
public class proveedorControl {
     private Proveedor proveedorModelo;
    private proveedorDB proveedorDB;
    private RegistroProveedor vistaProveedor;

    public proveedorControl(Proveedor proveedorModelo, proveedorDB proveedorDB, RegistroProveedor vistaProveedor) {
        this.proveedorModelo = proveedorModelo;
        this.proveedorDB = proveedorDB;
        this.vistaProveedor = vistaProveedor;
    }

   

    public void iniciarControl(){
        //abrir la ventana
        vistaProveedor.setVisible(true);
        vistaProveedor.setLocationRelativeTo(null);
        
        
        //acciones a los botones de la vistaPersona
        vistaProveedor.getBtnGuardar().addActionListener(e -> ingreso());
    }
    
    public void ingreso() {
        proveedorDB.setId_persona(Integer.parseInt(vistaProveedor.getTxtId().getText()));
        proveedorDB.setCedula(vistaProveedor.getTxtCedula().getText());
        proveedorDB.setNombres(vistaProveedor.getTxtNombres().getText());
        proveedorDB.setDireccion(vistaProveedor.getTxtDireccion().getText());
        proveedorDB.setTelefono(vistaProveedor.getTxtTelefono().getText());
        proveedorDB.setCorreo(vistaProveedor.getTxtCorreo().getText());
        if (proveedorDB.insertarProveedor()) {
            JOptionPane.showMessageDialog(null, "Datos Agregados correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Error al Ingresar Datos");
        }
    }
}
