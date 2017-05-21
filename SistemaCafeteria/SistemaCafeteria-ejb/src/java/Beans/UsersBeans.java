/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Classes.Foods;
import Classes.Users;
import DesingPatterns.ProxyMethods;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author cbzn_
 */
@Stateless
@LocalBean
public class UsersBeans implements ProxyMethods{

    @PersistenceContext(unitName = "SistemaCafeteria-ejbPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }
    
    //Método que devuelve los usuarios de la base de datos
    @Override
    public List<Users> users(){
        Query query = em.createNamedQuery("Users.findAll");
        return query.getResultList();
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public List<Foods> comidas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
