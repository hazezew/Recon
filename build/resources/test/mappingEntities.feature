#  Author: Habitamu Azezew
#  Date: Nov 09, 2022
#  Project name: Reconciliation
#  Module: Mapping Entities Management
#  Activity: File Configuration
#  Project owner: EthSwitch
#  Vendor: CashLink
#  language: en
#  Test Environment: EthSwitch Test

@Regression
@MappingEntities

Feature: Mapping Entities Management
  Background: user opened web browser and maximizes it
    When user has entered test reconciliation system URL

  Scenario: Mapping Entities Management page integrity
    When user enters checker username into username field
    And user enters checker user password into password field
    And user selects checker user financial from Financial dropdown
    And tenant user clicks on Login button
    Then system displays tenant dashboard page
    And user moves mouse over Configuration menu
    And user clicks on Mapping Entities
    Then system displays Mapping Entities page
    And on Mapping Entities page user selects "Same Financial" from sameDifferent Financial dropdown
    And on Mapping Entities page user selects "ENS" from financial name dropdown
    And on Mapping Entities page user clicks on Cancel button
    And tenant user clicks on logout button