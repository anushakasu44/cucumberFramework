
@Login
Feature: login button validation
 
@Login
  Scenario Outline: login with correct username and password
    Given user navigates to browser
    When user enters "<username>" and "<password>"
    And user clicks on signin button
    Then "<user>" can able to login sucessfully

    Examples: 
      |username | password      |user               |
      |cs       | Password@123  |Cold Storage       |
      |pc1      | Password@123  |Processing center  |
      |dist1    | Password@123  |distribution center|
      
      
      
      
      
      