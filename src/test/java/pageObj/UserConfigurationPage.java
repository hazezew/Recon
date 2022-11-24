package pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserConfigurationPage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//*[@id=\"__tab_ContentPlaceHolder1_ajaxTabContainer_AjaxTabUserManageconfig\"]")
    private WebElement tabUserNameConfiguration;

    @FindBy(id = "ContentPlaceHolder1_ajaxTabContainer_AjaxTabUserManageconfig_btnUserEdit")
    private WebElement btnUserEdit;

    @FindBy(xpath= "//*[@id=\"ContentPlaceHolder1_ajaxTabContainer_AjaxTabUserManageconfig_btnUserSave\"]")
    private WebElement btnUserUpdate;

    @FindBy(xpath = "/html/body/form/table/tbody/tr[2]/td/table[2]/tbody/tr[2]/td[2]/center/div/div/center/table/tbody/tr/td/div/div[1]/span[2]/span/span")
    private WebElement tabPasswordConfiguration;

    @FindBy(id = "ContentPlaceHolder1_ajaxTabContainer_AjaxTabPanelPwdConfig_btnEdit")
    private WebElement btnPasswordEdit;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_ajaxTabContainer_AjaxTabPanelPwdConfig_btnSave\"]")
    private WebElement btnPasswordUpdate;

    public UserConfigurationPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void clickTabUserNameConfiguration(){
        wait.until(ExpectedConditions.visibilityOf(tabUserNameConfiguration));
        tabUserNameConfiguration.click();
    }

    public void clickBtnUserEdit(){
        wait.until(ExpectedConditions.visibilityOf(btnUserEdit));
        btnUserEdit.click();
    }

    public void clickBtnUserUpdate(){
        wait.until(ExpectedConditions.visibilityOf(btnUserUpdate));
        btnUserUpdate.click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    public void clickTabPasswordConfiguration(){
        wait.until(ExpectedConditions.visibilityOf(tabPasswordConfiguration));
        tabPasswordConfiguration.click();
    }

    public void clickBtnPasswordEdit(){
        wait.until(ExpectedConditions.visibilityOf(btnPasswordEdit));
        btnPasswordEdit.click();
    }

    public void clickBtnPasswordUpdate(){
        wait.until(ExpectedConditions.visibilityOf(btnPasswordUpdate));
        btnPasswordUpdate.click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        try{
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept();
        }
        catch (Exception e){}
    }

    public String getURL(){
        wait.until(ExpectedConditions.visibilityOf(tabPasswordConfiguration));
        return driver.getCurrentUrl();
    }
}