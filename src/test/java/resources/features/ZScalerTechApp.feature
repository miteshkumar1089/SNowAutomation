Feature: OS and Asset to be mandatory for Z Scaler Tech App

  Background:
    Given User opens the application

  Scenario Outline: Validate user login and ticket submission
    When User logs in with Username and Password
    And User lands on the issue details page
    And User fills in Requester Information, Multilingual Support, Source, Reported For, Site, and Description
    And User searches for "<Catalog>" in the Catalog Search field
    And User selects Software in Area of Support field
    And User enters Z Scaler in Technology Application field
    And User clicks on Next button
    Then Verify that OS and Asset fields are mandatory

    Examples:
