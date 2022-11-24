package pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExtractionAndUploadPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(id = "ContentPlaceHolder1_lblExtractUploadVal")
    private WebElement msgDisplay;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_rblExtractUpload_0\"]")
    private WebElement chkExtraction;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_rblExtractUpload_1\"]")
    private WebElement chkUpload;

    @FindBy(id = "ContentPlaceHolder1_btnExtract")
    private WebElement btnExtract;

    @FindBy(id = "ContentPlaceHolder1_btnUpload")
    private WebElement btnUpload;

    @FindBy(id = "ContentPlaceHolder1_btnCancel")
    private WebElement btnCancel;

    public ExtractionAndUploadPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }
    public String getMsgDisplay(){
        wait.until(ExpectedConditions.visibilityOf(msgDisplay));
        return msgDisplay.getText();
    }
    public void clickChkExtraction(){
        wait.until(ExpectedConditions.visibilityOf(chkExtraction));
        chkExtraction.click();
    }
    public void clickChkUpload(){
        wait.until(ExpectedConditions.visibilityOf(chkUpload));
        chkUpload.click();
    }
    public void clickBtnExtract(){
        wait.until(ExpectedConditions.visibilityOf(btnExtract));
        btnExtract.click();
    }
    public void clickBtnUpload(){
        wait.until(ExpectedConditions.visibilityOf(btnUpload));
        btnUpload.click();
    }
    public void clickBtnCancel(){
        wait.until(ExpectedConditions.visibilityOf(btnCancel));
        btnCancel.click();
    }
    public String getURL(){
        return driver.getCurrentUrl();
    }
}
