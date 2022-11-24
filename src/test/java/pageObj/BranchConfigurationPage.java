package pageObj;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BranchConfigurationPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private String alertMessage="";

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_lblMsg\"]")
    private WebElement msgDisplay;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_btnNew\"]")
    private WebElement btnNew;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_ddlFinName\"]")
    private WebElement ddFinancialName;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_txtBranchcode\"]")
    private WebElement txtBranchCode;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_txtBranchName\"]")
    private WebElement txtBranchName;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_txtAddress\"]")
    private WebElement txtAddress;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_txtContNo\"]")
    private WebElement txtContactNumber;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_btnSave\"]")
    private WebElement btnSave;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_btnCancel\"]")
    private WebElement btnCancel;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_Txtsearchfee\"]")
    private WebElement txtSearch;

    public BranchConfigurationPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
    }
    public void clickBtnNew(){
        wait.until(ExpectedConditions.visibilityOf(btnNew));
        btnNew.click();
    }
    public void selectDDFinancialName(String finName){
        wait.until(ExpectedConditions.visibilityOf(ddFinancialName));
        Select dd=new Select(ddFinancialName);
        dd.selectByVisibleText(finName);
    }

    public void enterTxtBranchCode(String branchCode){
        wait.until(ExpectedConditions.visibilityOf(txtBranchCode));
        txtBranchCode.sendKeys(branchCode);
    }

    public void enterTxtBranchName(String branchName){
        wait.until(ExpectedConditions.visibilityOf(txtBranchName));
        txtBranchName.sendKeys(branchName);
    }

    public void enterTxtAddress(String address){
        wait.until(ExpectedConditions.visibilityOf(txtAddress));
        txtAddress.sendKeys(address);
    }
    public void enterTxtContactNumber(String contactNumber){
        wait.until(ExpectedConditions.visibilityOf(txtContactNumber));
        txtContactNumber.sendKeys(contactNumber);
    }
    public void clickBtnSave(){
        wait.until(ExpectedConditions.visibilityOf(btnSave));
        btnSave.click();
        try {
            Alert alert = driver.switchTo().alert();
            alertMessage = alert.getText();
            alert.accept();
        }catch (Exception e){}
    }
    public String getErrorSuccussMsg(){
        wait.until(ExpectedConditions.visibilityOf(msgDisplay));
        return msgDisplay.getText();
    }
    public String getAlertMessage(){
        return alertMessage;
    }

    public void clickBtnCancel(){
        wait.until(ExpectedConditions.visibilityOf(btnCancel));
        btnCancel.click();
    }
    public void enterTxtSearch(String search){
        wait.until(ExpectedConditions.visibilityOf(txtSearch));
        txtSearch.sendKeys(search);
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}