Feature: Test PSEG login

  Scenario Outline: Test Login with valid credentials
    Given the user is in pseg application
    When the user enters login information
    Then the user should be logged in


    Examples: 
      | username          | password  |
      | ntbejoe5@gmail.com | password1 |