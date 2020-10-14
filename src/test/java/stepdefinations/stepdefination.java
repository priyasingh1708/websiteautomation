package stepdefinations;


import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import cucumber.api.junit.Cucumber;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobject.LoginLocators;
import pageobject.myaccountLocators;
import pageobject.signuplocator;
import resources.base;

@RunWith(Cucumber.class)

public class stepdefination extends base{
	LoginLocators L;
	signuplocator sl;
	myaccountLocators A;
	WebDriver driver;
	
	 @Given("^user starts the browser and enters the url$")
	    public void user_starts_the_browser_and_enters_the_url() throws Throwable {
	    	driver=BrowserConfig();
	    	driver.get(prop.getProperty("url"));
	    }

	    @Then("^user click on login button$")
	    public void user_click_on_login_button() throws Throwable {
	       L=new LoginLocators(driver);
	       try {
	       WaitForWebelement(L.getlogin());
	       Assert.assertTrue(L.getlogin().isDisplayed(), "login button is displayed");
	       L.getlogin().click();
	       Thread.sleep(4000);
	       }catch(Exception e) {
	    	   
	       }
	       
	    }
	    @Then("^user enters email as \"([^\"]*)\"$")
	    public void user_enters_email_as(String username) throws Throwable {
	    	try {
	     WaitForWebelement(L.getemail());
	     L.getemail().sendKeys(username);
	     Assert.assertTrue(L.getemail().isDisplayed());
	     Thread.sleep(3000);
	    	} catch(Exception e) {}
	    }
	    
	    @Then("^user enters mobilenumber as \"([^\"]*)\"$")
	    public void user_enters_mobilenumber_as(String number) throws Throwable {
	    	try {
	     WaitForWebelement(L.getemail());
	     L.getemail().sendKeys(number);
	     Assert.assertTrue(L.getemail().isDisplayed());
	     Thread.sleep(3000);
	    	} catch(Exception e) {}
	    }
	    @Then("^user clicks on contuine$")
	      public void user_clicks_on_contuine() throws Throwable {
	       	L.getloginbutton().click();
	       	Thread.sleep(2000);
	        }  
	    
	    @Then("^user enters password as \"([^\"]*)\"$")
		   public void user_enters_password_as(String password) throws Throwable {
		    	 try {
		    	WaitForWebelement(L.getpassword());
		    	Assert.assertTrue(L.getpassword().isDisplayed());
		    	L.getpassword().sendKeys((password));
		    	Assert.assertTrue(L.getpassword().isDisplayed());
		    	L.getloginbutton().click();
			    Thread.sleep(3000);  
		    	 } catch(Exception e)  {}    
		    }
	    
	    @Then("^user click on forget password link$")
		   public void user_click_on_forget_password_link() throws Throwable {
		    	 try {
		    	WaitForWebelement(L.getforgetpassword());
		    	Assert.assertTrue(L.getforgetpassword().isDisplayed());
		    	L.getforgetpassword().click();
			    Thread.sleep(3000);  
		    	 } catch(Exception e)  {}    
		    }
		   
		 @Then("^user enter email for forget password link as \"([^\"]*)\"$")
		   public void user_enter_email_for_forget_password_link_as(String username) throws Throwable {
			 try {
			    	WaitForWebelement(L.getforgetemailid());
			    	Assert.assertTrue(L.getforgetemailid().isDisplayed());
			    	L.getforgetemailid().sendKeys((username));
			    	L.getforgetemailid().click();
				    Thread.sleep(3000);  
			    	 } catch(Exception e)  {}    
			    }
		   
		   @Then("^user click on submit button$")
				   public void user_click_on_submit_button() throws Throwable {
				    	 try {
				    	WaitForWebelement(L.getsubmitforgetemailid());
				    	Assert.assertTrue(L.getsubmitforgetemailid().isDisplayed());
				    	L.getsubmitforgetemailid().click();
					    Thread.sleep(3000);  
				    	 } catch(Exception e)  {}    
				    }
		   
		   @Then("^verify reset msg visible$")
		   public void verify_reset_msg_visible() throws Throwable {
			 try {
			    	WaitForWebelement(L.getresetmsg());
			    	Assert.assertTrue(L.getresetmsg().isDisplayed());
				    Thread.sleep(3000);  
			    	 } catch(Exception e)  {}    
			    }
		   @Then("^user click on back to login button$")
		   public void user_click_on_back_to_login_button() throws Throwable {
		    	 try {
		    	WaitForWebelement(L.getbacktologin());
		    	Assert.assertTrue(L.getbacktologin().isDisplayed());
		    	L.getbacktologin().click();
			    Thread.sleep(3000);  
		    	 } catch(Exception e)  {}    
		    	 
		    }
		 
		   
		   @Then("^user click on Facebook$")
		   public void user_click_on_Facebook() throws Throwable {
		    	 try {
		    	WaitForWebelement(L.getfblogin());
		    	Assert.assertTrue(L.getfblogin().isDisplayed());
		    	L.getfblogin().click();
			    Thread.sleep(3000);  
		    	 } catch(Exception e)  {}    
		    	 
		    }
		   @Then("^user enters fbemail as \"([^\"]*)\"$")
		    public void user_enters_fbemail_as(String username) throws Throwable {
		    	try {
		     WaitForWebelement(L.getfbemail());
		     L.getfbemail().sendKeys(username);
		     Assert.assertTrue(L.getfbemail().isDisplayed());
		     Thread.sleep(3000);
		    	} catch(Exception e) {}
		    }
		    
		    
		    @Then("^user enters fbpassword as \"([^\"]*)\"$")
			   public void user_enters_fbpassword_as(String password) throws Throwable {
			    	 try {
			    	WaitForWebelement(L.getfbpwd());
			    	Assert.assertTrue(L.getfbpwd().isDisplayed());
			    	L.getfbpwd().sendKeys((password));
			    	Assert.assertTrue(L.getfbpwd().isDisplayed());
				    Thread.sleep(3000);  
			    	 } catch(Exception e)  {}    
			    }
		    
		   
		   @Then("^user click on LogIn button$")
		   public void user_click_on_LogIn_button() throws Throwable {
		    	 try {
		    	WaitForWebelement(L.getfbloginbtn());
		    	Assert.assertTrue(L.getfbloginbtn().isDisplayed());
		    	L.getfbloginbtn().click();
			    Thread.sleep(1000);  
		    	 } catch(Exception e)  {}    
		    	 
		    }
		   
		   @Then("^user click on Gmail$")
		   public void user_click_on_Gmail() throws Throwable {
		    	 try {
		    	WaitForWebelement(L.getgmaillogin());
		    	Assert.assertTrue(L.getgmaillogin().isDisplayed());
		    	L.getgmaillogin().click();
			    Thread.sleep(2000);  
		    	 } catch(Exception e)  {}    
		    	 
		    }		    
		    @Then("^user select Gmailaccount$")
			   public void user_select_Gmailaccount() throws Throwable {
		    	L=new LoginLocators(driver);
			    	 try {
			    	WaitForWebelement(L.getmygmailaccount());
			    	Assert.assertTrue(L.getmygmailaccount().isDisplayed());
			    	L.getmygmailaccount().click();
				    Thread.sleep(3000);  
			    	 } catch(Exception e)  {}    
			    	 
			    }
		    
		    @Then("^user click on signup link$")
		      public void user_click_on_signup_link() throws Throwable {
		    	sl=new signuplocator(driver);
		        try {
		        	WaitForWebelement(sl.getsignup());
		        	Assert.assertTrue(sl.getsignup().isDisplayed());
		        	sl.getsignup().click();
		        	Thread.sleep(3000); 
		        }catch(Exception e)  {}  
		    
		        }    
		    
		      @Then("^user click on signup with mobile$")
		      public void user_click_on_signup_with_mobile() throws Throwable {
		    	  sl=new signuplocator(driver);
		          try {
			        	WaitForWebelement(sl.getsignwithmobile());
			        	Assert.assertTrue(sl.getsignwithmobile().isDisplayed());
			        	sl.getsignwithmobile().click();
			            Thread.sleep(3000); 
			        }catch(Exception e)  {}  
		      }

		      @Then("^user enter firstname as \"([^\"]*)\"$")
		      public void user_enter_firstname_as(String Firstname) throws Throwable {
		    	  try {
		    		  WaitForWebelement(sl.getFirstname());
		    		  Assert.assertTrue(sl.getFirstname().isDisplayed());		    		  
		    		  sl.getFirstname().sendKeys(Firstname);
		    		  Thread.sleep(3000); 
		    	  }catch(Exception e)  {}  
		    	  
		      }
		    	  
		      

		      @Then("^user enter lastname as \"([^\"]*)\"$")
		      public void user_enter_lastname_as(String Lastname) throws Throwable {
		    	  try{
		    		  WaitForWebelement(sl.getlastname());
		    		  sl.getlastname().sendKeys(Lastname);	
		    		  Assert.assertTrue(sl.getlastname().isDisplayed());
		    		  Thread.sleep(3000); 
		    	  
		    	  }catch(Exception e)  {}
		    	  
		      }
		      
		      
		      @Then("^user enter mobileno as \"([^\"]*)\"$")
		      public void user_enter_mobileno_as(String mobile) throws Throwable {
		    	  try {
		    		  WaitForWebelement(sl.getmobile());
		    		  sl.getmobile().sendKeys(mobile);
		    		  Assert.assertTrue(sl.getmobile().isDisplayed());
		    		  Thread.sleep(3000); 
		    	  }catch(Exception e) {}
		    	  
		      }
		      
		      @Then("^user enter email as \"([^\"]*)\"$")
		      public void user_enter_email_as(String email) throws Throwable {
		    	  try {
		    		  WaitForWebelement(sl.getsignemail());
		    		  sl.getsignemail().sendKeys(email);
		    		  Assert.assertTrue(sl.getsignemail().isDisplayed());
		    	      Thread.sleep(3000);
		    	  }catch(Exception e) {}
		      }
		      
		      @Then("^user enter password as \"([^\"]*)\"$")
		      public void user_enter_password_as(String password) throws Throwable {
		    	  try {
		    		  WaitForWebelement(sl.getsignpassword());
		    		  sl.getsignpassword().sendKeys(password);
		    		  Assert.assertTrue(sl.getsignpassword().isDisplayed());
		    		   Thread.sleep(3000);
		    	  }catch(Exception e) {}
		      }
		      
		      @Then("^user click on female button$")
		      public void user_click_on_female_button() throws Throwable {
		          try {
		    		  WaitForWebelement(sl.getfemale());
		    		  sl.getfemale().click();
		    		  Assert.assertTrue(sl.getfemale().isDisplayed());
		    		   Thread.sleep(3000);
		    	  }catch(Exception e) {}
		      }
		      @Then("^user click on final button$")
		      public void user_click_on_final_button() throws Throwable {
		    	  try {
		    		  WaitForWebelement(sl.getsignupbutton());
		    		  Assert.assertTrue(sl.getsignupbutton().isDisplayed());
			    	  sl.getsignupbutton().click();
			          Thread.sleep(3000);
		    		  
		    	  }catch(Exception e) {}
		    	  
		      }
		      
		      
		        
		      @Then("^user click on Signup with Gmail$")
		      public void user_click_on_Signup_with_Gmail() throws Throwable {
		    	  try {
		    		  WaitForWebelement(sl.getsignupgoogle());
		    		  Assert.assertTrue(sl.getsignupgoogle().isDisplayed());
			    	  sl.getsignupgoogle().click();
			          Thread.sleep(3000);
		    		  
		    	  }catch(Exception e) {}
		    	  
		      }
		      
		      @Then("^user get validation for firstname and lastname$")
		      public void user_get_validation_for_firstname_and_lastname() throws Throwable {
		    	  try {
		    		  WaitForWebelement(sl.getvalidatename());
		    		  Assert.assertTrue(sl.getsignupgoogle().isDisplayed());
			          Thread.sleep(3000);
		    		  
		    	  }catch(Exception e) {}
		    	  
		      }
		      
		      
		      @Then("^user get validation for email$")
		      public void user_get_validation_for_email() throws Throwable {
		    	  try {
		    		  WaitForWebelement(sl.getvalidatemail());
		    		  Assert.assertTrue(sl.getvalidatemail().isDisplayed());
			          Thread.sleep(3000);
		    		  
		    	  }catch(Exception e) {}
		    	  
		      }
		          
		      @Then("^user get validation for mobile$")
		      public void user_get_validation_for_mobile() throws Throwable {
		    	  try {
		    		  WaitForWebelement(sl.getvalidatmobile());
		    		  Assert.assertTrue(sl.getvalidatmobile().isDisplayed());
			          Thread.sleep(3000);
		    		  
		    	  }catch(Exception e) {}
		    	  
		      }
		      
		      @Then("^user get validation for password$")
		      public void user_get_validation_for_password() throws Throwable {
		    	  try {
		    		  WaitForWebelement(sl.getvalidatpwd());
		    		  Assert.assertTrue(sl.getvalidatpwd().isDisplayed());
			          Thread.sleep(3000);
		    		  
		    	  }catch(Exception e) {}
		    	  
		      }
		      		      
		      @Then("^user get validation for min length pwd$")
		      public void user_get_validation_for_min_length_pwd() throws Throwable {
		    	  try {
		    		  WaitForWebelement(sl.getlengthpwd());
		    		  Assert.assertTrue(sl.getlengthpwd().isDisplayed());
			          Thread.sleep(3000);
		    		  
		    	  }catch(Exception e) {}
		      }
		      @Then("^user verify profile icon and account details$")
		     
		      public void user_verify_profile_icon_and_account_details() throws Throwable {
		    	  A=new myaccountLocators(driver);
		    	  try {
		    		  WaitForWebelement(A.getusericon());
		    		  Assert.assertTrue(A.getusericon().isDisplayed());
			    	  A.getusericon().click();
			    	  A.getmyaccount().click();
			    	  Assert.assertTrue(A.getmyaccountlabel().isDisplayed());
			          Thread.sleep(3000);
		    		  
		    	  }catch(Exception e) {}
		    	  
		      }
		         
		      @Then("^user click profile icon$")
			     
		      public void user_clcik_profile_icon() throws Throwable {
		    	  try {
		    		  WaitForWebelement(A.getusericon());
		    		  Assert.assertTrue(A.getusericon().isDisplayed());
			    	  A.getusericon().click();
			          Thread.sleep(3000);
		    		  
		    	  }catch(Exception e) {}
		    	  
		      }
		      
		      
		    @Then("^user verify myaccount option is visible$")
		      public void user_verify_myaccount_option_is_visible() throws Throwable {
		    	  try {
		    		  WaitForWebelement(A.getmyaccount());
		    		  Assert.assertTrue(A.getmyaccount().isDisplayed());
			          Thread.sleep(3000);
		    		  
		    	  }catch(Exception e) {}
		      }  
		    
		    @Then("^user verify mywishlist option is visible$")
		      public void user_verify_mywishlist_option_is_visible() throws Throwable {
		    	  try {
		    		  WaitForWebelement(A.getmywishlist());
		    		  Assert.assertTrue(A.getmywishlist().isDisplayed());
			          Thread.sleep(3000);
		    		  
		    	  }catch(Exception e) {}
		      }  
		    
		    @Then("^user verify myorder option is visible$")
		      public void user_verify_myorder_option_is_visible() throws Throwable {
		    	  try {
		    		  WaitForWebelement(A.getmyorders());
		    		  Assert.assertTrue(A.getmyorders().isDisplayed());
			          Thread.sleep(3000);
		    		  
		    	  }catch(Exception e) {}
		      } 
		    
		    @Then("^user verify mywallet option is visible$")
		      public void user_verify_mywallet_option_is_visible() throws Throwable {
		    	  try {
		    		  WaitForWebelement(A.getmywallet());
		    		  Assert.assertTrue(A.getmywallet().isDisplayed());
			          Thread.sleep(3000);
		    		  
		    	  }catch(Exception e) {}
		      }  
		    
		    @Then("^user verify logout option is visible$")
		      public void user_verify_logout_option_is_visible() throws Throwable {
		    	  try {
		    		  WaitForWebelement(A.getlogout());
		    		  Assert.assertTrue(A.getlogout().isDisplayed());
			          Thread.sleep(3000);
		    		  
		    	  }catch(Exception e) {}
		      }  
		    @Then("^user click profile icon and wallet details$")
		     
		      public void user_click_profile_icon_and_wallet_details() throws Throwable {
		    	A=new myaccountLocators(driver);
		    	  try {
		    		  WaitForWebelement(A.getusericon());
		    		  Assert.assertTrue(A.getusericon().isDisplayed());
			    	  A.getusericon().click();
			    	  A.getmywallet().click();
			    	  Assert.assertTrue(A.getmywallet().isDisplayed());
			    	  A.getusewalletlink().click();
			    	  Assert.assertTrue(A.getBwkwalletuse().isDisplayed());
			          Thread.sleep(3000);
		    		  
		    	  }catch(Exception e) {}
		    	  
		      }
		    
		    @Then("^user click profile icon and order details$")
		     
		      public void user_click_profile_icon_and_order_details() throws Throwable {
		    	A=new myaccountLocators(driver);
		    	  try {
		    		  WaitForWebelement(A.getusericon());
		    		  Assert.assertTrue(A.getusericon().isDisplayed());
			    	  A.getusericon().click();
			    	  A.getmyorders().click();
			    	  Assert.assertTrue(A.getmyorderlabel().isDisplayed());
			    	  A.getmyorderinfo().click();
			    	  Assert.assertTrue(A.getcancelcta().isDisplayed());
			    	  //A.getorderhlpcta().click();
			    	  Assert.assertTrue(A.getorderhlpcta().isDisplayed());
			    	  Assert.assertTrue(A.getBacktomyorder().isDisplayed());
			    	  A.getBacktomyorder().click();
			    	  Assert.assertTrue(A.getmyorderlabel().isDisplayed());
			    	  
			          Thread.sleep(3000);
		    		  
		    	  }catch(Exception e) {}
		    	  
		      }
		    
	    @Then("^user close the browser$")
		   public void user_close_the_browser() throws Throwable {
		    	    driver.close();   
		    	    }
		   
}
