Feature: Create account of Facebook2
  As a user you need to open a facebook homepage and do the validation

 
    
Scenario Outline: Validate create user multiple field21
Given User need to be on facebook login page
When User enters user "<user>" first name
And User enters user "<surname>" surname
Then User checks user "<user>" first name is present
Then User mobile field should be blank
Then Close Browser

Examples:

	|user		|	surname		|
	|Tom		|Jerry			|
	|Lorren	|Hardy			|
	
