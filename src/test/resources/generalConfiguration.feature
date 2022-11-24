#  Author: Habitamu Azezew
#  Date: Nov 10, 2022
#  Project name: Reconciliation
#  Module: General Configuration
#  Activity: General Configuration
#  Project owner: EthSwitch
#  Vendor: CashLink
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@GeneralConfiguration

Feature: General Configuration
  Background: user opened web browser and maximizes it
    When user has entered test reconciliation system URL

  @TransactionIDConfig
    Scenario: TransactionID configuration page integrity
      When user enters checker username into username field
      And user enters checker user password into password field
      And user selects checker user financial from Financial dropdown
      And tenant user clicks on Login button
      Then system displays tenant dashboard page
      And user moves mouse over Configuration menu
      And user moves mouse over General Configuration menu
      And user clicks on TranID Configuration child menu
      Then system opens TranID Configuration page
      And user selects "ENS" from Financial Name dropdown
      And user selects "SVBO" from Entity Name dropdown
      And user clicks on Cancel button
      And tenant user clicks on logout button

  Scenario: Add Entity Configuration page integrity
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Configuration menu
    And user moves mouse over General Configuration menu
    And user clicks on Entity Configuration child menu
    Then system opens Entity Configuration page
    And on Entity Configuration user selects "ENS" from Financial Name dropdown
    And on Entity Configuration user enters "ENtity" into Entity Name textfield
    And on Entity Configuration user enters "Entity Desc" into Entity Description textfield
    And on Entity Configuration user clicks on Save button
    And tenant user clicks on logout button

  Scenario: Reason Code Configuration page integrity
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Configuration menu
    And user moves mouse over General Configuration menu
    And user clicks on Reason Code Configuration child menu
    Then system opens Reason Code Configuration page
    And on Reason Code Configuration user clicks on New button
    And on Reason Code Configuration user enters "Reason Desc" into Reason Description textfield
    And on Reason Code Configuration user clicks on Save button
#    Then Reason Code Configuration displays an error/success message
    And tenant user clicks on logout button

  Scenario: new valid Currency Configuration page integrity
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Configuration menu
    And user moves mouse over General Configuration menu
    And user clicks on Currency Configuration child menu
    Then system opens Currency Configuration page
    And on Currency Configuration user clicks on New button
    And on Currency Configuration user selects "ENS" from Financial Name dropdown
    And on Currency Configuration user enters "321" into Code textfield
    And on Currency Configuration user enters "Dollar" into Name textfield
    And on Currency Configuration user enters "USA" into Country textfield
    And on Currency Configuration user enters "Dollar" into Abbreviation textfield
    And on Currency Configuration user enters "Dollar Description" into Description textfield
    And on Currency Configuration user clicks on Save button
    Then Currency Configuration displays an alert message "Currency Details Saved successfully...!"
    And tenant user clicks on logout button

  Scenario: duplicate Currency Configuration page integrity
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Configuration menu
    And user moves mouse over General Configuration menu
    And user clicks on Currency Configuration child menu
    Then system opens Currency Configuration page
    And on Currency Configuration user clicks on New button
    And on Currency Configuration user selects "ENS" from Financial Name dropdown
    And on Currency Configuration user enters "123" into Code textfield
    And on Currency Configuration user enters "Name" into Name textfield
    And on Currency Configuration user enters "Ethiopia" into Country textfield
    And on Currency Configuration user enters "BR" into Abbreviation textfield
    And on Currency Configuration user enters "Birr Description" into Description textfield
    And on Currency Configuration user clicks on Save button
    Then Currency Configuration displays an alert message "Currency Details Already Exist for this Currency code...!"
    And tenant user clicks on logout button