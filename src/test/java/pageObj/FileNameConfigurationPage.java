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

public class FileNameConfigurationPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(id = "ContentPlaceHolder1_ddlFinID")
    private WebElement ddFinName;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_ddlEntityID\"]")
    private WebElement ddEntity;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_ddlFileID\"]")
    private WebElement ddFileID;

    @FindBy(id = "ContentPlaceHolder1_btnCancel")
    private WebElement btnCancel;

    public FileNameConfigurationPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public void selectDDFinName(String finName){
        wait.until(ExpectedConditions.visibilityOf(ddFinName));
        Select dd=new Select(ddFinName);
        dd.selectByVisibleText(finName);
    }

    public void selectDDEntity(String entity){
        wait.until(ExpectedConditions.visibilityOf(ddEntity));
        Select dd=new Select(ddEntity);
        dd.selectByVisibleText(entity);
    }

    public void selectDDFileID(String fileID){
        wait.until(ExpectedConditions.visibilityOf(ddFileID));
        Select dd=new Select(ddFileID);
        dd.selectByVisibleText(fileID);
    }

    public void clickBtnCancel(){
        action.moveToElement(btnCancel).build().perform();
        wait.until(ExpectedConditions.visibilityOf(btnCancel));
        btnCancel.click();
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}