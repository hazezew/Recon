#  Author: Habitamu Azezew
#  Date: Oct 27, 2022
#  Project name: Reconciliation
#  Module: User Management
#  Activity: User Management
#  Project owner: EthSwitch
#  Vendor: CashLink
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@UserManagement

Feature: User Management
  Background: user opened web browser and maximizes it
    When user has entered test reconciliation system URL

  Scenario: add new user with valid and complete data
    When user enters superAdmin username
    And user enters superAdmin password
    And user selects superAdmin financial
    And user clicks on Login button
    Then system displays superAdmin dashboard
    And user moves mouse over User Management menu
    And user moves mouse over Manage User submenu
    And user clicks on Add User submenu
    Then system displays Add User page
    And on add user page user selects User Authentication as application
    And on add user page user select "ENS" from financial name dropdown
    And on add user page user page user enters "MAKERUSER" into username text field
    And on add user page user clicks on check availability button
    And on add user page user enters "MAKER Name" into first name text field
    And on add user page user enters "MAKER Last name" into last name text field
    And on add user page user selects "MAKER" from profile dropdown option
    And on add user page user enters "makeruser@123" into password text field
    And on add user page user enters "makeruser@123" into confirm password text field
    And on add user page user enters "maker@ethswitch.com" into mail ID text field
    And on add user page user "Maker user description" into user description text field
    And on add user page user clicks on save button
    Then add user page displays a success message "User has been Created Sucessfully...!"
    And user clicks on logout button

  Scenario: add new user without all mandatory field values
    When user enters superAdmin username
    And user enters superAdmin password
    And user selects superAdmin financial
    And user clicks on Login button
    Then system displays superAdmin dashboard
    And user moves mouse over User Management menu
    And user moves mouse over Manage User submenu
    And user clicks on Add User submenu
    Then system displays Add User page
    And on add user page user selects User Authentication as application
    And on add user page user select "ENS" from financial name dropdown
    And on add user page user page user enters "NEWUSER" into username text field
    And on add user page user clicks on check availability button
    And on add user page user clicks on save button
    Then add user page displays an error message "1. Please Enter the First Name.\n2. Please Enter the Last Name.\n  3.Please Enter the password.\n4.Please Enter the Confirm Password.\n  5.Please Enter the Mail Id.\n  6.Please Enter the User Description."
    And user clicks on logout button

  Scenario: view user with existing user data
    When user enters superAdmin username
    And user enters superAdmin password
    And user selects superAdmin financial
    And user clicks on Login button
    Then system displays superAdmin dashboard
    And user moves mouse over User Management menu
    And user moves mouse over Manage User submenu
    And user clicks on View User submenu
    Then system displays View User page
    And on view user page user selects "ENS" from financial name dropdown
    And on view user page user selects "SADMIN" from username dropdown
    Then view user page displays "SUPER" into first name text field
    Then view user page displays "SUPER@ENS.com" into EmailID text field
    And user clicks on logout button

  Scenario: edit an existing user with all mandatory data
    When user enters superAdmin username
    And user enters superAdmin password
    And user selects superAdmin financial
    And user clicks on Login button
    Then system displays superAdmin dashboard
    And user moves mouse over User Management menu
    And user moves mouse over Manage User submenu
    And user clicks on Edit User submenu
    Then system displays Edit User page
    And on edit user page user selects "ENS" from financial name dropdown
    And on edit user page user selects "MULUGETA" from username dropdown
    And on edit user page user enters "MULUGETA" into firstname text field
    And on edit user page user enters "ANTEWA" into lastname text field
    And on edit user page user selects "ENSTEST" from profile dropdown
    And on edit user page user enters "MULUGETA@ETHSWITCH.COM" into email text field
    And on edit user page user enters "RECON ADMIN DESC" into description text field
    And on edit user page user clicks on update button
    Then edit user page displays "User Information Updation has approved Successfully...!" as a success message
    And user clicks on logout button

  Scenario: edit an existing user without first name mandatory data
    When user enters superAdmin username
    And user enters superAdmin password
    And user selects superAdmin financial
    And user clicks on Login button
    Then system displays superAdmin dashboard
    And user moves mouse over User Management menu
    And user moves mouse over Manage User submenu
    And user clicks on Edit User submenu
    Then system displays Edit User page
    And on edit user page user selects "ENS" from financial name dropdown
    And on edit user page user selects "HABITAMU" from username dropdown
    And on edit user page user clears firstname text field
    And on edit user page user clicks on update button
    Then edit user page displays "Please Enter First Name...!" as an error message
    And user clicks on logout button

  Scenario: edit an existing user without last name mandatory data
    When user enters superAdmin username
    And user enters superAdmin password
    And user selects superAdmin financial
    And user clicks on Login button
    Then system displays superAdmin dashboard
    And user moves mouse over User Management menu
    And user moves mouse over Manage User submenu
    And user clicks on Edit User submenu
    Then system displays Edit User page
    And on edit user page user selects "ENS" from financial name dropdown
    And on edit user page user selects "HABITAMU" from username dropdown
    And on edit user page user clears lastname text field
    And on edit user page user clicks on update button
    Then edit user page displays "Please Enter Last Name...!" as an error message
    And user clicks on logout button

  Scenario: edit an existing user without profile mandatory data
    When user enters superAdmin username
    And user enters superAdmin password
    And user selects superAdmin financial
    And user clicks on Login button
    Then system displays superAdmin dashboard
    And user moves mouse over User Management menu
    And user moves mouse over Manage User submenu
    And user clicks on Edit User submenu
    Then system displays Edit User page
    And on edit user page user selects "ENS" from financial name dropdown
    And on edit user page user selects "HABITAMU" from username dropdown
    And on edit user page user clears profile dropdown
    And on edit user page user clicks on update button
    Then edit user page displays "Please Choose Profile...!" as an error message
    And user clicks on logout button

  Scenario: edit an existing user without email mandatory data
    When user enters superAdmin username
    And user enters superAdmin password
    And user selects superAdmin financial
    And user clicks on Login button
    Then system displays superAdmin dashboard
    And user moves mouse over User Management menu
    And user moves mouse over Manage User submenu
    And user clicks on Edit User submenu
    Then system displays Edit User page
    And on edit user page user selects "ENS" from financial name dropdown
    And on edit user page user selects "HABITAMU" from username dropdown
    And on edit user page user clears email text field
    And on edit user page user clicks on update button
    Then edit user page displays "Please Enter Valid MailID...!" as an error message
    And user clicks on logout button

  Scenario: edit an existing user without description mandatory data
    When user enters superAdmin username
    And user enters superAdmin password
    And user selects superAdmin financial
    And user clicks on Login button
    Then system displays superAdmin dashboard
    And user moves mouse over User Management menu
    And user moves mouse over Manage User submenu
    And user clicks on Edit User submenu
    Then system displays Edit User page
    And on edit user page user selects "ENS" from financial name dropdown
    And on edit user page user selects "HABITAMU" from username dropdown
    And on edit user page user clears description text field
    And on edit user page user clicks on update button
    Then edit user page displays "Please enter User Description...!" as an error message
    And user clicks on logout button

  Scenario: recover forgotten password requests
    When user enters superAdmin username
    And user enters superAdmin password
    And user selects superAdmin financial
    And user clicks on Login button
    Then system displays superAdmin dashboard
    And user moves mouse over User Management menu
    And user mover mouse over Forget Password menu
    And user clicks on Request Forget Password
    Then system displays recover forgotten password page