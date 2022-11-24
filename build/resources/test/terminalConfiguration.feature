#  Author: Habitamu Azezew
#  Date: Nov 09, 2022
#  Project name: Reconciliation
#  Module: Terminal Configuration
#  Activity: Terminal Configuration
#  Project owner: EthSwitch
#  Vendor: CashLink
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@BranchConfiguration

Feature: Terminal Configuration
  Background: user opened web browser and maximizes it
    When user has entered test reconciliation system URL

  Scenario: New make Terminal Configuration with valid and complete data
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Configuration menu
    And user clicks on Terminal Configuration submenu
    Then system displays Terminal Configuration page
    And on Terminal Configuration page user clicks on Terminal Make Configuration tab
    And on Terminal Configuration user clicks on New button
    And on Terminal Configuration page user enters "Terminal Name" into Terminal Name textfield
    And on Terminal Configuration page user enters "Terminal Desc" into Terminal Description textfield
    And on Terminal Configuration page user selects "ATM" from DeviceType dropdown
    And on Terminal Configuration page user clicks on Save button
    Then Terminal Configuration page displays a success message "Terminal Make has been Saved successfully...!"
    And tenant user clicks on logout button

  Scenario: New make Terminal Configuration with already available detail
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Configuration menu
    And user clicks on Terminal Configuration submenu
    Then system displays Terminal Configuration page
    And on Terminal Configuration page user clicks on Terminal Make Configuration tab
    And on Terminal Configuration user clicks on New button
    And on Terminal Configuration page user enters "Terminal Name" into Terminal Name textfield
    And on Terminal Configuration page user enters "Terminal Desc" into Terminal Description textfield
    And on Terminal Configuration page user selects "ATM" from DeviceType dropdown
    And on Terminal Configuration page user clicks on Save button
    Then Terminal Configuration page displays a success message "TerminalMake Details Already Exist"
    And tenant user clicks on logout button

  Scenario: New make Terminal Configuration without mandatory field values
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Configuration menu
    And user clicks on Terminal Configuration submenu
    Then system displays Terminal Configuration page
    And on Terminal Configuration page user clicks on Terminal Make Configuration tab
    And on Terminal Configuration user clicks on New button
    And on Terminal Configuration page user clicks on Save button
    And Terminal Configuration page displays an alert message containing "Enter the Terminal Make Name"
    And Terminal Configuration page displays an alert message containing "Enter the Terminal Description"
    And Terminal Configuration page displays an alert message containing "Please select the Device Name"
    And tenant user clicks on logout button

  Scenario: Edit make Terminal Configuration with mandatory field values
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Configuration menu
    And user clicks on Terminal Configuration submenu
    Then system displays Terminal Configuration page
    And on Terminal Configuration page user clicks on Terminal Make Configuration tab
    Then on Terminal Configuration page user clicks on Select button
    And on Terminal Configuration page user clicks on Edit button
    And on Terminal Configuration page user clicks on Update button
    Then Terminal Configuration page displays a success message "Terminal Make has been Updated successfully...!"
    And tenant user clicks on logout button

  Scenario: New detail Terminal Configuration with valid and mandatory field data
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Configuration menu
    And user clicks on Terminal Configuration submenu
    Then system displays Terminal Configuration page
    And on Terminal Configuration page user clicks on Terminal Detail Configuration tab
    And on Terminal Configuration Detail user clicks on New button
    And on Terminal Configuration Detail user selects "ENS" from Financial Name dropdown
    And on Terminal Configuration Detail user enters "Name" into Name textfield
    And on Terminal Configuration Detail user enters "321" into ID textfield
    And on Terminal Configuration Detail user enters "321" into Account textfield
    And on Terminal Configuration Detail user enters "Location" into Location textfield
    And on Terminal Configuration Detail user selects "BRC" from Branch Name dropdown
    And on Terminal Configuration Detail user selects "abc" from Terminal Make dropdown
    And on Terminal Configuration Detail user selects "1" from No of Cassette dropdown
    And on Terminal Configuration Detail user selects "YES" Outsource checkbox
    And on Terminal Configuration Detail user selects "TLS GROUP" from Outsourcing Agent dropdown
    And on Terminal Configuration Detail user selects "ATM" from Terminal Type dropdown
    And on Terminal Configuration Detail user clicks on Save button
    Then Terminal Configuration page displays a success message "Terminal Details Saved Successfully...!"
    And tenant user clicks on logout button

  Scenario: New detail Terminal Configuration without mandatory values
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Configuration menu
    And user clicks on Terminal Configuration submenu
    Then system displays Terminal Configuration page
    And on Terminal Configuration page user clicks on Terminal Detail Configuration tab
    And on Terminal Configuration Detail user clicks on New button
    And on Terminal Configuration Detail user clicks on Save button
    Then Terminal Configuration page displays an alert message containing "Select the Financial Name"
    And Terminal Configuration page displays an alert message containing "Enter the Terminal Name"
    And Terminal Configuration page displays an alert message containing "Enter the Terminal ID"
    And Terminal Configuration page displays an alert message containing "Enter the Terminal Account"
    And Terminal Configuration page displays an alert message containing "Select the Branch Name"
    And Terminal Configuration page displays an alert message containing "Select the Terminal Make"
    And Terminal Configuration page displays an alert message containing "Select the Terminal Type"
    And Terminal Configuration page displays an alert message containing "Please select the No of Cassette"
    And tenant user clicks on logout button