/*

 */
package libreria.servicios;

import java.util.List;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;

/**
 *
 * @author Usuario
 */
public class LibroServicio {
    
    private AutorServicio autorservicio;
    private EditorialServicio editorialservicio;
    private final LibroDAO DAO;

    public LibroServicio() {
        this.DAO = new LibroDAO();
        
    }

    public void setServicios(AutorServicio autorservicio, EditorialServicio editorialservicio) {
        this.autorservicio = autorservicio;
        this.editorialservicio = editorialservicio;
    }
    
   public Libro crearLibro(Long id, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, boolean alta, Autor autor, Editorial editorial){
       Libro libro = new Libro();
       try {
           libro.setTitulo(titulo);
           libro.setId(id);
           libro.setEjemplares(ejemplares);
           libro.setAlta(alta);
           libro.setAnio(anio);
           libro.setAutor(autor);
           libro.setEjemplaresPrestados(ejemplaresPrestados);
           libro.setEjemplaresRestantes(ejemplaresRestantes);
           
           DAO.guardar(libro);
           return libro;
       } catch (Exception e) {
           System.out.println(e.getMessage());
           return null;
       } 
   }

    public Libro buscarPorId(Long id){
        try {
            return DAO.buscarPorIDLibro(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
  
    }
    
    public boolean eliminarporId(Long id){
        try {
            DAO.eliminar(id);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }   
    }
    
    public List<Libro> listarLibros(){
        try {
            return DAO.listartodos();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    
    } 
    
    
}
