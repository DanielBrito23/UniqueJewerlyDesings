/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquejewerlydesings;

import uniquejewerlydesings.DBmodelo.personaDB;
import uniquejewerlydesings.DBmodelo.proveedorDB;
import uniquejewerlydesings.control.facturaControl;
import uniquejewerlydesings.control.listaPerControl;
import uniquejewerlydesings.control.personaControl;
import uniquejewerlydesings.control.proveedorControl;
import uniquejewerlydesings.modelo.Persona;
import uniquejewerlydesings.modelo.Proveedor;
import uniquejewerlydesings.vista.Factura;
import uniquejewerlydesings.vista.Inicio;
import uniquejewerlydesings.vista.ListaPersonas;
import uniquejewerlydesings.vista.PersonaIngreso;
import uniquejewerlydesings.vista.RegistroProveedor;

/**
 *
 * @author corin
 */
public class UniqueJewerlyDesings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RegistroProveedor vistaProveedor =new RegistroProveedor();
        proveedorDB proveedorDB=new proveedorDB();
        Proveedor proveedorModelo=new Proveedor();
       
        proveedorControl control=new proveedorControl(proveedorModelo, proveedorDB, vistaProveedor);
        control.iniciarControl();
    }

}
