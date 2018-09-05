Feature: To test the functionality of report screen

  Background: Steps to pre-requisite
    Given User opens the browser
    And User launches the URL
    And User in on "Resource Scheduling Application" URL
    When user enters "A2334" in EmployeeID textbox
    And user enters "123456789" in password textbox
    And user cliks on LoginButton
    Then user should navigate to homePage

  @+VE
  Scenario Outline: To test the positive functioality of Report screen
    Given User is navugated to "<screen>"
    When User select "<resoutrce Type>" for resource dropdown
    And User  Select "<Project Type>" for Project dropdown
    And User  Select "<Location>" for Location dropdown
    And User  Select  "<Department>" for Department dropdown
    And User  Select  "<Allocation Start Date>" for Start Date dropdown
    And User  Select  "<Allocation End Date>" for End Date dropdown
    Then Clicks on Get Report

    Examples: 
      | screen | resoutrce Type | Project Type | Location | Department | Allocation Start Date | Allocation End Date |
      | report | All            | All          | All      | All        | 21/8/2000             | 21/8/2000           |
