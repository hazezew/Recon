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

public class CurrencyConfigurationPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;
    private String alertMessage="";

    @FindBy(name = "ctl00$ContentPlaceHolder1$btnNew")
    private WebElement btnNew;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ddlFinName")
    private WebElement ddFinancialName;

    @FindBy(name = "ctl00$ContentPlaceHolder1$txtCurCode")
    private WebElement txtCode;

    @FindBy(name = "ctl00$ContentPlaceHolder1$txtCurName")
    private WebElement txtName;

    @FindBy(name = "ctl00$ContentPlaceHolder1$txtCurCountry")
    private WebElement txtCountry;

    @FindBy(name = "ctl00$ContentPlaceHolder1$txtCurAlias")
    private WebElement txtAbbreviation;

    @FindBy(name = "ctl00$ContentPlaceHolder1$txtCurDesc")
    private WebElement txtDescription;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ddlStatus")
    private WebElement ddStatus;

    @FindBy(name = "ctl00$ContentPlaceHolder1$btnSave")
    private WebElement btnSave;

    @FindBy(name = "ctl00$ContentPlaceHolder1$btnCancel")
    private WebElement btnCancel;

    public CurrencyConfigurationPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public void clickBtnNew(){
        wait.until(ExpectedConditions.visibilityOf(btnNew));
        btnNew.click();
    }
    public void selectDdFinancialName(String financialName){
        wait.until(ExpectedConditions.visibilityOf(ddFinancialName));
        Select dd=new Select(ddFinancialName);
        dd.selectByVisibleText(financialName);
    }
    public void enterTxtCode(String code){
        wait.until(ExpectedConditions.visibilityOf(txtCode));
        txtCode.sendKeys(code);
    }
    public void enterTxtName(String name){
        wait.until(ExpectedConditions.visibilityOf(txtName));
        txtName.sendKeys(name);
    }
    public void enterTxtCountry(String country){
        wait.until(ExpectedConditions.visibilityOf(txtCountry));
        txtCountry.sendKeys(country);
    }
    public void enterTxtAbbreviation(String abbr){
        wait.until(ExpectedConditions.visibilityOf(txtAbbreviation));
        txtAbbreviation.sendKeys(abbr);
    }
    public void enterTxtDescription(String desc){
        wait.until(ExpectedConditions.visibilityOf(txtDescription));
        txtDescription.sendKeys(desc);
    }
    public void clickBtnSave(){
        wait.until(ExpectedConditions.visibilityOf(btnSave));
        btnSave.click();
        try {
            Alert alert = driver.switchTo().alert();
            alertMessage =alert.getText();
            alert.accept();
        }
        catch (Exception e){}
    }
    public String getAlertMessage(){
        return alertMessage;
    }
    public String getURL(){
        return driver.getCurrentUrl();
    }
}