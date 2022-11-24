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

public class EntityConfigurationPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_ddlFinancialId\"]")
    private WebElement ddFinancialName;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_txtEntityName\"]")
    private WebElement txtEntityName;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_txtEntityDesc\"]")
    private WebElement txtEntityDescription;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_btnShowPopUp\"]")
    private WebElement btnSave;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_btnCancel\"]")
    private WebElement btnDialogCancel;

    public EntityConfigurationPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public void selectDdFinancialName(String financialName){
        wait.until(ExpectedConditions.visibilityOf(ddFinancialName));
        Select dd=new Select(ddFinancialName);
        dd.selectByVisibleText(financialName);
    }

    public void enterTxtEntityName(String entityName){
        wait.until(ExpectedConditions.visibilityOf(txtEntityName));
        txtEntityName.sendKeys(entityName);
    }
    public void enterTxtEntityDescription(String entityDescription){
        wait.until(ExpectedConditions.visibilityOf(txtEntityDescription));
        txtEntityDescription.sendKeys(entityDescription);
    }

    public void clickBtnSave(){
        wait.until(ExpectedConditions.visibilityOf(btnSave));
        btnSave.click();
        clickBtnDialogCancel();
    }

    public void clickBtnDialogCancel(){
        wait.until(ExpectedConditions.visibilityOf(btnDialogCancel));
        btnDialogCancel.click();
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}
