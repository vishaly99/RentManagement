package entity;

import entity.Grouptb;
import entity.Usertb;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-06-08T12:56:08", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Usergrouptb.class)
public class Usergrouptb_ { 

    public static volatile SingularAttribute<Usergrouptb, Integer> userGroupId;
    public static volatile SingularAttribute<Usergrouptb, Date> lastUpdate;
    public static volatile SingularAttribute<Usergrouptb, Grouptb> groupId;
    public static volatile SingularAttribute<Usergrouptb, Integer> isActive;
    public static volatile SingularAttribute<Usergrouptb, Usertb> userId;
    public static volatile SingularAttribute<Usergrouptb, Date> createDate;

}