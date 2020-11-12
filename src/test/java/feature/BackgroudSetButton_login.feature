@End2End
Feature: Validate sky blue  button exists

Background: 
Given User is on the todo list website     
	     	
@Scenario1	   
Scenario: User should be able to use the set Sky Blue Background Button
When User clicks on  set skyBlue Background  button                                                                                                                                                                                                                                                   
Then The background color should change to skyBlue   
             	                             
@Scenario2
Scenario: User should be able to use set White Background Button
When User clicks on the  set White Background Button                                                                                                  
Then The Background color Should Change to White
	
	
