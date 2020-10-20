$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Bag.feature");
formatter.feature({
  "line": 2,
  "name": "Test BAG functionality",
  "description": "",
  "id": "test-bag-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#Scenario: Verify My Bag UI page without login empty bag"
    },
    {
      "line": 5,
      "value": "#"
    },
    {
      "line": 6,
      "value": "#Given user starts the browser and enters the url"
    },
    {
      "line": 7,
      "value": "#Then user go to my cart"
    },
    {
      "line": 8,
      "value": "#Then click on Continue Shopping CTA in Cart"
    },
    {
      "line": 9,
      "value": "#Then user redirects to home page"
    },
    {
      "line": 10,
      "value": "#Then user close the browser"
    }
  ],
  "line": 13,
  "name": "Verify Size of product can be changed in Bag as per requested by User",
  "description": "",
  "id": "test-bag-functionality;verify-size-of-product-can-be-changed-in-bag-as-per-requested-by-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Bag"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user starts the browser and enters the url",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Add product to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.user_starts_the_browser_and_enters_the_url()"
});
formatter.result({
  "duration": 7787263724,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.Add_product_to_cart()"
});
formatter.result({
  "duration": 1175454032,
  "status": "passed"
});
});