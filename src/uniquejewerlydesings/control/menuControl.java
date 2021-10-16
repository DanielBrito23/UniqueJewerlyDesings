/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquejewerlydesings.control;

import uniquejewerlydesings.DBmodelo.personaDB;
import uniquejewerlydesings.DBmodelo.proveedorDB;
import uniquejewerlydesings.modelo.persona;
import uniquejewerlydesings.modelo.proveedor;
import uniquejewerlydesings.vista.MenuPrincipal;
import uniquejewerlydesings.vista.PersonaIngreso;
import uniquejewerlydesings.vista.RegistroProveedor;

/**
 *
 * @author LENOVO
 */
public class menuControl {

    MenuPrincipal menu = new MenuPrincipal();

    //Registro de persona
    persona personaModelo = new persona();
    personaDB personaDB = new personaDB();
    PersonaIngreso vistaPersona = new PersonaIngreso();
    personaControl controlPersona = new personaControl(personaModelo, personaDB, vistaPersona);

    //registro de prioveedor
    proveedor proveedorModelo = new proveedor();
    proveedorDB proveedorDB = new proveedorDB();
    RegistroProveedor vistaProveedor = new RegistroProveedor();
    proveedorControl controlProveedor = new proveedorControl(proveedorModelo, proveedorDB, vistaProveedor);

    public void iniciarControl() {
        menu.setVisible(true);
        //accion para que inicie el btn de persona ubicado en el menu item
        menu.getBtnNewCustom().addActionListener(e -> btnPersona());

        //accion para que inicie el btn de proveedor ubicado en el menu item
        menu.getBtnProveedor().addActionListener(e -> btnProveedor());
    }

    public void btnPersona() {
        controlPersona.iniciarControl();
    }

    public void btnProveedor() {
        controlProveedor.iniciarControl();
    }

}
