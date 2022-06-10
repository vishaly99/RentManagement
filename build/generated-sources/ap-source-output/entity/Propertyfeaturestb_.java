package entity;

import entity.Featurestb;
import entity.Featurevaluetb;
import entity.Propertytb;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-06-08T12:56:08", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Propertyfeaturestb.class)
public class Propertyfeaturestb_ { 

    public static volatile SingularAttribute<Propertyfeaturestb, Featurevaluetb> featureValueId;
    public static volatile SingularAttribute<Propertyfeaturestb, Date> lastUpdate;
    public static volatile SingularAttribute<Propertyfeaturestb, Integer> propertyFeatureId;
    public static volatile SingularAttribute<Propertyfeaturestb, Integer> isActive;
    public static volatile SingularAttribute<Propertyfeaturestb, Propertytb> propertyId;
    public static volatile SingularAttribute<Propertyfeaturestb, Featurestb> featureId;
    public static volatile SingularAttribute<Propertyfeaturestb, Date> createDate;

}