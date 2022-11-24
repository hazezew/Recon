package pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FileStructureDetailConfigurationPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(xpath = "//*[@id=\"__tab_ContentPlaceHolder1_ajaxTabContainer_AjaxTabPanelFileId\"]")
    private WebElement tabFieldConfiguration;

    @FindBy(xpath = "//*[@id=\"__tab_ContentPlaceHolder1_ajaxTabContainer_AjaxTabPanelFileStructure\"]")
    private WebElement tabFileStructureConfiguration;

    @FindBy(xpath = "//*[@id=\"__tab_ContentPlaceHolder1_ajaxTabContainer_AjaxTabPanelFileField\"]")
    private WebElement tabFileFieldConfiguration;

    public FileStructureDetailConfigurationPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public void clickTabFieldConfiguration(){
        wait.until(ExpectedConditions.visibilityOf(tabFieldConfiguration));
        tabFieldConfiguration.click();
    }
    public void clickTabFileStructureConfiguration(){
        wait.until(ExpectedConditions.visibilityOf(tabFileStructureConfiguration));
        tabFileStructureConfiguration.click();
    }
    public void clickTabFileFieldConfiguration(){
        wait.until(ExpectedConditions.visibilityOf(tabFileFieldConfiguration));
        tabFileFieldConfiguration.click();
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}
