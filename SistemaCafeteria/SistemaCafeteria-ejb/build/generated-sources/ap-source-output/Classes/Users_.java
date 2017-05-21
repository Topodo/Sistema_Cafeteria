package Classes;

import Classes.Dates;
import Classes.Orders;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-20T23:08:44")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile ListAttribute<Users, Dates> datesList;
    public static volatile SingularAttribute<Users, String> usersName;
    public static volatile SingularAttribute<Users, Orders> orders;
    public static volatile SingularAttribute<Users, Integer> idUsers;
    public static volatile SingularAttribute<Users, String> usersEmail;
    public static volatile SingularAttribute<Users, String> usersPass;

}