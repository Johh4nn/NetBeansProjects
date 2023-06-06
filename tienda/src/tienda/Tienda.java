/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda;

import tienda.entidades.Producto;
import tienda.servicios.ProductoService;

/**
 *
 * @author Usuario
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        ProductoService ps = new ProductoService();
        ps.imprimirProductos();
      
    }
        
    
}
