#  Author: Habitamu Azezew
#  Date: Nov 09, 2022
#  Project name: Reconciliation
#  Module: User Configuration Management
#  Activity: User Configuration
#  Project owner: EthSwitch
#  Vendor: CashLink
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@UserConfiguration

Feature: User Configuration Management
  Background: user opened web browser and maximizes it
    When user has entered test reconciliation system URL

  Scenario:  User Configuration page integrity
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Configuration menu
    And user clicks on User Configuration submenu
    Then system displays User Configuration page
    Then user clicks on Username Configuration tab
    And on Username Configuration tab user clicks on Edit button
    And on Username Configuration tab user clicks on Update button
    Then user clicks on Password Configuration tab
    And on Password Configuration tab user clicks on Edit button
    And on Password Configuration tab user clicks on Update button
    And tenant user clicks on logout button