package pageObj;

import org.apache.poi.hssf.eventusermodel.AbortableHSSFListener;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FileRenamingDetailsPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    private String successErrorMessage="";
    private String alertMessage;

    @FindBy(id = "ContentPlaceHolder1_ddlentitytype")
    private WebElement ddEntityType;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_ddltxntype\"]")
    private WebElement ddTranscationType;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_txtfromdate\"]")
    private WebElement calFromDate;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_txttodate\"]")
    private WebElement calToDate;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_btnProcess\"]")
    private WebElement btnProcess;

    public FileRenamingDetailsPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public void selectDDEntityType(String entityType){
        wait.until(ExpectedConditions.visibilityOf(ddEntityType));
        Select dd=new Select(ddEntityType);
        dd.selectByVisibleText(entityType);
    }

    public void selectDDTranscationType(String tranType){
        wait.until(ExpectedConditions.visibilityOf(ddTranscationType));
        Select dd=new Select(ddTranscationType);
        dd.selectByVisibleText(tranType);
    }

    public void selectCalFromDate(String day){
        wait.until(ExpectedConditions.visibilityOf(calFromDate));
        calFromDate.click();
        driver.findElement(By.linkText(day)).click();
    }

    public void clickCalToDate(String day){
        wait.until(ExpectedConditions.visibilityOf(calToDate));
        calToDate.click();
        driver.findElement(By.linkText(day)).click();
    }

    public void clickBtnProcess(){
        action.moveToElement(btnProcess).build().perform();
        wait.until(ExpectedConditions.visibilityOf(btnProcess));
        btnProcess.click();
//        try{
//            get success or error message on web element
//            successErrorMessage=msgDisplay.getText();
//        }
//        catch (Exception e){}
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            alertMessage = alert.getText();
        }catch (Exception e){}
    }
    public String getAlertMessage(){
        return alertMessage;
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}
