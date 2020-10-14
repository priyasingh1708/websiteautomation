@signup 

Feature: validate signup page

#Scenario Outline: To verify validation for Password field less than 6 digit

    #Given user starts the browser and enters the url
    #Then user click on login button
    #Then user click on signup link
    #Then user click on signup with mobile
    #Then user enter firstname as "<Firstname>"
    #Then user enter lastname as "<Lastname>"
    #Then user enter mobileno as "<mobile>"
    #Then user enter email as "<email>"
    #Then user enter password as "<password>"
    #Then user click on female button
    #Then user click on final button
    #Then user get validation for min length pwd
    #Then user close the browser
    #Examples:
    #|Firstname|Lastname|mobile|email|password|
    #|hello|automation|6765432789|helloauto@gmail.com|12345|

#Scenario Outline: To verify validation for email in signup form

    #Given user starts the browser and enters the url
    #Then user click on login button
    #Then user click on signup link
    #Then user click on signup with mobile
    #Then user enter firstname as "<Firstname>"
    #Then user enter lastname as "<Lastname>"
    #Then user enter mobileno as "<mobile>"
    #Then user enter password as "<password>"
    #Then user click on final button
    #Then user get validation for email
    #Then user close the browser
    #Examples:
    #|Firstname|Lastname|mobile|password|
    #|hello|automation|6765432789|123456|
   
 #Scenario Outline: To verify validation for mobile

    #Given user starts the browser and enters the url
    #Then user click on login button
    #Then user click on signup link
    #Then user click on signup with mobile
    #Then user enter firstname as "<Firstname>"
    #Then user enter lastname as "<Lastname>"
    #Then user enter email as "<email>"
    #Then user enter password as "<password>"
    #Then user click on final button
    #Then user get validation for mobile
    #Then user close the browser
    #Examples:
    #|Firstname|Lastname|email|password|
    #|hello|automation|helloauto@gmail.com|123456|
   
#Scenario Outline: To verify validation for password

    #Given user starts the browser and enters the url
    #Then user click on login button
    #Then user click on signup link
    #Then user click on signup with mobile
    #Then user enter firstname as "<Firstname>"
    #Then user enter lastname as "<Lastname>"
    #Then user enter email as "<email>"
    #Then user enter mobileno as "<mobile>"
    #Then user click on final button
    #Then user get validation for password
    #Then user close the browser
    #Examples:
    #|Firstname|Lastname|email|mobile|
    #|hello|automation|helloauto@gmail.com|6765432789|
   
#Scenario: To verify Empty form submition on SIgnup form

    #Given user starts the browser and enters the url
    #Then user click on login button
    #Then user click on signup link
    #Then user click on signup with mobile
    #Then user click on final button
    #Then user get validation for firstname and lastname
    #Then user get validation for mobile
    #Then user get validation for email
    #Then user get validation for password
    #Then user close the browser


#Scenario Outline: To verify validation for firstname and lastname in signup form

     #Given user starts the browser and enters the url
     #Then user click on login button
     #Then user click on signup link
     #Then user click on signup with mobile
     #Then user enter mobileno as "<mobile>"
     #Then user enter email as "<email>"
     #Then user enter password as "<password>"
     #Then user click on final button
     #Then user get validation for firstname and lastname
     #Then user close the browser
     #Examples:
     #|mobile|email|password|
     #|6765432789|helloauto@gmail.com|123456|

 #Scenario: To Verify signup with Gmail Account
     #Given user starts the browser and enters the url
     #Then user click on login button
     #Then user click on signup link
     #Then user click on Signup with Gmail
     #Then user close the browser
    
#Scenario Outline: To Verify signup with Gmail Account
     #Given user starts the browser and enters the url
     #Then user click on login button
     #Then user click on signup link
     #Then user click on Facebook
     #Then user enters fbemail as "<username>"
     #Then user enters fbpassword as "<password>"
     #Then user click on LogIn button
     #Then user close the browser
     #Examples:
         #|username|password|
         #|3dspoiler@gmail.com|3d@fb123$|
    
 #Scenario Outline: To verify signup page with mobile

    #Given user starts the browser and enters the url
    #Then user click on login button
    #Then user click on signup link
    #Then user click on signup with mobile
    #Then user enter firstname as "<Firstname>"
    #Then user enter lastname as "<Lastname>"
    #Then user enter mobileno as "<mobile>"
    #Then user enter email as "<email>"
    #Then user enter password as "<password>"
    #Then user click on female button
    #Then user click on final button
    #Then user close the browser
    
    #Examples:
    #|Firstname|Lastname|mobile|email|password|
    #|hello|automation|6765432789|helloauto@gmail.com|123456|
    
    
    