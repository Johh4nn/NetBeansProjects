/*
 * 
 */
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Libro;

/**
 *
 * @author Usuario
 */
public class LibroDAO extends DAO<Libro>{

    

    @Override
    public void guardar(Libro objeto) {
        super.guardar(objeto); 
    }
    public void eliminar(Long id){
        Libro libro = buscarPorIDLibro(id);
        super.eliminar(libro);
    
    }
   public List<Libro> listartodos() {
       conectar();
       List<Libro> libros =  em.createQuery("SELECT l FORM Libros l ").getResultList();
       desconectar();
       return libros;
   
   }
   
   public Libro buscarPorIDLibro(Long id){
       conectar();
       Libro libro = (Libro) em.createQuery("SELECT l from Libro l WHERE l.id = id")
               .setParameter("id", id).getSingleResult();
       desconectar();
       return libro; 
   }
   
   public List<Libro> buscarPorAutoryEditorial(String autor, String editorial){
       conectar();
       List<Libro> libros = em.createQuery("SELECT l FROM  Libro l Join l.autor a WHERE a.nombre LIKE: autor and l.editorial LIKE :editorial ")
               .setParameter("autor", autor).setParameter("editorial", editorial).getResultList();
       desconectar();
       return libros; 
   
   }
}
