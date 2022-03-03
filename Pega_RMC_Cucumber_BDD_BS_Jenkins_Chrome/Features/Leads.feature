Feature: Validate Leads page
  
Scenario: User is able to view Leads page
    Given User launches Chrome browser
    When User opens the URL "https://test.primericaonline.com/home/index_was35.html"
    And User enters the user name "bfs31"
    And User enters the password "Mar032022"
    And User clicks on Login button
    And User clicks Continue in Protect Your Account page
    When User clicks on Create lead button
    And User selects Individual lead type
    And User enters and submits the lead details
    Then User is able to see the newly entered lead
    When User selects the lead and clicks on Edit lead
    And User edits and submits the lead details
    Then User is able to see the edits made to the lead
    When User clicks on Convert lead option    
    Then User is able to convert a lead
    