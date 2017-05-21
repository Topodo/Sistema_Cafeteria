package Classes;

import Classes.Orders;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-20T23:08:44")
@StaticMetamodel(Foods.class)
public class Foods_ { 

    public static volatile SingularAttribute<Foods, Integer> foodsStock;
    public static volatile SingularAttribute<Foods, String> foodsName;
    public static volatile SingularAttribute<Foods, Integer> idFoods;
    public static volatile SingularAttribute<Foods, String> foodsPrice;
    public static volatile ListAttribute<Foods, Orders> ordersList;

}