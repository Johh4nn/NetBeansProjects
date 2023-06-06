/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import java.util.Collection;

import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

/**
 *
 * @author Usuario
 */
public class ProductoService {
    
    private ProductoDAO dao;

    public ProductoService() {
        this.dao = new ProductoDAO();
    }

    

    
    

   
 
    
     public Collection<Producto> listarProducto() throws Exception{
        try{
            Collection<Producto> productos = dao.listarProductos();
            return productos;
        }catch(Exception e){
            throw e;
        }
            
        }
     
    public void imprimirProductos() throws Exception{
        try{
        Collection<Producto> productos =  listarProducto();
        
        if(productos.isEmpty()){
            throw new Exception("No existen productos para mostrar");
        }else {
        
            for (Producto u : productos) {
                System.out.println(u);
            }                

        }
        
        }catch(Exception e){
            throw e;
        } 
    
    }
    
   
    
    
    
    
}
    
    
     
   
    

