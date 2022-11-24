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

public class AddProfilePage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;
    private String alertMessage;

    @FindBy(id = "ContentPlaceHolder1_ddlFinancialId")
    private WebElement ddFinancialName;

    @FindBy(id = "ContentPlaceHolder1_txtProfileName")
    private WebElement txtProfileName;

    @FindBy(id = "ContentPlaceHolder1_btnSave")
    private WebElement btnSave;

    @FindBy(id = "ContentPlaceHolder1_btnCancel1")
    private WebElement btnCancel;

    public AddProfilePage(WebDriver driver){
        this.driver=driver;
        action=new Actions(driver);
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
    }
    public void setDdFinancialName(String fin){
        wait.until(ExpectedConditions.visibilityOf(ddFinancialName));
        Select dd=new Select(ddFinancialName);
        dd.selectByVisibleText(fin);
    }
    public void setTxtProfileName(String profile){
        wait.until(ExpectedConditions.visibilityOf(txtProfileName));
        txtProfileName.sendKeys(profile);
    }
    public void clickBtnSave(){
        action.moveToElement(btnSave).perform();
        wait.until(ExpectedConditions.visibilityOf(btnSave));
        btnSave.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert=driver.switchTo().alert();
        alertMessage=alert.getText();
        alert.dismiss();
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
