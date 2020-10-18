package stepdefinations;


import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import cucumber.api.junit.Cucumber;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobject.LoginLocators;
import pageobject.MywishlistLocators;
import pageobject.myaccountLocators;
import pageobject.signuplocator;
import resources.base;

@RunWith(Cucumber.class)

public class stepdefination extends base{
	LoginLocators L;
	signuplocator sl;
	myaccountLocators A;
	MywishlistLocators W;
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
	    	L=new LoginLocators(driver);
	    	try {
	     WaitForWebelement(L.getemail());
	     L.getemail().click();
	     L.getemail().sendKeys(number);
	     Assert.assertTrue(L.getemail().isDisplayed());
	     Thread.sleep(3000);
	    	} catch(Exception e) {}
	    }
	    @Then("^user clicks on continue$")
	      public void user_clicks_on_continue() throws Throwable {
	    	try {
	       	L.getloginbutton().click();
	       	Thread.sleep(3000);
	    	} catch(Exception e) {}
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
		    
		    @Then("^user click profile icon and verify empty order page$")
		     
		      public void user_click_profile_icon_and_verify_empty_order_page() throws Throwable {
		    	A=new myaccountLocators(driver);
		    	  try {
		    		  WaitForWebelement(A.getusericon());
		    		  Assert.assertTrue(A.getusericon().isDisplayed());
			    	  A.getusericon().click();
			    	  A.getmyorders().click();
			    	  Assert.assertTrue(A.getmyorderlabel().isDisplayed());
			    	  Assert.assertTrue(A.getbacktomyaccount().isDisplayed());
			    	  Assert.assertTrue(A.getnoorderstxt().isDisplayed());
			    	  Assert.assertTrue(A.getcntshpcta().isDisplayed());
			    	  A.getcntshpcta().click();
			          Thread.sleep(3000);
		    		  
		    	  }catch(Exception e) {}
		    	  
		      }
		    @Then("^user click profile icon and verify address page fields$")
		     
		      public void user_click_profile_icon_and_verify_address_page_fields() throws Throwable {
		    	A=new myaccountLocators(driver);
		    	  try {
		    		  WaitForWebelement(A.getusericon());
		    		  Assert.assertTrue(A.getusericon().isDisplayed());
			    	  A.getusericon().click();
			    	  A.getmyaccount().click();
			    	  Assert.assertTrue(A.getmyaccountlabel().isDisplayed());
			    	  Assert.assertTrue(A.getMyaddresses().isDisplayed());
			    	  A.getMyaddresses().click();
			    	  Assert.assertTrue(A.getMyaddresseslabel().isDisplayed());
			    	  Assert.assertTrue(A.getAddNewAdd().isDisplayed());
			    	  A.getAddNewAdd().click();
			    	  Assert.assertTrue(A.getDeliveryInfoLabel().isDisplayed());
			    	  Assert.assertTrue(A.getReceiverNametxt().isDisplayed());
                      Assert.assertTrue(A.getPincodetxt().isDisplayed());
			    	  Assert.assertTrue(A.getPhonenotxt().isDisplayed());
			    	  Assert.assertTrue(A.getAddresstxt().isDisplayed());
			    	  Assert.assertTrue(A.getLocalitytxt().isDisplayed());
			    	  Assert.assertTrue(A.getcitytxt().isDisplayed());
			    	  Assert.assertTrue(A.getstatetxt().isDisplayed());
			    	  Assert.assertTrue(A.gethome().isDisplayed());
			    	  Assert.assertTrue(A.getoffice().isDisplayed());
			    	  Assert.assertTrue(A.getother().isDisplayed());
			    	  Assert.assertTrue(A.getcnlctaaddpage().isDisplayed());
			    	  Assert.assertTrue(A.getsaveaddbtnaddpage().isDisplayed());
			          Thread.sleep(3000);
		    		  
		    	  }catch(Exception e) {}
		    	  
		      }
		    
		    
		    @Then("^user click profile icon and click on myaddress$")
		     
		      public void user_click_profile_icon_and_click_on_myaddress() throws Throwable {
		    	A=new myaccountLocators(driver);
		    	  try {
		    		  WaitForWebelement(A.getusericon());
		    		  Assert.assertTrue(A.getusericon().isDisplayed());
			    	  A.getusericon().click();
			    	  A.getmyaccount().click();
			    	  Assert.assertTrue(A.getmyaccountlabel().isDisplayed());
			    	  Assert.assertTrue(A.getMyaddresses().isDisplayed());
			    	  A.getMyaddresses().click();
			    	  Assert.assertTrue(A.getMyaddresseslabel().isDisplayed());
			    	  Assert.assertTrue(A.getAddNewAdd().isDisplayed());
			    	  A.getAddNewAdd().click();
		    		  
		    	  }catch(Exception e) {}
		    	  
		      }		    
		    @Then("^user enter pincode as \"([^\"]*)\"$")
		      public void user_enter_pincode_as(String pincode) throws Throwable {
		    	  try {
		    		  WaitForWebelement(A.getPincodetxt());
		    		  Assert.assertTrue(A.getPincodetxt().isDisplayed());		    		  
		    		  A.getPincodetxt().sendKeys(pincode);
		    		  Thread.sleep(3000); 
		    	  }catch(Exception e)  {}  
		    	  
		      }
		    @Then("^user enter address as \"([^\"]*)\"$")
		      public void user_enter_address_as(String address) throws Throwable {
		    	  try {
		    		  WaitForWebelement(A.getAddresstxt());
		    		  Assert.assertTrue(A.getAddresstxt().isDisplayed());		    		  
		    		  A.getAddresstxt().sendKeys(address);
		    		  Thread.sleep(3000); 
		    	  }catch(Exception e)  {}  
		    	  
		      }
		    @Then("^user enter locality as \"([^\"]*)\"$")
		      public void user_enter_locality_as(String Locality) throws Throwable {
		    	  try {
		    		  WaitForWebelement(A.getLocalitytxt());
		    		  Assert.assertTrue(A.getLocalitytxt().isDisplayed());		    		  
		    		  A.getLocalitytxt().sendKeys(Locality);
		    		  A.gethome().click();
		    		  A.getsaveaddbtnaddpage().click();
		    		  A.getremoveadd().click();
		    		  Thread.sleep(3000); 
		    	  }catch(Exception e)  {}  
		    	  
		    }
		    
		    
		    @Then("^user click on save address btn and verify validation$")
		      public void user_click_on_save_address_btn_and_verify_validation() throws Throwable {
		    	  try {
		    		  A.getsaveaddbtnaddpage().click();
		    		  Assert.assertTrue(A.getfullnamereq().isDisplayed());
		    		  Assert.assertTrue(A.getphonenoreq().isDisplayed());
		    		  Assert.assertTrue(A.getpincodereq().isDisplayed());
		    		  Assert.assertTrue(A.getaddressreq().isDisplayed());
		    		  Assert.assertTrue(A.getLocalityreq().isDisplayed());
		    		  Assert.assertTrue(A.getcityreq().isDisplayed());
		    		  Assert.assertTrue(A.getstatereq().isDisplayed());
		    		  Assert.assertTrue(A.getaddtypereq().isDisplayed());
		    		  Thread.sleep(3000); 
		    	  }catch(Exception e)  {}  
		    	  
		    }
		    
		    @Then("^user navigate to myaddress page$")
		     public void user_navigate_to_myaddress_page() throws Throwable {
		    	A=new myaccountLocators(driver);
		    	  try {
			    	  A.getusericon().click();
			    	  A.getmyaccount().click();
			    	  Assert.assertTrue(A.getmyaccountlabel().isDisplayed());
			    	  Assert.assertTrue(A.getMyaddresses().isDisplayed());
			    	  A.getMyaddresses().click();
			    	  Assert.assertTrue(A.getMyaddresseslabel().isDisplayed());
			    	  Thread.sleep(3000); 
                     }catch(Exception e) {}
		    	  
		      }	
		     
		    @Then("^user click on Edit address$")
		      public void user_click_on_Edit_address() throws Throwable {
		    	  try {
		    		  Assert.assertTrue(A.geteditadd().isDisplayed());
		    		  A.geteditadd().click();
		    		  Thread.sleep(3000); 
		    	  }catch(Exception e)  {}  
		    	  
		    }
		    
		    @Then("^user update address as \"([^\"]*)\"$")
		      public void user_update_address_as(String address) throws Throwable {
		    	  try {
		    		  WaitForWebelement(A.getAddresstxt());
		    		  Assert.assertTrue(A.getAddresstxt().isDisplayed());		    		  
		    		  A.getAddresstxt().sendKeys(address);
		    		  A.getsaveaddbtnaddpage().click();
		    		  Thread.sleep(3000); 
		    	  }catch(Exception e)  {}  
		    	  
		    }
		    		    
		    @Then("^user navigate to myprofile page$")
		     public void user_navigate_to_myprofile_page() throws Throwable {
		    	A=new myaccountLocators(driver);
		    	  try {
			    	  A.getusericon().click();
			    	  A.getmyaccount().click();
			    	  Assert.assertTrue(A.getmyaccountlabel().isDisplayed());
			    	  Assert.assertTrue(A.getMyProfile().isDisplayed());
			    	  A.getMyProfile().click();
			    	  Assert.assertTrue(A.getMyProfilelabel().isDisplayed());
			    	  Thread.sleep(3000); 
                    }catch(Exception e) {}
		    	  
		      }			    
		    @Then("^user verify myprofile fields$")
		      public void user_verify_myprofile_fields() throws Throwable {
		    	  try {
		    		  Assert.assertTrue(A.getprofilefirstname().isDisplayed());
		    		  Assert.assertTrue(A.getprofilelastname().isDisplayed());
		    		  Assert.assertTrue(A.getprofileemailid().isDisplayed());
		    		  Assert.assertTrue(A.getprofilepwd().isDisplayed());
		    		  Assert.assertTrue(A.getprofilechangepwd().isDisplayed());
		    		  Assert.assertTrue(A.getprofilephone().isDisplayed());
		    		  Assert.assertTrue(A.getprofiledob().isDisplayed());
		    		  Assert.assertTrue(A.getprofilmen().isDisplayed());
		    		  Assert.assertTrue(A.getprofilefemale().isDisplayed());
		    		  Assert.assertTrue(A.getprofilesavebtn().isDisplayed());
		    		  Thread.sleep(3000); 
		    	  }catch(Exception e)  {}  
		    	  
		    }
		    @Then("^user update lastname as \"([^\"]*)\"$")
		      public void user_update_lastname_as(String lastname) throws Throwable {
		    	  try {
		    		  WaitForWebelement(A.getprofilelastname());
		    		  Assert.assertTrue(A.getprofilelastname().isDisplayed());		    		  
		    		  A.getprofilelastname().sendKeys(lastname);
		    		  A.getprofilesavebtn().click();
		    		  Thread.sleep(3000); 
		    	  }catch(Exception e)  {}  
		    	  
		    }
		   
		    
		    @Then("^user verify change password fields$")
		     public void user_verify_change_password_fields() throws Throwable {
		    	  try {
			    	  A.getusericon().click();
			    	  A.getmyaccount().click();
			    	  Assert.assertTrue(A.getmyaccountlabel().isDisplayed());
			    	  Assert.assertTrue(A.getMyProfile().isDisplayed());
			    	  A.getMyProfile().click();
			    	  Assert.assertTrue(A.getMyProfilelabel().isDisplayed());
			    	  Assert.assertTrue(A.getprofilechangepwd().isDisplayed());
			    	  A.getprofilechangepwd().click();
			    	  Assert.assertTrue(A.getpopupchngpwdlabel().isDisplayed());
			    	  Assert.assertTrue(A.getoldpwdtxt().isDisplayed());
			    	  Assert.assertTrue(A.getforgetpwdonpopuplink().isDisplayed());
			    	  Assert.assertTrue(A.getnewpwdtxt().isDisplayed());
			    	  Assert.assertTrue(A.getconfirmpwdtxt().isDisplayed());
			    	  Assert.assertTrue(A.getupdatepwdbtn().isDisplayed());
			    	  Assert.assertTrue(A.getcrossicononpopup().isDisplayed());
			    	  Thread.sleep(3000); 
                   }catch(Exception e) {}
		    	  
		      }	
		    @Then("^user enter oldpwd as \"([^\"]*)\"$")
		      public void user_enter_oldpwd_as(String oldpwd) throws Throwable {
		    	  try {
		    		  WaitForWebelement(A.getoldpwdtxt());
		    		  A.getoldpwdtxt().click();
                      A.getoldpwdtxt().sendKeys(oldpwd);
		    		  Thread.sleep(3000); 
		    	  }catch(Exception e)  {}  
		    	  
		    }
		    @Then("^user enter newpwd as \"([^\"]*)\"$")
		      public void user_enter_newpwd_as(String newpwd) throws Throwable {
		    	  try {
		    		  WaitForWebelement(A.getnewpwdtxt());
		    		  A.getnewpwdtxt().click();
		    		  A.getnewpwdtxt().sendKeys(newpwd);
		    		  Thread.sleep(3000); 
		    	  }catch(Exception e)  {}  
		    	  
		    }
		    @Then("^user enter confirmpwd as \"([^\"]*)\"$")
		      public void user_enter_confirmpwd_as(String confirmpwdpwd) throws Throwable {
		    	  try {
		    		  WaitForWebelement(A.getconfirmpwdtxt());
		    		  A.getconfirmpwdtxt().click();
		    		  A.getconfirmpwdtxt().sendKeys(confirmpwdpwd);
		    		  A.getupdatepwdbtn().click();
		    		  Thread.sleep(3000); 
		    	  }catch(Exception e)  {}  
		    	  
		    }
		    
		    @Then("^user click on wishlist icon and see loginpopup$")
		     public void user_click_on_wishlist_icon_and_see_loginpopup() throws Throwable {
		    	W=new MywishlistLocators(driver);
		    	  try {
		    		  WaitForWebelement(W.getwishlisticon());
		    		  W.getwishlisticon().click();
		    		  WaitForWebelement(W.getloginlabel());
		    		  Assert.assertTrue(W.getloginlabel().isDisplayed());
			    	  Thread.sleep(3000); 
                   }catch(Exception e) {}
		    	  
		      }			
		    
		    @Then("^user click on wishlist icon and navigate to mywishlist page$")
		     public void user_click_on_wishlist_icon_and_navigate_to_mywishlist_page() throws Throwable {
		    	  try {
		    		  WaitForWebelement(W.getwishlisticon());
		    		  W.getwishlisticon().click();
		    		  Assert.assertTrue(W.getwishlisticon().isDisplayed());
		    		  Thread.sleep(3000); 
                 }catch(Exception e) {}
		    	  
		      }	
		    @Then("^user open plp page$")
		      public void user_open_plp_page() throws Throwable {
		          driver.navigate().to("https://p6.bewakoof.com/men-t-shirts");
		      }
		    
		    @Then("^user click on plpwishlist icon and see loginpopup$")
		     public void user_click_on_plpwishlist_icon_and_see_loginpopup() throws Throwable {
		    	W=new MywishlistLocators(driver);
		    	  try {
		    		  WaitForWebelement(W.getplpwishlisticon());
		    		  W.getplpwishlisticon().click();
		    		  WaitForWebelement(W.getloginlabel());
		    		  Assert.assertTrue(W.getloginlabel().isDisplayed());
			    	  Thread.sleep(3000); 
                  }catch(Exception e) {}
		    	  
		      }	
		    
		    @Then("^user add product to wishlist$")
		     public void user_add_product_to_wishlist() throws Throwable {
		    	  try {
		    		  WaitForWebelement(W.getplpwishlisticon());
		    		  W.getplpwishlisticon().click();
		    		  Assert.assertTrue(W.getplpyellowwishlisticon().isDisplayed());
			    	  Thread.sleep(3000); 
                 }catch(Exception e) {}
		    	  
		      }	
		    
		    @Then("^user open product page$")
		      public void user_open_product_page() throws Throwable {
		          driver.navigate().to("https://p6.bewakoof.com/p/travel-minimal-half-sleeve-t-shirt-for-men");
		      }
		    
		    @Then("^user click on productwishlist icon and see loginpopup$")
		     public void user_click_on_productwishlist_icon_and_see_loginpopup() throws Throwable {
		    	W=new MywishlistLocators(driver);
		    	  try {
		    		  WaitForWebelement(W.getpdpwishlisticon());
		    		  W.getpdpwishlisticon().click();
		    		  WaitForWebelement(W.getloginlabel());
		    		  Assert.assertTrue(W.getloginlabel().isDisplayed());
			    	  Thread.sleep(3000); 
                 }catch(Exception e) {}
		    	  
		      }	
		    
		    
		    @Then("^verify product is added to wishlist$")
		     public void verify_product_is_added_to_wishlist() throws Throwable {
		    	  try {
		    		  WaitForWebelement(W.getpdpwishlisticon());
		    		  W.getpdpwishlisticon().click();
		    		  WaitForWebelement(W.getpdpyellowwishlisticon());
		    		  Assert.assertTrue(W.getpdpyellowwishlisticon().isDisplayed());
		    		  W.getpdpwishlisticon().click();
			    	  Thread.sleep(3000); 
                }catch(Exception e) {}
		    	  
		      }	
		   @Then("^user close the browser$")
		   public void user_close_the_browser() throws Throwable {
		    	    driver.close();   
		    	    }
		   
}
