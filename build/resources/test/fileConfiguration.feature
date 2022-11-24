#  Author: Habitamu Azezew
#  Date: Nov 09, 2022
#  Project name: Reconciliation
#  Module: Configuration
#  Activity: File Configuration
#  Project owner: EthSwitch
#  Vendor: CashLink
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@FileConfiguration

Feature: File Configuration
  Background: user opened web browser and maximizes it
    When user has entered test reconciliation system URL

  Scenario: File Name Configuration page integrity
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Configuration menu
    And user moves mouse over File Configuration submenu
    And user clicks on File Name Configuration child menu
    Then system displays File Name Configuration page
    And on File Name Configuration page user selects "ENS" from financial name dropdown
    And on File Name Configuration page user selects "SVFE" from Entity Name dropdown
#    And on File Name Configuration page user selects "ENSSETTLEMENT" from FIle ID dropdown
    And on File Name Configuration page user clicks on Cancel button
    And tenant user clicks on logout button


    Scenario: File Structure & Detail Configuration page integrity
      When user enters checker username into username field
      And user enters checker user password into password field
      And user selects checker user financial from Financial dropdown
      And tenant user clicks on Login button
      Then system displays tenant dashboard page
      And user moves mouse over Configuration menu
      And user moves mouse over File Configuration submenu
      And user clicks on File Structure Detail Configuration child menu
      Then system displays File Structure Detail Configuration page
      And user clicks on Field Configuration Tab
      And user clicks on File Structure Configuration tab
      And user clicks on File Field Configuration Tab
      And tenant user clicks on logout button

  Scenario: file Field Mapping Configuration page integrity
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Configuration menu
    And user moves mouse over File Configuration submenu
    And user clicks on File Field Mapping Configuration child menu
    And system displays File Field Mapping Configuration page
    Then on File Field Mapping Configuration user selects "ENS" from Financial Name dropdown
    And on File Field Mapping Configuration user selects "SVFE" from Entity Name dropdown
    And on File Field Mapping Configuration user selects "SMARTVISTAFE" from File ID dropdown
    And on File Field Mapping Configuration user selects "DETAIL" from Record Type dropdown
    And on File Field Mapping Configuration user clicks on Filter button
    And tenant user clicks on logout button