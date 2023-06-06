/*
 
 */
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Editorial;

/**
 *
 * @author Usuario
 */
public class EditorialDAO extends DAO<Editorial> {

    @Override
    protected void eliminar(Editorial objeto) {
        super.eliminar(objeto); 
    }

    @Override
    protected void guardar(Editorial objeto) {
        super.guardar(objeto); 
    }
    
    protected List<Editorial> listarTodos(){
    conectar();
    List<Editorial> editoriales = em.createQuery("SELECT e form Editorial e").getResultList();
    desconectar();
    return editoriales;
    }
    
}
