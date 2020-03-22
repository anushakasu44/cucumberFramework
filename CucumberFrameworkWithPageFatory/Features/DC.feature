@DC
Feature: Verifying check of Distribution center site
 

  @DC
  Scenario: DC site verification check
    Given user launch browser 
    And user enters username and password and clicks on login button
    When user clicks on PCorders viewdetails
    And user  clicks on Buyerorders viewdetails
    And user  clicks on DStock viewdetails
    And user logout from the site
    
    
