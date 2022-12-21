#  Author: Habitamu Azezew
#  Date: Nov 09, 2022
#  Project name: Reconciliation
#  Module: Task Operations
#  Activity: Automatic Reconciliation
#  Project owner: EthSwitch
#  Vendor: CashLink
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@BranchConfiguration

Feature: Automatic Reconciliation
  Background: user opened web browser and maximizes it
    When user has entered test reconciliation system URL

  Scenario: Automatic Reconciliation page integrity with mandatory data
    When user enters direct username into username field
    And user enters direct user password into password field
    And user selects direct user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Task Operations menu
    And user clicks on Automatic Reconciliation submenu
    Then system displays Automatic Reconciliation page
    And on Automatic Reconciliation page user selects "SVFE-SVBO" from Transaction Type dropdown
    And on Automatic Reconciliation page user clicks on Reconciliation button
    Then Automatic Reconciliation page display an alert message containing "Are you Sure Automatic Reconciliation ?"
    And tenant user clicks on logout button

  Scenario: Automatic Reconciliation page integrity without mandatory data
    When user enters direct username into username field
    And user enters direct user password into password field
    And user selects direct user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Task Operations menu
    And user clicks on Automatic Reconciliation submenu
    Then system displays Automatic Reconciliation page
    And on Automatic Reconciliation page user clicks on Reconciliation button
    Then Automatic Reconciliation page display an alert message containing "Select Txn Type"
    And tenant user clicks on logout button