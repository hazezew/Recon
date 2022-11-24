package pageObj;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddFinancialPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private String alertMessage;

    @FindBy(id = "ContentPlaceHolder1_txtFinName")
    private WebElement txtFinancialName;

    @FindBy(id = "ContentPlaceHolder1_txtFinDesc")
    private WebElement txtDescription;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_rblActInact\"]/tbody/tr/td[1]/label")
    private WebElement activeStatus;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_rblActInact\"]/tbody/tr/td[2]/label")
    private WebElement disabledStatus;

    @FindBy(id = "ContentPlaceHolder1_btnSaveFin")
    private WebElement saveButton;

    @FindBy(id = "ContentPlaceHolder1_btnCancel1Fin")
    private WebElement cancelButton;

    public AddFinancialPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
    }
    public void setTxtFinancialName(String finName){
        wait.until(ExpectedConditions.visibilityOf(txtFinancialName));
        txtFinancialName.sendKeys(finName);
    }

    public void setTxtDescription(String desc){
        wait.until(ExpectedConditions.visibilityOf(txtDescription));
        txtDescription.sendKeys(desc);
    }
    public void setStatus(String status){
        if(status.equalsIgnoreCase("Enable")){
            wait.until(ExpectedConditions.visibilityOf(activeStatus));
            activeStatus.click();
        }
        else{
            wait.until(ExpectedConditions.visibilityOf(disabledStatus));
            disabledStatus.click();
        }
    }
    public void clickSaveButton(){
        wait.until(ExpectedConditions.visibilityOf(saveButton));
        saveButton.click();
        Alert alert=wait.until(ExpectedConditions.alertIsPresent());
        alertMessage=alert.getText();
        alert.accept();
    }
    public String getAlertMessage(){
        return alertMessage;
    }

    public void clickCancelButton(){
        wait.until(ExpectedConditions.visibilityOf(cancelButton));
        cancelButton.click();
    }
    public String getURL(){
        return driver.getCurrentUrl();
    }
}
