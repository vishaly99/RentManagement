package entity;

import entity.Featurestb;
import entity.Propertytb;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-27T19:48:25", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Propertytypetb.class)
public class Propertytypetb_ { 

    public static volatile CollectionAttribute<Propertytypetb, Propertytb> propertytbCollection;
    public static volatile SingularAttribute<Propertytypetb, String> propertyName;
    public static volatile SingularAttribute<Propertytypetb, Date> lastUpdate;
    public static volatile SingularAttribute<Propertytypetb, Integer> propertytypeId;
    public static volatile CollectionAttribute<Propertytypetb, Featurestb> featurestbCollection;
    public static volatile SingularAttribute<Propertytypetb, Integer> isActive;
    public static volatile SingularAttribute<Propertytypetb, Date> createDate;

}