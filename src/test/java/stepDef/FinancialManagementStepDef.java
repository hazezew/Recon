package stepDef;

import config.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.AddFinancialPage;
import pageObj.ViewFinancialPage;

public class FinancialManagementStepDef extends AbstractPage {
    private WebDriver driver;
    private AddFinancialPage addFinancialPage;
    private ViewFinancialPage viewFinancialPage;

    public FinancialManagementStepDef(){
        driver=super.driver;
    }

    @Then("user moves mouse over Configuration parent menu")
    public void user_clicks_on_Configuration_parent_menu() {
        superAdminDashboard.hoverConfigurationMenu();
    }

    @Then("user moves mouse over Financial Configuration submenu")
    public void user_clicks_on_Financial_Configuration_submenu() {
        superAdminDashboard.hoverFinancialConfiguration();
    }

    @Then("user clicks on Add Financial submenu")
    public void user_clicks_on_Add_Financial_submenu() {
        addFinancialPage=superAdminDashboard.clickAddFinancialMenu();
    }

    @Then("system displays add financial page")
    public void system_displays_add_financial_page() {
        Assert.assertEquals(Config.addFinancialPageURL,addFinancialPage.getURL());
    }

    @Then("user enters {string} into Financial Name text field")
    public void user_enters_into_Financial_Name_text_field(String finName) {
        addFinancialPage.setTxtFinancialName(finName);
    }

    @Then("user enters {string} into Description text field")
    public void user_enters_into_Description_text_field(String desc) {
        addFinancialPage.setTxtDescription(desc);
    }

    @Then("user selects status {string} radio button")
    public void user_selects_status_radio_button(String status) {
        addFinancialPage.setStatus(status);
    }

    @Then("user clicks on save button")
    public void user_clicks_on_save_button() {
        addFinancialPage.clickSaveButton();
    }

    @Then("system should display an alert message {string}")
    public void system_should_display_an_alert_message(String expectedAlertMessage) {
        Assert.assertEquals(addFinancialPage.getAlertMessage(),expectedAlertMessage);
    }

    @And("user clicks on view financial submenu")
    public void userClicksOnViewFinancialSubmenu() {
        viewFinancialPage= superAdminDashboard.clickLinkEditFinancial();
    }

    @Then("system displays view financial page")
    public void systemDisplaysViewFinancialPage() {
        Assert.assertEquals(viewFinancialPage.getURL(),Config.viewFinancialPageURL);
    }

    @Then("registered financial {string} is available for view")
    public void registeredFinancialIsDisplayed(String financial) {
        Assert.assertEquals(viewFinancialPage.getFinancialNameText(),financial);
    }
}
