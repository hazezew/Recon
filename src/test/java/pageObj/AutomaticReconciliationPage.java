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

public class AutomaticReconciliationPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;
    private String alertMessage="";

    @FindBy(name = "ctl00$ContentPlaceHolder1$ddlTxnType")
    private WebElement ddTransactionType;

    @FindBy(name = "ctl00$ContentPlaceHolder1$btnReconcile")
    private WebElement btnReconciliation;

    @FindBy(id = "ContentPlaceHolder1_btnCancel")
    private WebElement btnCancel;

    public AutomaticReconciliationPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }
    public void selectDDTransactionType(String trnxType){
        wait.until(ExpectedConditions.visibilityOf(ddTransactionType));
        Select dd=new Select(ddTransactionType);
        dd.selectByVisibleText(trnxType);
    }
    public void clickBtnReconciliation(){
        wait.until(ExpectedConditions.visibilityOf(btnReconciliation));
        btnReconciliation.click();
        try{
            Alert alert=driver.switchTo().alert();
            alertMessage=alert.getText();
            alert.accept();
        }catch (Exception e){}
    }
    public String getAlertMessage(){
        return alertMessage;
    }
    public void clickBtnCancel(){
        wait.until(ExpectedConditions.visibilityOf(btnCancel));
        btnCancel.click();
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}
