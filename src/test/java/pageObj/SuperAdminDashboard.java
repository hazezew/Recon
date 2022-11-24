package pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SuperAdminDashboard {
    private WebDriver driver;
    public WebDriverWait wait;
    private Actions action;

    @FindBy(id="lnkbtnLogOut")
    private WebElement linkLogout;

//    Configuration parent menu
    @FindBy(linkText = "Configuration")
    private WebElement configuration;

    @FindBy(xpath = "//*[@id=\"menu\"]/ul/li[1]/div/ul/li/a/span")
    private WebElement financialConfiguration;

    @FindBy(linkText = "Add Financial")
    private WebElement addFinancial;

    @FindBy(linkText = "View Financial")
    private WebElement linkViewFinancial;

    @FindBy(linkText = "Edit Financial")
    private WebElement linkEditFinancial;

    @FindBy(linkText = "View Financial")
    private WebElement viewFinancial;

    @FindBy(linkText = "Edit Financial")
    private WebElement editFinancial;

//    User management parent menu
    @FindBy(linkText = "User Management")
    private WebElement userManagement;

//    Manage profile submenu
    @FindBy(xpath = "//*[@id=\"menu\"]/ul/li[2]/div/ul/li[1]/a/span")
    private WebElement linkManageProfile;

    @FindBy(linkText = "Add Profile")
    private WebElement linkAddProfile;

    @FindBy(linkText = "View Profile")
    private WebElement linkViewProfile;

    @FindBy(partialLinkText = "Edit Profile")
    private WebElement linkEditProfile;

//    Manage user submenu
    @FindBy(linkText= "Manage User")
    private WebElement linkManageUser;

    @FindBy(linkText = "Add User")
    private WebElement linkAddUser;

    @FindBy(linkText = "View User")
    private WebElement linkViewUser;

    @FindBy(linkText = "Edit User")
    private WebElement linkEditUser;

//    Implement Recover Forgot passwords
    @FindBy(linkText = "Forget Password")
    private WebElement linkForgetPassword;

    @FindBy(linkText = "Request Forget Password")
    private WebElement linkRequestForgetPassword;

    public SuperAdminDashboard(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public void hoverConfigurationMenu(){
        wait.until(ExpectedConditions.visibilityOf(configuration));
        action.moveToElement(configuration).perform();
    }
    public void hoverFinancialConfiguration(){
        wait.until(ExpectedConditions.visibilityOf(financialConfiguration));
        action.moveToElement(financialConfiguration).perform();
    }
    public AddFinancialPage clickAddFinancialMenu(){
        wait.until(ExpectedConditions.visibilityOf(addFinancial));
        addFinancial.click();
        return new AddFinancialPage(driver);
    }

    public ViewFinancialPage clickLinkEditFinancial(){
        wait.until(ExpectedConditions.visibilityOf(viewFinancial));
        viewFinancial.click();
        return new ViewFinancialPage(driver);
    }

    public void hoverUserManagement(){
        wait.until(ExpectedConditions.visibilityOf(userManagement));
        action.moveToElement(userManagement).perform();
    }
    public void hoverLinkManageProfile(){
        wait.until(ExpectedConditions.visibilityOf(linkManageProfile));
        action.moveToElement(linkManageProfile).perform();
    }
    public AddProfilePage clickLinkAddProfile(){
        wait.until(ExpectedConditions.visibilityOf(linkAddProfile));
        linkAddProfile.click();
        return new AddProfilePage(driver);
    }
    public ViewProfilePage clickLinkViewProfile(){
        wait.until(ExpectedConditions.visibilityOf(linkViewProfile));
        linkViewProfile.click();
        return new ViewProfilePage(driver);
    }
    public EditProfilePage clickLinkEditProfile(){
        wait.until(ExpectedConditions.visibilityOf(linkEditProfile));
        linkEditProfile.click();
        return new EditProfilePage(driver);
    }
    public void hoverLinkManageUser(){
        wait.until(ExpectedConditions.visibilityOf(linkManageUser));
        action.moveToElement(linkManageUser).perform();
    }
    public AddUserPage clickLinkAddUser(){
        wait.until(ExpectedConditions.visibilityOf(linkAddUser));
        linkAddUser.click();
        return new AddUserPage(driver);
    }
    public ViewUserPage clickLinkViewUser(){
        wait.until(ExpectedConditions.visibilityOf(linkViewUser));
        linkViewUser.click();
        return new ViewUserPage(driver);
    }
    public EditUserPage clickLinkEditUser(){
        wait.until(ExpectedConditions.visibilityOf(linkEditUser));
        linkEditUser.click();
        return new EditUserPage(driver);
    }

    public void hoverLinkForgetPassword(){
        wait.until(ExpectedConditions.visibilityOf(linkForgetPassword));
        action.moveToElement(linkForgetPassword).perform();
    }

    public ForgottenPasswordPage clickLinkRequestForgetPassword(){
        wait.until(ExpectedConditions.visibilityOf(linkRequestForgetPassword));
        linkRequestForgetPassword.click();
        return new ForgottenPasswordPage(driver);
    }

    public LoginPage clickLinkLogout(){
        Actions action=new Actions(driver);
        action.moveToElement(linkLogout);
        wait.until(ExpectedConditions.visibilityOf(linkLogout));
        wait.until(ExpectedConditions.elementToBeClickable(linkLogout));
        linkLogout.click();
        return new LoginPage(driver);
    }
    public String getURL(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver.getCurrentUrl();
    }
}
