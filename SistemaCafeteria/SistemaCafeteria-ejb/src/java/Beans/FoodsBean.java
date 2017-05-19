/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Classes.Foods;
import DesingPatterns.FoodsMethods;
import java.sql.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author cbzn_
 * Bean correspondiente a la tabla Foods
 */
@Stateless
@LocalBean
public class FoodsBean implements FoodsMethods{

    @PersistenceContext(unitName = "SistemaCafeteria-ejbPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

    //Método implementado desde la interfaz FoodsMethods, para la implementación del Proxy

    @Override
    public List<Foods> comidasPorFecha(Date date) {
        //Se realiza la query correspondiente
        Query query = em.createNamedQuery("Foods.findByFoodsDate").setParameter("foodsDate", date);
        return query.getResultList();
    }
    
}
