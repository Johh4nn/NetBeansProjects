/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda1.servicios;

import java.util.Collection;
import tienda1.entidades.Producto;
import tienda1.persistencia.ProductoDAO;

/**
 *
 * @author Usuario
 */
public class ProductoServicio {
    
    private  ProductoDAO dao;

    public ProductoServicio() {
        this.dao = new ProductoDAO();
    }
    
   public Collection<Producto> listarProductos() throws Exception{
       try {
           Collection<Producto> productos = dao.listarProductos();
           return productos;
           
       } catch (Exception e) {
           throw e;
       }
      
   }
   
    public void imprimirProductos() throws Exception{
         try {
             Collection<Producto> productos = listarProductos();
             if (productos.isEmpty()) {
                 throw new Exception("No existen productos");
                 
             }else{ 
                 for (Producto u : productos) {
                     System.out.println(u);
                 }
             
             }
         } catch (Exception e) {
         throw e;
         }
     
     }
    
     public Collection<Producto> listarProductospornombre() throws Exception{
       try {
           Collection<Producto> productos = dao.listarProductospornombre();
           return productos;
           
       } catch (Exception e) {
           throw e;
       }
      
   }
     public void imprimirProductospornombre() throws Exception{
         try {
             Collection<Producto> productos = listarProductospornombre();
             if (productos.isEmpty()) {
                 throw new Exception("No existen productos");
                 
             }else{ 
                 for (Producto u : productos) {
                     System.out.println(u.getNombre());
                 }
             
             }
         } catch (Exception e) {
         throw e;
         }
     
     }
    public void imprimirProductospornombreyprecio() throws Exception{
         try {
             Collection<Producto> productos = dao.nombreyprecio();
             if (productos.isEmpty()) {
                 throw new Exception("No existen productos");
                 
             }else{ 
                 for (Producto u : productos) {
                     System.out.println("Nombre: "+u.getNombre()+" Precio: "+u.getPrecio());
                 }
             
             }
         } catch (Exception e) {
         throw e;
         }
     
     }
    public void imprimirProductosentre120y220() throws Exception{
         try {
             Collection<Producto> productos = dao.listarProductosentre120y220();
             if (productos.isEmpty()) {
                 throw new Exception("No existen productos");
                 
             }else{ 
                 for (Producto u : productos) {
                     System.out.println("Codigo:"+u.getCodigo()+" Nombre:"+u.getNombre()+" Precio:"+u.getPrecio()+" Codigo Fabricante: "+u.getCodigoFabricante());
                 }
             
             }
         } catch (Exception e) {
         throw e;
         }
     
     }
    public void imprimirProductosportatil() throws Exception{
         try {
             Collection<Producto> productos = dao.listarsoloportatiles();
             if (productos.isEmpty()) {
                 throw new Exception("No existen productos");
                 
             }else{ 
                 for (Producto u : productos) {
                     System.out.println("Codigo:"+u.getCodigo()+" Nombre:"+u.getNombre()+" Precio:"+u.getPrecio()+" Codigo Fabricante: "+u.getCodigoFabricante());
                 }
             
             }
         } catch (Exception e) {
         throw e;
         }
     
     }
   public void imprimirProductomasbarato() throws Exception{
         try {
             Collection<Producto> productos = dao.mostartodosproductomasbarato();
             if (productos.isEmpty()) {
                 throw new Exception("No existen productos");
                 
             }else{ 
                 for (Producto u : productos) {
                     System.out.println("Codigo:"+u.getCodigo()+" Nombre:"+u.getNombre()+" Precio:"+u.getPrecio()+" Codigo Fabricante: "+u.getCodigoFabricante());
                 }
             
             }
         } catch (Exception e) {
         throw e;
         }
     
     }
   
   
   public void crearProducto(String nombre, double precio , int codigoFabricante) throws Exception{
       try {
           if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
           }
           if ( precio == 0 ) {
                throw new Exception("Debe indicar el precio");
           }
           if(codigoFabricante == 0){
           throw  new Exception("Debe indicar el codigo");
           }
           Producto producto = new Producto();
           producto.setNombre(nombre);
           producto.setPrecio(precio);
           producto.setCodigoFabricante(codigoFabricante);
           dao.guardarProducto(producto);
       } catch (Exception e) {
           throw e;
       }
   
   
   
   
   }
   
   
   
   
   
   
   
   
}
