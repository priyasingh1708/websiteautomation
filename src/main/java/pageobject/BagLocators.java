package pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BagLocators {
	
	WebDriver driver;
	 public BagLocators(WebDriver driver ) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);		

}
	 
	 @FindBy(id="testHeaderCart")
	 private WebElement BagIcon;
	 
	 @FindBy(xpath="//a[contains(text(),'Continue Shopping')]")
	 private WebElement continueShoppingEmptybagCTA;
	 
	 @FindBy(xpath="//div[contains(text(),'Nothing in the bag')]")
	 private WebElement NothingInTheBag;
	 
	 @FindBy(xpath="//div[@id='testSizes_M']")
	 private WebElement SizeSelected_M;
	 
	 @FindBy(xpath="//button[@id='addToCart']")
	 private WebElement AddtoBag;
	 
	 @FindBy(xpath="//span[@id='testRemoveCart']")
	 private WebElement RemovefromBag;
	 
	 @FindBy(xpath="//span[@id='testSavefrLater']")
	 private WebElement Saveforlater;
	 
	 @FindBy(xpath="//div[@id='testHaveGiftCard']")
	 private WebElement HaveaGiftCode;
	 
	 @FindBy(xpath="//button[contains(text(),'LOGIN')]")
	 private WebElement HaveaGiftCode_loginCTA;
	 
	//button[@id='web_continue_submit']
	
	 @FindBy(xpath="//button[contains(text(),'LOGIN')]")
	 private WebElement HaveaGiftcodeLogincta;
	 
	 
	 

	 	public WebElement BagIcon() {
	 		
		return BagIcon;
	}
	 	public WebElement continueShoppingEmptybagCTA() {
	 		
		return continueShoppingEmptybagCTA;
	}
	 	public WebElement nothinginTheBag() {
	 		
		return NothingInTheBag;
	}	
	 	public WebElement SizeSelected_M() {
	 		
		return SizeSelected_M;
	}
	 	public WebElement AddtoBag() {
	 		
			return AddtoBag;
	}
	 	public WebElement RemovefromBag() {
	 		
			return RemovefromBag;
	}
	 	public WebElement Saveforlater() {
	 		
			return Saveforlater;
	}
	 	public WebElement HaveaGiftCode() {
	 		
			return HaveaGiftCode;
	}
	 	public WebElement HaveaGiftcodeLogincta() {
	 		
			return HaveaGiftcodeLogincta;
	}
	 	
	 	
	 	
}
