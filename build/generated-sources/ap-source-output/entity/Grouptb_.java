package entity;

import entity.Usergrouptb;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-06-08T12:56:08", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Grouptb.class)
public class Grouptb_ { 

    public static volatile SingularAttribute<Grouptb, String> groupName;
    public static volatile SingularAttribute<Grouptb, Integer> groupId;
    public static volatile SingularAttribute<Grouptb, Date> lastUpdate;
    public static volatile SingularAttribute<Grouptb, Integer> isActive;
    public static volatile CollectionAttribute<Grouptb, Usergrouptb> usergrouptbCollection;
    public static volatile SingularAttribute<Grouptb, Date> createDate;

}