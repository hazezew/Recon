package pageObj;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.beans.Visibility;
import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(id = "txtUserName")
    private WebElement txtUserName;

    @FindBy(id = "txtPassword")
    private WebElement txtPassword;

    @FindBy(id = "ddlFinancial")
    private WebElement ddlFinancial;

    @FindBy(id = "linkForgetPwd")
    private WebElement linkForgetPwd;

    @FindBy(id = "lnkUnlockUser")
    private WebElement lnkUnlockUser;

    @FindBy(id = "ImgbtnLogin")
    private WebElement btnLogin;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public void setTxtUserName(String userName){
        wait.until(ExpectedConditions.visibilityOf(txtUserName));
        txtUserName.sendKeys(userName);
    }
    public void setTxtPassword(String password){
        wait.until(ExpectedConditions.visibilityOf(txtPassword));
        txtPassword.sendKeys(password);
    }
    public void setDdlFinancial(String financial){
        wait.until(ExpectedConditions.visibilityOf(ddlFinancial));
        Select finDDL=new Select(ddlFinancial);
        finDDL.selectByVisibleText(financial);
    }
    public ForgotPasswordPage clickLinkForgetPwd(){
        wait.until(ExpectedConditions.visibilityOf(linkForgetPwd));
        linkForgetPwd.click();
        return new ForgotPasswordPage(driver);
    }
    public UnlockUserPage clickLnkUnlockUser(){
        wait.until(ExpectedConditions.visibilityOf(lnkUnlockUser));
        lnkUnlockUser.click();
        return new UnlockUserPage(driver);
    }

    public SuperAdminDashboard clickBtnLogin() {
        wait.until(ExpectedConditions.visibilityOf(btnLogin));
        btnLogin.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new SuperAdminDashboard(driver);
    }
    public TenantDashboardPage clickLoginButtonAsTenantUser(){
        wait.until(ExpectedConditions.visibilityOf(btnLogin));
        btnLogin.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new TenantDashboardPage(driver);
    }

    public String getAlertMessage(){
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String message=alert.getText();
        alert.accept();
        return message;
    }
    public void clickFinancialDropdown(){
        ddlFinancial.click();
    }
    public String getURL(){
        return driver.getCurrentUrl();
    }
}