/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Classes.Foods;
import Classes.Users;
import java.sql.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import DesingPatterns.ProxyMethods;

/**
 *
 * @author cbzn_
 * Bean correspondiente a la tabla Foods
 */
@Stateless
@LocalBean
public class FoodsBean implements ProxyMethods{

    @PersistenceContext(unitName = "SistemaCafeteria-ejbPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

    //Método implementado desde la interfaz ProxyMethods, para la implementación del Proxy

    @Override
    public List<Foods> comidas() {
        Query query = em.createNamedQuery("Foods.findAll");
        return query.getResultList();
    }

    @Override
    public List<Users> users() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
