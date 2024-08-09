Feature: Test web Automation


  @web
  Scenario: login with valid email and password
    Given open page web
    And user click login navbar
    Then verify user in pop login
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login

  @web
  Scenario: login invalid user name
    Given open page web
    And user click login navbar
    Then verify user in pop login
    And user input username "standard_Users"
    And user input password "secret_sauce"
    And user click login
    Then Verify alart error massage "Invalid user name"


  @web
  Scenario: login invalid password
    Given open page web
    And user click login navbar
    Then verify user in pop login
    And user input username "standard_User"
    And user input password "12222"
    And user click login
    Then Verify alart error massage "wrong password"

  @web
  Scenario: login empty username dan password
    Given open page web
    And user click login navbar
    Then verify user in pop login
    And user input username ""
    And user input password ""
    And user click login
    Then Verify alart error massage "Please fill out Username and Password."

    @web
  Scenario: Add Product to chart
      Given open page web

      And user click at item "Nexus 6"
      Then go to product page
      And user click add to cart
      Then go to cart page

  @web
  Scenario: Product Delete
    Given open page web
    And user click at item "Nexus 6"
    Then go to product page
    And user click add to cart
    Then go to cart page
    And user click delete

  @web
  Scenario: Checkout
    Given open page web
    And user click at item "Nexus 6"
    Then go to product page
    And user click add to cart
    Then go to cart page
    And user click Purchase
    Then pop up checkout form
    When user input name "test"
    And user input country "indonesia"
    And user input city "medan"
    And user input card "1234456789101122"
    And user input month "04"
    And user input year "2026"
    And user click bayar

  @web
  Scenario: Log out from website
    Given open page web
    And user click login navbar
    Then verify user in pop login
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login
    Then verify user in homepage
    And user click logout

  @web
  Scenario: categories product
    Given open page web
    And click the item categories "Laptops"
