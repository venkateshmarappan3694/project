Feature: verifying the Adactim login module

  Scenario Outline: verifying  Adactim login with valid data
    Given user should perform login with "<username>" and "<password>"
    When user click login

    Examples: 
      | username      | password   |
      | venkatesh1228 | venkat1228 |
