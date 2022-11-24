#Author: Habitamu Azezew
#  Date: Nov 09, 2022
#  Project name: Reconciliation
#  Module: KeyField Configuration
#  Activity: KeyField Configuration
#  Project owner: EthSwitch
#  Vendor: CashLink
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@KeyFieldConfiguration

Feature: KeyField Configuration
  Background: user opened web browser and maximizes it
    When user has entered test reconciliation system URL

  Scenario: KeyField Configuration page integrity
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Configuration menu
    And user clicks on KeyField Configuration link
    Then system displays KeyField Configuration page
    And on KeyField Configuration page user selects "ENS" Financial Name dropdown
    And on KeyField Configuration page user selects "SVFEVSENSSETTLE" Mapping Name dropdown
    And on KeyField Configuration page user selects "SVFE-SVBO" Transaction Type dropdown
    And on KeyField Configuration page user enters "Key field desc" into Description textfield
    And on KeyField Configuration page user clicks on Cancel button
    And tenant user clicks on logout button