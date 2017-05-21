package Classes;

import Classes.Foods;
import Classes.OrdersPK;
import Classes.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-20T23:08:44")
@StaticMetamodel(Orders.class)
public class Orders_ { 

    public static volatile SingularAttribute<Orders, OrdersPK> ordersPK;
    public static volatile ListAttribute<Orders, Users> usersList;
    public static volatile SingularAttribute<Orders, String> ordersAddress;
    public static volatile ListAttribute<Orders, Foods> foodsList;
    public static volatile SingularAttribute<Orders, String> ordersManager;

}