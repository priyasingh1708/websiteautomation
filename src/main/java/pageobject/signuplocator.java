package pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class signuplocator {
	WebDriver driver;
	 public signuplocator(WebDriver driver ) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);		

}
	
	@FindBy(id="mob_sign_up")
	 private WebElement signup;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
	 private WebElement signwithmobile;
	 
	 @FindBy(xpath="//input[@name='fname']")
	 private WebElement Firstname;
	 
	 @FindBy(xpath="//input[@name='lname']")
	 private WebElement lastname;
	 
	 @FindBy(xpath="//input[@name='mobile']")
	 private WebElement mobile;
	 
	 @FindBy(xpath="//input[@name='email']")
	 private WebElement signemail;
	 
	 @FindBy(xpath="//input[@name='password']")
	 private WebElement signpassword;
	 
	 @FindBy(xpath="//span[contains(text(),'Female')]")
	 private WebElement female;
	 
	 @FindBy(xpath="//button[contains(text(),'Sign Up')]")
	 private WebElement signupbutton;
	 
	 @FindBy(id="web_google_login")
	 private WebElement signupgoogle;
	 
	 @FindBy(xpath="//p[contains(text(),'First and last name required')]")
	 private WebElement validatename;
	 
	 @FindBy(xpath="//p[contains(text(),'Email Id is required')]")
	 private WebElement validatemail;
	 
	 @FindBy(xpath="//p[contains(text(),'Password is required')]")
	 private WebElement validatpwd;
	 
	 @FindBy(xpath="//p[contains(text(),'Mobile is required')]")
	 private WebElement validatmobile;
	 
	 @FindBy(xpath="//p[contains(text(),'Enter at least 6 characters')]")
	 private WebElement lengthpwd;
	 
	 public WebElement getsignup() {
		 
		 return signup;
	 }
    public WebElement getsignwithmobile() {
		 
		 return signwithmobile;
	 }
    public WebElement getFirstname() {
		 
		 return Firstname;
	 }
    public WebElement getlastname() {
		 
		 return lastname;
	 }
    public WebElement getmobile() {
		 
		 return mobile;
	 }
    public WebElement getsignemail() {
		 
		 return signemail;
	 }
    public WebElement getsignpassword() {
		 
		 return signpassword;
	 }
    public WebElement getfemale() {
		 
		 return female;
	 }
    public WebElement getsignupbutton() {
		 
		 return signupbutton;
	 }
    public WebElement getsignupgoogle() {
		 
		 return signupgoogle;
	 }
    
    public WebElement getvalidatename() {
		 
		 return validatename;
	 }
    
    public WebElement getvalidatpwd() {
		 
		 return validatpwd;
	 }
    public WebElement getvalidatmobile() {
		 
		 return validatmobile;
	 }
    public WebElement getvalidatemail() {
		 
		 return validatemail;
	 }
public WebElement getlengthpwd() {
		 
		 return lengthpwd;
	 }
}

