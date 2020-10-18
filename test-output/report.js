$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "validate Login Page",
  "description": "",
  "id": "validate-login-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.uri("MyAccount.feature");
formatter.feature({
  "line": 2,
  "name": "validate Myaccount",
  "description": "",
  "id": "validate-myaccount",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Myaccount"
    }
  ]
});
formatter.uri("MyWishlist.feature");
formatter.feature({
  "line": 3,
  "name": "validate MyWishlist Page",
  "description": "",
  "id": "validate-mywishlist-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@MyWishlist"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Verify Wishist case for non login user from product page",
  "description": "",
  "id": "validate-mywishlist-page;verify-wishist-case-for-non-login-user-from-product-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user starts the browser and enters the url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user open product page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click on productwishlist icon and see loginpopup",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enters mobilenumber as \"\u003cnumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on continue",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enters password as \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "verify product is added to wishlist",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "validate-mywishlist-page;verify-wishist-case-for-non-login-user-from-product-page;",
  "rows": [
    {
      "cells": [
        "number",
        "password"
      ],
      "line": 15,
      "id": "validate-mywishlist-page;verify-wishist-case-for-non-login-user-from-product-page;;1"
    },
    {
      "cells": [
        "7972072423",
        "123456"
      ],
      "line": 16,
      "id": "validate-mywishlist-page;verify-wishist-case-for-non-login-user-from-product-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Verify Wishist case for non login user from product page",
  "description": "",
  "id": "validate-mywishlist-page;verify-wishist-case-for-non-login-user-from-product-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@MyWishlist"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user starts the browser and enters the url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user open product page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click on productwishlist icon and see loginpopup",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enters mobilenumber as \"7972072423\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on continue",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enters password as \"123456\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "verify product is added to wishlist",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.user_starts_the_browser_and_enters_the_url()"
});
formatter.result({
  "duration": 5111753324,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_open_product_page()"
});
formatter.result({
  "duration": 1252263996,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_click_on_productwishlist_icon_and_see_loginpopup()"
});
formatter.result({
  "duration": 4228842682,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7972072423",
      "offset": 29
    }
  ],
  "location": "stepdefination.user_enters_mobilenumber_as(String)"
});
formatter.result({
  "duration": 3302821879,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_continue()"
});
formatter.result({
  "duration": 3117999143,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 25
    }
  ],
  "location": "stepdefination.user_enters_password_as(String)"
});
formatter.result({
  "duration": 3272461641,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.verify_product_is_added_to_wishlist()"
});
formatter.result({
  "duration": 4381739881,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_close_the_browser()"
});
formatter.result({
  "duration": 142205872,
  "status": "passed"
});
formatter.uri("Signup.feature");
formatter.feature({
  "line": 3,
  "name": "validate signup page",
  "description": "",
  "id": "validate-signup-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@signup"
    }
  ]
});
});