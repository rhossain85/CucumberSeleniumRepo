Feature: Create account of Facebook5
  As a user you need to open a facebook homepage and do the validation

  Scenario: Validate first name field51
    Given User need to be on facebook login page
    When User enters user "David" first name
    Then User checks user "David" first name is present
    
    
Scenario: Validate create user multiple field52
Given User need to be on facebook login page
When User enters user "Ryan" first name
And User enters user "Jack" surname
#Then User checks user first name is present
Then User mobile field should be blank



