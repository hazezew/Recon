#  Author: Habitamu Azezew
#  Date: Oct 27, 2022
#  Project name: Reconciliation
#  Module: Profile Management
#  Activity: Manage Profile
#  Project owner: EthSwitch
#  Vendor: CashLink
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@ProfileManagement

  Feature: Profile Management
    Background: user opened web browser and maximizes it
      When user has entered test reconciliation system URL

    Scenario: add new profile with valid and complete data
      When user enters superAdmin username
      And user enters superAdmin password
      And user selects superAdmin financial
      And user clicks on Login button
      Then system displays superAdmin dashboard
      And user moves mouse over User Management menu
      And user moves mouse over Manage Profile submenu
      And user clicks on Add Profile submenu
      Then system displays Add profile page
      And on new profile page user selects "ENS" from financial name dropdown
      And on new profile page user enters "ENSPROFILE" into profile name text field
      And on new profile page user clicks on save button
      Then system displays an alert message "Please Choose a Menu for the Profile...!"
      And user clicks on logout button

    Scenario: view profile page integrity
      When user enters superAdmin username
      And user enters superAdmin password
      And user selects superAdmin financial
      And user clicks on Login button
      Then system displays superAdmin dashboard
      And user moves mouse over User Management menu
      And user moves mouse over Manage Profile submenu
      And user clicks on view Profile submenu
      Then system displays view profile page
      And user selects "ENS" from financial name dropdown option
      And user selects "CHECKER" from profile name dropdown option
      And user clicks on logout button

    Scenario: edit profile with valid and complete data
      When user enters superAdmin username
      And user enters superAdmin password
      And user selects superAdmin financial
      And user clicks on Login button
      Then system displays superAdmin dashboard
      And user moves mouse over User Management menu
      And user moves mouse over Manage Profile submenu
      And user clicks on edit Profile submenu
      Then system displays edit profile page
      And on edit profile page user selects "ENS" from financial name dropdown option
      And on edit profile page user selects "CHECKER" from profile name dropdown option
      And on edit profile page user clicks on update button
      And user clicks on logout button