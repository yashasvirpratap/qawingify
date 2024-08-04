Feature: Click the amount header in transaction table to sort the values

  @sakshingp_TC1
  Scenario: Sorting experience of the values in transaction table
    Given User is on sakshingp landing page
    When user provides userid and password
    Then user navigates to home page

  @sakshingp_TC2
  Scenario: Sorting experience of the values in transaction table
    Given User is on sakshingp home page
    Then user clicks on amount header in transaction table then verify whether the values are sorted or not
