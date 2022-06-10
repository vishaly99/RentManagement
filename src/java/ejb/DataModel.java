/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Amenitiestb;
import entity.Citytb;
import entity.Featurestb;
import entity.Grouptb;
import entity.Propertyimagetb;
import entity.Propertytb;
import entity.Propertytypetb;
import entity.Sellertb;
import entity.Statetb;
import entity.Usergrouptb;
import entity.Usertb;
import entity.Wishlisttb;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Vishal
 */
@Stateless
public class DataModel implements DataModelLocal {
    @PersistenceContext(unitName = "RentManagementPU")
    EntityManager em;
    private static final SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Override
    public Collection<Statetb> getAllStates() {
            return em.createNamedQuery("Statetb.findAllStatus").setParameter("isActive",0).getResultList();    
    }

    @Override
    public String addState(String StateName) {
         try {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String sdate1=sdf3.format(timestamp);
            Date date1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sdate1);
            Statetb state=new Statetb();
            state.setState(StateName);
            state.setCreateDate(date1);
            em.persist(state);
            return "Inserted State";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public String updateState(Integer StateId, String StateName) {
        try {
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                String sdate1=sdf3.format(timestamp);
                Date date1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sdate1);    
            
                Statetb state=(Statetb) em.find(Statetb.class,StateId);
                state.setState(StateName);
                  
                state.setLastUpdate(date1);
                em.merge(state);
            return "Updated";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public String removeState(Integer StateId) {
        try {
            Statetb state=(Statetb) em.find(Statetb.class, StateId);
            state.setIsActive(1);
            
            em.merge(state);
            return "Deleted";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public Collection<Citytb> getAllCity() {
        return em.createNamedQuery("Citytb.findAllStatus").setParameter("isActive",0).getResultList();
    }

    @Override
    public String addCity(Integer StateId,String CityName) {
        try {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String sdate1=sdf3.format(timestamp);
            Date date1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sdate1);
            
            
            Statetb s=em.find(Statetb.class,StateId);
            //Collection<Citytb> citys=s.getCitytbCollection();
            
            Citytb city=new Citytb();
           
            city.setCity(CityName);
           
            city.setCreateDate(date1);
            city.setStateId(s);
            //citys.add(city);
            //s.setCitytbCollection(citys);
            em.persist(city);
            //em.merge(s);
            return "Inserted";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public String updateCity(Integer StateId,Integer CityId, String CityName) {
        try {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String sdate1=sdf3.format(timestamp);
            Date date1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sdate1);
            
            Citytb city=(Citytb) em.find(Citytb.class,CityId);
            Statetb state=(Statetb) em.find(Statetb.class,StateId);
            city.setStateId(state);
            city.setCity(CityName);
            city.setLastUpdate(date1);
            
            em.merge(city);
            return "Updated";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public String removeCity(Integer CityId) {
        try {
                Citytb city=(Citytb) em.find(Citytb.class,CityId);
                city.setIsActive(1);
                
                em.merge(city);
            return "Deleted";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public Statetb searchState(Integer stateid) {
     try{
            Statetb searchstate = em.find(Statetb.class, stateid);
            return searchstate;
        }catch(Exception e){
            return null;
        }
    }

    @Override
    public Citytb searchCity(Integer cityid) {
        try{
            Citytb searchcity = em.find(Citytb.class, cityid);
            return searchcity;
        }catch(Exception e){
            return null;
        }
    }

    @Override
    public Collection<Amenitiestb> getAllAmenities() {
            return em.createNamedQuery("Amenitiestb.findAllStatus").setParameter("isActive",0).getResultList();
    }

    @Override
    public String addAmenities(String Amenities) {
        try {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String sdate1=sdf3.format(timestamp);
            Date date1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sdate1);
            
            Amenitiestb a=new Amenitiestb();
            a.setAmenities(Amenities);
            a.setCreateDate(date1);
            
            em.persist(a);
            return "Inserted";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public String updateAmenities(Integer AmenitiesId, String Amenities) {
        try {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String sdate1=sdf3.format(timestamp);
            Date date1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sdate1);
            
            Amenitiestb a=(Amenitiestb) em.find(Amenitiestb.class,AmenitiesId);
            a.setAmenities(Amenities);
           
            a.setLastUpdate(date1);
            
            em.merge(a);
            
            return "Updated";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public String removeAmenities(Integer AmenitiesId) {
        try {
            Amenitiestb a=(Amenitiestb) em.find(Amenitiestb.class,AmenitiesId);
            a.setIsActive(1);
            
            return "Deleted";

        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public Amenitiestb searchAmenities(Integer AmenitiesId) {
        try{
            Amenitiestb amenitiestb = em.find(Amenitiestb.class,AmenitiesId);
            return amenitiestb;
        }catch(Exception e){
            return null;
        }
    }

    @Override
    public Collection<Propertytypetb> getAllPropertytype() {
        return em.createNamedQuery("Propertytypetb.findAllStatus").setParameter("isActive",0).getResultList();
    }

    @Override
    public String addPropertytype(String PropertyName) {
        try {
                    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String sdate1=sdf3.format(timestamp);
            Date date1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sdate1);
            
            Propertytypetb p=new Propertytypetb();
            p.setPropertyName(PropertyName);
            p.setCreateDate(date1);
            em.persist(p);
            return "Inserted";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public String updatePropertytype(Integer PropertytypeId, String PropertyName) {
        try {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String sdate1=sdf3.format(timestamp);
            Date date1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sdate1);
                Propertytypetb p=(Propertytypetb) em.find(Propertytypetb.class,PropertytypeId);
                p.setPropertyName(PropertyName);
                
                p.setLastUpdate(date1);
                
                em.merge(p);
                return "Updated";
            } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public String removePropertytype(Integer PropertytypeId) {
        try {
                Propertytypetb p=(Propertytypetb) em.find(Propertytypetb.class,PropertytypeId);
                p.setIsActive(1);
                
                return "Deleted";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    @Override
    public Propertytypetb searchPropertytype(Integer PropertytypeId) {
        try{
            Propertytypetb propertytypetb = em.find(Propertytypetb.class,PropertytypeId);
            return propertytypetb;
        }catch(Exception e){
            return null;
        }
    }

    @Override
    public Collection<Usertb> getAllUser() {
       return em.createNamedQuery("Usertb.findAllStatus").setParameter("isActive",0).getResultList();
    }
    @Override
    public Collection<Usertb> getAllUsertbs() {
       return em.createNamedQuery("Usertb.findByIsSeller").setParameter("isSeller",0).setParameter("isActive",0).getResultList();
    }
    @Override
    public Collection<Usertb> getAllSeller() {
       return em.createNamedQuery("Usertb.findByIsSeller").setParameter("isSeller",1).setParameter("isActive",0).getResultList();
    }
    @Override
    public String addUser(String UserName, String Email, String Password, String MobileNo, Integer IsSeller) {
        try {
            Integer seller=5,user=4;
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String sdate1=sdf3.format(timestamp);
            Date date1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sdate1);
            Usertb usertb=new Usertb();
            Usergrouptb usergrouptb=new Usergrouptb();
            
            usertb.setUserName(UserName);
            usertb.setEmail(Email);
            usertb.setPassword(Password);
            usertb.setMobileNo(MobileNo);
            usertb.setIsSeller(IsSeller);
            usertb.setCreateDate(date1);
            
            em.persist(usertb);
            em.flush();
            System.out.println("Inserted id:="+usertb.getUserId());
            Usertb u=(Usertb)em.find(Usertb.class,usertb.getUserId());
            
            if(usertb.getIsSeller()!=0)
            {
                Grouptb grouptb=(Grouptb)em.find(Grouptb.class, 5);
                
                
                usergrouptb.setGroupId(grouptb);
                usergrouptb.setUserId(usertb);
                usergrouptb.setCreateDate(date1);
                em.persist(usergrouptb);
            }
            else
            {
                Grouptb grouptb=(Grouptb)em.find(Grouptb.class, 4);
                
                usergrouptb.setGroupId(grouptb);
                usergrouptb.setUserId(usertb);
                usergrouptb.setCreateDate(date1);
                em.persist(usergrouptb);
            }

            return "Inserted";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public String updateUser(Integer UserId, String UserName, String Email,String MobileNo) {
        try {
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                String sdate1=sdf3.format(timestamp);
                Date date1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sdate1);    
            
                Usertb usertb=(Usertb) em.find(Usertb.class,UserId);
                usertb.setUserName(UserName);
                usertb.setEmail(Email);
                usertb.setMobileNo(MobileNo);
                usertb.setLastUpdate(date1);
                em.merge(usertb);
            return "Updated";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public String removeUser(Integer UserId) {
         try {
             Usertb usertb=(Usertb)em.find(Usertb.class, UserId);
             usertb.setIsActive(1);
             
             em.merge(usertb);
            return "Deleted";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public Usertb searchUser(Integer UserId) {
        try {
            Usertb usertb=(Usertb)em.find(Usertb.class, UserId);
            return usertb;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Collection<Featurestb> getAllFeatures() {
       return em.createNamedQuery("Featurestb.findAllStatus").setParameter("isActive",0).getResultList();
    }

    @Override
    public String addFeatures(Integer PropertyTypeId, String Feature) {
        try {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String sdate1=sdf3.format(timestamp);
            Date date1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sdate1);
            
            
            Propertytypetb p=em.find(Propertytypetb.class,PropertyTypeId);
            //Collection<Citytb> citys=s.getCitytbCollection();
            
            Featurestb featurestb=new Featurestb();
           
            featurestb.setFeature(Feature);
           
            featurestb.setCreateDate(date1);
            featurestb.setPropertyTypeId(p);
            //citys.add(city);
            //s.setCitytbCollection(citys);
            em.persist(featurestb);
            //em.merge(s);
            return "Inserted";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public String updateFeatures(Integer PropertyTypeId, Integer FeatureId, String Feature) {
        try {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String sdate1=sdf3.format(timestamp);
            Date date1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sdate1);
            
            Propertytypetb p=em.find(Propertytypetb.class,PropertyTypeId);
            Featurestb featurestb=em.find(Featurestb.class,FeatureId);
            featurestb.setFeature(Feature);
            featurestb.setPropertyTypeId(p);
            featurestb.setLastUpdate(date1);
            
            em.merge(featurestb);
            return "Updated";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public String removeFeatures(Integer FeatureId) {
       try {
                Featurestb featurestb=em.find(Featurestb.class,FeatureId);
                featurestb.setIsActive(1);
                
                em.merge(featurestb);
            return "Deleted";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public Featurestb searchFeatures(Integer FeatureId) {
         try{
            Featurestb featurestb=em.find(Featurestb.class,FeatureId);
            return featurestb;
        }catch(Exception e){
            return null;
        }   
    }

    @Override
    public String addUserGroup(Integer UserId, Integer GroupId) {
        try {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String sdate1=sdf3.format(timestamp);
            Date date1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sdate1);
            
            Grouptb grouptb=(Grouptb)em.find(Grouptb.class, GroupId);
            Usertb usertb=(Usertb)em.find(Usertb.class,UserId);
            Usergrouptb usergrouptb=new Usergrouptb();
            usergrouptb.setGroupId(grouptb);
            usergrouptb.setUserId(usertb);
            usergrouptb.setCreateDate(date1);
            em.persist(usergrouptb);
            return "Inserted UserGroup";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public Collection<Usertb> validate(String email, String password) {
            try {
            return em.createNamedQuery("Usertb.validate").setParameter("email",email).setParameter("password",password).setParameter("isActive",0).getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Collection<Wishlisttb> searchWishList(Usertb UserId) {

            return em.createNamedQuery("Wishlisttb.findAllByUserId").setParameter("userId",UserId).getResultList();
        
    }

    @Override
    public Collection<Propertyimagetb> searchImageList(int Id) {
       
            System.out.println("Id:="+Id);
            Propertyimagetb propertyimage=(Propertyimagetb)em.find(Propertyimagetb.class, Id);
            Collection<Propertyimagetb> p= em.createNamedQuery("Propertyimagetb.findByImageId").setParameter("propertyId",propertyimage.getPropertyId()).getResultList();    
            for (Propertyimagetb propertyimagetb : p) {
                System.out.println("image:="+propertyimagetb.getImage());
            }
        return p;
    }

    @Override
    public Propertytb searchProperty(int Id) {
        try{
            Propertytb propertytb=em.find(Propertytb.class,Id);
            return propertytb;
        }catch(Exception e){
            return null;
        }   
    }

    @Override
    public Sellertb searchSeller(int Id) {
        try{
            Sellertb sellertb=em.find(Sellertb.class,Id);
            return sellertb;
        }catch(Exception e){
            return null;
        }  
    }
}
