package entity;

import entity.Propertyamenitiestb;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-06-08T12:56:08", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Amenitiestb.class)
public class Amenitiestb_ { 

    public static volatile SingularAttribute<Amenitiestb, String> amenities;
    public static volatile CollectionAttribute<Amenitiestb, Propertyamenitiestb> propertyamenitiestbCollection;
    public static volatile SingularAttribute<Amenitiestb, Integer> amenitiesId;
    public static volatile SingularAttribute<Amenitiestb, Date> lastUpdate;
    public static volatile SingularAttribute<Amenitiestb, Integer> isActive;
    public static volatile SingularAttribute<Amenitiestb, Date> createDate;

}