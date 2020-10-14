package pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLocators {
	
	WebDriver driver;
	 public LoginLocators(WebDriver driver ) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);		

}
	 @FindBy(id="loginLink")
	 private WebElement login;
	 
	 @FindBy(id="mob_email_id")
	 private WebElement email;
	 
	 @FindBy(id="mob_password")
	 private WebElement password;
	 
	 @FindBy(id="mob_continue_submit")
	 private WebElement loginbutton;
	 
	 @FindBy(id="mob_forgot_password_link")
	 private WebElement forgotpassword;
	 
	 @FindBy(id="mob_sign_up")
	 private WebElement signup;
	 
	 @FindBy(id="mob_forgot_password_email")
	 private WebElement forgotemailid;
	 
	 @FindBy(id="mob_forgot_password_submit")
	 private WebElement submitforgotemailid;
	 
	 @FindBy(xpath="//div[contains(text(),'A reset password link is sent to priyanka.singh@be')]")
	 private WebElement resetmsg;
	 
	 @FindBy(xpath="//button[contains(text(),'BACK TO LOGIN')]")
	 private WebElement backtologin;
	 
	 @FindBy(className="fbLogin")
	 private WebElement fblogin;
	 
	 @FindBy(id="email")
	 private WebElement fbemail;
	 
	 @FindBy(id="pass")
	 private WebElement fbpwd;
	 
	 @FindBy(id="loginbutton")
	 private WebElement fbloginbtn;
	 
	 @FindBy(id="mob_google_loginn")
	 private WebElement gmaillogin;
	 
	 @FindBy(xpath="//div[contains(text(),'priyanka singh')]")
	 private WebElement mygmailaccount;
	 
	 
	 public WebElement getlogin() {
		 
		 return login;
	 }
	public WebElement getemail() {
		 
		 return email;
	 }
	
     public WebElement getpassword() {
		 
		 return password;
	}
	
	public WebElement getloginbutton() {
		 
		 return loginbutton;
	}
	public WebElement getsignup() {
		 
		 return signup;
	}
	
	public WebElement getforgetpassword() {
		 
		 return forgotpassword;
	}
	
	public WebElement getforgetemailid() {
		 
		 return forgotemailid;
	}
	
	public WebElement getsubmitforgetemailid() {
		 
		 return submitforgotemailid;
	}
	
	public WebElement getresetmsg() {
		 
		 return resetmsg;
	}
	public WebElement getbacktologin() {
		 
		 return backtologin;
	}
	
	public WebElement getfblogin() {
		 
		 return fblogin;
	}
	public WebElement getfbemail() {
		 
		 return fbemail;
	}
	public WebElement getfbpwd() {
		 
		 return fbpwd;
	}
	public WebElement getfbloginbtn() {
		 
		 return fbloginbtn;
	}
	public WebElement getgmaillogin() {
		 
		 return gmaillogin;
	}
	
	public WebElement getmygmailaccount() {
		 
		 return mygmailaccount;
	}
		 
}
