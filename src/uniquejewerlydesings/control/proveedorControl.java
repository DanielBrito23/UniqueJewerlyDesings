/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquejewerlydesings.control;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import uniquejewerlydesings.DBmodelo.personaDB;
import uniquejewerlydesings.DBmodelo.proveedorDB;
import uniquejewerlydesings.modelo.proveedor;
import uniquejewerlydesings.vista.RegistroProveedor;

/**
 *
 * @author corin
 */
public class proveedorControl {

    private proveedor proveedorModelo;
    private proveedorDB proveedorDB;
    private RegistroProveedor vistaProveedor;
    private personaDB personaDB;

    public proveedorControl(proveedor proveedorModelo, proveedorDB proveedorDB, RegistroProveedor vistaProveedor) {
        this.proveedorModelo = proveedorModelo;
        this.proveedorDB = proveedorDB;
        this.vistaProveedor = vistaProveedor;
    }

    public void iniciarControl() {
        //abrir la ventana
        vistaProveedor.setVisible(true);
        vistaProveedor.setLocationRelativeTo(null);
        vistaProveedor.getTxtID().setText(String.valueOf(idpro()));
        vistaProveedor.getTxtidpersona().setText(String.valueOf(idper()));
        //acciones a los botones de la vistaPersona
        vistaProveedor.getBtnGuardar().addActionListener(e -> ingreso());
    }

    public void ingreso() {
        proveedorDB.setId_proveedor(Integer.parseInt(vistaProveedor.getTxtID().getText()));
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

    public int idpro() {
        int id = proveedorDB.id_auto();
        return id;
    }

    public int idper() {
        int id = personaDB.id_autoper();
        return id;
    }
}
