package entity;

import entity.Propertytb;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T19:48:25", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Propertyimagetb.class)
public class Propertyimagetb_ { 

    public static volatile SingularAttribute<Propertyimagetb, String> image;
    public static volatile SingularAttribute<Propertyimagetb, Integer> imageId;
    public static volatile SingularAttribute<Propertyimagetb, Date> lastUpdate;
    public static volatile SingularAttribute<Propertyimagetb, Integer> isActive;
    public static volatile SingularAttribute<Propertyimagetb, Propertytb> propertyId;
    public static volatile SingularAttribute<Propertyimagetb, Date> createDate;

}