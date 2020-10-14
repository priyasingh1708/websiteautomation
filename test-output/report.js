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
formatter.scenarioOutline({
  "line": 5,
  "name": "To Verify My Wallet",
  "description": "",
  "id": "validate-myaccount;to-verify-my-wallet",
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
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters mobilenumber as \"\u003cnumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on contuine",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters password as \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user click profile icon and order details",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "validate-myaccount;to-verify-my-wallet;",
  "rows": [
    {
      "cells": [
        "number",
        "password"
      ],
      "line": 14,
      "id": "validate-myaccount;to-verify-my-wallet;;1"
    },
    {
      "cells": [
        "7972072423",
        "123456"
      ],
      "line": 15,
      "id": "validate-myaccount;to-verify-my-wallet;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "To Verify My Wallet",
  "description": "",
  "id": "validate-myaccount;to-verify-my-wallet;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Myaccount"
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
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters mobilenumber as \"7972072423\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on contuine",
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
  "name": "user click profile icon and order details",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.user_starts_the_browser_and_enters_the_url()"
});
formatter.result({
  "duration": 5975968496,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_click_on_login_button()"
});
formatter.result({
  "duration": 4582297213,
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
  "duration": 3270485063,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_contuine()"
});
formatter.result({
  "duration": 2082097305,
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
  "duration": 3306008224,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_click_profile_icon_and_order_details()"
});
formatter.result({
  "duration": 5865986892,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_close_the_browser()"
});
formatter.result({
  "duration": 182606169,
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