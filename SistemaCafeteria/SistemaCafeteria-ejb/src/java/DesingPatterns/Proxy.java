/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesingPatterns;

import Beans.FoodsBean;
import Beans.UsersBeans;
import Classes.Foods;
import Classes.Users;
import java.sql.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.PersistenceContext;

/**
 *
 * @author cbzn_
 */
@Stateless
@LocalBean
public class Proxy implements FoodsMethods{

    @EJB
    private UsersBeans usersBeans;

    @EJB
    private FoodsBean foodsBean;

    @Override
    public List<Foods> comidasPorFecha(Date date) {
        return foodsBean.comidasPorFecha(date);
    }
    
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public List<Users> users() {
        return usersBeans.users();
    }
}
