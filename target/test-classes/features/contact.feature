Feature: QT Test Case

  Scenario Outline: Submit Contact Information
  
    Given Initialize the browser with Chrome
      And Navigate to "https://www.inmarsat.com/12345/partner-test/" site
      And Click on Contact Us button
     When User enters <firstname> and <lastname> and submits
     Then Verfiy the Send Request Button

     Examples:
     |firstname			|lastname		|
     |test1				|test2			|
     |test3				|test4			|