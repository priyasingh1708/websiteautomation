@Myaccount
Feature: validate Myaccount


Scenario Outline: To Verify My Wallet
    Given user starts the browser and enters the url
    Then user click on login button
    Then user enters mobilenumber as "<number>"
    Then user clicks on contuine
    Then user enters password as "<password>"
    Then user click profile icon and order details
    Then user close the browser
    Examples:
    |number|password|
    |7972072423|123456|

#Scenario Outline: To Verify My Wallet
    #Given user starts the browser and enters the url
    #Then user click on login button
    #Then user enters mobilenumber as "<number>"
    #Then user clicks on contuine
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
    #Then user clicks on contuine
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
    #Then user clicks on contuine
    #Then user enters password as "<password>"
    #Then user verify profile icon and account details
    #Then user close the browser
    #Examples:
    #|number|password|
    #|7972072423|123456|    