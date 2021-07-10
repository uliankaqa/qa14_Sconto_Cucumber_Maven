Feature: Sconto login feature
  In order to see the user area
  I log in to the website
@login
  Scenario: Successful login
    Given I am on the Homepage
    When I click on the Login icon
    Then I see Login page

    When I insert valid user credentials
    And I click on Login button
    Then I should see MyAccount icon

    When I click on MyAccount icon
    Then I should see my name

