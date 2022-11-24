#  Author: Habitamu Azezew
#  Date: Nov 09, 2022
#  Project name: Reconciliation
#  Module: Branch Configuration
#  Activity: Branch Configuration
#  Project owner: EthSwitch
#  Vendor: CashLink
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@BranchConfiguration

Feature: Branch Configuration
  Background: user opened web browser and maximizes it
    When user has entered test reconciliation system URL

  Scenario: New Financial branch with valid and complete data
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Configuration menu
    And user clicks on Branch Configuration submenu
    Then system displays Branch Configuration page
    And on Branch Configuration page user clicks on New button
    And on Branch Configuration page user selects "ENS" from Financial dropdown
    And on Branch Configuration page user enters "BRC" into Branch Code textfield
    And on Branch Configuration page user enters "Branch Name 1" into Branch Name textfield
    And on Branch Configuration page user enters "Branch Address 1" into Address textfield
    And on Branch Configuration page user enters "12345" into Contact No textfield
    And on Branch Configuration page user clicks on Save button
    Then Branch Configuration page displays a success message "Branch Details Saved Successfully...!"
    And tenant user clicks on logout button

  Scenario: Add Financial branch with an already exiting branch data
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Configuration menu
    And user clicks on Branch Configuration submenu
    Then system displays Branch Configuration page
    And on Branch Configuration page user clicks on New button
    And on Branch Configuration page user selects "ENS" from Financial dropdown
    And on Branch Configuration page user enters "BranchCode" into Branch Code textfield
    And on Branch Configuration page user enters "Branch Name" into Branch Name textfield
    And on Branch Configuration page user enters "Branch Address" into Address textfield
    And on Branch Configuration page user enters "12345" into Contact No textfield
    And on Branch Configuration page user clicks on Save button
    Then Branch Configuration page displays an alert message containing "Branch details already exist...!"
    And tenant user clicks on logout button

  Scenario: Add Financial branch without all mandatory field values
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Configuration menu
    And user clicks on Branch Configuration submenu
    Then system displays Branch Configuration page
    And on Branch Configuration page user clicks on New button
    And on Branch Configuration page user clicks on Save button
    Then Branch Configuration page displays an alert message containing "Please select the Financial Name"
    And Branch Configuration page displays an alert message containing "Please Enter the Branch Code"
    And Branch Configuration page displays an alert message containing "Please Enter the Branch Name"
    And Branch Configuration page displays an alert message containing "Enter the Branch Address Details"
    And tenant user clicks on logout button