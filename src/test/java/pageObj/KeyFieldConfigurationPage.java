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

public class KeyFieldConfigurationPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;
    private String alertMessage;

    @FindBy(id = "ContentPlaceHolder1_ddlFinNames")
    private WebElement ddFinancialName;

    @FindBy(id = "ContentPlaceHolder1_ddlMappingEntityName")
    private WebElement ddMappingName;

    @FindBy(id = "ContentPlaceHolder1_ddlTxnType")
    private WebElement ddTrnxType;

    @FindBy(id = "ContentPlaceHolder1_txtKeyFieldDesc")
    private WebElement txtDescription;

    @FindBy(id = "ContentPlaceHolder1_btnClear")
    private WebElement btnCancel;

    public KeyFieldConfigurationPage(WebDriver driver){
        this.driver=driver;
        action=new Actions(driver);
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
    }
    public void selectDDFinancialName(String fin){
        wait.until(ExpectedConditions.visibilityOf(ddFinancialName));
        Select dd=new Select(ddFinancialName);
        dd.selectByVisibleText(fin);
    }
    public void selectDDMappingName(String mappingName){
        wait.until(ExpectedConditions.visibilityOf(ddMappingName));
        Select dd=new Select(ddMappingName);
        dd.selectByVisibleText(mappingName);
    }
    public void selectDDTrnxType(String trnxType){
        wait.until(ExpectedConditions.visibilityOf(ddTrnxType));
        Select dd=new Select(ddTrnxType);
        dd.selectByVisibleText(trnxType);
    }
    public void enterTxtDescription(String desc){
        wait.until(ExpectedConditions.visibilityOf(txtDescription));
        txtDescription.sendKeys(desc);
    }
    public void clickBtnCancel(){
        action.moveToElement(btnCancel).perform();
        wait.until(ExpectedConditions.visibilityOf(btnCancel));
        btnCancel.click();
    }
    public String getURL(){
        return driver.getCurrentUrl();
    }
}