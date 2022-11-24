package pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MappingEntitiesPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private String alertMessage;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_ddlSameDiffFinancial\"]")
    private WebElement ddSameDiffFinancial;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_ddlFinNames\"]")
    private WebElement ddFinancialName;

    @FindBy(id = "ContentPlaceHolder1_btnCancel")
    private WebElement btnCancel;


    public MappingEntitiesPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
    }

    public void selectDdSameDiffFinancial(String sameDiff){
        wait.until(ExpectedConditions.visibilityOf(ddSameDiffFinancial));
        Select dd=new Select(ddSameDiffFinancial);
        dd.selectByVisibleText(sameDiff);
    }
    public void selectDdFinancialName(String finName){
        wait.until(ExpectedConditions.visibilityOf(ddFinancialName));
        Select dd=new Select(ddFinancialName);
        dd.selectByVisibleText(finName);
    }

    public void clickBtnCancel(){
        wait.until(ExpectedConditions.visibilityOf(btnCancel));
        btnCancel.click();
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}