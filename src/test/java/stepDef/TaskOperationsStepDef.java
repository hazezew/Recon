package stepDef;

import config.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.*;

public class TaskOperationsStepDef extends AbstractPage {
    private WebDriver driver;
    private LoginPage loginPage;
    private TenantDashboardPage tenantDashboardPage;
    private TransactionStatusPage transactionStatusPage;
    private RollbackPage rollbackPage;
    private FileRenamingDetailsPage fileRenamingDetailsPage;
    private ExtractionAndUploadPage extractionAndUploadPage;
    private AutomaticReconciliationPage automaticReconciliationPage;

    public TaskOperationsStepDef(){
        this.driver=super.driver;
        this.loginPage=super.loginPage;
    }

    @When("user enters checker username into username field")
    public void userEntersCheckerUsernameIntoUsernameField() {
        loginPage.setTxtUserName(Config.checkerUserName);
    }

    @And("user enters checker user password into password field")
    public void userEntersCheckerUserPasswordIntoPasswordField() {
        loginPage.setTxtPassword(Config.checkerUserPassword);
    }

    @And("user selects checker user financial from Financial dropdown")
    public void userSelectsCheckerUserFinancialFromFinancialDropdown() {
        loginPage.setDdlFinancial(Config.checkerMakerDirectFinancial);
    }


    @And("tenant user clicks on Login button")
    public void tenantUserClicksOnLoginButton() {
        super.tenantDashboardPage=loginPage.clickLoginButtonAsTenantUser();
        this.tenantDashboardPage=super.tenantDashboardPage;
    }

    @Then("system displays tenant dashboard page")
    public void systemDisplaysTenantDashboardPage() {
        Assert.assertEquals(tenantDashboardPage.getURL(),Config.tenantDashboardPageURL);
    }

    @And("user moves mouse over Task Operation menu")
    public void userMovesMouseOverTaskOperationMenu() {
        tenantDashboardPage.hoverLinkTaskOperations();
    }

    @And("user clicks on Transaction Status submenu")
    public void userClicksOnTransactionStatusSubmenu() {
        transactionStatusPage=tenantDashboardPage.clickLinkTransactionStatus();
    }

    @Then("system displays Transaction Status page")
    public void systemDisplaysTransactionStatusPage() {
        Assert.assertEquals(transactionStatusPage.getURL(),Config.transactionStatusPageURL);
    }


    @And("on Transaction Status page user selects {string} from Bank name dropdown")
    public void onTransactionStatusPageUserSelectsFromBankNameDropdown(String bankName) {
        transactionStatusPage.selectDdBankName(bankName);
    }


    @And("on Transaction Status page user selects {string} from Transaction Nature dropdown")
    public void onTransactionStatusPageUserSelectsFromTransactionNatureDropdown(String txnNature) {
        transactionStatusPage.selectDdTransactionNature(txnNature);
    }

    @Then("on Transaction Status page user clicks on Filter button")
    public void onTransactionStatusPageUserClicksOnFilterButton() {
        transactionStatusPage.clickBtnFilter();
    }

    @And("tenant user clicks on logout button")
    public void tenantUserClicksOnLogoutButton() {
        tenantDashboardPage.clickLnkbtnLogOut();
    }

    @And("user clicks on Rollback submenu")
    public void userClicksOnRollbackSubmenu() {
        rollbackPage=tenantDashboardPage.clickLinkRollback();
    }

    @Then("system displays Rollback page")
    public void systemDisplaysRollbackPage() {
        Assert.assertEquals(rollbackPage.getURL(),Config.rollbackPageURL);
    }

    @And("on Rollback page user selects {string} from Entity dropdown")
    public void onRollbackPageUserSelectsFromEntityDropdown(String entity) {
        rollbackPage.selectDdEntity(entity);
    }

    @And("on Rollback page user clicks on Upload checkbox")
    public void onRollbackPageUserClicksOnUploadCheckbox() {
        rollbackPage.clickChkUpload();
    }

    @And("on Rollback page user clicks on Extraction checkbox")
    public void onRollbackPageUserClicksOnExtractionCheckbox() {
        rollbackPage.clickChkExtraction();
    }

    @And("on Rollback page user clicks on Cancel button")
    public void onRollbackPageUserClicksOnCancelButton() {
        rollbackPage.clickBtnCancel();
    }

    @When("user enters direct username into username field")
    public void userEntersDirectUsernameIntoUsernameField() {
        loginPage.setTxtUserName(Config.directUserName);
    }

    @And("user enters direct user password into password field")
    public void userEntersDirectUserPasswordIntoPasswordField() {
        loginPage.setTxtPassword(Config.directUserPassword);
    }

    @And("user selects direct user financial from Financial dropdown")
    public void userSelectsDirectUserFinancialFromFinancialDropdown() {
        loginPage.setDdlFinancial(Config.checkerMakerDirectFinancial);
    }

//    @Then("system displays tenant direct user dashboard page")
//    public void systemDisplaysTenantDirectUserDashboardPage() {
//
//    }

    @And("user moves mouse over Task Operations menu")
    public void userMovesMouseOverTaskOperationsMenu() {
        tenantDashboardPage.hoverLinkTaskOperations();
    }

    @And("user clicks on File Renaming Details submenu")
    public void userClicksOnFileRenamingDetailsSubmenu() {
        fileRenamingDetailsPage=tenantDashboardPage.clickLinkFileRenamingDetails();
    }

    @Then("system displays File Renaming Details page")
    public void systemDisplaysFileRenamingDetailsPage() {
        Assert.assertEquals(fileRenamingDetailsPage.getURL(),Config.fileRenamingDetailsPageURL);
    }

    @And("on File Renaming Details page user selects {string} from Entity dropdown")
    public void onFileRenamingDetailsPageUserSelectsFromEntityDropdown(String entity) {
        fileRenamingDetailsPage.selectDDEntityType(entity);
    }

    @And("on File Renaming Details page user selects {string} from Transacation Type dropdown")
    public void onFileRenamingDetailsPageUserSelectsFromTransacationTypeDropdown(String trnType) {
        fileRenamingDetailsPage.selectDDTranscationType(trnType);
    }

    @And("on File Renaming Details page user selects {string} from From Date calender")
    public void onFileRenamingDetailsPageUserSelectsFromFromDateCalender(String from) {
        fileRenamingDetailsPage.selectCalFromDate(from);
    }

    @And("on File Renaming Details page user selects {string} from To Date calender")
    public void onFileRenamingDetailsPageUserSelectsFromToDateCalender(String to) {
        fileRenamingDetailsPage.clickCalToDate(to);
    }

    @Then("on File Renaming Details page user clicks on Process button")
    public void on_File_Renaming_Details_page_user_clicks_on_Process_button() {
        fileRenamingDetailsPage.clickBtnProcess();
    }

    @Then("File Renaming Details page displays an alert message containing {string}")
    public void file_Renaming_Details_page_displays_an_alert_message_containing(String partOfMsg) {
        Assert.assertTrue(fileRenamingDetailsPage.getAlertMessage().contains(partOfMsg));
    }

    @And("user clicks on Extraction and Upload submenu")
    public void userClicksOnExtractionAndUploadSubmenu() {
        extractionAndUploadPage=tenantDashboardPage.clickLinkExtractionAndUpload();
    }

    @Then("system displays Extraction and Upload page")
    public void systemDisplaysExtractionAndUploadPage() {
        Assert.assertEquals(extractionAndUploadPage.getURL(),Config.extractionAndUploadPageURL);
    }

    @And("on Extraction and Upload page user clicks on Path Type Upload checkbox")
    public void onExtractionAndUploadPageUserClicksOnPathTypeUploadCheckbox() {
        extractionAndUploadPage.clickChkUpload();
    }

    @And("on Extraction and Upload page user clicks on Upload button")
    public void onExtractionAndUploadPageUserClicksOnUploadButton() {
        extractionAndUploadPage.clickBtnUpload();
    }

    @Then("Extraction and Upload page display an error message {string}")
    public void extractionAndUploadPageDisplayAnErrorMessage(String msg) {
        Assert.assertEquals(extractionAndUploadPage.getMsgDisplay(),msg);
    }

    @And("on Extraction and Upload page user clicks on Path Type Extract checkbox")
    public void onExtractionAndUploadPageUserClicksOnPathTypeExtractCheckbox() {
        extractionAndUploadPage.clickChkExtraction();
    }

    @And("on Extraction and Upload page user clicks on Extract button")
    public void onExtractionAndUploadPageUserClicksOnExtractButton() {
        extractionAndUploadPage.clickBtnExtract();
    }

    @And("user clicks on Automatic Reconciliation submenu")
    public void userClicksOnAutomaticReconciliationSubmenu() {
        automaticReconciliationPage=tenantDashboardPage.clickLinkAutomaticReconciliation();
    }

    @Then("system displays Automatic Reconciliation page")
    public void systemDisplaysAutomaticReconciliationPage() {
        Assert.assertEquals(automaticReconciliationPage.getURL(),Config.automaticReconciliationPageURL);
    }

    @And("on Automatic Reconciliation page user selects {string} from Transaction Type dropdown")
    public void onAutomaticReconciliationPageUserSelectsFromTransactionTypeDropdown(String trnxType) {
        automaticReconciliationPage.selectDDTransactionType(trnxType);
    }

    @And("on Automatic Reconciliation page user clicks on Reconciliation button")
    public void onAutomaticReconciliationPageUserClicksOnReconciliationButton() {
        automaticReconciliationPage.clickBtnReconciliation();
    }

    @Then("Automatic Reconciliation page display an alert message containing {string}")
    public void automaticReconciliationPageDisplayAnAlertMessageContaining(String partOfAlertMsg) {
        Assert.assertTrue(automaticReconciliationPage.getAlertMessage().contains(partOfAlertMsg));
    }
}