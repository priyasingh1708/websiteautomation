@Myaccount
Feature: validate Myaccount

#Scenario Outline: Verify change password 
    #Given user starts the browser and enters the url
    #Then user click on login button
    #Then user enters mobilenumber as "<number>"
    #Then user clicks on continue
    #Then user enters password as "<password>"
    #Then user navigate to myprofile page
    #Then user verify change password fields
    #Then user enter oldpwd as "<oldpwd>"
    #Then user enter newpwd as "<newpwd>"
    #Then user enter confirmpwd as "<confirmpwd>"
    #Then user close the browser
    #Examples:
    #|number|password|oldpwd|newpwd|confirmpwd|
    #|8888999999|123456|123456|123456|123456|    
    
#Scenario Outline: Verify by updating My Profile data
    #Given user starts the browser and enters the url
    #Then user click on login button
    #Then user enters mobilenumber as "<number>"
    #Then user clicks on continue
    #Then user enters password as "<password>"
    #Then user navigate to myprofile page
    #Then user update lastname as "<lastname>"
    #Then user close the browser
    #Examples:
    #|number|password|lastname|
    #|8888999999|123456|update|
    
#Scenario Outline: Verify My Profile 
    #Given user starts the browser and enters the url
    #Then user click on login button
    #Then user enters mobilenumber as "<number>"
    #Then user clicks on continue
    #Then user enters password as "<password>"
    #Then user navigate to myprofile page
    #Then user verify myprofile fields 
    #Then user close the browser
    #Examples:
    #|number|password|
    #|8888999999|123456|
    
#Scenario Outline: Verify Edit  Address feature working

    #Given user starts the browser and enters the url
    #Then user click on login button
    #Then user enters mobilenumber as "<number>"
    #Then user clicks on continue
    #Then user enters password as "<password>"
    #Then user navigate to myaddress page
    #Then user click on Edit address
    #Then user update address as "<address>"
    #Then user close the browser
    #Examples:
    #|number|password|address|
    #|8888999999|123456|pqr|

#Scenario Outline: Verify New address is added to new user account

    #Given user starts the browser and enters the url
    #Then user click on login button
    #Then user enters mobilenumber as "<number>"
    #Then user clicks on continue
    #Then user enters password as "<password>"
    #Then user click profile icon and click on myaddress
    #Then user enter pincode as "<pincode>"
    #Then user enter address as "<address>"
    #Then user enter locality as "<Locality>"
    #Then user close the browser
    #Examples:
    #|number|password|pincode|address|Locality|
    #|8394884784|123456|421201|abc|xyz|

#Scenario Outline: verify Empty form submission of Address form
    #Given user starts the browser and enters the url
    #Then user click on login button
    #Then user enters mobilenumber as "<number>"
    #Then user clicks on continue
    #Then user enters password as "<password>"
    #Then user click profile icon and click on myaddress
    #Then user click on save address btn and verify validation
    #Then user close the browser
    #Examples:
    #|number|password|
    #|8888999999|123456|
    
#Scenario Outline: To Verify My Address For New User

    #Given user starts the browser and enters the url
    #Then user click on login button
    #Then user enters mobilenumber as "<number>"
    #Then user clicks on continue
    #Then user enters password as "<password>"
    #Then user click profile icon and verify address page fields
    #Then user close the browser
    #Examples:
    #|number|password|
    #|8888999999|123456|
 
    
#Scenario Outline: To Verify Empty My Orders Page

    #Given user starts the browser and enters the url
    #Then user click on login button
    #Then user enters mobilenumber as "<number>"
    #Then user clicks on continue
    #Then user enters password as "<password>"
    #Then user click profile icon and verify empty order page
    #Then user close the browser
    #Examples:
    #|number|password|
    #|8394884784|123456|

#Scenario Outline: To Verify Verify My Orders For Existing Users having order Info 

    #Given user starts the browser and enters the url
    #Then user click on login button
    #Then user enters mobilenumber as "<number>"
    #Then user clicks on continue
    #Then user enters password as "<password>"
    #Then user click profile icon and order details
    #Then user close the browser
    #Examples:
    #|number|password|
    #|7972072423|123456|

#Scenario Outline: To Verify My Wallet
    #Given user starts the browser and enters the url
    #Then user click on login button
    #Then user enters mobilenumber as "<number>"
    #Then user clicks on continue
    #Then user enters password as "<password>"
    #Then user click profile icon and wallet details
    #Then user close the browser
    #Examples:
    #|number|password|
    #|7972072423|123456|

#Scenario Outline: To Verify Features for my Account Visible
    #Given user starts the browser and enters the url
    #Then user click on login button
    #Then user enters mobilenumber as "<number>"
    #Then user clicks on continue
    #Then user enters password as "<password>"
    #Then user click profile icon 
    #Then user verify myaccount option is visible
    #Then user verify mywishlist option is visible
    #Then user verify myorder option is visible
    #Then user verify mywallet option is visible
    #Then user verify logout option is visible
    #Then user close the browser
    #Examples:
    #|number|password|
    #|7972072423|123456|
    

#Scenario Outline: To Verify My Account 
   #Given user starts the browser and enters the url
    #Then user click on login button
    #Then user enters mobilenumber as "<number>"
    #Then user clicks on continue
    #Then user enters password as "<password>"
    #Then user verify profile icon and account details
    #Then user close the browser
    #Examples:
    #|number|password|
    #|7972072423|123456|    