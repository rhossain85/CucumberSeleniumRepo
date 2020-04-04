
@Important
Feature: Create account of Facebook8
  As a user you need to open a facebook homepage and do the validation

 @Smoke
 Scenario: Validate first name field81
    Given User need to be on facebook login page
    When User enters user "David" first name
    Then User checks user "David" first name is present
    And Close Browser
    
@Regression
Scenario: Validate create user multiple field82
Given User need to be on facebook login page
When User enters user "Ryan" first name
And User enters user "Jack" surname
#Then User checks user first name is present
But User mobile field should be blank
Then Close Browser

Scenario: Validate first name field83
    Given User need to be on facebook login page
    When User enters user "David" first name
    Then User checks user "David" first name is present
    And Close Browser
    
@Smoke @Regression
Scenario: Validate first name field84
    Given User need to be on facebook login page
    When User enters user "David" first name
    Then User checks user "David" first name is present
    And Close Browser
    

@Smoke    
Scenario: Validate first name field85
    Given User need to be on facebook login page
    When User enters user "David" first name
    Then User checks user "David" first name is present
    And Close Browser


