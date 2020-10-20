package pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MywishlistLocators {
	
	WebDriver driver;
	 public MywishlistLocators(WebDriver driver ) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);		
}
	 @FindBy(xpath="//header/div[2]/div[1]/div[3]/div[1]/div[1]/span[2]/div[1]/div[1]/i[1]")
	 private WebElement wishlisticon;
	 
	 @FindBy(xpath="//p[contains(text(),'Log In')]")
	 private WebElement loginlabel;
	 
	 @FindBy(xpath="//div[contains(text(),'WISHLIST')]")
	 private WebElement wishlistlabel;
	 
	 @FindBy(id="testCatHeart")
	 private WebElement plpwishlisticon;
	 
	 @FindBy(id="testCatHeartYellow")
	 private WebElement plpyellowwishlisticon;
	 
	 @FindBy(id="testWishButton")
	 private WebElement pdpwishlisticon;

	 @FindBy(id="testWishButtonFilled")
	 private WebElement pdpyellowwishlisticon;
     
	 @FindBy(id="testWishlistProduct_0")
	 private WebElement firtproductofmywishlist;
	 
	 @FindBy(id="icon_close icon_close")
	 private WebElement closeicononmywishlist;
	 
	 @FindBy(className="addToCartBtn")
	 private WebElement mvtobag;
	 
	 @FindBy(className="namePriceWrapper")
	 private WebElement mrppriceofproduct;
	 
	 @FindBy(className="loyaltyPriceBox")
	 private WebElement loyaltylpriceofproduct;
	 
	 @FindBy(xpath="//div[contains(text(),'Your Wishlist is Empty !')]")
	 private WebElement emptywishlist;
	 
	 @FindBy(xpath="//div[contains(text(),'Continue Shopping')]")
	 private WebElement cntshpwishlist;
	 
	 @FindBy(id="smallText")
	 private WebElement tryothercategoryoption;
	 
	 @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/img[1]")
	 private WebElement emptywishlistimg;
	 
	
	 
    public WebElement getwishlisticon() {
		 
		 return wishlisticon;
	 }
    
    public WebElement getloginlabel() {
		 
		 return loginlabel;
	 }
    
    public WebElement getwishlistlabel() {
		 
		 return wishlistlabel;
	 }
    
    public WebElement getplpwishlisticon() {
		 
		 return plpwishlisticon;
	 }
    public WebElement getplpyellowwishlisticon() {
		 
		 return plpyellowwishlisticon;
	 }
    public WebElement getpdpwishlisticon() {
		 
		 return pdpwishlisticon;
	 }
    public WebElement getpdpyellowwishlisticon() {
		 
		 return pdpyellowwishlisticon;
	 }
    public WebElement getfirtproductofmywishlist() {
		 
		 return firtproductofmywishlist;
	 }
    
    public WebElement getcloseicononmywishlist() {
		 
		 return closeicononmywishlist;
	 }
    public WebElement getmvtobag() {
		 
		 return mvtobag;
	 }
    public WebElement getmrppriceofproduct() {
		 
		 return mrppriceofproduct;
	 }
    
    public WebElement getloyaltylpriceofproduct() {
		 
		 return loyaltylpriceofproduct;
	 }
    public WebElement getemptywishlist() {
		 
		 return emptywishlist;
	 }
    public WebElement getcntshpwishlist() {
		 
		 return cntshpwishlist;
	 }
    
    public WebElement gettryothercategoryoption() {
		 
		 return tryothercategoryoption;
	 }
    public WebElement getemptywishlistimg() {
		 
		 return emptywishlistimg;
	 }
    
}
