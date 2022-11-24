package pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TenantDashboardPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

//    Task Operations parent menu
    @FindBy(linkText = "Task Operations")
    private WebElement linkTaskOperations;

    @FindBy(linkText = "Transaction Status")
    private WebElement linkTransactionStatus;

    @FindBy(linkText = "Rollback")
    private WebElement linkRollback;

    @FindBy(linkText = "File Renaming Details")
    private WebElement linkFileRenamingDetails;

    @FindBy(linkText = "Extraction and Upload")
    private WebElement linkExtractionAndUpload;

    @FindBy(linkText = "Automatic Reconciliation")
    private WebElement linkAutomaticReconciliation;

//    Configuration parent menu
    @FindBy(linkText = "Configuration")
    private WebElement linkConfiguration;

    @FindBy(linkText = "User Configuration")
    private WebElement linkUserConfiguration;

//    @FindBy(linkText = "Source Configuration")
//    private WebElement linkSourceConfiguration;

//    Sub menu items under Source Configuration
    @FindBy(xpath = "//*[@id=\"menu\"]/ul/li[2]/div/ul/li[2]/a")
    private WebElement linkFileConfiguration;

//    Grandchild menu items under File Configuration menu
    @FindBy(linkText = "File Name Configuration")
    private WebElement linkFileNameConfiguration;

    @FindBy(linkText = "File Structure & Detail Configuration")
    private WebElement linkFileStructureDetailConfiguration;

    @FindBy(partialLinkText = "File Field Mapping Configuration")
    private WebElement linkFileFieldMappingConfiguration;

    //
    @FindBy(partialLinkText = "General Configuration")
    private WebElement linkGeneralConfiguration;

//    Sub menu items under General Configuration
    @FindBy(linkText = "TranID Configuration")
    private WebElement linkTranIDConfiguration;

    @FindBy(linkText = "Entity Configuration")
    private WebElement linkEntityConfiguration;

    @FindBy(linkText = "Reason Code Configuration")
    private WebElement linkReasonCodeConfiguration;

    @FindBy(linkText = "Currency Configuration")
    private WebElement linkCurrencyConfiguration;

    //
    @FindBy(linkText = "Mapping Entities")
    private WebElement linkMappingEntities;

    @FindBy(linkText = "KeyField Configuration")
    private WebElement linkKeyFieldConfiguration;

    @FindBy(linkText = "Branch Configuration")
    private WebElement linkBranchConfiguration;

    @FindBy(linkText = "Bin Configuration")
    private WebElement linkBinConfiguration;

    @FindBy(linkText = "Terminal Configuration")
    private WebElement linkTerminalConfiguration;

//    Sub menu items under Terminal Configuration
//    @FindBy(linkText = "Terminal Configuration")
//    private WebElement linkSubTerminalConfiguration;

    @FindBy(linkText = "Merchant Configuration")
    private WebElement linkMerchantConfiguration;

//    User Management parent menu
    @FindBy(linkText = "User Management")
    private WebElement linkUserManagement;

//    Sub menu items under Manage Profile
    @FindBy(linkText = "Manage Profile")
    private WebElement linkManageProfile;

    @FindBy(linkText = "Manage User")
    private WebElement linkManageUser;

    @FindBy(linkText = "Forget Password")
    private WebElement linkForgetPassword;

//    Reports parent menu
    @FindBy(linkText = "Reports")
    private WebElement linkReports;

//    Sub menu items under Reports
    @FindBy(linkText = "User Management Reports")
    private WebElement linkUserManagementReports;

    @FindBy(linkText = "Extraction Report")
    private WebElement linkExtractionReport;

    @FindBy(linkText = "Upload File Report")
    private WebElement linkUploadFileReport;

    @FindBy(linkText = "Reconciled Reports")
    private WebElement linkReconciledReports;

    @FindBy(linkText = "Unreconciled Reports")
    private WebElement linkUnreconciledReports;

    @FindBy(id = "lnkbtnLogOut")
    private WebElement lnkbtnLogOut;

    public TenantDashboardPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public void hoverLinkTaskOperations(){
        wait.until(ExpectedConditions.visibilityOf(linkTaskOperations));
        action.moveToElement(linkTaskOperations).perform();
    }

    public TransactionStatusPage clickLinkTransactionStatus(){
        wait.until(ExpectedConditions.visibilityOf(linkTransactionStatus));
        linkTransactionStatus.click();
        return new TransactionStatusPage(driver);
    }

    public RollbackPage clickLinkRollback(){
        wait.until(ExpectedConditions.visibilityOf(linkRollback));
        linkRollback.click();
        return new RollbackPage(driver);
    }

    public FileRenamingDetailsPage clickLinkFileRenamingDetails(){
        linkFileRenamingDetails.click();
        return new FileRenamingDetailsPage(driver);
    }
    public ExtractionAndUploadPage clickLinkExtractionAndUpload(){
        linkExtractionAndUpload.click();
        return new ExtractionAndUploadPage(driver);
    }
    public AutomaticReconciliationPage clickLinkAutomaticReconciliation(){
        linkAutomaticReconciliation.click();
        return new AutomaticReconciliationPage(driver);
    }

    public void hoverLinkConfiguration(){
        wait.until(ExpectedConditions.visibilityOf(linkConfiguration));
        action.moveToElement(linkConfiguration).perform();
    }

    public UserConfigurationPage clickLinkUserConfiguration(){
        wait.until(ExpectedConditions.visibilityOf(linkUserConfiguration));
        linkUserConfiguration.click();
        return new UserConfigurationPage(driver);
    }

    public void hoverLinkFileConfiguration(){
        wait.until(ExpectedConditions.visibilityOf(linkFileConfiguration));
        action.moveToElement(linkFileConfiguration).build().perform();
    }

    public FileNameConfigurationPage clickLinkFileNameConfiguration(){
        wait.until(ExpectedConditions.visibilityOf(linkFileNameConfiguration));
        linkFileNameConfiguration.click();
        return new FileNameConfigurationPage(driver);
    }

    public FileStructureDetailConfigurationPage clickLinkFileStructureDetailConfiguration(){
        wait.until(ExpectedConditions.visibilityOf(linkFileStructureDetailConfiguration));
        linkFileStructureDetailConfiguration.click();
        return new FileStructureDetailConfigurationPage(driver);
    }

    public FileFieldMappingConfigurationPage clickLinkFileFieldMappingConfiguration(){
        wait.until(ExpectedConditions.visibilityOf(linkFileFieldMappingConfiguration));
        linkFileFieldMappingConfiguration.click();
        return new FileFieldMappingConfigurationPage(driver);
    }

    public void hoverLinkGeneralConfiguration(){
        wait.until(ExpectedConditions.visibilityOf(linkGeneralConfiguration));
        action.moveToElement(linkGeneralConfiguration).build().perform();
    }

    public TranIDConfigurationPage clickLinkTranIDConfiguration(){
        wait.until(ExpectedConditions.visibilityOf(linkTranIDConfiguration));
        linkTranIDConfiguration.click();
        return new TranIDConfigurationPage(driver);
    }

    public EntityConfigurationPage clickLinkEntityConfiguration(){
        wait.until(ExpectedConditions.visibilityOf(linkEntityConfiguration));
        linkEntityConfiguration.click();
        return new EntityConfigurationPage(driver);
    }
    public ReasonCodeConfigurationPage clickLinkReasonCodeConfiguration(){
        wait.until(ExpectedConditions.visibilityOf(linkReasonCodeConfiguration));
        linkReasonCodeConfiguration.click();
        return new ReasonCodeConfigurationPage(driver);
    }
    public CurrencyConfigurationPage clickLinkCurrencyConfiguration(){
        wait.until(ExpectedConditions.visibilityOf(linkCurrencyConfiguration));
        linkCurrencyConfiguration.click();
        return new CurrencyConfigurationPage(driver);
    }

    public MappingEntitiesPage clickLinkMappingEntities(){
        wait.until(ExpectedConditions.visibilityOf(linkMappingEntities));
        linkMappingEntities.click();
        return new MappingEntitiesPage(driver);
    }

    public KeyFieldConfigurationPage clickLinkKeyFieldConfiguration(){
        wait.until(ExpectedConditions.visibilityOf(linkKeyFieldConfiguration));
        linkKeyFieldConfiguration.click();
        return new KeyFieldConfigurationPage(driver);
    }

    public BranchConfigurationPage clickLinkBranchConfiguration(){
        wait.until(ExpectedConditions.visibilityOf(linkBranchConfiguration));
        linkBranchConfiguration.click();
        return new BranchConfigurationPage(driver);
    }

    public BINConfigurationPage clickLinkBinConfiguration(){
        wait.until(ExpectedConditions.visibilityOf(linkBinConfiguration));
        linkBinConfiguration.click();
        return new BINConfigurationPage(driver);
    }

    public TerminalConfigurationPage clickLinkTerminalConfiguration(){
        wait.until(ExpectedConditions.visibilityOf(linkTerminalConfiguration));
        linkTerminalConfiguration.click();
        return new TerminalConfigurationPage(driver);
    }
    public MerchantConfigurationPage clickLinkMerchantConfiguration(){
        wait.until(ExpectedConditions.visibilityOf(linkMerchantConfiguration));
        linkMerchantConfiguration.click();
        return new MerchantConfigurationPage(driver);
    }
















    public void hoverLinkUserManagement(){
        wait.until(ExpectedConditions.visibilityOf(linkUserManagement));
        action.moveToElement(linkUserManagement).perform();
    }

    public void hoverLinkReports(){
        wait.until(ExpectedConditions.visibilityOf(linkReports));
        action.moveToElement(linkReports).perform();
    }

    public void clickLnkbtnLogOut(){
        action.moveToElement(lnkbtnLogOut).perform();
        wait.until(ExpectedConditions.visibilityOf(lnkbtnLogOut));
        lnkbtnLogOut.click();
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}
