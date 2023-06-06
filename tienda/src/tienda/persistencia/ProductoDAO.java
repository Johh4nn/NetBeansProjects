/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;


/**
 *
 * @author Usuario
 */
public final class ProductoDAO extends DAO {

  
   // Usuario usuario = usuarioService.buscarUsuarioPorId(idUsuario);
                //mascota.setUsuario(usuario);
    public Collection<Producto> listarProductos() throws Exception{
    try{
        String sql = "SELECT * FROM Producto";
        consultarBase(sql);
        Producto producto = null;
        Collection<Producto> productos = new ArrayList();
        while(resultado.next()){
            producto = new Producto();
            producto.setNombre(resultado.getString("nombre"));
            producto.setPrecio(resultado.getDouble("precio"));
            producto.setCodigo(resultado.getInt("codigo"));
            producto.setCodigofabricante(resultado.getInt("codigo_fabricante"));
              
            productos.add(producto);
        }
        desconectarBase();
    return productos;
    }catch(SQLException e){
        
        desconectarBase();
        throw e;
    }
    
    
    }
   
} 
    
     
    
    

