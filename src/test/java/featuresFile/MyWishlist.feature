@MyWishlist

Feature: validate MyWishlist Page

Scenario Outline: Verify Wishlist case for new user
    Given user starts the browser and enters the url
    Then user click on wishlist icon and see loginpopup
    Then user enters mobilenumber as "<number>"
    Then user clicks on continue
    Then user enters password as "<password>"
    Then user click profile icon and select Mywishlist
    Then verify wishlist for new user
    Then user close the browser
    Examples:
    |number|password|
    |8888999999|123456|


#Scenario Outline: Verify Wishlist case from Home page Profile icon
    #Given user starts the browser and enters the url
    #Then user click on wishlist icon and see loginpopup
    #Then user enters mobilenumber as "<number>"
    #Then user clicks on continue
    #Then user enters password as "<password>"
    #Then user click profile icon and select Mywishlist
    #Then verify user is navigated to wishlist page
    #Then user close the browser
    #Examples:
    #|number|password|
    #|7972072423|123456|

#Scenario Outline: Verify Wishlist case for login user from Home page
    #Given user starts the browser and enters the url
    #Then user click on wishlist icon and see loginpopup
    #Then user enters mobilenumber as "<number>"
    #Then user clicks on continue
    #Then user enters password as "<password>"
    #Then user click on wishlist icon and navigate to mywishlist page
    #Then verify user is navigated to wishlist page
    #Then user close the browser
    #Examples:
    #|number|password|
    #|7972072423|123456|

#Scenario Outline: Verify Wishist case for non login user from product page
    #Given user starts the browser and enters the url
    #Then user open product page
    #Then user click on productwishlist icon and see loginpopup
    #Then user enters mobilenumber as "<number>"
    #Then user clicks on continue
    #Then user enters password as "<password>"
    #Then verify product is added to wishlist 
    #Then user close the browser
    #Examples:
    #|number|password|
    #|7972072423|123456|

#Scenario Outline: Verify Wishist case for non login user from PLP page
    #Given user starts the browser and enters the url
    #Then user open plp page
    #Then user click on plpwishlist icon and see loginpopup
    #Then user enters mobilenumber as "<number>"
    #Then user clicks on continue
    #Then user enters password as "<password>"
    #Then user add product to wishlist
    #Then user close the browser
    #Examples:
    #|number|password|
    #|7972072423|123456|
    
#Scenario Outline: Verify Wishist case for non login user on Home page
    #Given user starts the browser and enters the url
    #Then user click on wishlist icon and see loginpopup
    #Then user enters mobilenumber as "<number>"
    #Then user clicks on continue
    #Then user enters password as "<password>"
    #Then user click on wishlist icon and navigate to mywishlist page
    #Then user close the browser
    #Examples:
    #|number|password|
    #|7972072423|123456|