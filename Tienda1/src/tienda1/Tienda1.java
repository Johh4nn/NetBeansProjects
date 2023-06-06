/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda1;

import tienda1.servicios.ProductoServicio;

/**
 *
 * @author Usuario
 */
public class Tienda1 {

   
    public static void main(String[] args) throws Exception {
        ProductoServicio ps = new ProductoServicio();
        ps.imprimirProductos();
        //ps.imprimirProductospornombre();
        //ps.imprimirProductospornombreyprecio();
        //ps.imprimirProductosentre120y220();
        //ps.imprimirProductosportatil();
        //ps.imprimirProductomasbarato();
        //ps.crearProducto("Disco Duro", 52.00, 1);
        //ps.imprimirProductos();
    
    }
    
}
