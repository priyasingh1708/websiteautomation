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
  "name": "Verify Wishlist case for new user",
  "description": "",
  "id": "validate-mywishlist-page;verify-wishlist-case-for-new-user",
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
  "name": "user click on wishlist icon and see loginpopup",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters mobilenumber as \"\u003cnumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on continue",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters password as \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user click profile icon and select Mywishlist",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "verify wishlist for new user",
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
  "id": "validate-mywishlist-page;verify-wishlist-case-for-new-user;",
  "rows": [
    {
      "cells": [
        "number",
        "password"
      ],
      "line": 15,
      "id": "validate-mywishlist-page;verify-wishlist-case-for-new-user;;1"
    },
    {
      "cells": [
        "8888999999",
        "123456"
      ],
      "line": 16,
      "id": "validate-mywishlist-page;verify-wishlist-case-for-new-user;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Verify Wishlist case for new user",
  "description": "",
  "id": "validate-mywishlist-page;verify-wishlist-case-for-new-user;;2",
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
  "name": "user click on wishlist icon and see loginpopup",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters mobilenumber as \"8888999999\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on continue",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters password as \"123456\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user click profile icon and select Mywishlist",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "verify wishlist for new user",
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
  "duration": 13708422165,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_click_on_wishlist_icon_and_see_loginpopup()"
});
formatter.result({
  "duration": 4191430749,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8888999999",
      "offset": 29
    }
  ],
  "location": "stepdefination.user_enters_mobilenumber_as(String)"
});
formatter.result({
  "duration": 3434704493,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_continue()"
});
formatter.result({
  "duration": 3090015271,
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
  "duration": 3283485637,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_click_profile_icon_and_select_Mywishlist()"
});
formatter.result({
  "duration": 20957084566,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.verify_wishlist_for_new_user()"
});
formatter.result({
  "duration": 3256604291,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_close_the_browser()"
});
formatter.result({
  "duration": 142500834,
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