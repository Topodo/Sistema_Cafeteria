package Classes;

import Classes.Deliverys;
import Classes.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-20T23:08:44")
@StaticMetamodel(Dates.class)
public class Dates_ { 

    public static volatile ListAttribute<Dates, Users> usersList;
    public static volatile SingularAttribute<Dates, Integer> idDates;
    public static volatile ListAttribute<Dates, Deliverys> deliverysList;
    public static volatile SingularAttribute<Dates, Date> datesDate;

}