Feature: The user tests Allo Ua website
  Background: The user test Allo Ua searchbox
    Given The User launches "alloUaURL"

  Scenario: TheUser01 tests buy something on website
  When TheUser searches "Iphone 15" on searchbox
    Then User tests search panel contains "Iphone 15"
    And User quites to browser

  Scenario: TheUser02 tests buy something on website
    When TheUser searches "Xiaomi" on searchbox
    Then User tests search panel contains "Xiaomi"
    And User quites to browser

  Scenario: TheUser04 tests buy something on website
    When TheUser searches "Dyson" on searchbox
    Then User tests search panel contains "Dyson"
    And User quites to browser

  Scenario: TheUser05 tests buy something on website
    When TheUser searches "Garmin" on searchbox
    Then User tests search panel contains "Garmin"
    And User quites to browser

