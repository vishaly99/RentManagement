/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbean;

import client.JerseyClient;
import ejb.DataModelLocal;
import entity.Amenitiestb;
import entity.Featurestb;
import entity.Propertyimagetb;
import entity.Propertytb;
import entity.Propertytypetb;
import entity.Sellertb;
import entity.Usertb;
import entity.Wishlisttb;
import java.util.Collection;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Vishal
 */
@Named(value = "clientBean")
@ApplicationScoped
public class ClientBean {
    @EJB DataModelLocal ejb;
    
    Response rs;
    JerseyClient jc;
    
    private List<String> selectedItems;
    Integer userid,featureid,propertytypeid,isseller,isactive,amenitiesid;
    Boolean check,auth;
    
    String username,adminname,amenities;
    String email,password,repassword,mobileno,feature,title;
   
    //Property
    Integer propertyid,price;
    String propertyname,decription,type,address,plotarea,areaunit,ptype,pimage;
    
    
    Collection<Usertb> getusertb;
    GenericType<Collection<Usertb>> gcusertb;
    
    Collection<Usertb> getusertbs;
    GenericType<Collection<Usertb>> gcusertbs;
    
    Collection<Amenitiestb> getAmenities;
    GenericType<Collection<Amenitiestb>> gcAmenities;
    
    Collection<Featurestb> getfeaturestb;
    GenericType<Collection<Featurestb>> gcfeaturestb;
    Collection<Propertytypetb> getPropertytype;
    GenericType<Collection<Propertytypetb>> gcPropertytype;
    
    Collection<Wishlisttb> getwishlisttb;
    Collection<Propertyimagetb> getPropertyimagetbs;
    Collection<Propertytb> getPropertytbs;
    Usertb usertb=new Usertb();
    Featurestb featurestb=new Featurestb();
    Wishlisttb wishlisttb=new Wishlisttb();
    Propertytypetb propertytypetb=new Propertytypetb();
    Sellertb sellertb=new Sellertb();
    Propertytb propertytb=new Propertytb();
    Propertyimagetb propertyimagetb=new Propertyimagetb();
    /**
     * Creates a new instance of ClientBean
     */
    @PostConstruct
    public void init()
    {
        jc=new JerseyClient();
        userid=0;
        isseller=0;
        username="";
        title="";
        auth=false;
    }
    public ClientBean() {
    }

    public String getDecription() {
        return decription;
    }

    public List<String> getSelectedItems() {
        return selectedItems;
    }

    public void setSelectedItems(List<String> selectedItems) {
        this.selectedItems = selectedItems;
    }

    public Collection<Propertyimagetb> getGetPropertyimagetbs() {
        return getPropertyimagetbs;
    }

    public void setGetPropertyimagetbs(Collection<Propertyimagetb> getPropertyimagetbs) {
        this.getPropertyimagetbs = getPropertyimagetbs;
    }

    public Collection<Amenitiestb> getGetAmenities() {
        return getAmenities;
    }

    public void setGetAmenities(Collection<Amenitiestb> getAmenities) {
        this.getAmenities = getAmenities;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAmenitiesid() {
        return amenitiesid;
    }

    public Integer getPropertyid() {
        return propertyid;
    }

    public void setPropertyid(Integer propertyid) {
        this.propertyid = propertyid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPropertyname() {
        return propertyname;
    }

    public void setPropertyname(String propertyname) {
        this.propertyname = propertyname;
    }

    public void setAmenitiesid(Integer amenitiesid) {
        this.amenitiesid = amenitiesid;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getPimage() {
        return pimage;
    }

    public void setPimage(String pimage) {
        this.pimage = pimage;
    }

    public String getPlotarea() {
        return plotarea;
    }

    public void setPlotarea(String plotarea) {
        this.plotarea = plotarea;
    }

    public String getAreaunit() {
        return areaunit;
    }

    public void setAreaunit(String areaunit) {
        this.areaunit = areaunit;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

  

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Collection<Propertytypetb> getGetPropertytype() {
        return getPropertytype;
    }

    public void setGetPropertytype(Collection<Propertytypetb> getPropertytype) {
        this.getPropertytype = getPropertytype;
    }

    public Integer getFeatureid() {
        return featureid;
    }

    public void setFeatureid(Integer featureid) {
        this.featureid = featureid;
    }

    public Integer getPropertytypeid() {
        return propertytypeid;
    }

    public void setPropertytypeid(Integer propertytypeid) {
        this.propertytypeid = propertytypeid;
    }

    public Integer getIsactive() {
        return isactive;
    }

    public void setIsactive(Integer isactive) {
        this.isactive = isactive;
    }

   
    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public Collection<Featurestb> getGetfeaturestb() {
        return getfeaturestb;
    }

    public void setGetfeaturestb(Collection<Featurestb> getfeaturestb) {
        this.getfeaturestb = getfeaturestb;
    }

    public Boolean getAuth() {
        return auth;
    }

    public void setAuth(Boolean auth) {
        this.auth = auth;
    }

    public Boolean getCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getIsseller() {
        return isseller;
    }

    public void setIsseller(Integer isseller) {
        this.isseller = isseller;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public Collection<Usertb> getGetusertb() {
        return getusertb;
    }

    public void setGetusertb(Collection<Usertb> getusertb) {
        this.getusertb = getusertb;
    }
    public String adduser()
    {
        try {
          
           System.out.println("Adduser:="+username+"/"+email+"/"+password+"/"+repassword+"/"+mobileno+"/"+check);
           if(check==true)
           {
               isseller=1;
           }else {isseller=0;}
           Usertb usertb=new Usertb();
           usertb.setUserName(username);
           usertb.setEmail(email);
           usertb.setPassword(password);
           usertb.setMobileNo(mobileno);
           usertb.setIsSeller(isseller);
           jc.addUser(username, email, password, mobileno, isseller);
           clearAll();
           return "login.xhtml?faces-redirect=true";
          
          
       } 
       catch (Exception e) {
           return e.getMessage();
          
       }
    }
    public String deleteuser(Integer id)
    {
        try {
            System.out.println("Delete user:="+jc.deleteuser(String.valueOf(id)));
            clearAll();
            return "user.xhtml?faces-redirect=true";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    public String updateuser()
   {
      
       try {
           
           System.out.println("Updateuser:="+jc.updateUser(String.valueOf(userid), username, email, mobileno));
           clearAll();
           return "myprofile.xhtml?faces-redirect=true";
       } 
       catch (Exception e) {
           return e.getMessage();
          
       }
   }
    public String searchuser(Integer uid)
   {
       try {
           usertb=ejb.searchUser(uid);
           userid=usertb.getUserId();
           username=usertb.getUserName();
           email=usertb.getEmail();
           mobileno=usertb.getMobileNo();
           
           if(usertb.getIsSeller()!=0)
           {
               title="Seller";
           }
           title="Customer";
           return "myprofile.xhtml?faces-redirect=true";
       } catch (Exception e) {
           return e.getMessage();
       }
   }
    public String authenticate()
    {

        try {
            if(username.equals("admin") && password.equals("admin"))
            {
                    HttpSession session = SessionUtils.getSession();
                    session.setAttribute("admin", username);
                    adminname=(String)session.getAttribute("admin");
                    return "/admin/index.xhtml?faces-redirect=true";
            }
            else
            {
                Integer UserId = LoginDAO.validate(username,password);
                usertb=ejb.searchUser(UserId);
                System.out.println("isSeller:="+usertb.getIsSeller());
                if(usertb.getIsSeller()!=0)
                {
                    HttpSession session = SessionUtils.getSession();
                    session.setAttribute("username", username);
                    session.setAttribute("isSeller",usertb.getIsSeller());
                    session.setAttribute("UserId",usertb.getUserId());
                    this.auth=true;
                    this.isseller=usertb.getIsSeller();
                    userid=usertb.getUserId();
                    email=usertb.getEmail();
                    mobileno=usertb.getMobileNo();
                    title="Seller";
                    return "index.xhtml?faces-redirect=true";
                }
                else if(usertb.getIsSeller()==0)
                {
                    HttpSession session = SessionUtils.getSession();
                    session.setAttribute("username", username);
                    session.setAttribute("isSeller",usertb.getIsSeller());
                    session.setAttribute("UserId",usertb.getUserId());
                    this.auth=true;
                    this.isseller=usertb.getIsSeller();
                    userid=usertb.getUserId();
                    email=usertb.getEmail();
                    mobileno=usertb.getMobileNo();
                    title="User";
                    return "index.xhtml?faces-redirect=true";
                }
                
                else
                {
                    FacesContext.getCurrentInstance().addMessage(
                                            null,
                                            new FacesMessage(FacesMessage.SEVERITY_WARN,
                                                            "Incorrect Username and Passowrd",
                                                            "Please enter correct username and Password"));
                    System.out.println("Incorrect password");
                    return "login.xhtml?faces-redirect=true";
                }
            }
            
        } catch (Exception e) {
            System.out.println("authenticate:="+e.getMessage());
            return "login.xhtml?faces-redirect=true";
        }
    }
    public String logout() {
		HttpSession session = SessionUtils.getSession();
		session.invalidate();
                clearAll();
		return "/client/login.xhtml?faces-redirect=true";
	}
    public String getuser()
    {
        HttpSession session = SessionUtils.getSession();
        String user=(String)session.getAttribute("username");
        
        return user;
    }
    
    public Collection<Usertb> showSeller()
    {
         gcusertb=new GenericType<Collection<Usertb>>(){};
         rs=jc.getAllSeller(Response.class);
         getusertb=rs.readEntity(gcusertb);

        return getusertb;
    }
    
    public Collection<Usertb> showUsertbs()
    {
         gcusertbs=new GenericType<Collection<Usertb>>(){};
         rs=jc.getAllUsertbs(Response.class);
         getusertbs=rs.readEntity(gcusertbs);

        return getusertbs;
    }
    public Collection<Propertytypetb> showPropertytype()
    {
         gcPropertytype=new GenericType<Collection<Propertytypetb>>(){};
         rs=jc.getAllPropertytype(Response.class);
         getPropertytype=rs.readEntity(gcPropertytype);

        return getPropertytype;
    }
    public String addfeature()
    {

        try {

            System.out.println("Addfeature:="+feature+"/"+propertytypeid);

            System.out.println("Addfeature:="+jc.addfeatures(String.valueOf(propertytypeid), feature));
            clearAll();
            return "features.xhtml?faces-redirect=true";


        } 
        catch (Exception e) {
            return e.getMessage();

        }
    }
    public String searchfeatures(Integer fid)
    {
        try {
            featurestb=ejb.searchFeatures(fid);
            featureid=featurestb.getFeatureId();
            feature=featurestb.getFeature();
            propertytypeid=featurestb.getPropertyTypeId().getPropertytypeId();
            return "addfeatures.xhtml?faces-redirect=true";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    public String updatefeatures()
    {

        try {
             System.out.println("UpdateFeature:="+jc.updatefeatures(String.valueOf(propertytypeid),String.valueOf(featureid),feature));
            clearAll();

            return "features.xhtml?faces-redirect=true";
        } 
        catch (Exception e) {
            return e.getMessage();

        }
    }
     public String deletefeatures(Integer id){
        try{
            jc.deletefeatures(String.valueOf(id));
            return "features.xhtml?faces-redirect=true";
        }catch(Exception e){
            return e.getMessage();
        }
    }
    public Collection<Featurestb> showfeatures()
    {
       gcfeaturestb=new GenericType<Collection<Featurestb>>(){};
         rs=jc.getAllFeatures(Response.class);
         getfeaturestb=rs.readEntity(gcfeaturestb);

        return getfeaturestb;
    }
    public Collection<Wishlisttb> showwishdata()
    {
        
        getwishlisttb=ejb.searchWishList(ejb.searchUser(userid));
        
        return getwishlisttb;
        
    }
    public Collection<Amenitiestb> showAmenities()
   {
      gcAmenities=new GenericType<Collection<Amenitiestb>>(){};
        rs=jc.getAllAmenities(Response.class);
        getAmenities=rs.readEntity(gcAmenities);
      
       return getAmenities;
   }
    public void addproperty()
    {
        try {
            System.out.println(amenitiesid);
        } catch (Exception e) {
            System.out.println("Error:="+e.getMessage());
        }
    }
    public String showimage(int i)
    {
        String img=null;
        System.out.println("Showimage:="+i);
        getPropertyimagetbs=ejb.searchImageList(i);
        for (Propertyimagetb propertyimagetb : getPropertyimagetbs) {
                System.out.println("a"+propertyimagetb.getImage());
                img=propertyimagetb.getImage();
                break;
            }
        
        return img;
    }
    public String showpropertybyid(int i)
    {
        System.out.println("showpropertybyid:="+i);
        propertytb=ejb.searchProperty(i);
        sellertb=ejb.searchSeller(propertytb.getPropertyId());
        getPropertyimagetbs=ejb.searchImageList(propertytb.getPropertyId());
        propertyname=propertytb.getPropertyName();
        type=sellertb.getType();
        address=sellertb.getAddress();
        price=propertytb.getPrice();
        areaunit=propertytb.getAreaUnit();
        decription=propertytb.getDescription();
        this.username=sellertb.getUserId().getUserName();
        this.mobileno=sellertb.getUserId().getMobileNo();
        this.email=sellertb.getUserId().getEmail();
        System.out.println("Seller details:="+username+""+mobileno+""+email);
        for (Propertyimagetb image : getPropertyimagetbs) {
            System.out.println("images:="+image.getImage());
        }
        //return null;
//        System.out.println("propertyid:="+propertytb.getPropertyId());
//        System.out.println("sellerid:="+sellertb.getSellerId());
        return "SinglePropertySeller.xhtml";
    }
    public String myprofile()
    {
        
        HttpSession session = SessionUtils.getSession();
        Integer UserId=(Integer)session.getAttribute("UserId");
        System.out.println("managedbean.ClientBean.myprofile():="+UserId);
       
        return "myprofile.xhtml";
    }
    public void clearAll()
    {
        userid=0;isseller=0;propertytypeid=0;featureid=0;amenitiesid=0;amenities="";
        propertyid=0;price=0;
        address="";decription="";
        propertyname="";type="";
        ptype="";
        username="";email="";password="";mobileno="";feature="";title="";
        auth=false;
    }
}
