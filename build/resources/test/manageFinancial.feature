#  Author: Habitamu Azezew
#  Date: Oct 27, 2022
#  Project name: Reconciliation
#  Module: Configuration
#  Activity: Add Financial
#  Project owner: EthSwitch
#  Vendor: CashLink
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@Configuration

  Feature: Financial institute Management
    Background: user opened web browser and maximizes it
      When user has entered test reconciliation system URL

      Scenario: add new financial with valid and complete data
        When user enters superAdmin username
        And user enters superAdmin password
        And user selects superAdmin financial
        And user clicks on Login button
        Then system displays superAdmin dashboard
        And user moves mouse over Configuration parent menu
        And user moves mouse over Financial Configuration submenu
        And user clicks on Add Financial submenu
        Then system displays add financial page
        And user enters "Abcd" into Financial Name text field
        And user enters "Description" into Description text field
        And user selects status "Enable" radio button
        And user clicks on save button
        Then system should display an alert message "Financial Details Inserted Successfully...!"
        And user clicks on logout button

        Scenario: add new financial with empty financial name
          When user enters superAdmin username
          And user enters superAdmin password
          And user selects superAdmin financial
          And user clicks on Login button
          Then system displays superAdmin dashboard
          And user moves mouse over Configuration parent menu
          And user moves mouse over Financial Configuration submenu
          And user clicks on Add Financial submenu
          Then system displays add financial page
          And user enters "Description" into Description text field
          And user selects status "Enable" radio button
          And user clicks on save button
          Then system should display an alert message "Please Enter Financial Name"
          And user clicks on logout button

    Scenario: add new financial with empty description detail
      When user enters superAdmin username
      And user enters superAdmin password
      And user selects superAdmin financial
      And user clicks on Login button
      Then system displays superAdmin dashboard
      And user moves mouse over Configuration parent menu
      And user moves mouse over Financial Configuration submenu
      And user clicks on Add Financial submenu
      Then system displays add financial page
      And user enters "Acb" into Financial Name text field
      And user selects status "Enable" radio button
      And user clicks on save button
      Then system should display an alert message "Please Enter Financial Description"
      And user clicks on logout button

    Scenario: add new financial with an existing financial name
      When user enters superAdmin username
      And user enters superAdmin password
      And user selects superAdmin financial
      And user clicks on Login button
      Then system displays superAdmin dashboard
      And user moves mouse over Configuration parent menu
      And user moves mouse over Financial Configuration submenu
      And user clicks on Add Financial submenu
      Then system displays add financial page
      And user enters "FINANCIAL" into Financial Name text field
      And user enters "Description" into Description text field
      And user selects status "Enable" radio button
      And user clicks on save button
      Then system should display an alert message "Financial Name already exists...!"
      And user clicks on logout button

      Scenario: check registered active financial on login page
        And on login page user selects "FINANCIAL" from financial dropdown

      Scenario: check registered active financial on forgot password page
        When user clicks on Forget-PWD link
        And on forgot password page user selects "FINANCIAL" from financial dropdown

      Scenario: check registered active financial on unlock user page
        When user clicks on unlockuser link
        And on unlockuser page user selects "FINANCIAL" from financial dropdown

        Scenario: edit registered financial
          When user enters superAdmin username
          And user enters superAdmin password
          And user selects superAdmin financial
          And user clicks on Login button
          Then system displays superAdmin dashboard
          And user moves mouse over Configuration parent menu
          And user moves mouse over Financial Configuration submenu
          And user clicks on view financial submenu
          Then system displays view financial page
          Then registered financial "FINANCIAL" is available for view
          And user clicks on logout button