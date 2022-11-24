package stepDef;

import config.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.AbstractPage;
import pageObj.ForgotPasswordPage;
import pageObj.LoginPage;
import pageObj.UnlockUserPage;

public class LoginStepDef extends AbstractPage {
    private WebDriver driver;
    private LoginPage loginPage;
    private UnlockUserPage unlockUserPage;
    private ForgotPasswordPage forgotPasswordPage;

    public LoginStepDef(){
        this.driver=super.driver;
    }

    @When("user has entered test reconciliation system URL")
    public void user_has_entered_test_reconciliation_system_URL() {
        driver.get(Config.baseURL);
        loginPage=new LoginPage(driver);
        super.loginPage=loginPage;
    }

    @When("user enters superAdmin username")
    public void user_enters_superAdmin_username() {
        loginPage.setTxtUserName(Config.superUser);
    }

    @When("user enters superAdmin password")
    public void user_enters_superAdmin_password() {
        loginPage.setTxtPassword(Config.superPassword);
    }

    @And("user selects {string} as financial")
    public void userSelectsAsFinancial(String financial) {
        loginPage.setDdlFinancial(financial);
    }

    @When("user selects superAdmin financial")
    public void user_selects_superAdmin_financial() {
        loginPage.setDdlFinancial(Config.superFinancial);
    }

    @And("on login page user selects {string} from financial dropdown")
    public void onLoginPageUserSelectsFromFinancialDropdown(String fin) {
        loginPage.clickFinancialDropdown();
        loginPage.setDdlFinancial(fin);
    }

    @When("user clicks on Login button")
    public void user_clicks_on_Login_button() {
        superAdminDashboard= loginPage.clickBtnLogin();
    }

    @Then("system displays superAdmin dashboard")
    public void system_displays_superAdmin_dashboard() {
        Assert.assertTrue(Config.superAdminDashboard.equalsIgnoreCase(superAdminDashboard.getURL()));
    }
    @Then("user clicks on logout button")
    public void user_clicks_on_logout_button() {
        loginPage= superAdminDashboard.clickLinkLogout();
    }

    @Then("user is logged out of the system")
    public void user_is_logged_out_of_the_system() {
        Assert.assertTrue(Config.loggedoutPage.equalsIgnoreCase(loginPage.getURL()));
    }

    @When("user enters {string} as password")
    public void user_enters_as_password(String password) {
        loginPage.setTxtPassword(password);
    }

    @Then("system should display an alert error message {string}")
    public void system_should_display_an_alert_message(String errMessage) {
        Assert.assertTrue(loginPage.getAlertMessage().contains(errMessage));
    }

    @When("user clicks on unlockuser link")
    public void user_clicks_on_unlockuser_link() {
        unlockUserPage=loginPage.clickLnkUnlockUser();
    }

    @When("user enters {string} into username text field")
    public void user_enters_into_username_text_field(String username) {
        unlockUserPage.setTxtFgtUserName(username);
    }

    @When("user enters {string} into password text field")
    public void user_enters_into_password_text_field(String password) {
        unlockUserPage.setTxtFgtPwd(password);
    }

    @When("user selects {string} from financial from dropdown")
    public void user_selects_financial_from_dropdown(String financial) {
        unlockUserPage.setDdlFinancial1(financial);
    }

    @When("user clicks on unlock user button")
    public void user_clicks_on_unlock_user_button() {
        unlockUserPage.clickImgbtnFgtSubmit();
    }


    @When("user clicks on Forget-PWD link")
    public void user_clicks_on_Forget_PWD_link() {
        forgotPasswordPage=loginPage.clickLinkForgetPwd();
    }

    @When("on forgot password page user enters {string} as username")
    public void on_forgot_password_page_user_enters_as_username(String username) {
        forgotPasswordPage.setUsername(username);
    }

    @When("on forgot password page user selects {string} from financial dropdown")
    public void on_forgot_password_page_user_enters_as_password(String financial) {
        forgotPasswordPage.clickDDFinancial();
        forgotPasswordPage.setFinancial(financial);
    }

    @When("on forgot password page user clicks on submit button")
    public void on_forgot_password_page_user_clicks_on_submit_button() {
        forgotPasswordPage.clickSubmit();
    }

    @Then("system display an alert message {string}")
    public void system_display_an_alert_message(String expectedAlertMessage) {
        Assert.assertTrue(forgotPasswordPage.getAlertMessage().equalsIgnoreCase(expectedAlertMessage));
    }

    @And("on unlockuser page user selects {string} from financial dropdown")
    public void onUnlockuserPageUserSelectsFromFinancialDropdown(String fin) {
        unlockUserPage.clickDDFinancial();
        unlockUserPage.setDdlFinancial1(fin);
    }
}