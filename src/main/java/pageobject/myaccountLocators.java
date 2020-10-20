package pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class myaccountLocators {
	
	WebDriver driver;
	 public myaccountLocators(WebDriver driver ) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);		
 }
	 
	 @FindBy(id="testHeaderAcc")
	 private WebElement usericon;
	 
	 @FindBy(id="web_menu_myaccount")
	 private WebElement myaccount;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]")
	 private WebElement myaccountlabel;
	 
	 @FindBy(id="web_menu_mywishlist")
	 private WebElement mywishlist;
	 
	 @FindBy(id="web_menu_myorders")
	 private WebElement myorders ;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]")
	 private WebElement myorderlabel;
	 
	 @FindBy(id="web_menu_mywallet")
	 private WebElement mywallet ;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]")
	 private WebElement usewalletlink;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]")
	 private WebElement mywalletlabel;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/a[1]/div[1]/div[1]/div[2]/button[1]")
	 private WebElement myorderinfo;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]")
	 private WebElement orderhlpcta;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")
	 private WebElement cancelcta;
	 
	 @FindBy(xpath="//span[contains(text(),'How to use Bewakoof Wallet?')]")
	 private WebElement Bwkwalletuse;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/a[1]/span[1]")
	 private WebElement Backtomyorder;
	 
	 @FindBy(id="testMyAddress")
	 private WebElement Myaddresses;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]")
	 private WebElement Myaddresseslabel;
	 
	 @FindBy(xpath="//span[contains(text(),'+')]")
	 private WebElement AddNewAdd;
	 
	 @FindBy(xpath="//div[contains(text(),'Info')]")
	 private WebElement DeliveryInfoLabel;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[3]/input[1]")
	 private WebElement ReceiverNametxt;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[7]/div[1]/input[1]")
	 private WebElement Pincodetxt;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[4]/div[1]/input[1]")
	 private WebElement Phonenotxt;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[8]/input[1]")
	 private WebElement Addresstxt;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[9]/input[1]")
	 private WebElement Localitytxt;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[11]/div[1]/input[1]")
	 private WebElement citytxt;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[12]/div[1]/input[1]")
	 private WebElement statetxt;
	 
	 @FindBy(xpath="//label[contains(text(),'home')]")
	 private WebElement home;
	 
	 @FindBy(xpath="//label[contains(text(),'office')]")
	 private WebElement office;
	 
	 @FindBy(xpath="//label[contains(text(),'other')]")
	 private WebElement other;
	 
	 @FindBy(xpath="//button[contains(text(),'CANCEL')]")
	 private WebElement cnlctaaddpage;
	 
	 @FindBy(xpath="//button[@id='addAddressButton']")
	 private WebElement saveaddbtnaddpage;
	
	 @FindBy(id="web_logout")
	 private WebElement logout ;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/a[1]/span[1]")
	 private WebElement backtomyaccount;
	 
	 @FindBy(xpath="//div[contains(text(),\"Sadly, you haven't placed any orders till now.\")]")
	 private WebElement noorderstxt;
	 
	 @FindBy(className="continueShop")
	 private WebElement cntshpcta;
	 
	 @FindBy(className="close_popup_target icon_close")
	 private WebElement closembverifcationpopup;
	 
	 @FindBy(xpath="//p[contains(text(),'Full name required')]")
	 private WebElement fullnamereq;
     
	 @FindBy(xpath="//p[contains(text(),'Phone Number required')]")
	 private WebElement phonenoreq;
	 
	 @FindBy(xpath="//p[contains(text(),'Pincode required')]")
	 private WebElement pincodereq;
	 
	 @FindBy(xpath="//p[contains(text(),'Address required')]")
	 private WebElement addressreq;
	 
	 @FindBy(xpath="//p[contains(text(),'Locality required')]")
	 private WebElement Localityreq;
	 
	 @FindBy(xpath="//p[contains(text(),'City required')]")
	 private WebElement cityreq;
	 
	 @FindBy(xpath="//p[contains(text(),'State required')]")
	 private WebElement statereq;
	 
	 @FindBy(xpath="//p[contains(text(),'Address type required')]")
	 private WebElement addtypereq;
	 
	 @FindBy(xpath="//span[contains(text(),'Remove')]")
	 private WebElement removeadd;

	 @FindBy(xpath="//span[contains(text(),'Edit')]")
	 private WebElement editadd;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")
	 private WebElement profilefirstname;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[1]/input[1]")
	 private WebElement profilelastname;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[4]/div[1]")
	 private WebElement profilepwd;
	 
	 @FindBy(partialLinkText="Change Passwo")
	 private WebElement profilechangepwd;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[5]/div[1]/input[1]")
	 private WebElement profilephone;
	 
	 @FindBy(xpath="//input[@id='DD/MM/YYYY']")
	 private WebElement profiledob;
	 
	 @FindBy(xpath="//label[contains(text(),'Male')]")
	 private WebElement profilmen;
	 
	 @FindBy(xpath="//label[contains(text(),'Female')]")
	 private WebElement profilefemale;
	 
	 @FindBy(xpath="//button[contains(text(),'SAVE CHANGES')]")
	 private WebElement profilesavebtn;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[3]")
	 private WebElement profileemailid;
	 
	 @FindBy(xpath="//span[contains(text(),'My Profile')]")
	 private WebElement MyProfile;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")
	 private WebElement MyProfilelabel;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[1]/div[1]/div[1]")
	 private WebElement popupchngpwdlabel;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
	 private WebElement oldpwdtxt;
	 
	 @FindBy(partialLinkText="Forgot Passwor")
	 private WebElement forgetpwdonpopuplink;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]")
	 private WebElement newpwdtxt;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[1]/div[1]/form[1]/div[4]/input[1]")
	 private WebElement confirmpwdtxt;
	 
	 @FindBy(xpath="//button[contains(text(),'UPDATE PASSWORD')]")
	 private WebElement updatepwdbtn;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[1]/div[1]/i[1]")
	 private WebElement crossicononpopup;
	 
		 
    public WebElement getusericon() {
		 
		 return usericon;
	 }
    public WebElement getmyaccount() {
		 
		 return myaccount;
	 }
    
    public WebElement getmyaccountlabel() {
		 
		 return myaccountlabel;
	 } 
    
    public WebElement getmywishlist() {
		 
		 return mywishlist;
	 }
    
    public WebElement getmyorders() {
		 
		 return myorders;
	 }
    
    public WebElement getmyorderlabel() {
		 
		 return myorderlabel;
	 }
    public WebElement getmywallet() {
		 
		 return mywallet;
	 }
    
    public WebElement getmywalletlabel() {
		 
		 return mywalletlabel;
	 }
    
    public WebElement getusewalletlink() {
		 
		 return usewalletlink;
	 }
    
    public WebElement getBwkwalletuse() {
		 
		 return Bwkwalletuse;
	 }
    public WebElement getmyorderinfo() {
		 
		 return myorderinfo;
	 }
    public WebElement getorderhlpcta() {
		 
		 return orderhlpcta;
	 } 
    public WebElement getcancelcta() {
		 
		 return cancelcta;
	 } 
    
    
     public WebElement getBacktomyorder() {
		 
		 return Backtomyorder;
	 } 
public WebElement getbacktomyaccount() {
		 
		 return backtomyaccount;
	 } 

public WebElement getnoorderstxt() {
	 
	 return noorderstxt;
} 

public WebElement getcntshpcta() {
	 
	 return cntshpcta;
} 

public WebElement getclosembverifcationpopup() {
	 
	 return closembverifcationpopup;
} 

public WebElement getMyaddresses() {
	 
	 return Myaddresses;
	 
} 

public WebElement getMyaddresseslabel(){
	return Myaddresseslabel;
}    

public WebElement getAddNewAdd(){
	return AddNewAdd;
}
public WebElement getDeliveryInfoLabel(){
	return DeliveryInfoLabel;
}
public WebElement getReceiverNametxt(){
	return ReceiverNametxt;
}

public WebElement getPincodetxt(){
	return Pincodetxt;
}

public WebElement getPhonenotxt(){
	return Phonenotxt;
}

public WebElement getAddresstxt(){
	return Addresstxt;
}

public WebElement getLocalitytxt(){
	return Localitytxt;
}
public WebElement getcitytxt(){
	return citytxt;
}
public WebElement getstatetxt(){
	return statetxt;
}
public WebElement gethome(){
	return home;
}
public WebElement getoffice(){
	return office;
}

public WebElement getother(){
	return other;
}

public WebElement getcnlctaaddpage(){
	return cnlctaaddpage;
}
public WebElement getsaveaddbtnaddpage(){
	return saveaddbtnaddpage;	
	
}
public WebElement getfullnamereq(){
	return fullnamereq;	
	
}

public WebElement getphonenoreq(){
	return phonenoreq;	
	
}

public WebElement getpincodereq(){
	return pincodereq;	
	
}

public WebElement getaddressreq(){
	return addressreq;	
	
}

public WebElement getLocalityreq(){
	return Localityreq;	
	
}

public WebElement getcityreq(){
	return cityreq;	
	
}

public WebElement getstatereq(){
	return statereq;	
	
}
public WebElement getaddtypereq(){
	return addtypereq;	
	
}

public WebElement getremoveadd(){
	return removeadd;	
	
}


public WebElement geteditadd(){
	return editadd;	
	
}

public WebElement getprofilefirstname(){
	return profilefirstname;	
	
}

public WebElement getprofilelastname(){
	return profilelastname;	
	
}
public WebElement getprofilepwd(){
	return profilepwd;	
	
}
public WebElement getprofilechangepwd(){
	return profilechangepwd;	
	
}
public WebElement getprofilephone(){
	return profilephone;	
	
}
public WebElement getprofiledob(){
	return profiledob;	
	
}

public WebElement getprofilmen(){
	return profilmen;	
	
}

public WebElement getprofilefemale(){
	return profilefemale;	
	
}
public WebElement getprofilesavebtn(){
	return profilesavebtn;	
	
}
public WebElement getprofileemailid(){
	return profileemailid;	
	
}
public WebElement getMyProfile(){
	return MyProfile;	
	
}

public WebElement getMyProfilelabel(){
	return MyProfilelabel;	
	
}

public WebElement getpopupchngpwdlabel(){
	return popupchngpwdlabel;	
	
}
public WebElement getoldpwdtxt(){
	return oldpwdtxt;	
	
}
public WebElement getforgetpwdonpopuplink(){
	return forgetpwdonpopuplink;	
	
}
public WebElement getnewpwdtxt(){
	return newpwdtxt;	
	
}
public WebElement getconfirmpwdtxt(){
	return confirmpwdtxt;	
	
}
public WebElement getupdatepwdbtn(){
	return updatepwdbtn;	
	
}
public WebElement getcrossicononpopup(){
	return crossicononpopup;	
	
}

public WebElement getlogout() {
		 
		 return logout;
	 }

}

