/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Usuario
 * @param <T>

 */
public class DAO<T> {
     
   protected final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("libreriaPU");
   protected EntityManager em = EMF.createEntityManager();
   
   //CONECTAR
   protected void conectar(){
       if (!em.isOpen()) {
           em = EMF.createEntityManager();
       }
   
   }
   
   //DESCONECTAR
   protected void desconectar(){
       if (em.isOpen()) {
           em.close();
       }
   
   }
   
   //GUARDAR
   protected void guardar(T objeto){
       conectar();
       em.getTransaction().begin();
       em.persist(objeto);
       em.getTransaction().commit();
       desconectar();
   }
   
   //EDITAR
   protected void editar(T objeto){
       conectar();
       em.getTransaction().begin();
       em.merge(objeto);
       em.getTransaction().commit();
       desconectar();
   }
   
   //ELIMINAR
   protected void eliminar(T objeto){
       conectar();
       em.getTransaction().begin();
       em.remove(objeto);
       em.getTransaction().commit();
       desconectar();
   }
}
