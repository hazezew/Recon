package pageObj;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddUserPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private String alertMessage="";

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_lblMsg\"]")
    private WebElement messageDisplay;

    @FindBy(id = "ContentPlaceHolder1_rbluserauthendication_1")
    private WebElement chkAppAuthenticationType;

    @FindBy(id="ContentPlaceHolder1_ddlFinancialId")
    private WebElement ddFinancialName;

    @FindBy(id="ContentPlaceHolder1_txtUserName")
    private WebElement txtUsername;

    @FindBy(id="ContentPlaceHolder1_chkAvailability")
    private WebElement btnCheckAvailability;

    @FindBy(id="ContentPlaceHolder1_txtFirstName")
    private WebElement txtFirstName;

    @FindBy(id="ContentPlaceHolder1_txtLastName")
    private WebElement txtLastName;

    @FindBy(id="ContentPlaceHolder1_ddlProfile")
    private WebElement ddProfile;

    @FindBy(id="ContentPlaceHolder1_ddlOptions")
    private WebElement ddUserType; //Disabled and don't know why and what is its use.

    @FindBy(id="ContentPlaceHolder1_txtPassword")
    private WebElement txtPassword;

    @FindBy(id="ContentPlaceHolder1_txtConfirmPassword")
    private WebElement txtConfirmPassword;

    @FindBy(id="ContentPlaceHolder1_txtMailId")
    private WebElement txtMailID;

    @FindBy(id="ContentPlaceHolder1_txtUserDescription")
    private WebElement txtUserDescription;

    @FindBy(id="ContentPlaceHolder1_chkActive")
    private WebElement chkIsActive;

    @FindBy(id="ContentPlaceHolder1_RdpStatus_1")
    private WebElement chkIsInActive;

    @FindBy(xpath="//*[@id=\"ContentPlaceHolder1_btnAdd\"]")
    private WebElement btnSave;

    @FindBy(id="ContentPlaceHolder1_btnCancel")
    private WebElement btnCancel;

    public AddUserPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
    }

    public void checkChkAppAuthenticationType(){
        wait.until(ExpectedConditions.visibilityOf(chkAppAuthenticationType));
        chkAppAuthenticationType.click();
    }

    public void selectDDFinancialName(String financial){
        wait.until(ExpectedConditions.visibilityOf(ddFinancialName));
        Select dd=new Select(ddFinancialName);
        dd.selectByVisibleText(financial);
    }

    public void enterTxtUsername(String username){
        wait.until(ExpectedConditions.visibilityOf(txtUsername));
        txtUsername.sendKeys(username);
    }

    public void clickBtnCheckAvailability(){
        wait.until(ExpectedConditions.visibilityOf(btnCheckAvailability));
        btnCheckAvailability.click();
        try{
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().dismiss();
        }
        catch (Exception e){

        }
    }
    public void enterTxtFirstName(String firstName){
        wait.until(ExpectedConditions.visibilityOf(txtFirstName));
        txtFirstName.sendKeys(firstName);
    }

    public void enterTxtLastName(String lastName){
        wait.until(ExpectedConditions.visibilityOf(txtLastName));
        txtLastName.sendKeys(lastName);
    }

    public void selectDDProfile(String financial){
        wait.until(ExpectedConditions.visibilityOf(ddProfile));
        Select dd=new Select(ddProfile);
        dd.selectByVisibleText(financial);
    }

    public void selectDDUserType(String financial){ // Dropdown option is inactive don't know why
        wait.until(ExpectedConditions.visibilityOf(ddUserType));
        Select dd=new Select(ddUserType);
        dd.selectByVisibleText(financial);
    }

    public void enterTxtPassword(String password){
        wait.until(ExpectedConditions.visibilityOf(txtPassword));
        txtPassword.sendKeys(password);
    }

    public void enterTxtConfirmPassword(String confirmPassword){
        wait.until(ExpectedConditions.visibilityOf(txtConfirmPassword));
        txtConfirmPassword.sendKeys(confirmPassword);
    }

    public void enterTxtMailID(String mailID){
        wait.until(ExpectedConditions.visibilityOf(txtMailID));
        txtMailID.sendKeys(mailID);
    }

    public void enterTxtUserDescription(String UserDescription){
        wait.until(ExpectedConditions.visibilityOf(txtUserDescription));
        txtUserDescription.sendKeys(UserDescription);
    }

    public void checkChkIsActive(){
        wait.until(ExpectedConditions.visibilityOf(chkIsActive));
        chkIsActive.click();
    }


    public void checkChkIsInActive(){
        wait.until(ExpectedConditions.visibilityOf(chkIsInActive));
        chkIsInActive.click();
    }

    public void clickBtnSave(){
        Actions action=new Actions(driver);
        action.moveToElement(btnSave).perform();
        wait.until(ExpectedConditions.visibilityOf(btnSave));
        btnSave.click();
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            alertMessage = alert.getText();
            alert.accept();
        }catch (Exception e){}
        wait.until(ExpectedConditions.visibilityOf(messageDisplay));
    }

    public String getAlertMessage(){
        return alertMessage;
    }

    public String getErrorSuccessMessage(){
        return messageDisplay.getText();
    }

    public void clickBtnCancel(){
        wait.until(ExpectedConditions.visibilityOf(btnCancel));
        btnCancel.click();
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}
