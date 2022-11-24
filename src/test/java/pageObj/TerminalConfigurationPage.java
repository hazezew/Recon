package pageObj;

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

public class TerminalConfigurationPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private String errorSuccessMsg="";
    private String alertMessage="";
    private Actions action;

    @FindBy(id = "ContentPlaceHolder1_lblTerminalVal")
    private WebElement msgDisplay;

    @FindBy(xpath = "//*[@id=\"__tab_ContentPlaceHolder1_ajaxTabContainer_AjaxTabPanelTerMake\"]")
    private WebElement tabTerminalMakeConfiguration;

    @FindBy(xpath = "//*[@id=\"__tab_ContentPlaceHolder1_ajaxTabContainer_AjaxTerminalConfig\"]")
    private WebElement tabTerminalDetailConfig;

    @FindBy(id = "ContentPlaceHolder1_ajaxTabContainer_AjaxTabPanelTerMake_btnNew")
    private WebElement btnNewMake;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTabPanelTerMake$txtTerminalName")
    private WebElement txtTerminalNameMake;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTabPanelTerMake$txtTerminalDesc")
    private WebElement txtTerminalDescMake;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTabPanelTerMake$ddlDeviceType")
    private WebElement ddDeviceTypeMake;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_ajaxTabContainer_AjaxTabPanelTerMake_btnSave\"]")
    private WebElement btnSaveMake;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTabPanelTerMake$btnCancel")
    private WebElement btnCancelMake;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTabPanelTerMake$btnEdit")
    private WebElement btnEditMake;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTabPanelTerMake$btnSave")
    private WebElement btnUpdateMake;

//    Web Elements for tab under Terminal Detail Configuration
    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTerminalConfig$btnNewTC")
    private WebElement btnNewDetail;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTerminalConfig$ddlFinName")
    private WebElement ddFinancialNameDetail;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTerminalConfig$txtTermID")
    private WebElement txtIDDetial;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTerminalConfig$txtTermLoc")
    private WebElement txtLocationDetail;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTerminalConfig$ddlTermType")
    private WebElement txtTerminalMakeDetail;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTerminalConfig$ddlCassette1")
    private WebElement ddCassette1Detail;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTerminalConfig$ddlCassette2")
    private WebElement ddCassette2Detail;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTerminalConfig$ddlCassette3")
    private WebElement ddCassette3Detail;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTerminalConfig$ddlCassette4")
    private WebElement ddCassette4Detail;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTerminalConfig$txtTermName")
    private WebElement txtNameDetail;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTerminalConfig$txtTermAcct")
    private WebElement txtAccountDetail;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTerminalConfig$ddlTermBranchName")
    private WebElement ddBranchDetail;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTerminalConfig$ddlTermType")
    private WebElement ddTerminalMakeDetail;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTerminalConfig$ddlNoOfCassette")
    private WebElement ddNoOfCassetteDetail;

    @FindBy(id = "ContentPlaceHolder1_ajaxTabContainer_AjaxTerminalConfig_RadioOutsource_0")
    private WebElement chkOutsourceYes;

    @FindBy(id = "ContentPlaceHolder1_ajaxTabContainer_AjaxTerminalConfig_RadioOutsource_1")
    private WebElement chkOutsourceNo;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTerminalConfig$ddlterminaltype")
    private WebElement ddTerminalTypeDetail;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTerminalConfig$btnSaveTC")
    private WebElement btnSaveDetail;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTerminalConfig$btnCancelTC")
    private WebElement btnCancelDetail;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTerminalConfig$txtSearch")
    private WebElement txtSearchDetail;

    @FindBy(name="ctl00$ContentPlaceHolder1$ajaxTabContainer$AjaxTerminalConfig$Dropoutsource")
    private WebElement ddOutsourcingAgentDetail;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_ajaxTabContainer_AjaxTerminalConfig_Btnexport\"]")
    private WebElement btnExportDetail;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolder1_ajaxTabContainer_AjaxTabPanelTerMake_grvTerminalID\"]/tbody/tr[2]/td[14]/a")
    private WebElement btnSelectMake;

    public TerminalConfigurationPage(WebDriver driver){
        this.driver=driver;
        action=new Actions(driver);
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
    }

    public void clickTabTerminalMakeConfiguration(){
        wait.until(ExpectedConditions.visibilityOf(tabTerminalMakeConfiguration));
        tabTerminalMakeConfiguration.click();
    }
//    Events for web elements for Tab Terminal Make Configuration
    public void clickBtnNewMake(){
        wait.until(ExpectedConditions.visibilityOf(btnNewMake));
        btnNewMake.click();
    }
    public void enterTxtTerminalNameMake(String terminalName){
        wait.until(ExpectedConditions.visibilityOf(txtTerminalNameMake));
        txtTerminalNameMake.sendKeys(terminalName);
    }
    public void enterTxtTerminalDescMake(String terminalDesc){
        wait.until(ExpectedConditions.visibilityOf(txtTerminalDescMake));
        txtTerminalDescMake.sendKeys(terminalDesc);
    }

    public void selectDDDeviceTypeMake(String deviceType){
        wait.until(ExpectedConditions.visibilityOf(ddDeviceTypeMake));
        Select dd=new Select(ddDeviceTypeMake);
        dd.selectByVisibleText(deviceType);
    }
    public void clickBtnSaveMake(){
        wait.until(ExpectedConditions.visibilityOf(btnSaveMake));
        btnSaveMake.click();
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
    public String getAlertMessage(){
        return alertMessage;
    }
    public void clickBtnCancelMake(){
        wait.until(ExpectedConditions.visibilityOf(btnCancelMake));
        btnCancelMake.click();
    }
    public void clickBtnSelectMake(){
        action.moveToElement(btnSelectMake);
        wait.until(ExpectedConditions.visibilityOf(btnSelectMake));
        btnSelectMake.click();
    }

    public void clickBtnEditMake(){
        wait.until(ExpectedConditions.visibilityOf(btnEditMake));
        btnEditMake.click();
    }
    public void clickBtnUpdateMake(){
        wait.until(ExpectedConditions.visibilityOf(btnUpdateMake));
        btnUpdateMake.click();
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
    public String getErrorSuccessMsgMake(){
        return errorSuccessMsg;
    }

//    Events of web elements for Tab Terminal Detail Configuration
    public void clickTabTerminalDetailConfig(){
        wait.until(ExpectedConditions.visibilityOf(tabTerminalDetailConfig));
        tabTerminalDetailConfig.click();
    }
    public void clickBtnNewDetail(){
        wait.until(ExpectedConditions.visibilityOf(btnNewDetail));
        btnNewDetail.click();
    }
    public void selectDDFinancialName(String financialName){
        wait.until(ExpectedConditions.visibilityOf(ddFinancialNameDetail));
        Select dd=new Select(ddFinancialNameDetail);
        dd.selectByVisibleText(financialName);
    }
    public void enterTxtIDDetial(String id){
        wait.until(ExpectedConditions.visibilityOf(txtIDDetial));
        txtIDDetial.sendKeys(id);
    }
    public void enterTxtLocationDetail(String location){
        wait.until(ExpectedConditions.visibilityOf(txtLocationDetail));
        txtLocationDetail.sendKeys(location);
    }
    public void enterTxtTerminalMakeDetail(String terminalMake){
        wait.until(ExpectedConditions.visibilityOf(txtTerminalMakeDetail));
        txtTerminalMakeDetail.sendKeys(terminalMake);
    }
    public void selectDDCassette1Detail(String cassette1){
        wait.until(ExpectedConditions.visibilityOf(ddCassette1Detail));
        Select dd=new Select(ddCassette1Detail);
        dd.selectByVisibleText(cassette1);
    }
    public void selectDDCassette2Detail(String cassette2){
        wait.until(ExpectedConditions.visibilityOf(ddCassette2Detail));
        Select dd=new Select(ddCassette2Detail);
        dd.selectByVisibleText(cassette2);
    }
    public void selectDDCassette3Detail(String cassette3){
        wait.until(ExpectedConditions.visibilityOf(ddCassette3Detail));
        Select dd=new Select(ddCassette3Detail);
        dd.selectByVisibleText(cassette3);
    }
    public void selectDDCassette4Detail(String cassette4){
        wait.until(ExpectedConditions.visibilityOf(ddCassette4Detail));
        Select dd=new Select(ddCassette4Detail);
        dd.selectByVisibleText(cassette4);
    }
    public void enterTxtNameDetail(String name){
        wait.until(ExpectedConditions.visibilityOf(txtNameDetail));
        txtNameDetail.sendKeys(name);
    }
    public void enterTxtAccountDetail(String account){
        wait.until(ExpectedConditions.visibilityOf(txtAccountDetail));
        txtAccountDetail.sendKeys(account);
    }
    public void selectDDBranchDetail(String branch){
        wait.until(ExpectedConditions.visibilityOf(ddBranchDetail));
        Select dd=new Select(ddBranchDetail);
        dd.selectByVisibleText(branch);
    }
    public void selectDDTerminalMakeDetail(String terminalMake){
        wait.until(ExpectedConditions.visibilityOf(txtTerminalMakeDetail));
        Select dd=new Select(txtTerminalMakeDetail);
        dd.selectByVisibleText(terminalMake);
    }
    public void selectDDNoOfCassetteDetail(String noOfCassette){
        wait.until(ExpectedConditions.visibilityOf(ddNoOfCassetteDetail));
        Select dd=new Select(ddNoOfCassetteDetail);
        dd.selectByVisibleText(noOfCassette);
    }
    public void clickChkOutsource(String yesNo){
        if(yesNo.equalsIgnoreCase("NO")){
            wait.until(ExpectedConditions.visibilityOf(chkOutsourceNo));
            chkOutsourceNo.click();
        }
        else {
            wait.until(ExpectedConditions.visibilityOf(chkOutsourceYes));
            chkOutsourceYes.click();
        }
    }

    public void selectDDTerminalTypeDetail(String terminalType){
        wait.until(ExpectedConditions.visibilityOf(ddTerminalTypeDetail));
        Select dd=new Select(ddTerminalTypeDetail);
        dd.selectByVisibleText(terminalType);
    }
    public void selectDDOutsourcingAgentDetail(String outsourcingAgent){
        wait.until(ExpectedConditions.visibilityOf(ddOutsourcingAgentDetail));
        Select dd=new Select(ddOutsourcingAgentDetail);
        dd.selectByVisibleText(outsourcingAgent);
    }
    public void clickBtnSaveDetail(){
        wait.until(ExpectedConditions.visibilityOf(btnSaveDetail));
        btnSaveDetail.click();
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
    public void clickBtnCancelDetail(){
        wait.until(ExpectedConditions.visibilityOf(btnCancelDetail));
        btnCancelDetail.click();
    }
    public void enterTxtSearchDetail(String search){
        wait.until(ExpectedConditions.visibilityOf(txtSearchDetail));
        txtSearchDetail.sendKeys(search);
    }
    public void clickBtnExportDetail(){
        wait.until(ExpectedConditions.visibilityOf(btnExportDetail));
        btnExportDetail.click();
    }
    public String getURL(){
        return driver.getCurrentUrl();
    }
}