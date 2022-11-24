package pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ViewUserPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private String firstName;
    private String email;

    @FindBy(id = "ContentPlaceHolder1_ddlFinancialId")
    private WebElement ddFinancialName;

    @FindBy(id = "ContentPlaceHolder1_ddlUserName")
    private WebElement ddUserName;

    @FindBy(id = "ContentPlaceHolder1_txtFirstName")
    private WebElement txtFirstName;

    @FindBy(id = "ContentPlaceHolder1_txtMailId")
    private WebElement txtEmailID;

    public ViewUserPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
    }

    public void selectDdFinancialName(String financial){
        wait.until(ExpectedConditions.visibilityOf(ddFinancialName));
        Select dd=new Select(ddFinancialName);
        dd.selectByVisibleText(financial);
    }

    public void selectDDUserName(String username){
        wait.until(ExpectedConditions.visibilityOf(ddUserName));
        Select dd=new Select(ddUserName);
        dd.selectByVisibleText(username);

        wait.until(ExpectedConditions.visibilityOf(txtFirstName));
        firstName=txtFirstName.getText();

        wait.until(ExpectedConditions.visibilityOf(txtEmailID));
        email=txtEmailID.getText();

    }

    public String getTxtFirstName(){
        wait.until(ExpectedConditions.visibilityOf(txtFirstName));
        return txtFirstName.getAttribute("value");
    }

    public String getTxtEmailID(){
        wait.until(ExpectedConditions.visibilityOf(txtEmailID));
        return txtEmailID.getAttribute("value");
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}