Feature: Create account of Facebook4
  As a user you need to open a facebook homepage and do the validation

  Scenario: Validate first name field41
    Given User need to be on facebook login page
    When User enters user first name
    Then User checks user first name is present
#Scenario: Validate create user multiple field
#Given User need to be on facebook login page
#When User enters user first name
#And User enters user surname
#Then User check user first name is present
#But User mobile field should be blank
