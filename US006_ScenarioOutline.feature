Feature: Use Scanario Outline practice
  Scenario Outline: TC01 User searches multiple words
    Given The User navigates to "amazonURL"
    Then The user searches "<product>"
    Then The user tests successfull search "<confirmProduct>"
    And The User closes to browser
    Examples:
      | product | confirmProduct |
      | Iphone  |Iphone          |
      |Selenium |Selenium        |
      |Java     |Java            |
