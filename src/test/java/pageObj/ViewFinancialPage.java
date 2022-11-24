package pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ViewFinancialPage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_grvFinancialInstitutions\"]/tbody/tr[3]/td[2]")
    private WebElement financialNameText;

    public ViewFinancialPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public String getFinancialNameText(){
        wait.until(ExpectedConditions.visibilityOf(financialNameText));
        return financialNameText.getText();
    }
    public String getURL(){
        return driver.getCurrentUrl();
    }
}
