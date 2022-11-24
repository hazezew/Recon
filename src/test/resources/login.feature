#  Author: Habitamu Azezew
#  Date: Oct 19, 2022
#  Project name: Reconciliation
#  Module: Login
#  Activity: User Login, forgot password, unlock user
#  Project owner: EthSwitch
#  Vendor: CashLink
#  language: en
#  Test Environment: EthSwitch Test

@Regression
  @Login
  Feature: Login user
    Background: user opened web browser and maximizes it
      When user has entered test reconciliation system URL

      Scenario: Valid superAdmin username password and financial
        When user enters superAdmin username
        And user enters superAdmin password
        And user selects superAdmin financial
        And user clicks on Login button
        Then system displays superAdmin dashboard
        And user clicks on logout button
        Then user is logged out of the system

    Scenario: Valid username, but invalid password and valid financial
      When user enters superAdmin username
      And user enters "password" as password
      And user selects superAdmin financial
      And user clicks on Login button
      Then system should display an alert error message "Invalid Password...!"

      Scenario: empty username but has password and financial
        When user enters "password" as password
        And user selects superAdmin financial
        And user clicks on Login button
        Then system should display an alert error message "Enter User Name...!"

    Scenario: valid username and financial but empty password
      When user enters superAdmin username
      And user selects superAdmin financial
      And user clicks on Login button
      Then system should display an alert error message "Enter Password...!"

    Scenario: valid username and password but empty financial
      When user enters superAdmin username
      And user enters superAdmin password
      And user clicks on Login button
      Then system should display an alert error message "Select Financial...!"

    Scenario: valid username and password but invalid financial
      When user enters superAdmin username
      And user enters superAdmin password
      And user selects "FINANCIAL" as financial
      And user clicks on Login button
      Then system should display an alert error message "Invalid User for Selected Financial...!"

      Scenario: Unlock a locked user
        When user clicks on unlockuser link
        And user enters "SADMIN" into username text field
        And user enters "admin@2022" into password text field
        And user selects "ENS" from financial from dropdown
        And user clicks on unlock user button

#  The following Scenario is disabled as it creates a havoc to the system user
#        Scenario: forgot password
#          When user clicks on Forget-PWD link
#          And on forgot password page user enters "SADMIN" as username
#          And on forgot password page user selects "ENS" from financial dropdown
#          And on forgot password page user clicks on submit button
#          Then system display an alert message "Request made for Forget Password...!"