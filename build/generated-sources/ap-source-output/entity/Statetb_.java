package entity;

import entity.Citytb;
import entity.Sellertb;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T19:48:25", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Statetb.class)
public class Statetb_ { 

    public static volatile CollectionAttribute<Statetb, Citytb> citytbCollection;
    public static volatile SingularAttribute<Statetb, Integer> stateId;
    public static volatile SingularAttribute<Statetb, Date> lastUpdate;
    public static volatile CollectionAttribute<Statetb, Sellertb> sellertbCollection;
    public static volatile SingularAttribute<Statetb, String> state;
    public static volatile SingularAttribute<Statetb, Integer> isActive;
    public static volatile SingularAttribute<Statetb, Date> createDate;

}