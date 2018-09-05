@Positive_Test
Feature: To test + the login Functionality

  Background: Steps for pre-requisite
    Given User opens the browser
    When User launches the URL
    Then User in on "Resource Scheduling Application" URL

  @Login_For_Employee
  Scenario Outline: user tries to login with valid credentials
    Given user is on Lopginpage
    When user enters "<usermane>" in EmployeeID textbox
    And user enters "<Password>" in password textbox
    And user cliks on LoginButton
    Then user should navigate to homePage

    Examples: 
      | usermane | Password  |
      | A2334    | 123456789 |
