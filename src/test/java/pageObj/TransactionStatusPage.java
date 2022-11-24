package pageObj;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Document;

import java.time.Duration;

public class TransactionStatusPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(id = "ContentPlaceHolder1_ddlBankType")
    private WebElement ddBankName;

    @FindBy(id = "ContentPlaceHolder1_ddlTransactionNature")
     private WebElement ddTransactionNature;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_btnFilter\"]")
    private WebElement btnFilter;

    public TransactionStatusPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public void selectDdBankName(String bank){
        wait.until(ExpectedConditions.visibilityOf(ddBankName));
        Select dd=new Select(ddBankName);
        dd.selectByVisibleText(bank);
    }

    public void selectDdTransactionNature(String txnNature){
        wait.until(ExpectedConditions.visibilityOf(ddTransactionNature));
        Select dd=new Select(ddTransactionNature);
        dd.selectByVisibleText(txnNature);
    }

    public void clickBtnFilter(){
        action.moveToElement(btnFilter).perform();
        action.moveToElement(btnFilter).build().perform();
        action.moveToElement(btnFilter).click().perform();

        try{
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept();
        }catch (Exception e){}
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}