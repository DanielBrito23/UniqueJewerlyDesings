/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquejewerlydesings.modelo;

/**
 *
 * @author corin
 */
public class proveedor  extends persona  {
    private int id_proveedor;

    public proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }
    

    public proveedor() {
    }

    public proveedor(int id_persona, String cedula, String nombres, String direccion, String telefono, String correo) {
        super(id_persona, cedula, nombres, direccion, telefono, correo);
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }
      
}
