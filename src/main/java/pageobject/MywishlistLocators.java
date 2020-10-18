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
}
