package pageObj;

import org.apache.commons.collections.functors.ExceptionPredicate;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MerchantConfigurationPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private String errorSuccessMsg="";
    private String alertMessage="";
    private Actions action;

    @FindBy(id = "ContentPlaceHolder1_lblTerminalVal")
    private WebElement msgDisplay;

    @FindBy(xpath = "//*[@id=\"__tab_ContentPlaceHolder1_ajaxTabContainer_TabPanel1\"]")
    private WebElement tabMerchantConfiguration;

    @FindBy(xpath = "//*[@id=\"__tab_ContentPlaceHolder1_ajaxTabContainer_AjaxTabPanelTerMake\"]")
    private WebElement tabMerchantPOS_IDConfiguration;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$TabPanel1$btnNewC")
    private WebElement btnNewMerchantConfig;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$TabPanel1$ddlFinName")
    private WebElement ddFinancialNameMerchantConfig;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$TabPanel1$txtMer_Catg_ID")
    private WebElement txtMerchantCategoryIDMerchantConfig;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$TabPanel1$txtMerchant_Name")
    private WebElement txtMerchantNameMerchantConfig;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$TabPanel1$txtMerchantAcctNo")
    private WebElement txtMerchantAccountNumberMerchantConfig;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$TabPanel1$ddlCurrencyCode")
    private WebElement ddCurrencyCode;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$TabPanel1$txtMerchantRent1")
    private WebElement txtMerchantRentaintion1MerchantConfig;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$TabPanel1$txtMerchantRent2")
    private WebElement txtMerchantRentaintion2MerchantConfig;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$TabPanel1$txtCategoryCode")
    private WebElement txtMerchantCategoryCodeMerchantConfig;

    @FindBy(id = "ContentPlaceHolder1_ajaxTabContainer_TabPanel1_rbtnStatus_0")
    private WebElement chkStatusActiveMerchantConfig;

    @FindBy(id = "ContentPlaceHolder1_ajaxTabContainer_TabPanel1_rbtnStatus_1")
    private WebElement chkStatusInActiveMerchantConfig;

    @FindBy(id = "ContentPlaceHolder1_ajaxTabContainer_TabPanel1_chkRank")
    private WebElement chkRankMerchantConfig;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$TabPanel1$txtCommission")
    private WebElement txtCommissionMerchantConfig;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$TabPanel1$btnSaveC")
    private WebElement btnSaveMerchantConfig;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$TabPanel1$btnCancelC")
    private WebElement btnCancelMerchantConfig;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$TabPanel1$Txtsearchfee")
    private WebElement txtSearchMerchantConfig;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_ajaxTabContainer_TabPanel1_grvMerID\"]/tbody/tr[2]/td[18]/a")
    private WebElement btnSelectMerchantConfig;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$TabPanel1$btnSaveC")
    private WebElement btnUpdateMerchantConfig;

    //    Web Elements for tab under Terminal Detail Configuration
    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTabPanelTerMake$ddlFinancialName")
    private WebElement ddFinancialNamePosConfig;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTabPanelTerMake$ddlMercat_ID")
    private WebElement ddMerchantIDPosConfig;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTabPanelTerMake$txtposidpos")
    private WebElement txtPosIDPosConfig;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTabPanelTerMake$btnSavemerpos")
    private WebElement btnSavePosConfig;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTabPanelTerMake$btnCancelpos")
    private WebElement btnCancelPosConfig;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTabPanelTerMake$TextBox9")
    private WebElement txtSearchPosConfig;

    @FindBy(xpath = "/html/body/form/table/tbody/tr[2]/td/table[2]/tbody/tr[2]/td[2]/center/div/div/div[1]/table/tbody/tr/td/div/div/div[2]/div[2]/div/table/tbody/tr[4]/td/div/div/table/tbody/tr[2]/td[4]/a")
    private WebElement btnSelectPosConfig;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_ajaxTabContainer_AjaxTabPanelTerMake_btnSavemerpos\"]")
    private WebElement btnUpdatePosConfig;

    public MerchantConfigurationPage(WebDriver driver){
        this.driver=driver;
        action=new Actions(driver);
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
    }

    public void clickTabMerchantConfiguration(){
        wait.until(ExpectedConditions.visibilityOf(tabMerchantConfiguration));
        tabMerchantConfiguration.click();
    }
    //    Events for web elements for Tab Merchant Configuration
    public void clickBtnNewMerchantConfig(){
        wait.until(ExpectedConditions.visibilityOf(btnNewMerchantConfig));
        btnNewMerchantConfig.click();
    }
    public void selectDDFinancialNameMerchantConfig(String finName){
        wait.until(ExpectedConditions.visibilityOf(ddFinancialNameMerchantConfig));
        Select dd=new Select(ddFinancialNameMerchantConfig);
        dd.selectByVisibleText(finName);
    }
    public void enterTxtMerchantCategoryIDMerchantConfig(String merchantID){
        wait.until(ExpectedConditions.visibilityOf(txtMerchantCategoryIDMerchantConfig));
        txtMerchantCategoryIDMerchantConfig.sendKeys(merchantID);
    }
    public void enterTxtMerchantNameMerchantConfig(String merchantName){
        wait.until(ExpectedConditions.visibilityOf(txtMerchantNameMerchantConfig));
        txtMerchantNameMerchantConfig.sendKeys(merchantName);
    }
    public void enterTxtMerchantAccountNumberMerchantConfig(String merchantAcc){
        wait.until(ExpectedConditions.visibilityOf(txtMerchantAccountNumberMerchantConfig));
        txtMerchantAccountNumberMerchantConfig.sendKeys(merchantAcc);
    }
    public void selectDDCurrencyCodeMerchantConfig(String currencyCode){
        wait.until(ExpectedConditions.visibilityOf(ddCurrencyCode));
        Select dd=new Select(ddCurrencyCode);
        dd.selectByVisibleText(currencyCode);
    }
    public void enterTxtMerchantRentaintion1MerchantConfig(String merchantRentaintion1){
        wait.until(ExpectedConditions.visibilityOf(txtMerchantRentaintion1MerchantConfig));
        txtMerchantRentaintion1MerchantConfig.sendKeys(merchantRentaintion1);
    }
    public void enterTxtMerchantRentaintion2MerchantConfig(String merchantRentaintion2){
        wait.until(ExpectedConditions.visibilityOf(txtMerchantRentaintion2MerchantConfig));
        txtMerchantRentaintion2MerchantConfig.sendKeys(merchantRentaintion2);
    }
    public void enterTxtMerchantCategoryCodeMerchantConfig(String merchantCategoryCode){
        wait.until(ExpectedConditions.visibilityOf(txtMerchantCategoryCodeMerchantConfig));
        txtMerchantCategoryCodeMerchantConfig.sendKeys(merchantCategoryCode);
    }
    public void clickChkStatusMerchantConfig(String yesNo){
        if(yesNo.equalsIgnoreCase("Yes")) {
            wait.until(ExpectedConditions.visibilityOf(chkStatusActiveMerchantConfig));
            chkStatusActiveMerchantConfig.click();
        }
        else
        {
            wait.until(ExpectedConditions.visibilityOf(chkStatusInActiveMerchantConfig));
            chkStatusInActiveMerchantConfig.click();
        }
    }
    public void clickChkRankMerchantConfig(){
        wait.until(ExpectedConditions.visibilityOf(chkRankMerchantConfig));
        chkRankMerchantConfig.click();
    }
    public void enterTxtCommissionMerchantConfig(String commission){
        wait.until(ExpectedConditions.visibilityOf(txtCommissionMerchantConfig));
        txtCommissionMerchantConfig.sendKeys(commission);
    }
    public void clickBtnSaveMerchantConfig(){
        wait.until(ExpectedConditions.visibilityOf(btnSaveMerchantConfig));
        btnSaveMerchantConfig.click();
        try{
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert=driver.switchTo().alert();
            alertMessage=alert.getText();
            alert.accept();
        }
        catch (Exception e){}
        try {
            wait.until(ExpectedConditions.visibilityOf(msgDisplay));
            errorSuccessMsg = msgDisplay.getText();
        }
        catch (Exception e){}
    }
    public void clickBtnCancelMerchantConfig(){
        wait.until(ExpectedConditions.visibilityOf(btnCancelMerchantConfig));
        btnCancelMerchantConfig.click();
    }
    public void enterTxtSearchMerchantConfig(String search){
        wait.until(ExpectedConditions.visibilityOf(txtSearchMerchantConfig));
        txtSearchMerchantConfig.sendKeys(search);
    }
    public void clickBtnSelectMerchantConfig(){
        action.moveToElement(btnSelectMerchantConfig).build().perform();
        wait.until(ExpectedConditions.visibilityOf(btnSelectMerchantConfig));
        btnSelectMerchantConfig.click();
    }

    public void clickBtnUpdateMerchantConfig(){
        wait.until(ExpectedConditions.visibilityOf(btnUpdateMerchantConfig));
        btnUpdateMerchantConfig.click();
    }

    public String getAlertMessage(){
        return alertMessage;
    }
    public String getErrorSuccessMsgMake(){
        return errorSuccessMsg;
    }

    //    Events of web elements for Tab Merchant POS_ID Configuration
    public void clickTabMerchantPOS_IDConfiguration(){
        wait.until(ExpectedConditions.visibilityOf(tabMerchantPOS_IDConfiguration));
        tabMerchantPOS_IDConfiguration.click();
    }
    public void selectDDFinancialNamePosConfig(String financialName){
        wait.until(ExpectedConditions.visibilityOf(ddFinancialNamePosConfig));
        Select dd=new Select(ddFinancialNamePosConfig);
        dd.selectByVisibleText(financialName);
    }
    public void selectDDMerchantIDPosConfig(String merchantID){
        wait.until(ExpectedConditions.visibilityOf(ddMerchantIDPosConfig));
        Select dd=new Select(ddMerchantIDPosConfig);
        dd.selectByVisibleText(merchantID);
    }
    public void enterTxtPosIDPosConfig(String posID){
        wait.until(ExpectedConditions.visibilityOf(txtPosIDPosConfig));
        txtPosIDPosConfig.sendKeys(posID);
    }
    public void clickBtnSavePosConfig(){
        wait.until(ExpectedConditions.visibilityOf(btnSavePosConfig));
        btnSavePosConfig.click();
        try{
            Alert alert=driver.switchTo().alert();
            alertMessage= alert.getText();
            alert.accept();
        }catch (Exception e){}
    }
    public void clickBtnCancelPosConfig(){
        wait.until(ExpectedConditions.visibilityOf(btnCancelPosConfig));
        btnCancelPosConfig.click();
    }
    public void enterTxtSearchPosConfig(String search){
        wait.until(ExpectedConditions.visibilityOf(txtSearchPosConfig));
        txtSearchPosConfig.sendKeys(search);
    }
    public void clickBtnSelectPosConfig(){
        wait.until(ExpectedConditions.visibilityOf(btnSelectPosConfig));
        btnSelectPosConfig.click();
    }
    public void clickBtnUpdatePosConfig(){
        wait.until(ExpectedConditions.visibilityOf(btnUpdatePosConfig));
        btnUpdatePosConfig.click();
        try{
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert=driver.switchTo().alert();
            alertMessage=alert.getText();
            alert.accept();
        }
        catch (Exception e){}
        try {
            wait.until(ExpectedConditions.visibilityOf(msgDisplay));
            errorSuccessMsg = msgDisplay.getText();
        }
        catch (Exception e){}
    }
    public String getURL(){
        return driver.getCurrentUrl();
    }
}