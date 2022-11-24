package pageObj;

import org.mockito.internal.matchers.Find;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UnlockUserPage {
    private WebDriver driver;
    @FindBy(id="txtFgtUserName")
    private WebElement txtFgtUserName;

    @FindBy(id="txtFgtPwd")
    private WebElement txtFgtPwd;

    @FindBy(id="ddlFinancial1")
    private WebElement ddlFinancial1;

    @FindBy(id="imgbtnFgtSubmit")
    private WebElement imgbtnFgtSubmit;

    private WebDriverWait wait;

    public UnlockUserPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public void setTxtFgtUserName(String username){
        wait.until(ExpectedConditions.visibilityOf(txtFgtUserName));
        txtFgtUserName.sendKeys(username);
    }
    public void setTxtFgtPwd(String password){
        wait.until(ExpectedConditions.visibilityOf(txtFgtPwd));
        txtFgtPwd.sendKeys(password);
    }
    public void setDdlFinancial1(String financial){
        wait.until(ExpectedConditions.visibilityOf(ddlFinancial1));
        Select dd=new Select(ddlFinancial1);
        dd.selectByVisibleText(financial);
    }
    public String clickImgbtnFgtSubmit(){
        wait.until(ExpectedConditions.visibilityOf(imgbtnFgtSubmit));
        imgbtnFgtSubmit.click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String message=alert.getText();
        alert.accept();
        return message;
    }
    public void clickDDFinancial(){
        ddlFinancial1.click();
    }
    public String getTitle(){
        return driver.getTitle();
    }
}