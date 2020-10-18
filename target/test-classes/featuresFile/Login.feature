@Login
Feature: validate Login Page

    #Scenario: To Verify Login with Gmail Account
    #Given user starts the browser and enters the url
    #Then user click on login button
    #Then user click on Gmail
    #Then user select Gmailaccount
    #Then user close the browser

    #Scenario Outline: To Verify Login with Non Registered Email ID
    # Given user starts the browser and enters the url
     #Then user click on login button
     #Then user enters email as "<username>"
     #Then user clicks on continue
     #Then user close the browser
    
    #Examples:
        #|username|
        #|new.n@gmail.com|
     
   #Scenario Outline: To Verify Login with Non Registered Mobile No
    #Given user starts the browser and enters the url
    #Then user click on login button
    #Then user enters mobilenumber as "<number>"
    #Then user clicks on continue
    #Then user close the browser
    
    #Examples:
        #|number|
        #|1122330000|
        
    #Scenario Outline: verify login validations with registered Mobile no. and correct password
    #Given user starts the browser and enters the url
    #Then user click on login button
    #Then user enters mobilenumber as "<number>"
    #Then user clicks on continue
    #Then user enters password as "<password>"
    #Then user close the browser
    
    #Examples:
        #|number|password|
       #|7972072423|123456|
        
    #Scenario Outline: verify forgot password field with valid email address
    #Given user starts the browser and enters the url
    #Then user click on login button
    #Then user enters email as "<username>"
    #Then user clicks on continue
    #Then user click on forget password link
    #Then user enter email for forget password link as "<username>"
    #Then user click on submit button
    #Then verify reset msg visible
    #Then user click on back to login button
    #Then user close the browser
    
    #Examples:
        #|username|
        #|priyanka.singh@bewakoof.com|
        
    #Scenario Outline: To Verify Login with Facebook
   # Given user starts the browser and enters the url
    #Then user click on login button
    #Then user click on Facebook
    #Then user enters fbemail as "<username>"
    #Then user enters fbpassword as "<password>"
    #Then user click on LogIn button
    #Then user close the browser
    
    #Examples:
        #|username|password|
        #|3dspoiler@gmail.com|3d@fb123$|
        
    
    