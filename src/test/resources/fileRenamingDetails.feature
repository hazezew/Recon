#  Author: Habitamu Azezew
#  Date: Nov 09, 2022
#  Project name: Reconciliation
#  Module: Task Operations
#  Activity: File Renaming Details
#  Project owner: EthSwitch
#  Vendor: CashLink
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@BranchConfiguration

Feature:  File Renaming Details
  Background: user opened web browser and maximizes it
    When user has entered test reconciliation system URL

  Scenario: File Renaming Details page integrity with mandatory value
    When user enters direct username into username field
    And user enters direct user password into password field
    And user selects direct user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Task Operations menu
    And user clicks on File Renaming Details submenu
    Then system displays File Renaming Details page
    And on File Renaming Details page user selects "ETHSWITCH-FILE" from Entity dropdown
    And on File Renaming Details page user selects "SVFE&SVBO" from Transacation Type dropdown
    And on File Renaming Details page user selects "1" from From Date calender
    And on File Renaming Details page user selects "20" from To Date calender
    And tenant user clicks on logout button

  Scenario: File Renaming Details page integrity without mandatory value
    When user enters direct username into username field
    And user enters direct user password into password field
    And user selects direct user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Task Operations menu
    And user clicks on File Renaming Details submenu
    Then system displays File Renaming Details page
    And on File Renaming Details page user clicks on Process button
    Then File Renaming Details page displays an alert message containing "Please select Entity Type"
    And File Renaming Details page displays an alert message containing "Please select Transaction Type"
    And tenant user clicks on logout button