#  Author: Habitamu Azezew
#  Date: Nov 07, 2022
#  Project name: Reconciliation
#  Module: Task Operations
#  Activity: Task Operations
#  Project owner: EthSwitch
#  Vendor: CashLink
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@TaskOperations

Feature: Task Operations Management
  Background: user opened web browser and maximizes it
    When user has entered test reconciliation system URL

    Scenario:  task operation File Renaming Process integrity
      When user enters checker username into username field
      And user enters checker user password into password field
      And user selects checker user financial from Financial dropdown
      And tenant user clicks on Login button
      Then system displays tenant dashboard page
      And user moves mouse over Task Operation menu
      And user clicks on Transaction Status submenu
      Then system displays Transaction Status page
      And on Transaction Status page user selects "ENS" from Bank name dropdown
      And on Transaction Status page user selects "Reversal-Matched" from Transaction Nature dropdown
#      Then on Transaction Status page user clicks on Filter button
      And tenant user clicks on logout button


  Scenario:  task operations Rollback feature integrity
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Task Operation menu
    And user clicks on Rollback submenu
    Then system displays Rollback page
    And on Rollback page user selects "ENSSETTLE" from Entity dropdown
    And on Rollback page user clicks on Upload checkbox
    And on Rollback page user clicks on Extraction checkbox
    And on Rollback page user clicks on Cancel button
    And tenant user clicks on logout button