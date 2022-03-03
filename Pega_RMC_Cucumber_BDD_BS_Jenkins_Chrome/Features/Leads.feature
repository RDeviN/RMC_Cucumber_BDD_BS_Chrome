Feature: Validate Prospective Campaign
  
Scenario: User is able to view send a prospective campaign
    Given User launches Chrome browser
    When User opens the URL "https://test.primericaonline.com/home/index_was35.html"
    And User enters the user name "bfs31"
    And User enters the password "Mar032022"
    And User clicks on Login button
    And User clicks Continue in Protect Your Account page
    And User enters verification code in Two Factor Preference page
    And User clicks Next in Two Factor Preference page
    And User clicks on crm hyperlink
    And User clicks on Prospects
    And User clicks on contact quick add