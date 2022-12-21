$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/%20extractionAndUpload.feature");
formatter.feature({
  "name": "Extraction and Upload",
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
  "name": "Extraction and Upload page integrity with upload option",
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
  "name": "user enters direct username into username field",
  "keyword": "When "
});
formatter.match({
  "location": "TaskOperationsStepDef.userEntersDirectUsernameIntoUsernameField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters direct user password into password field",
  "keyword": "And "
});
formatter.match({
  "location": "TaskOperationsStepDef.userEntersDirectUserPasswordIntoPasswordField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects direct user financial from Financial dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "TaskOperationsStepDef.userSelectsDirectUserFinancialFromFinancialDropdown()"
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
  "error_message": "org.openqa.selenium.UnhandledAlertException: Dismissed user prompt dialog: User Already Login...!: \nBuild info: version: \u00274.3.0\u0027, revision: \u0027a4995e2c09*\u0027\nSystem info: host: \u0027HABITAMU-ETHSWI\u0027, ip: \u0027192.168.33.44\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCommand: [de9a890d-2e23-4098-88a0-003c71ed0650, getCurrentUrl {}]\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 107.0.1, moz:accessibilityChecks: false, moz:buildID: 20221128144904, moz:debuggerAddress: 127.0.0.1:51742, moz:geckodriverVersion: 0.31.0, moz:headless: false, moz:platformVersion: 10.0, moz:processID: 10320, moz:profile: C:\\Users\\Admin\\AppData\\Loca..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, moz:windowless: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://127.0.0.1:51742/devtoo..., se:cdpVersion: 85.0, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: de9a890d-2e23-4098-88a0-003c71ed0650\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:131)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:569)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:624)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:628)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getCurrentUrl(RemoteWebDriver.java:344)\r\n\tat pageObj.TenantDashboardPage.getURL(TenantDashboardPage.java:303)\r\n\tat stepDef.TaskOperationsStepDef.systemDisplaysTenantDashboardPage(TaskOperationsStepDef.java:50)\r\n\tat ✽.system displays tenant dashboard page(file:src/test/resources/%20extractionAndUpload.feature:23)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user moves mouse over Task Operations menu",
  "keyword": "And "
});
formatter.match({
  "location": "TaskOperationsStepDef.userMovesMouseOverTaskOperationsMenu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on Extraction and Upload submenu",
  "keyword": "And "
});
formatter.match({
  "location": "TaskOperationsStepDef.userClicksOnExtractionAndUploadSubmenu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "system displays Extraction and Upload page",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskOperationsStepDef.systemDisplaysExtractionAndUploadPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "on Extraction and Upload page user clicks on Path Type Upload checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "TaskOperationsStepDef.onExtractionAndUploadPageUserClicksOnPathTypeUploadCheckbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "on Extraction and Upload page user clicks on Upload button",
  "keyword": "And "
});
formatter.match({
  "location": "TaskOperationsStepDef.onExtractionAndUploadPageUserClicksOnUploadButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Extraction and Upload page display an error message \"No files are selected\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskOperationsStepDef.extractionAndUploadPageDisplayAnErrorMessage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "tenant user clicks on logout button",
  "keyword": "And "
});
formatter.match({
  "location": "TaskOperationsStepDef.tenantUserClicksOnLogoutButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "user opened web browser and maximizes it",
  "description": "",
  "keyword": "Background"
});
