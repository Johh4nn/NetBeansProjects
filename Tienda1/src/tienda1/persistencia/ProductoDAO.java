/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda1.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda1.entidades.Producto;

/**
 *
 * @author Usuario
 */
public final  class ProductoDAO extends DAO{
    
    public Producto mostartodoslosproductos() throws Exception{
        try {
           
            String sql = "SELECT * FROM Producto";
            consultarBase(sql);
             Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(2));
                producto.setCodigoFabricante(resultado.getInt(5));
                producto.setNombre(resultado.getString(3));
                producto.setPrecio(resultado.getDouble(4));
            }
            
            desconectarBase();
              return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
      
    
 
    }
    
    public Collection<Producto> listarProductos() throws Exception{
        try {
            String sql = "SELECT * FROM Producto";
            consultarBase(sql);
             Producto producto = null;
             Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt("codigo"));
                producto.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                productos.add(producto);
            }
            
            desconectarBase();
              return productos;

            
        } catch (Exception e) {
             desconectarBase();
            throw e;
        }
    }
    
    public Collection<Producto> listarProductospornombre() throws Exception{
        try {
            String sql = "SELECT nombre FROM Producto";
            consultarBase(sql);
             Producto producto = null;
             Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
          
                producto.setNombre(resultado.getString("nombre"));
                
                productos.add(producto);
            }
            
            desconectarBase();
              return productos;

            
        } catch (Exception e) {
             desconectarBase();
            throw e;
        }
    }
    
    //Lista los nombres y los precios de todos los productos de la tabla producto.
    public Collection<Producto> nombreyprecio() throws Exception{
        try {
            String sql = "SELECT nombre , precio FROM Producto";
            consultarBase(sql);
             Producto producto = null;
             Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
          
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                productos.add(producto);
            }
            
            desconectarBase();
              return productos;

            
        } catch (Exception e) {
             desconectarBase();
            throw e;
        }
    }
    //Listar aquellos productos que su precio esté entre 120 y 202.
        public Collection<Producto> listarProductosentre120y220() throws Exception{
        try {
            String sql = "SELECT * FROM Producto where precio>=120 and precio<=220";
            consultarBase(sql);
             Producto producto = null;
             Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt("codigo"));
                producto.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                productos.add(producto);
            }
            
            desconectarBase();
              return productos;

            
        } catch (Exception e) {
             desconectarBase();
            throw e;
        }
    }
     //Buscar y listar todos los Portátiles de la tabla producto.
        public Collection<Producto> listarsoloportatiles() throws Exception{
        try {
         
            String sql = "SELECT * FROM Producto WHERE nombre like '%Portátil%'";
            consultarBase(sql);
             Producto producto = null;
             Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt("codigo"));
                producto.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                productos.add(producto);
            }
            
            desconectarBase();
              return productos;

            
        } catch (Exception e) {
             desconectarBase();
            throw e;
        }
    }
    //Listar el nombre y el precio del producto más barato.
   
        
        
          public Collection<Producto> mostartodosproductomasbarato() throws Exception{
        try {
           
            String sql = "SELECT * FROM Producto order by precio ASC LIMIT 1"  ;
            consultarBase(sql);
             Producto producto = null;
             Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt("codigo"));
                producto.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                productos.add(producto);
            }
            
            desconectarBase();
              return productos;

            
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
      
    
 
    }
    //Ingresar un producto a la base de datos. 
          public void guardarProducto(Producto producto) throws Exception{
              try {
                  if(producto == null){
                  throw new Exception("Debe indicar el producto");
                  
                  
                  }
                  String sql = "INSERT INTO Producto (nombre,precio,codigo_fabricante)" + "VALUES ( '" + producto.getNombre() +"' , '"+producto.getPrecio()+
                          "' , '"+ producto.getCodigoFabricante()+"' );";
                  insertarModificarEliminar(sql);
              } catch (Exception e) {
                  throw e;
              }finally{
              
              desconectarBase();
              }
          
          
          
          
          }
          
       
        
}
