package pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EditProfilePage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(id = "ContentPlaceHolder1_ddlFinancialId")
    private WebElement ddFinancialName;

    @FindBy(id = "ContentPlaceHolder1_ddlProfileName")
    private WebElement ddProfileName;

    @FindBy(id = "ContentPlaceHolder1_btnUpdate")
    private WebElement btnUpdate;

    @FindBy(id = "ContentPlaceHolder1_btnCancel1")
    private WebElement btnCancel;

    public EditProfilePage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
    }
    public void selectDdFinancialName(String financial){
        wait.until(ExpectedConditions.visibilityOf(ddFinancialName));
        Select dd=new Select(ddFinancialName);
        dd.selectByVisibleText(financial);
    }
    public void selectDdProfileName(String profile){
        wait.until(ExpectedConditions.visibilityOf(ddProfileName));
        Select dd=new Select(ddProfileName);
        dd.selectByVisibleText(profile);
    }
    public void clickBtnUpdate(){
        wait.until(ExpectedConditions.visibilityOf(btnUpdate));
        btnUpdate.click();
        try {
            driver.switchTo().alert().dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void clickBtnCancel(){
        wait.until(ExpectedConditions.visibilityOf(btnCancel));
        btnCancel.click();
    }
    public String getURL(){
        return driver.getCurrentUrl();
    }
}