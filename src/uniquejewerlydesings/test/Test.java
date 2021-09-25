/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquejewerlydesings.test;

import uniquejewerlydesings.bo.PersonaBO;
import uniquejewerlydesings.modelo.Persona;

/**
 *
 * @author corin
 */
public class Test {
    
   PersonaBO perbo= new PersonaBO();
   Persona per=new Persona();
   String mensaje="";
   
   public void insertar(){
       per.setCedula("0105765085478");
       per.setNombres("Corina Guzman");
       per.setDireccion("avenida del tejar");
       per.setTelefono("0983015552");
       per.setCorreo("cori@gmail.com");
       mensaje = perbo.agregarPersona(per);
       System.out.println(mensaje);
   }
    public static void main(String[] args) {
        Test test=new  Test();
        test.insertar();
    }
           
    
}
