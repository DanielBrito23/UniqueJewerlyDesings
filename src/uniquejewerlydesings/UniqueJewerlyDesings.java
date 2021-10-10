/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquejewerlydesings;

import java.sql.SQLException;
import uniquejewerlydesings.DBmodelo.empresaDB;
import uniquejewerlydesings.DBmodelo.personaDB;
import uniquejewerlydesings.DBmodelo.proveedorDB;
import uniquejewerlydesings.control.empresaControl;
import uniquejewerlydesings.control.facturaControl;
import uniquejewerlydesings.control.inicioControl;
import uniquejewerlydesings.control.listaControl;
import uniquejewerlydesings.control.listaPerControl;
import uniquejewerlydesings.control.menuControl;
import uniquejewerlydesings.control.personaControl;
import uniquejewerlydesings.control.proveedorControl;
import uniquejewerlydesings.modelo.empresa;
import uniquejewerlydesings.modelo.persona;
import uniquejewerlydesings.modelo.proveedor;
import uniquejewerlydesings.vista.Factura;
import uniquejewerlydesings.vista.Inicio;
import uniquejewerlydesings.vista.ListaPersonas;
import uniquejewerlydesings.vista.MenuPrincipal;
import uniquejewerlydesings.vista.PersonaIngreso;
import uniquejewerlydesings.vista.RegistroEmpresa;
import uniquejewerlydesings.vista.RegistroProveedor;

/**
 *
 * @author corin
 */
public class UniqueJewerlyDesings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

//        menuControl menuControl = new menuControl();
//        MenuPrincipal vistaMenu = new MenuPrincipal();
//        Inicio vistaInicio = new Inicio();
//        inicioControl controlInicio = new inicioControl(menuControl, vistaMenu, vistaInicio);
//        controlInicio.iniciaControl();
       ListaPersonas vista = new ListaPersonas();
       listaControl control = new listaControl(vista);
       vista.setVisible(true);
    }

}
