package pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TranIDConfigurationPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_ddlFinNames\"]")
    private WebElement ddFinancialName;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_ddlEntityName\"]")
    private WebElement ddEntity;

    @FindBy(id = "ContentPlaceHolder1_btnCancel")
    private WebElement btnCancel;

    public TranIDConfigurationPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public void selectDdFinancialName(String financialName){
        wait.until(ExpectedConditions.visibilityOf(ddFinancialName));
        Select dd=new Select(ddFinancialName);
        dd.selectByVisibleText(financialName);
    }
    public void selectDdEntity(String entity){
        wait.until(ExpectedConditions.visibilityOf(ddEntity));
        Select dd=new Select(ddEntity);
        dd.selectByVisibleText(entity);
    }

    public void clickBtnCancel(){
        action.moveToElement(btnCancel).build().perform();
        wait.until(ExpectedConditions.visibilityOf(ddEntity));
        btnCancel.click();
    }
    public String getURL(){
        return driver.getCurrentUrl();
    }
}