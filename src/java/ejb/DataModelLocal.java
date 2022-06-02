/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Amenitiestb;
import entity.Citytb;
import entity.Featurestb;
import entity.Propertytypetb;
import entity.Statetb;
import entity.Usertb;
import entity.Wishlisttb;
import java.util.Collection;
import javax.ejb.Local;

/**
 *
 * @author Vishal
 */
@Local
public interface DataModelLocal {
    //==== State =================
    Collection<Statetb> getAllStates();
    public String addState(String StateName);
    public String updateState(Integer StateId,String StateName);
    public String removeState(Integer StateId);
    public Statetb searchState(Integer stateid);
    //==== City =================
    Collection<Citytb> getAllCity();
    public String addCity(Integer StateId,String CityName);
    public String updateCity(Integer StateId,Integer CityId,String CityName);
    public String removeCity(Integer CityId);
    public Citytb searchCity(Integer cityid);
    //==== Amenitiestb =================
    Collection<Amenitiestb> getAllAmenities();
    public String addAmenities(String Amenities);
    public String updateAmenities(Integer AmenitiesId,String Amenities);
    public String removeAmenities(Integer AmenitiesId);
    public Amenitiestb searchAmenities(Integer AmenitiesId);
    //==== Propertytypetb =================
    Collection<Propertytypetb> getAllPropertytype();
    public String addPropertytype(String PropertyName);
    public String updatePropertytype(Integer PropertytypeId,String PropertyName);
    public String removePropertytype(Integer PropertytypeId);
    public Propertytypetb searchPropertytype(Integer PropertytypeId);
    //==== Usertb =================
    Collection<Usertb> getAllUser();
    Collection<Usertb> getAllUsertbs();
    
    Collection<Usertb> getAllSeller();
    public String addUser(String UserName,String Email,String Password,String MobileNo,Integer IsSeller);
    public String updateUser(Integer UserId,String UserName,String Email,String MobileNo);
    public String removeUser(Integer UserId);
    public Usertb searchUser(Integer UserId);
    Collection<Usertb> validate(String email,String password);
    //UserGrouptb
    public String addUserGroup(Integer UserId,Integer GroupId);
    //==== features =================
    Collection<Featurestb> getAllFeatures();
    public String addFeatures(Integer PropertyTypeId,String Feature);
    public String updateFeatures(Integer PropertyTypeId,Integer FeatureId,String Feature);
    public String removeFeatures(Integer FeatureId);
    public Featurestb searchFeatures(Integer FeatureId);
    //==== WishList=========
    public Collection<Wishlisttb> searchWishList(Usertb UserId);
}
