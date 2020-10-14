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
	 
	 @FindBy(id="web_logout")
	 private WebElement logout ;
	 
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
    public WebElement getlogout() {
		 
		 return logout;
	 }

}

