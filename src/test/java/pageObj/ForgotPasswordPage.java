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

public class ForgotPasswordPage {
    private WebDriver driver;
    private String alertMessage;
    @FindBy(id="txtFgtUserName")
    private WebElement username;

    @FindBy(id="ddlFinancial1")
    private WebElement financial;

    @FindBy(id="imgbtnFgtSubmit")
    private WebElement imgbtnFgtSubmit;

    private WebDriverWait wait;

    public ForgotPasswordPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void setUsername(String uname) {
        wait.until(ExpectedConditions.visibilityOf(username));
        username.sendKeys(uname);
    }
    public void setFinancial(String fin){
        wait.until(ExpectedConditions.visibilityOf(financial));
        Select dd=new Select(financial);
        dd.selectByVisibleText(fin);
    }
    public void clickSubmit(){
        wait.until(ExpectedConditions.visibilityOf(imgbtnFgtSubmit));
        imgbtnFgtSubmit.click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alertMessage=alert.getText();
        alert.accept();
    }
    public void clickDDFinancial(){
        financial.click();
    }
    public String getAlertMessage(){
        return alertMessage;
    }
}
