package entity;

import entity.Featurevaluetb;
import entity.Propertyfeaturestb;
import entity.Propertytypetb;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-06-08T12:56:08", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Featurestb.class)
public class Featurestb_ { 

    public static volatile SingularAttribute<Featurestb, Propertytypetb> propertyTypeId;
    public static volatile SingularAttribute<Featurestb, String> feature;
    public static volatile SingularAttribute<Featurestb, Featurevaluetb> featurevaluetb;
    public static volatile SingularAttribute<Featurestb, Date> lastUpdate;
    public static volatile SingularAttribute<Featurestb, Integer> isActive;
    public static volatile CollectionAttribute<Featurestb, Propertyfeaturestb> propertyfeaturestbCollection;
    public static volatile SingularAttribute<Featurestb, Integer> featureId;
    public static volatile SingularAttribute<Featurestb, Date> createDate;

}