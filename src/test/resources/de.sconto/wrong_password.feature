Feature: Sconto login feature
  In order to see the error message
@wrong
  Scenario: Login with wrong password
    Given I am on the Homepage
    When I click on the Login icon
    Then I see Login page

    When I insert user credentials
    | email | password |
    | ulitruli@gmail.com | 12|

    And I click on Login button
    Then I should see error message


