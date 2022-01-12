/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquejewerlydesings.control;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import uniquejewerlydesings.DBmodelo.productoDB;
import uniquejewerlydesings.vista.ListaProductos;
import uniquejewerlydesings.vista.RegistroProductos;

/**
 *
 * @author LENOVO
 */
public class productoRegistrarControl {

    private final productoDB modelo;
    private final RegistroProductos vista;
    DefaultTableModel modeloTab;

    public productoRegistrarControl(productoDB modelo, RegistroProductos vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciarControl() {
        vista.getId_producto().setText(String.valueOf(idpro()));
        
        vista.getBtnGuardar().addActionListener(e -> ingresoProducto());
        ventana();
    }

    public int idpro() {
        int id = modelo.id_autoProduct();
        return id;
    }

    public void ventana() {
        vista.setVisible(true);
        vista.setTitle("Product Registration");
        vista.setLocationRelativeTo(null);

    }

    public void ingresoProducto() {
        modelo.setId_producto(Integer.parseInt(vista.getId_producto().getText()));
        modelo.setCalculo_utilidad(Integer.parseInt(vista.getCantidadUtilidad().getText()));
        modelo.setDescripcion(vista.getDescripcion().getText());
        modelo.setFecha(vista.getTextFechaCompra().getText());
        modelo.setCantidad(Integer.parseInt(vista.getTxtCantidad().getText()));
        modelo.setPeso_metal(Double.parseDouble(vista.getTxtPeso().getText()));
        modelo.setTipo_metal(vista.getTxtTipo().getText());
        modelo.setPrecio_unitario(Integer.parseInt(vista.getTxtPrecio().getText()));
        if (modelo.insertarProducto()) {
            JOptionPane.showMessageDialog(null, "Added successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Data entry error");
        }
    }

}
