package pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ForgottenPasswordPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public ForgottenPasswordPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public String getURL(){
        return driver.getCurrentUrl();
    }
}
