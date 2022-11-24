package pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FileFieldMappingConfigurationPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(id = "ContentPlaceHolder1_ddlFinId")
    private WebElement ddFinancialName;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_ddlEntityName\"]")
    private WebElement ddEntityName;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_ddlFileId\"]")
    private WebElement ddFileID;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_ddlRecordType\"]")
    private WebElement ddRecordType;

    @FindBy(name = "ctl00$ContentPlaceHolder1$btnFilter")
    private WebElement btnFilter;

    public FileFieldMappingConfigurationPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public void selectDDFinancialName(String financialName){
        wait.until(ExpectedConditions.visibilityOf(ddFinancialName));
        Select dd=new Select(ddFinancialName);
        dd.selectByVisibleText(financialName);
    }

    public void selectDDEntityName(String entityName){
        wait.until(ExpectedConditions.visibilityOf(ddEntityName));
        Select dd=new Select(ddEntityName);
        dd.selectByVisibleText(entityName);
    }

    public void selectDDFileID(String fileID){
        wait.until(ExpectedConditions.visibilityOf(ddFileID));
        Select dd=new Select(ddFileID);
        dd.selectByVisibleText(fileID);
    }

    public void selectDDRecordType(String recordType){
        wait.until(ExpectedConditions.visibilityOf(ddRecordType));
        Select dd=new Select(ddRecordType);
        dd.selectByVisibleText(recordType);
    }

    public void clickBtnFilter(){
        wait.until(ExpectedConditions.visibilityOf(btnFilter));
        btnFilter.click();
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}