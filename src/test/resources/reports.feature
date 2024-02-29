#  Author: Habitamu Azezew
#  Date: Nov 09, 2022
#  Project name: Reconciliation
#  Module: Task Operations
#  Activity: Automatic Reconciliation
#  Project owner: EthSwitch
#  Vendor: CashLink
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@Report

Feature: Reconciliation Report
  Background: user opened web browser and maximizes it
    When user has entered test reconciliation system URL
    When user enters direct username into username field
    And user enters direct user password into password field
    And user selects direct user financial from Financial dropdown
    And tenant user clicks on Login button

  Scenario: Daily Interoperable Dispute Transactions report
    And user opens Daily Interoperable Dispute Transactions report