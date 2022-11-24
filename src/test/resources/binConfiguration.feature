#  Author: Habitamu Azezew
#  Date: Nov 09, 2022
#  Project name: Reconciliation
#  Module: BIN Configuration
#  Activity: BIN Configuration
#  Project owner: EthSwitch
#  Vendor: CashLink
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@BranchConfiguration

Feature: BIN Configuration
  Background: user opened web browser and maximizes it
    When user has entered test reconciliation system URL

  Scenario: New BIN registration with valid and complete data
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Configuration menu
    And user clicks on BIN Configuration submenu
    Then system displays BIN Configuration page
    And on BIN Configuration page user clicks on New button
    And on BIN Configuration page user selects "ENS" from Financial Name dropdown
    And on BIN Configuration page user selects "ETHSWITCH" from Entity Name dropdown
    And on BIN Configuration page user enters "1231" into Bin No textfield
    And on BIN Configuration page user selects "Credit" from Card Type dropdown
    And on BIN Configuration page user clicks on Save button
    Then BIN Configuration page displays success message "BIN Details Saved Successfully...!"
    And tenant user clicks on logout button

  Scenario: New BIN registration with an already existing data
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Configuration menu
    And user clicks on BIN Configuration submenu
    Then system displays BIN Configuration page
    And on BIN Configuration page user clicks on New button
    And on BIN Configuration page user selects "ENS" from Financial Name dropdown
    And on BIN Configuration page user selects "ETHSWITCH" from Entity Name dropdown
    And on BIN Configuration page user enters "123" into Bin No textfield
    And on BIN Configuration page user selects "Credit" from Card Type dropdown
    And on BIN Configuration page user clicks on Save button
    Then BIN Configuration page displays an alert message "Bin Details Already Exist...!"
    And tenant user clicks on logout button

  Scenario: New BIN registration without mandatory field values
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Configuration menu
    And user clicks on BIN Configuration submenu
    Then system displays BIN Configuration page
    And on BIN Configuration page user clicks on New button
    And on BIN Configuration page user clicks on Save button
    And BIN Configuration page displays an alert message containing "Please select the Financial"
    And BIN Configuration page displays an alert message containing "Please select the Financial"
    And BIN Configuration page displays an alert message containing "Please select the Financial"
    And BIN Configuration page displays an alert message containing "Please select the Financial"
    And tenant user clicks on logout button

  Scenario: Edit/Update BIN with mandatory field values
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Configuration menu
    And user clicks on BIN Configuration submenu
    Then system displays BIN Configuration page
    And on BIN Configuration page user clicks on Select button on first row
    And on BIN Configuration page user clicks on Edit button
    And on BIN Configuration page user clicks on Update button
    Then BIN Configuration page displays success message "Bin datails updated successfully...!"
    And tenant user clicks on logout button