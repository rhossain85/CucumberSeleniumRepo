Feature: Create account of Facebook6
  As a user you need to open a facebook homepage and do the validation

  Scenario: Validate first name field61
    Given User need to be on facebook login page
    When User enters user first name
    Then User checks user first name is present
    And Close Browser
    
Scenario: Validate create user multiple field62
Given User need to be on facebook login page
When User enters user first name
And User enters user surname
Then User checks user first name is present
And User mobile field should be blank
And Close Browser

