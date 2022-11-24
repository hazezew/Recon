#  Author: Habitamu Azezew
#  Date: Nov 09, 2022
#  Project name: Reconciliation
#  Module: Merchant Configuration
#  Activity: Merchant Configuration
#  Project owner: EthSwitch
#  Vendor: CashLink
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@BranchConfiguration

Feature: Merchant Configuration
  Background: user opened web browser and maximizes it
    When user has entered test reconciliation system URL

  Scenario: New Merchant Configuration with valid and complete data
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Configuration menu
    And user clicks on Merchant Configuration submenu
    Then system displays Merchant Configuration page
    And on Merchant Configuration page user clicks on Merchant Configuration tab
    And on Merchant Configuration user clicks on New button
    And on Merchant Configuration user selects "ENS" from Financial Name dropdown option
    And on Merchant Configuration user enters "123" into Merchant Category ID textfield
    And on Merchant Configuration user enters "Merchant Name" into Merchant Name textfield
    And on Merchant Configuration user enters "1234" into Merchant Name textfield
    And on Merchant Configuration user enters "1234" into Merchant Account Number textfield
    And on Merchant Configuration user selects "DOLLAR" from Currency Code dropdown
    And on Merchant Configuration user enters "retaintion 1" into Merchant Rentaintion one textfield
    And on Merchant Configuration user enters "retaintion 2" into Merchant Rentaintion two textfield
    And on Merchant Configuration user enters "4321" into Merchant Category Code textfield
    And on Merchant Configuration user clicks "Yes" from Status checkbox
    And on Merchant Configuration user clicks on Rank checkbox
    And on Merchant Configuration user enters "10" into Commission textfield
    And on Merchant Configuration user clicks on Save button
    Then Merchant Configuration page displays a success message "Merchant Configuration Saved Successfully!"
    And tenant user clicks on logout button

  Scenario: Edit Merchant Configuration with valid and complete data
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Configuration menu
    And user clicks on Merchant Configuration submenu
    Then system displays Merchant Configuration page
    And on Merchant Configuration page user clicks on Merchant Configuration tab
    And on Merchant Configuration page user clicks on Select button
    And on Merchant Configuration page user clicks on Update button
    Then Merchant Configuration page displays a success message "Merchant Configuration Saved Successfully!"
    And tenant user clicks on logout button

  Scenario: Add new Merchant Configuration without mandatory values
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Configuration menu
    And user clicks on Merchant Configuration submenu
    Then system displays Merchant Configuration page
    And on Merchant Configuration page user clicks on Merchant Configuration tab
    And on Merchant Configuration user clicks on New button
    And on Merchant Configuration user clicks on Save button
    Then Merchant Configuration page displays an alert message containing "Please select the Finantial"
    And Merchant Configuration page displays an alert message containing "Please select the Merchant Category ID"
    And Merchant Configuration page displays an alert message containing "Please select the Merchant Name"
    And Merchant Configuration page displays an alert message containing "Please select the Currency Code"
    And tenant user clicks on logout button

  Scenario: Add new Merchant POS Configuration with valid mandatory values
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Configuration menu
    And user clicks on Merchant Configuration submenu
    Then system displays Merchant Configuration page
    And on Merchant Configuration page user clicks on Merchant Pos_ID Configuration tab
    And on Merchant Configuration page user selects "ENS" from Financial Name dropdown
    And on Merchant Configuration page user selects "RCEHAH000001" from Merchant ID dropdown
    And on Merchant Configuration page user enters "123" into POS ID textfield
    And on Merchant Configuration page user clicks on Save button
    Then Merchant Configuration page displays an alert message "Merchant Detail Information Saved Successfully...!"
    And tenant user clicks on logout button

  Scenario: Add new Merchant POS Configuration with an exiting POS
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Configuration menu
    And user clicks on Merchant Configuration submenu
    Then system displays Merchant Configuration page
    And on Merchant Configuration page user clicks on Merchant Pos_ID Configuration tab
    And on Merchant Configuration page user selects "ENS" from Financial Name dropdown
    And on Merchant Configuration page user selects "RCEHAH000001" from Merchant ID dropdown
    And on Merchant Configuration page user enters "123" into POS ID textfield
    And on Merchant Configuration page user clicks on Save button
    Then Merchant Configuration page displays an alert message "Pos Detail already exists"
    And tenant user clicks on logout button

  Scenario: Add new Merchant POS Configuration without mandatory values
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Configuration menu
    And user clicks on Merchant Configuration submenu
    Then system displays Merchant Configuration page
    And on Merchant Configuration page user clicks on Merchant Pos_ID Configuration tab
    And on Merchant Configuration page user clicks on Save button
    Then Merchant Configuration page displays an alert message containing "Please select the Financial"
    Then Merchant Configuration page displays an alert message containing "Please select the Merchant ID"
    Then Merchant Configuration page displays an alert message containing "Please select the POS ID"
    And tenant user clicks on logout button

  Scenario: Edit Merchant POS Configuration with mandatory values
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Configuration menu
    And user clicks on Merchant Configuration submenu
    Then system displays Merchant Configuration page
    And on Merchant Configuration page user clicks on Merchant Pos_ID Configuration tab
    And on Merchant POS Configuration page tab user clicks on Edit button
    And on Merchant POS Configuration page tab user clicks on Update button
    Then on Merchant POS Configuration page displays an alert message "Merchant Detail Information Saved Successfully...!"
    And tenant user clicks on logout button