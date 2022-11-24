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

public class EditUserPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    @FindBy(id = "ContentPlaceHolder1_ddlFinancialId")
    private WebElement ddFinancialName;

    @FindBy(id = "ContentPlaceHolder1_ddlUserName")
    private WebElement ddUserName;

    @FindBy(id = "ContentPlaceHolder1_txtFirstName")
    private WebElement txtFirstName;

    @FindBy(id = "ContentPlaceHolder1_txtLastName")
    private WebElement txtLastName;

    @FindBy(id = "ContentPlaceHolder1_ddlProfile")
    private WebElement ddProfile;

    @FindBy(id = "ContentPlaceHolder1_txtMailId")
    private WebElement txtEmailID;

    @FindBy(id = "ContentPlaceHolder1_txtUserDescription")
    private WebElement txtUserDescription;

    @FindBy(id = "ContentPlaceHolder1_btnUpdate")
    private WebElement btnUpdate;

    @FindBy(id = "ContentPlaceHolder1_btnCancel")
    private WebElement btnCancel;

    @FindBy(id = "//*[@id=\"ContentPlaceHolder1_lblMsg\"]")
    private WebElement errorMessageDisplay;

    public EditUserPage(WebDriver driver){
        this.driver=driver;
        actions=new Actions(driver);
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
    }

    public void selectDdFinancialName(String financial){
        wait.until(ExpectedConditions.visibilityOf(ddFinancialName));
        Select dd=new Select(ddFinancialName);
        dd.selectByVisibleText(financial);
    }

    public void selectDdUserName(String username){
        wait.until(ExpectedConditions.visibilityOf(ddUserName));
        Select dd=new Select(ddUserName);
        dd.selectByVisibleText(username);
    }

    public void enterTxtFirstName(String firstName){
        wait.until(ExpectedConditions.visibilityOf(txtFirstName));
        txtFirstName.clear();
        txtFirstName.sendKeys(firstName);
    }

    public void enterTxtLastName(String lastname){
        wait.until(ExpectedConditions.visibilityOf(txtLastName));
        txtLastName.clear();
        txtLastName.sendKeys(lastname);
    }

    public void selectDdProfile(String profile){
        wait.until(ExpectedConditions.visibilityOf(ddProfile));
        Select dd=new Select(ddProfile);
        dd.selectByVisibleText(profile);
    }
    public void enterTxtEmailID(String email){
        wait.until(ExpectedConditions.visibilityOf(txtEmailID));
        txtEmailID.clear();
        txtEmailID.sendKeys(email);
    }

    public void enterTxtUserDescription(String desc){
        wait.until(ExpectedConditions.visibilityOf(txtUserDescription));
        txtUserDescription.clear();
        txtUserDescription.sendKeys(desc);
    }

    public void clickBtnUpdate(){
        actions.moveToElement(btnUpdate).perform();
        wait.until(ExpectedConditions.visibilityOf(btnUpdate));
        btnUpdate.click();
        System.out.println("Success message: "+ errorMessageDisplay.getText());
    }

    public void clearTxtFirstName(){
        wait.until(ExpectedConditions.visibilityOf(txtFirstName));
        txtFirstName.clear();
    }

    public void clearTxtLastName(){
        wait.until(ExpectedConditions.visibilityOf(txtLastName));
        txtLastName.clear();
    }

    public void clearDDProfile(){
        wait.until(ExpectedConditions.visibilityOf(ddProfile));
        Select dd=new Select(ddProfile);
        dd.selectByVisibleText("--Select--");
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            alert.dismiss();
        }
        catch (Exception e){}
    }

    public void clearTxtEmailID(){
        wait.until(ExpectedConditions.visibilityOf(txtEmailID));
        txtEmailID.clear();
    }

    public void clearTxtUserDescription(){
        wait.until(ExpectedConditions.visibilityOf(txtUserDescription));
        txtUserDescription.clear();
    }

    public String getErrorSuccessMessage(){
        wait.until(ExpectedConditions.visibilityOf(errorMessageDisplay));
        return errorMessageDisplay.getText();
    }

    public String getAlertMessage(){
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert=driver.switchTo().alert();
        String message=alert.getText();
        alert.dismiss();
        return message;
    }

    public void clickBtnCancel(){
        wait.until(ExpectedConditions.visibilityOf(btnCancel));
        btnCancel.click();
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}