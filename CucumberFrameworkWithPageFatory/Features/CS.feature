
@CS
Feature: Verifying check of Cold Storage site
 

  @CS
  Scenario: CS site verification check
    Given user launch browser 
    And user enters username and password and clicks on login button
    When user clicks on farmingorders viewdetails
    And user  clicks on PCorders viewdetails
    And user  clicks on CAS Stock viewdetails
    And user logout from the site
    
    

      