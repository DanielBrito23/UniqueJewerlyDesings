/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquejewerlydesings.control;

import uniquejewerlydesings.vista.ProductosStock;

/**
 *
 * @author LENOVO
 */
public class productsStocksControl {
    ProductosStock vista = new ProductosStock();
    
    
    public void ventana(){
   vista.setVisible(true);
   vista.setLocationRelativeTo(null);
   vista.setTitle("Products Stocks");
    
    }
}
