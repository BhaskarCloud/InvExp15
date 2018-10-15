Feature: Chek functionality on Activity page of Application

  @Second
  Scenario: Test login with credentials
    Given Open the Firefox and launch the application
    When Enter the Username and Password
    Then dashboardPage is loaded

  @First
  Scenario: Loginpage Test UI verification
    Given URL is given into Browser
    When I cosmatic check for login Page
    Then all locators are verified

  @Third
  Scenario: AccountsPage Test UI verification
    Given dashboardPage is loaded and verified
    When I click on accounsLinkInSideBar
    Then accouns Page is displayed and Default date filter verified
