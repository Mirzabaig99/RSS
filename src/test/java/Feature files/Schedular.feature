Feature: To test the functionality of Schedular screen

  Background: Steps to pre-requisite
    Given User opens the browser
    And User launches the URL
    And User in on "Resource Scheduling Application" URL
    When user enters "A2334" in EmployeeID textbox
    And user enters "123456789" in password textbox
    And user cliks on LoginButton
    Then user should navigate to homePage

  Scenario Outline: To view both views Resources/Prject
    Given User is navugated to "<screen>"
    When User "<checks_views>"
    And User clicks on different "<view>"
    Then Application should change the view

    Examples: 
      | screen    | checks_views | View      |
      | scheduler | Resources    | Resources |
