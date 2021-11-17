/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquejewerlydesings.control;

import uniquejewerlydesings.DBmodelo.personaDB;
import uniquejewerlydesings.DBmodelo.productoDB;
import uniquejewerlydesings.modelo.persona;
import uniquejewerlydesings.vista.ListaPersonas;
import uniquejewerlydesings.vista.ListaProductos;
import uniquejewerlydesings.vista.MenuPrincipal;
import uniquejewerlydesings.vista.PersonaIngreso;

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
    ListaPersonas vista=new ListaPersonas();
    personaControl controlPersona = new personaControl(personaModelo, personaDB, vistaPersona);
    
    
    listaControl listaPersona=new listaControl(personaDB, vista);

    //instancias para el funcionamiento de la lista de productos
    ListaProductos listaProductos = new ListaProductos();
    productoDB productodb = new productoDB();
    productsStocksControl controlProductos = new productsStocksControl(productodb, listaProductos);
    
    
    public void iniciarControl() {
        menu.setVisible(true);
        //accion para que inicie el btn de persona ubicado en el menu item
        menu.getBtnNewCustom().addActionListener(e -> btnPersona());
        menu.getJListCustom().addActionListener(e -> listaPersona());
        menu.getBtnListProducts().addActionListener(e -> listaProdcutos());
    }

    public void btnPersona() {
        controlPersona.iniciarControl();
    }
    public void listaPersona(){
        listaPersona.iniciaControl();
    }
    
     public void listaProdcutos(){
        controlProductos.iniciarControl();
    }

}
