package pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReasonCodeConfigurationPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(name = "ctl00$ContentPlaceHolder1$btnNew")
    private WebElement btnNew;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_txtReason\"]")
    private WebElement txtReasonDescription;

    @FindBy(name = "ctl00$ContentPlaceHolder1$btnSave")
    private WebElement btnSave;

    public ReasonCodeConfigurationPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public void clickBtnNew(){
        wait.until(ExpectedConditions.visibilityOf(btnNew));
        btnNew.click();
    }

    public void enterTxtReasonDescription(String reasonDesc){
        wait.until(ExpectedConditions.visibilityOf(txtReasonDescription));
        txtReasonDescription.sendKeys(reasonDesc);
    }

    public void clickBtnSave(){
        wait.until(ExpectedConditions.visibilityOf(btnSave));
        btnSave.click();
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}
