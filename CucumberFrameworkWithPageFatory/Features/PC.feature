@PC
Feature: Verifying check of Cold Storage site
 

  @PC
  Scenario: CS site verification check
    Given user launch browser 
    And user enters username and password and clicks on login button
    When user clicks on CSCSorders viewdetails
    And user  clicks on DCorders viewdetails
    And user  clicks on CACASStock viewdetails
    And user logout from the site
    
    
