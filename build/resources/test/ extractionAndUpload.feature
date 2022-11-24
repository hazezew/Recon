#  Author: Habitamu Azezew
#  Date: Nov 09, 2022
#  Project name: Reconciliation
#  Module: Task Operations
#  Activity: Extraction and Upload
#  Project owner: EthSwitch
#  Vendor: CashLink
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@BranchConfiguration

Feature: Extraction and Upload
  Background: user opened web browser and maximizes it
    When user has entered test reconciliation system URL

  Scenario: Extraction and Upload page integrity with upload option
    When user enters direct username into username field
    And user enters direct user password into password field
    And user selects direct user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Task Operations menu
    And user clicks on Extraction and Upload submenu
    Then system displays Extraction and Upload page
    And on Extraction and Upload page user clicks on Path Type Upload checkbox
    And on Extraction and Upload page user clicks on Upload button
    Then Extraction and Upload page display an error message "No files are selected"
    And tenant user clicks on logout button

  Scenario: Extraction and Upload page integrity with Extract option
    When user enters direct username into username field
    And user enters direct user password into password field
    And user selects direct user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Task Operations menu
    And user clicks on Extraction and Upload submenu
    Then system displays Extraction and Upload page
    And on Extraction and Upload page user clicks on Path Type Extract checkbox
    And on Extraction and Upload page user clicks on Extract button
    Then Extraction and Upload page display an error message "No Files Available"
    And tenant user clicks on logout button