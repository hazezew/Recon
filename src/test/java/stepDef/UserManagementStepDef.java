package stepDef;

import config.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.*;

public class UserManagementStepDef extends AbstractPage {
    private WebDriver driver;
    private AddProfilePage addProfilePage;
    private ViewProfilePage viewProfilePage;
    private EditProfilePage editProfilePage;
    private AddUserPage addUserPage;
    private ViewUserPage viewUserPage;
    private EditUserPage editUserPage;
    private ForgottenPasswordPage forgottenPasswordPage;

    public UserManagementStepDef(){
        this.driver=super.driver;
    }
    @And("user moves mouse over User Management menu")
    public void userMovesMouseOverUserManagementMenu() {
        superAdminDashboard.hoverUserManagement();
    }

    @And("user mover mouse over Forget Password menu")
    public void userMoverMouseOverForgetPasswordMenu() {
        superAdminDashboard.hoverLinkForgetPassword();
    }

    @And("user clicks on Request Forget Password")
    public void userClicksOnRequestForgetPassword() {
        forgottenPasswordPage=superAdminDashboard.clickLinkRequestForgetPassword();
    }

    @Then("system displays recover forgotten password page")
    public void systemDisplaysRecoverForgottenPasswordPage() {
        Assert.assertEquals(forgottenPasswordPage.getURL(),Config.forgottenPageURL);
    }

    @And("user moves mouse over Manage Profile submenu")
    public void userMovesMouseOverManageProfileSubmenu() {
        superAdminDashboard.hoverLinkManageProfile();
    }

    @And("user clicks on Add Profile submenu")
    public void userClicksOnAddProfileSubmenu() {
        addProfilePage=superAdminDashboard.clickLinkAddProfile();
    }

    @Then("system displays Add profile page")
    public void systemDisplaysAddProfilePage() {
        Assert.assertEquals(Config.addProfilePageURL,addProfilePage.getURL());
    }
    @And("on new profile page user selects {string} from financial name dropdown")
    public void onNewProfilePageUserSelectsFromFinancialNameDropdown(String financialName) {
        addProfilePage.setDdFinancialName(financialName);
    }

    @And("on new profile page user enters {string} into profile name text field")
    public void onNewProfilePageUserEntersIntoProfileNameTextField(String profileName) {
        addProfilePage.setTxtProfileName(profileName);
    }

    @And("on new profile page user clicks on save button")
    public void onNewProfilePageUserClicksOnSaveButton() {
        addProfilePage.clickBtnSave();
    }

    @Then("system displays an alert message {string}")
    public void systemDisplaysAnAlertMessage(String alertMessage) {
        System.out.println("Alert message: " + addProfilePage.getAlertMessage());
        System.out.println("Expected alert: " + alertMessage);
        Assert.assertEquals(alertMessage,addProfilePage.getAlertMessage());
    }

    @And("user clicks on view Profile submenu")
    public void userClicksOnViewProfileSubmenu() {
        viewProfilePage=superAdminDashboard.clickLinkViewProfile();
    }

    @Then("system displays view profile page")
    public void systemDisplaysViewProfilePage() {
        Assert.assertEquals(Config.viewProfilePageURL,viewProfilePage.getURL());
    }

    @And("user selects {string} from financial name dropdown option")
    public void userSelectsFromFinancialNameDropdownOption(String financial) {
        viewProfilePage.selectDdFinancialName(financial);
    }

    @And("user selects {string} from profile name dropdown option")
    public void userSelectsFromProfileNameDropdownOption(String profile) {
        viewProfilePage.selectDdProfileName(profile);
    }

    @And("user clicks on edit Profile submenu")
    public void userClicksOnEditProfileSubmenu() {
        editProfilePage=superAdminDashboard.clickLinkEditProfile();
    }

    @Then("system displays edit profile page")
    public void systemDisplaysEditProfilePage() {
        Assert.assertEquals(Config.editProfilePageURL,editProfilePage.getURL());
    }

    @And("on edit profile page user selects {string} from financial name dropdown option")
    public void onEditProfilePageUserSelectsFromFinancialNameDropdownOption(String financial) {
        editProfilePage.selectDdFinancialName(financial);
    }

    @And("on edit profile page user selects {string} from profile name dropdown option")
    public void onEditProfilePageUserSelectsFromProfileNameDropdownOption(String profile) {
        editProfilePage.selectDdProfileName(profile);
    }

    @And("on edit profile page user clicks on update button")
    public void onEditProfilePageUserClicksOnUpdateButton() {
        editProfilePage.clickBtnUpdate();
    }

    @And("user moves mouse over Manage User submenu")
    public void userMovesMouseOverManageUserSubmenu() {
        superAdminDashboard.hoverLinkManageUser();
    }

    @And("user clicks on Add User submenu")
    public void userClicksOnAddUserSubmenu() {
        addUserPage=superAdminDashboard.clickLinkAddUser();
    }

    @Then("system displays Add User page")
    public void systemDisplaysAddUserPage() {
        Assert.assertEquals(Config.addUserPageURL,addUserPage.getURL());
    }

    @And("on add user page user selects User Authentication as application")
    public void onAddUserPageUserSelectsUserAuthenticationAsApplication() {
        addUserPage.checkChkAppAuthenticationType();
    }

    @And("on add user page user select {string} from financial name dropdown")
    public void onAddUserPageUserSelectFromFinancialNameDropdown(String financial) {
        addUserPage.selectDDFinancialName(financial);
    }

    @And("on add user page user page user enters {string} into username text field")
    public void onAddUserPageUserPageUserEntersIntoUsernameTextField(String username) {
        addUserPage.enterTxtUsername(username);
    }

    @And("on add user page user clicks on check availability button")
    public void onAddUserPageUserClicksOnCheckAvailabilityButton() {
        addUserPage.clickBtnCheckAvailability();
    }

    @And("on add user page user enters {string} into first name text field")
    public void onAddUserPageUserEntersIntoFirstNameTextField(String firstName) {
        addUserPage.enterTxtFirstName(firstName);
    }

    @And("on add user page user enters {string} into last name text field")
    public void onAddUserPageUserEntersIntoLastNameTextField(String lastName) {
        addUserPage.enterTxtLastName(lastName);
    }

    @And("on add user page user selects {string} from profile dropdown option")
    public void onAddUserPageUserSelectsFromProfileDropdownOption(String profile) {
        addUserPage.selectDDProfile(profile);
    }

    @And("on add user page user enters {string} into password text field")
    public void onAddUserPageUserEntersIntoPasswordTextField(String password) {
        addUserPage.enterTxtPassword(password);
    }

    @And("on add user page user enters {string} into confirm password text field")
    public void onAddUserPageUserEntersIntoConfirmPasswordTextField(String confirmPassword) {
        addUserPage.enterTxtConfirmPassword(confirmPassword);
    }

    @And("on add user page user enters {string} into mail ID text field")
    public void onAddUserPageUserEntersIntoMailIDTextField(String mail) {
        addUserPage.enterTxtMailID(mail);
    }

    @And("on add user page user {string} into user description text field")
    public void onAddUserPageUserIntoUserDescriptionTextField(String desc) {
        addUserPage.enterTxtUserDescription(desc);
    }

    @And("on add user page user clicks on save button")
    public void onAddUserPageUserClicksOnSaveButton() {
        addUserPage.clickBtnSave();
    }


    @Then("add user page displays a success message {string}")
    public void addUserPageSystemDisplaysASuccessMessage(String successMsg) {
        Assert.assertEquals(addUserPage.getErrorSuccessMessage(),successMsg);
    }

    @Then("add user page displays an error message {string}")
    public void addUserPageDisplaysAnErrorMessage(String errorMessage) {
        Assert.assertEquals(Config.addUserAllMandatoryFieldValidationMessage,addUserPage.getErrorSuccessMessage());
    }

    @And("user clicks on View User submenu")
    public void userClicksOnViewUserSubmenu() {
        viewUserPage=superAdminDashboard.clickLinkViewUser();
    }

    @Then("system displays View User page")
    public void systemDisplaysViewUserPage() {
        Assert.assertEquals(Config.viewUserPageURL,viewUserPage.getURL());
    }

    @And("on view user page user selects {string} from financial name dropdown")
    public void onViewUserPageUserSelectsFromFinancialNameDropdown(String financial) {
        viewUserPage.selectDdFinancialName(financial);
    }

    @And("on view user page user selects {string} from username dropdown")
    public void onViewUserPageUserSelectsFromUsernameDropdown(String username) {
        viewUserPage.selectDDUserName(username);
    }

    @Then("view user page displays {string} into first name text field")
    public void viewUserPageDisplaysIntoFirstNameTextField(String firstName) {
        Assert.assertEquals(viewUserPage.getTxtFirstName(),firstName);
    }

    @Then("view user page displays {string} into EmailID text field")
    public void viewUserPageDisplaysIntoEmailIDTextField(String email) {
        Assert.assertEquals(viewUserPage.getTxtEmailID(),email);
    }

    @And("user clicks on Edit User submenu")
    public void userClicksOnEditUserSubmenu() {
        editUserPage=superAdminDashboard.clickLinkEditUser();
    }

    @Then("system displays Edit User page")
    public void systemDisplaysEditUserPage() {
        Assert.assertEquals(Config.editUserPageURL,editUserPage.getURL());
    }

    @And("on edit user page user selects {string} from financial name dropdown")
    public void onEditUserPageUserSelectsFromFinancialNameDropdown(String financial) {
        editUserPage.selectDdFinancialName(financial);
    }

    @And("on edit user page user selects {string} from username dropdown")
    public void onEditUserPageUserSelectsFromUsernameDropdown(String user) {
        editUserPage.selectDdUserName(user);
    }

    @And("on edit user page user enters {string} into firstname text field")
    public void onEditUserPageUserEntersIntoFirstnameTextField(String firstname) {
        editUserPage.enterTxtFirstName(firstname);
    }

    @And("on edit user page user enters {string} into lastname text field")
    public void onEditUserPageUserEntersIntoLastnameTextField(String lastname) {
        editUserPage.enterTxtLastName(lastname);
    }

    @And("on edit user page user selects {string} from profile dropdown")
    public void onEditUserPageUserSelectsFromProfileDropdown(String profile) {
        editUserPage.selectDdProfile(profile);
    }

    @And("on edit user page user enters {string} into email text field")
    public void onEditUserPageUserEntersIntoEmailTextField(String email) {
        editUserPage.enterTxtEmailID(email);
    }

    @And("on edit user page user enters {string} into description text field")
    public void onEditUserPageUserEntersIntoDescriptionTextField(String description) {
        editUserPage.enterTxtUserDescription(description);
    }

    @And("on edit user page user clicks on update button")
    public void onEditUserPageUserClicksOnUpdateButton() {
        editUserPage.clickBtnUpdate();
    }

    @Then("edit user page displays {string} as a success message")
    public void editUserPageDisplaysAsASuccessMessage(String errorSuccessMessage) {
        Assert.assertEquals(editUserPage.getErrorSuccessMessage(),errorSuccessMessage);
    }

    @And("on edit user page user clears firstname text field")
    public void onEditUserPageUserClearsFirstnameTextField() {
        editUserPage.clearTxtFirstName();
    }

    @And("on edit user page user clears lastname text field")
    public void onEditUserPageUserClearsLastnameTextField() {
        editUserPage.clearTxtLastName();
    }

    @And("on edit user page user clears profile dropdown")
    public void onEditUserPageUserClearsProfileDropdown() {
        editUserPage.clearDDProfile();
    }

    @And("on edit user page user clears email text field")
    public void onEditUserPageUserClearsEmailTextField() {
        editUserPage.clearTxtEmailID();
    }

    @And("on edit user page user clears description text field")
    public void onEditUserPageUserClearsDescriptionTextField() {
        editUserPage.clearTxtUserDescription();
    }

    @Then("edit user page displays {string} as an error message")
    public void editUserPageDisplaysAsAnErrorMessage(String alertMsg) {
        Assert.assertEquals(editUserPage.getAlertMessage(),alertMsg);
    }
}
