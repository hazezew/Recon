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

public class BINConfigurationPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private String alertMessage="";

    @FindBy(id = "ContentPlaceHolder1_lblMsg")
    private WebElement msgDisplay;

    @FindBy(name = "ctl00$ContentPlaceHolder1$btnNewInt")
    private WebElement btnNew;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ddlFinName")
    private WebElement ddFinancialName;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ddlEntityName")
    private WebElement ddEntityName;

    @FindBy(name = "ctl00$ContentPlaceHolder1$txtBinID")
    private WebElement txtBinNumber;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ddlCardType")
    private WebElement ddCardType;

//    Status dropdown is inactive for now
    @FindBy(name = "ctl00$ContentPlaceHolder1$ddlStatus")
    private WebElement ddStatus;

    @FindBy(name = "ctl00$ContentPlaceHolder1$btnSaveInt")
    private WebElement btnSave;

    @FindBy(name = "ctl00$ContentPlaceHolder1$btnCancelInt")
    private WebElement btnCancel;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_grvBin\"]/tbody/tr[2]/td[13]/a")
    private WebElement btnSelect;

    @FindBy(name = "ctl00$ContentPlaceHolder1$btnEditInt")
    private WebElement btnEdit;

    @FindBy(name = "ctl00$ContentPlaceHolder1$btnSaveInt")
    private WebElement btnUpdate;

    public BINConfigurationPage(WebDriver driver){
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

    public void selectDDEntityName(String entityName){
        wait.until(ExpectedConditions.visibilityOf(ddEntityName));
        Select dd=new Select(ddEntityName);
        dd.selectByVisibleText(entityName);
    }

    public void enterTxtBinNumber(String binNumber){
        wait.until(ExpectedConditions.visibilityOf(txtBinNumber));
        txtBinNumber.sendKeys(binNumber);
    }

    public void selectDDCardType(String cardType){
        wait.until(ExpectedConditions.visibilityOf(ddCardType));
        Select dd=new Select(ddCardType);
        dd.selectByVisibleText(cardType);
    }
    public void clickBtnSave(){
        wait.until(ExpectedConditions.visibilityOf(btnSave));
        btnSave.click();
        try{
            Alert alert=driver.switchTo().alert();
            alertMessage=alert.getText();
            alert.accept();
        }
        catch (Exception e){}
    }

    public void clickBtnSelect(){
        wait.until(ExpectedConditions.visibilityOf(btnSelect));
        btnSelect.click();
    }
    public void clickBtnEdit(){
        wait.until(ExpectedConditions.visibilityOf(btnEdit));
        btnEdit.click();
    }

    public void clickBtnUpdate(){
        wait.until(ExpectedConditions.visibilityOf(btnUpdate));
        btnUpdate.click();
    }

    public void clickBtnCancel(){
        wait.until(ExpectedConditions.visibilityOf(btnCancel));
        btnCancel.click();
    }
    public String getErrorSuccussMsg(){
        wait.until(ExpectedConditions.visibilityOf(msgDisplay));
        return msgDisplay.getText();
    }
    public String getAlertMessage(){
        return alertMessage;
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}
