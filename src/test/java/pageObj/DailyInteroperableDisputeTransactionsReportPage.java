package pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DailyInteroperableDisputeTransactionsReportPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    public DailyInteroperableDisputeTransactionsReportPage(WebDriver driver){
        this.driver=driver;
        action=new Actions(driver);
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
    }
    public void getReport(){
//        org.openqa.selenium.interactions.Actions;
        action.moveToElement(driver.findElement(By.xpath("//span[text()=\"Reports\"]"))).perform();
        action.moveToElement(driver.findElement(By.xpath("//span[text()=\"Ethswitch Report\"]"))).perform();
        driver.findElement(By.xpath("//span[text()=\"Dispute Status Report\"]")).click();
        new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlReportFilter"))).selectByVisibleText("Daily Interoperable Dispute Transactions");
        driver.findElement(By.xpath("//input[@id=\"ContentPlaceHolder1_txtStartSettlementDate\"]")).click();
    }
}
