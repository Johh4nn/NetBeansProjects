/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Autor;

/**
 *
 * @author Usuario
 */
public class AutorDAO extends DAO<Autor>{

    @Override
    protected void eliminar(Autor objeto) {
        super.eliminar(objeto); 
    }

    @Override
    protected void guardar(Autor objeto) {
        super.guardar(objeto); 
    }
    
    public List<Autor> listartodos(){
        conectar();
        List<Autor> autores = em.createQuery("SELECT a from Autor a ").getResultList();
        desconectar();
        return autores;
    }
    
    public Autor buscarAutorPorID(Long id){
    conectar();
    Autor autor = (Autor) em.createQuery("SELECT a form Autor a Where a.id = id").setParameter("id", id).getSingleResult();
    desconectar();
    return autor;
    
    }
    
    
    
}
