/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import Beans.FoodsBean;
import Classes.Foods;
import DesingPatterns.Proxy;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.ejb.EJB;
import DesingPatterns.ProxyMethods;

/**
 *
 * @author cbzn_
 */
@Named(value = "foodsService")
@SessionScoped
public class FoodsService implements Serializable  {

    //Se realiza un llamado al Enterprise Bean Proxy, para poder realizar la consulta
    @EJB
    private Proxy proxy;

   // @EJB
   // private Proxy proxyFoods;
    /**
     * Creates a new instance of FoodsService
     */
    public FoodsService() {
    }

    
    
    public List<Foods> comidas() {
        return proxy.comidas();
    }
    
    
}
