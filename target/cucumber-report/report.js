$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/binConfiguration.feature");
formatter.feature({
  "name": "BIN Configuration",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@BranchConfiguration"
    }
  ]
});
formatter.background({
  "name": "user opened web browser and maximizes it",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has entered test reconciliation system URL",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.user_has_entered_test_reconciliation_system_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "New BIN registration with valid and complete data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@BranchConfiguration"
    }
  ]
});
formatter.step({
  "name": "user enters checker username into username field",
  "keyword": "When "
});
formatter.match({
  "location": "TaskOperationsStepDef.userEntersCheckerUsernameIntoUsernameField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters checker user password into password field",
  "keyword": "And "
});
formatter.match({
  "location": "TaskOperationsStepDef.userEntersCheckerUserPasswordIntoPasswordField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects checker user financial from Financial dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "TaskOperationsStepDef.userSelectsCheckerUserFinancialFromFinancialDropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "tenant user clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "TaskOperationsStepDef.tenantUserClicksOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "system displays tenant dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskOperationsStepDef.systemDisplaysTenantDashboardPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user moves mouse over Configuration menu",
  "keyword": "And "
});
formatter.match({
  "location": "ConfigurationStepDef.userMovesMouseOverConfigurationMenu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on BIN Configuration submenu",
  "keyword": "And "
});
formatter.match({
  "location": "ConfigurationStepDef.userClicksOnBINConfigurationSubmenu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "system displays BIN Configuration page",
  "keyword": "Then "
});
formatter.match({
  "location": "ConfigurationStepDef.systemDisplaysBINConfigurationPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "on BIN Configuration page user clicks on New button",
  "keyword": "And "
});
formatter.match({
  "location": "ConfigurationStepDef.onBINConfigurationPageUserClicksOnNewButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "on BIN Configuration page user selects \"ENS\" from Financial Name dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "ConfigurationStepDef.onBINConfigurationPageUserSelectsFromFinancialNameDropdown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "on BIN Configuration page user selects \"ETHSWITCH\" from Entity Name dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "ConfigurationStepDef.onBINConfigurationPageUserSelectsFromEntityNameDropdown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "on BIN Configuration page user enters \"1231\" into Bin No textfield",
  "keyword": "And "
});
formatter.match({
  "location": "ConfigurationStepDef.onBINConfigurationPageUserEntersIntoBinNoTextfield(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "on BIN Configuration page user selects \"Credit\" from Card Type dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "ConfigurationStepDef.onBINConfigurationPageUserSelectsFromCardTypeDropdown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "on BIN Configuration page user clicks on Save button",
  "keyword": "And "
});
formatter.match({
  "location": "ConfigurationStepDef.onBINConfigurationPageUserClicksOnSaveButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "BIN Configuration page displays success message \"BIN Details Saved Successfully...!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ConfigurationStepDef.binConfigurationPageDisplaysSuccessMessage(String)"
});
