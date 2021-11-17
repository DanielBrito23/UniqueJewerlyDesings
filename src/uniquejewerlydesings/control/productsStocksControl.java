/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquejewerlydesings.control;

import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import uniquejewerlydesings.DBmodelo.productoDB;
import uniquejewerlydesings.modelo.persona;
import uniquejewerlydesings.modelo.producto;
import uniquejewerlydesings.vista.ListaProductos;

/**
 *
 * @author LENOVO
 */
public class productsStocksControl {

    private final productoDB modelo;
    private final ListaProductos vista;
    DefaultTableModel modeloTab;

    public productsStocksControl(productoDB modelo, ListaProductos vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciarControl() {
        ventana();
        cargarLista();
    }

    private void cargarLista() {
        int canFilas = vista.getTablaProductos().getRowCount();
        for (int i = canFilas - 1; i >= 0; i--) {
            modeloTab.removeRow(i);

        }

        modeloTab = (DefaultTableModel) vista.getTablaProductos().getModel();
        List<producto> lista;

        try {
            lista = modelo.listaProductos();
            int columnas = modeloTab.getColumnCount();

            for (int i = 0; i < lista.size(); i++) {
                modeloTab.addRow(new Object[columnas]);
                vista.getTablaProductos().setValueAt(lista.get(i).getId_producto(), i, 0);

            }
            vista.getLbCantidad().setText("Cargados " + lista.size() + " registros");
        } catch (SQLException e) {
            System.out.println("Error en la tabla personas: " + e.getLocalizedMessage() + " causa: " + e.getCause());

        }

    }

    public void ventana() {
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        vista.setTitle("Products Stocks");
    }
}
