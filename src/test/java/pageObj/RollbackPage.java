package pageObj;

import org.checkerframework.checker.signature.qual.FieldDescriptor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RollbackPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(id = "ContentPlaceHolder1_ddlEntityName")
    private WebElement ddEntity;

    @FindBy(id = "ContentPlaceHolder1_rblExtractUpload_1")
    private WebElement chkUpload;

    @FindBy(id = "ContentPlaceHolder1_rblExtractUpload_2")
    private WebElement chkExtraction;

    @FindBy(id = "ContentPlaceHolder1_btnCancel")
    private WebElement btnCancel;

    public RollbackPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public void selectDdEntity(String entity){
        wait.until(ExpectedConditions.visibilityOf(ddEntity));
        Select dd=new Select(ddEntity);
        dd.selectByVisibleText(entity);
    }

    public void clickChkUpload(){
        wait.until(ExpectedConditions.visibilityOf(chkUpload));
        chkUpload.click();
    }

    public void clickChkExtraction(){
        wait.until(ExpectedConditions.visibilityOf(chkExtraction));
        chkExtraction.click();
    }

    public void clickBtnCancel(){
        wait.until(ExpectedConditions.visibilityOf(btnCancel));
        btnCancel.click();
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}