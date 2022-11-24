package stepDef;

import config.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObj.*;

public class ConfigurationStepDef extends AbstractPage {
    private WebDriver driver;
    private LoginPage loginPage;
    private TenantDashboardPage tenantDashboardPage;
    private UserConfigurationPage userConfigurationPage;
    private FileNameConfigurationPage fileNameConfigurationPage;
    private FileStructureDetailConfigurationPage fileStructureDetailConfigurationPage;
    private FileFieldMappingConfigurationPage fileFieldMappingConfigurationPage;
    private TranIDConfigurationPage tranIDConfigurationPage;
    private EntityConfigurationPage entityConfigurationPage;
    private ReasonCodeConfigurationPage reasonCodeConfigurationPage;
    private CurrencyConfigurationPage currencyConfigurationPage;
    public MappingEntitiesPage mappingEntitiesPage;
    private KeyFieldConfigurationPage keyFieldConfigurationPage;
    private BranchConfigurationPage branchConfigurationPage;
    private BINConfigurationPage binConfigurationPage;
    private TerminalConfigurationPage terminalConfigurationPage;
    private MerchantConfigurationPage merchantConfigurationPage;

    public ConfigurationStepDef(){
        this.driver=super.driver;
        this.loginPage=super.loginPage;
        tenantDashboardPage=super.tenantDashboardPage;
    }
    @And("user moves mouse over Configuration menu")
    public void userMovesMouseOverConfigurationMenu() {
        tenantDashboardPage.hoverLinkConfiguration();
    }

    @And("user clicks on User Configuration submenu")
    public void userClicksOnUserConfigurationSubmenu() {
        userConfigurationPage=tenantDashboardPage.clickLinkUserConfiguration();
    }

    @Then("system displays User Configuration page")
    public void systemDisplaysUserConfigurationPage() {
        Assert.assertEquals(userConfigurationPage.getURL(), Config.userConfigurationPageURL);
    }

    @Then("user clicks on Username Configuration tab")
    public void userClicksOnUsernameConfigurationTab() {
        userConfigurationPage.clickTabUserNameConfiguration();
    }

    @And("on Username Configuration tab user clicks on Edit button")
    public void onUsernameConfigurationTabUserClicksOnEditButton() {
        userConfigurationPage.clickBtnUserEdit();
    }

    @And("on Username Configuration tab user clicks on Update button")
    public void onUsernameConfigurationTabUserClicksOnUpdateButton() {
        userConfigurationPage.clickBtnUserUpdate();
    }

    @Then("user clicks on Password Configuration tab")
    public void userClicksOnPasswordConfigurationTab() {
        userConfigurationPage.clickTabPasswordConfiguration();
    }

    @And("on Password Configuration tab user clicks on Edit button")
    public void onPasswordConfigurationTabUserClicksOnEditButton() {
        userConfigurationPage.clickBtnPasswordEdit();
    }

    @And("on Password Configuration tab user clicks on Update button")
    public void onPasswordConfigurationTabUserClicksOnUpdateButton() {
        userConfigurationPage.clickBtnPasswordUpdate();
    }

    @And("user moves mouse over File Configuration submenu")
    public void userMovesMouseOverFileConfigurationSubmenu() {
        tenantDashboardPage.hoverLinkFileConfiguration();
    }

    @And("user clicks on File Name Configuration child menu")
    public void userClicksOnFileNameConfigurationChildMenu() {
        fileNameConfigurationPage=tenantDashboardPage.clickLinkFileNameConfiguration();
    }

    @And("user clicks on File Structure Detail Configuration child menu")
    public void userClicksOnFileStructureDetailConfigurationChildMenu() {
        fileStructureDetailConfigurationPage=tenantDashboardPage.clickLinkFileStructureDetailConfiguration();
    }

    @Then("system displays File Structure Detail Configuration page")
    public void system_displays_File_Structure_Detail_Configuration_page() {
        Assert.assertEquals(fileStructureDetailConfigurationPage.getURL(),Config.fileStructureDetailConfigurationPageURL);
    }

    @And("user clicks on Field Configuration Tab")
    public void userClicksOnFieldConfigurationTab() {
        fileStructureDetailConfigurationPage.clickTabFieldConfiguration();
    }

    @And("user clicks on File Structure Configuration tab")
    public void userClicksOnFileStructureConfigurationTab() {
        fileStructureDetailConfigurationPage.clickTabFileStructureConfiguration();
        
    }

    @And("user clicks on File Field Configuration Tab")
    public void userClicksOnFileFieldConfigurationTab() {
        fileStructureDetailConfigurationPage.clickTabFileFieldConfiguration();
    }

    @And("user clicks on File Field Mapping Configuration child menu")
    public void userClicksOnFileFieldMappingConfigurationChildMenu() {
        fileFieldMappingConfigurationPage=tenantDashboardPage.clickLinkFileFieldMappingConfiguration();
    }

    @And("system displays File Field Mapping Configuration page")
    public void systemDisplaysFileFieldMappingConfigurationPage() {
        Assert.assertEquals(fileFieldMappingConfigurationPage.getURL(),Config.fileFieldMappingConfigurationPageURL);
    }

    @Then("on File Field Mapping Configuration user selects {string} from Financial Name dropdown")
    public void onFileFieldMappingConfigurationUserSelectsFromFinancialNameDropdown(String finName) {
        fileFieldMappingConfigurationPage.selectDDFinancialName(finName);
    }

    @And("on File Field Mapping Configuration user selects {string} from Entity Name dropdown")
    public void onFileFieldMappingConfigurationUserSelectsFromEntityNameDropdown(String entity) {
        fileFieldMappingConfigurationPage.selectDDEntityName(entity);
    }

    @And("on File Field Mapping Configuration user selects {string} from File ID dropdown")
    public void onFileFieldMappingConfigurationUserSelectsFromFileIDDropdown(String fileID) {
        fileFieldMappingConfigurationPage.selectDDFileID(fileID);
    }

    @And("on File Field Mapping Configuration user selects {string} from Record Type dropdown")
    public void onFileFieldMappingConfigurationUserSelectsFromRecordTypeDropdown(String recordType) {
        fileFieldMappingConfigurationPage.selectDDRecordType(recordType);
    }

    @And("on File Field Mapping Configuration user clicks on Filter button")
    public void onFileFieldMappingConfigurationUserClicksOnFilterButton() {
        fileFieldMappingConfigurationPage.clickBtnFilter();
    }

    @Then("user moves mouse over General Configuration menu")
    public void user_moves_mouse_over_General_Configuration_menu() {
        tenantDashboardPage.hoverLinkGeneralConfiguration();
    }

    @Then("user clicks on TranID Configuration child menu")
    public void user_clicks_on_TranID_Configuration_child_menu() {
        tranIDConfigurationPage=tenantDashboardPage.clickLinkTranIDConfiguration();
    }

    @Then("system opens TranID Configuration page")
    public void system_opens_TranID_Configuration_page() {
        Assert.assertEquals(tranIDConfigurationPage.getURL(),Config.tranIDConfigurationPageURL);
    }

    @Then("user selects {string} from Financial Name dropdown")
    public void user_selects_from_Financial_Name_dropdown(String finName) {
        tranIDConfigurationPage.selectDdFinancialName(finName);
    }

    @Then("user selects {string} from Entity Name dropdown")
    public void user_selects_from_Entity_Name_dropdown(String entity) {
        tranIDConfigurationPage.selectDdEntity(entity);
    }

    @Then("user clicks on Cancel button")
    public void user_clicks_on_Cancel_button() {
        tranIDConfigurationPage.clickBtnCancel();
    }

    @And("user clicks on Entity Configuration child menu")
    public void userClicksOnEntityConfigurationChildMenu() {
        entityConfigurationPage= tenantDashboardPage.clickLinkEntityConfiguration();
    }

    @Then("system opens Entity Configuration page")
    public void systemOpensEntityConfigurationPage() {
        Assert.assertEquals(entityConfigurationPage.getURL(),Config.entityConfigurationPageURL);
    }

    @And("on Entity Configuration user selects {string} from Financial Name dropdown")
    public void onEntityConfigurationUserSelectsFromFinancialNameDropdown(String finName) {
        entityConfigurationPage.selectDdFinancialName(finName);
    }

    @And("on Entity Configuration user enters {string} into Entity Name textfield")
    public void onEntityConfigurationUserEntersIntoEntityNameTextfield(String entity) {
        entityConfigurationPage.enterTxtEntityName(entity);
    }

    @And("on Entity Configuration user enters {string} into Entity Description textfield")
    public void onEntityConfigurationUserEntersIntoEntityDescriptionTextfield(String desc) {
        entityConfigurationPage.enterTxtEntityDescription(desc);
    }

    @And("on Entity Configuration user clicks on Save button")
    public void onEntityConfigurationUserClicksOnSaveButton() {
        entityConfigurationPage.clickBtnSave();
    }

    @And("user clicks on Reason Code Configuration child menu")
    public void userClicksOnReasonCodeConfigurationChildMenu() {
        reasonCodeConfigurationPage=tenantDashboardPage.clickLinkReasonCodeConfiguration();
    }

    @Then("system opens Reason Code Configuration page")
    public void systemOpensReasonCodeConfigurationPage() {
        Assert.assertEquals(reasonCodeConfigurationPage.getURL(),Config.reasonCodeConfigurationPageURL);
    }

    @And("on Reason Code Configuration user clicks on New button")
    public void onReasonCodeConfigurationUserClicksOnNewButton() {
        reasonCodeConfigurationPage.clickBtnNew();
    }

    @And("on Reason Code Configuration user enters {string} into Reason Description textfield")
    public void onReasonCodeConfigurationUserEntersIntoReasonDescriptionTextfield(String desc) {
        reasonCodeConfigurationPage.enterTxtReasonDescription(desc);
    }

    @And("on Reason Code Configuration user clicks on Save button")
    public void onReasonCodeConfigurationUserClicksOnSaveButton() {
        reasonCodeConfigurationPage.clickBtnSave();
    }

    @And("user clicks on Currency Configuration child menu")
    public void userClicksOnCurrencyConfigurationChildMenu() {
        currencyConfigurationPage=tenantDashboardPage.clickLinkCurrencyConfiguration();
    }

    @Then("system opens Currency Configuration page")
    public void systemOpensCurrencyConfigurationPage() {
        Assert.assertEquals(currencyConfigurationPage.getURL(),Config.currencyCodeConfigurationPageURL);
    }

    @And("on Currency Configuration user clicks on New button")
    public void onCurrencyConfigurationUserClicksOnNewButton() {
        currencyConfigurationPage.clickBtnNew();
    }

    @And("on Currency Configuration user selects {string} from Financial Name dropdown")
    public void onCurrencyConfigurationUserSelectsFromFinancialNameDropdown(String finName) {
        currencyConfigurationPage.selectDdFinancialName(finName);
    }

    @And("on Currency Configuration user enters {string} into Code textfield")
    public void onCurrencyConfigurationUserEntersIntoCodeTextfield(String code) {
        currencyConfigurationPage.enterTxtCode(code);
    }

    @And("on Currency Configuration user enters {string} into Name textfield")
    public void onCurrencyConfigurationUserEntersIntoNameTextfield(String name) {
        currencyConfigurationPage.enterTxtName(name);
    }

    @And("on Currency Configuration user enters {string} into Country textfield")
    public void onCurrencyConfigurationUserEntersIntoCountryTextfield(String country) {
        currencyConfigurationPage.enterTxtCountry(country);
    }

    @And("on Currency Configuration user enters {string} into Abbreviation textfield")
    public void onCurrencyConfigurationUserEntersIntoAbbreviationTextfield(String abbr) {
        currencyConfigurationPage.enterTxtAbbreviation(abbr);
    }

    @And("on Currency Configuration user enters {string} into Description textfield")
    public void onCurrencyConfigurationUserEntersIntoDescriptionTextfield(String desc) {
        currencyConfigurationPage.enterTxtDescription(desc);
    }

    @And("on Currency Configuration user clicks on Save button")
    public void onCurrencyConfigurationUserClicksOnSaveButton() {
        currencyConfigurationPage.clickBtnSave();
    }

    @Then("Currency Configuration displays an alert message {string}")
    public void currencyConfigurationDisplaysAnAlertMessage(String successMsg) {
        Assert.assertEquals(currencyConfigurationPage.getAlertMessage(),successMsg);
    }

    @And("user clicks on Mapping Entities")
    public void userClicksOnMappingEntities() {
        mappingEntitiesPage=tenantDashboardPage.clickLinkMappingEntities();
    }

    @Then("system displays Mapping Entities page")
    public void systemDisplaysMappingEntitiesPage() {
        Assert.assertEquals(mappingEntitiesPage.getURL(),Config.mappingEntitiesPageURL);
    }

    @And("on Mapping Entities page user selects {string} from sameDifferent Financial dropdown")
    public void onMappingEntitiesPageUserSelectsFromSameDifferentFinancialDropdown(String sameDiff) {
        mappingEntitiesPage.selectDdSameDiffFinancial(sameDiff);
    }

    @And("on Mapping Entities page user selects {string} from financial name dropdown")
    public void onMappingEntitiesPageUserSelectsFromFinancialNameDropdown(String finName) {
        mappingEntitiesPage.selectDdFinancialName(finName);
    }

    @And("on Mapping Entities page user clicks on Cancel button")
    public void onMappingEntitiesPageUserClicksOnCancelButton() {
        mappingEntitiesPage.clickBtnCancel();
    }

    @And("user clicks on KeyField Configuration link")
    public void userClicksOnKeyFieldConfigurationLink() {
        keyFieldConfigurationPage=tenantDashboardPage.clickLinkKeyFieldConfiguration();
    }

    @Then("system displays KeyField Configuration page")
    public void systemDisplaysKeyFieldConfigurationPage() {
        Assert.assertEquals(keyFieldConfigurationPage.getURL(),Config.keyFieldConfigurationPageURL);
    }

    @And("on KeyField Configuration page user selects {string} Financial Name dropdown")
    public void onKeyFieldConfigurationPageUserSelectsFinancialNameDropdown(String finName) {
        keyFieldConfigurationPage.selectDDFinancialName(finName);
    }

    @And("on KeyField Configuration page user selects {string} Mapping Name dropdown")
    public void onKeyFieldConfigurationPageUserSelectsMappingNameDropdown(String mapping) {
        keyFieldConfigurationPage.selectDDMappingName(mapping);
    }

    @And("on KeyField Configuration page user selects {string} Transaction Type dropdown")
    public void onKeyFieldConfigurationPageUserSelectsTransactionTypeDropdown(String trnxType) {
        keyFieldConfigurationPage.selectDDTrnxType(trnxType);
    }

    @And("on KeyField Configuration page user enters {string} into Description textfield")
    public void onKeyFieldConfigurationPageUserEntersIntoDescriptionTextfield(String desc) {
        System.out.println("Description: "+desc);
        keyFieldConfigurationPage.enterTxtDescription(desc);
    }

    @And("on KeyField Configuration page user clicks on Cancel button")
    public void onKeyFieldConfigurationPageUserClicksOnCancelButton() {
        keyFieldConfigurationPage.clickBtnCancel();
    }

    @And("user clicks on Branch Configuration submenu")
    public void userClicksOnBranchConfigurationSubmenu() {
        branchConfigurationPage=tenantDashboardPage.clickLinkBranchConfiguration();
    }

    @Then("system displays Branch Configuration page")
    public void systemDisplaysBranchConfigurationPage() {
        Assert.assertEquals(branchConfigurationPage.getURL(),Config.branchConfigurationPageURL);
    }

    @And("on Branch Configuration page user clicks on New button")
    public void onBranchConfigurationPageUserClicksOnNewButton() {
        branchConfigurationPage.clickBtnNew();
    }

    @And("on Branch Configuration page user selects {string} from Financial dropdown")
    public void onBranchConfigurationPageUserSelectsFromFinancialDropdown(String financial) {
        branchConfigurationPage.selectDDFinancialName(financial);
    }

    @And("on Branch Configuration page user enters {string} into Branch Code textfield")
    public void onBranchConfigurationPageUserEntersIntoBranchCodeTextfield(String branchCode) {
        branchConfigurationPage.enterTxtBranchCode(branchCode);
    }

    @And("on Branch Configuration page user enters {string} into Branch Name textfield")
    public void onBranchConfigurationPageUserEntersIntoBranchNameTextfield(String branchName) {
        branchConfigurationPage.enterTxtBranchName(branchName);
    }

    @And("on Branch Configuration page user enters {string} into Address textfield")
    public void onBranchConfigurationPageUserEntersIntoAddressTextfield(String address) {
        branchConfigurationPage.enterTxtAddress(address);
    }

    @And("on Branch Configuration page user enters {string} into Contact No textfield")
    public void onBranchConfigurationPageUserEntersIntoContactNoTextfield(String contactNo) {
        branchConfigurationPage.enterTxtContactNumber(contactNo);
    }

    @And("on Branch Configuration page user clicks on Save button")
    public void onBranchConfigurationPageUserClicksOnSaveButton() {
        branchConfigurationPage.clickBtnSave();
    }

    @Then("Branch Configuration page displays a success message {string}")
    public void systemDisplaysASuccessMessage(String errorSuccussMsg) {
        Assert.assertEquals(branchConfigurationPage.getErrorSuccussMsg(),errorSuccussMsg);
    }

    @Then("Branch Configuration page displays an alert message containing {string}")
    public void branchConfigurationPageDisplaysAnAlertMessage(String alertMsg) {
//        System.out.println("Alert Msg: \n"+branchConfigurationPage.getAlertMessage());
//        System.out.println("Expected msg: "+alertMsg);
        Assert.assertTrue(branchConfigurationPage.getAlertMessage().contains(alertMsg));
    }

    @And("user clicks on BIN Configuration submenu")
    public void userClicksOnBINConfigurationSubmenu() {
        binConfigurationPage=tenantDashboardPage.clickLinkBinConfiguration();
    }

    @Then("system displays BIN Configuration page")
    public void systemDisplaysBINConfigurationPage() {
        Assert.assertEquals(binConfigurationPage.getURL(),Config.binConfigurationPageURL);
    }

    @And("on BIN Configuration page user clicks on New button")
    public void onBINConfigurationPageUserClicksOnNewButton() {
        binConfigurationPage.clickBtnNew();
    }

    @And("on BIN Configuration page user selects {string} from Financial Name dropdown")
    public void onBINConfigurationPageUserSelectsFromFinancialNameDropdown(String finName) {
        binConfigurationPage.selectDDFinancialName(finName);
    }

    @And("on BIN Configuration page user selects {string} from Entity Name dropdown")
    public void onBINConfigurationPageUserSelectsFromEntityNameDropdown(String entity) {
        binConfigurationPage.selectDDEntityName(entity);
    }

    @And("on BIN Configuration page user enters {string} into Bin No textfield")
    public void onBINConfigurationPageUserEntersIntoBinNoTextfield(String binNumber) {
        binConfigurationPage.enterTxtBinNumber(binNumber);
    }

    @And("on BIN Configuration page user selects {string} from Card Type dropdown")
    public void onBINConfigurationPageUserSelectsFromCardTypeDropdown(String cardType) {
        binConfigurationPage.selectDDCardType(cardType);
    }

    @And("on BIN Configuration page user clicks on Save button")
    public void onBINConfigurationPageUserClicksOnSaveButton() {
        binConfigurationPage.clickBtnSave();
    }

    @Then("BIN Configuration page displays success message {string}")
    public void binConfigurationPageDisplaysSuccessMessage(String msg) {
        Assert.assertEquals(binConfigurationPage.getErrorSuccussMsg(),msg);
    }

    @Then("BIN Configuration page displays an alert message {string}")
    public void binConfigurationPageDisplaysAnAlertMessage(String alertMsg) {
        Assert.assertEquals(binConfigurationPage.getAlertMessage(),alertMsg);
    }

    @And("BIN Configuration page displays an alert message containing {string}")
    public void binConfigurationPageDisplaysAnAlertMessageContaining(String partOfAlertMessage) {
        Assert.assertTrue(binConfigurationPage.getAlertMessage().contains(partOfAlertMessage));
    }

    @And("on BIN Configuration page user clicks on Select button on first row")
    public void onBINConfigurationPageUserClicksOnSelectButtonOnFirstRow() {
        binConfigurationPage.clickBtnSelect();
    }

    @And("on BIN Configuration page user clicks on Edit button")
    public void onBINConfigurationPageUserClicksOnEditButton() {
        binConfigurationPage.clickBtnEdit();
    }

    @And("on BIN Configuration page user clicks on Update button")
    public void onBINConfigurationPageUserClicksOnUpdateButton() {
        binConfigurationPage.clickBtnUpdate();
    }

    @And("user clicks on Terminal Configuration submenu")
    public void userClicksOnTerminalConfigurationSubmenu() {
        terminalConfigurationPage=tenantDashboardPage.clickLinkTerminalConfiguration();
    }

    @Then("system displays Terminal Configuration page")
    public void systemDisplaysTerminalConfigurationPage() {
        Assert.assertEquals(terminalConfigurationPage.getURL(),Config.terminalConfigurationPageURL);
    }

    @And("on Terminal Configuration page user clicks on Terminal Make Configuration tab")
    public void onTerminalConfigurationPageUserClicksOnTerminalMakeConfigurationTab() {
        terminalConfigurationPage.clickTabTerminalMakeConfiguration();
    }

    @And("on Terminal Configuration user clicks on New button")
    public void onTerminalConfigurationUserClicksOnNewButton() {
        terminalConfigurationPage.clickBtnNewMake();
    }

    @And("on Terminal Configuration page user enters {string} into Terminal Name textfield")
    public void onTerminalConfigurationPageUserEntersIntoTerminalNameTextfield(String terminalName) {
        terminalConfigurationPage.enterTxtTerminalNameMake(terminalName);
    }

    @And("on Terminal Configuration page user enters {string} into Terminal Description textfield")
    public void onTerminalConfigurationPageUserEntersIntoTerminalDescriptionTextfield(String desc) {
        terminalConfigurationPage.enterTxtTerminalDescMake(desc);
    }

    @And("on Terminal Configuration page user selects {string} from DeviceType dropdown")
    public void onTerminalConfigurationPageUserSelectsFromDeviceTypeDropdown(String deviceType) {
        terminalConfigurationPage.selectDDDeviceTypeMake(deviceType);
    }

    @And("on Terminal Configuration page user clicks on Save button")
    public void onTerminalConfigurationPageUserClicksOnSaveButton() {
        terminalConfigurationPage.clickBtnSaveMake();
    }

    @Then("Terminal Configuration page displays a success message {string}")
    public void terminalConfigurationPageDisplaysASuccessMessage(String errorSuccessMsg) {
        System.out.println("Alert message: "+terminalConfigurationPage.getAlertMessage());
        Assert.assertEquals(terminalConfigurationPage.getErrorSuccessMsgMake(),errorSuccessMsg);
    }

    @And("Terminal Configuration page displays an alert message containing {string}")
    public void terminalConfigurationPageDisplaysAnAlertMessageContaining(String partOfAlertMsg) {
        System.out.println("Alert message: "+terminalConfigurationPage.getAlertMessage());
        Assert.assertTrue(terminalConfigurationPage.getAlertMessage().contains(partOfAlertMsg));
    }

    @Then("on Terminal Configuration page user clicks on Select button")
    public void onTerminalConfigurationPageUserClicksOnSelectButton() {
        terminalConfigurationPage.clickBtnSelectMake();
    }

    @And("on Terminal Configuration page user clicks on Edit button")
    public void onTerminalConfigurationPageUserClicksOnEditButton() {
        terminalConfigurationPage.clickBtnEditMake();
    }

    @And("on Terminal Configuration page user clicks on Update button")
    public void onTerminalConfigurationPageUserClicksOnUpdateButton() {
        terminalConfigurationPage.clickBtnUpdateMake();
    }

    @And("on Terminal Configuration page user clicks on Terminal Detail Configuration tab")
    public void onTerminalConfigurationPageUserClicksOnTerminalDetailConfigurationTab() {
        terminalConfigurationPage.clickTabTerminalDetailConfig();
    }

    @And("on Terminal Configuration Detail user clicks on New button")
    public void onTerminalConfigurationDetailUserClicksOnNewButton() {
        terminalConfigurationPage.clickBtnNewDetail();
    }

    @And("on Terminal Configuration Detail user selects {string} from Financial Name dropdown")
    public void onTerminalConfigurationDetailUserSelectsFromFinancialNameDropdown(String finName) {
        terminalConfigurationPage.selectDDFinancialName(finName);
    }

    @And("on Terminal Configuration Detail user enters {string} into Name textfield")
    public void onTerminalConfigurationDetailUserEntersIntoNameTextfield(String name) {
        terminalConfigurationPage.enterTxtNameDetail(name);
    }

    @And("on Terminal Configuration Detail user enters {string} into ID textfield")
    public void onTerminalConfigurationDetailUserEntersIntoIDTextfield(String id) {
        terminalConfigurationPage.enterTxtIDDetial(id);
    }

    @And("on Terminal Configuration Detail user enters {string} into Account textfield")
    public void onTerminalConfigurationDetailUserEntersIntoAccountTextfield(String account) {
        terminalConfigurationPage.enterTxtAccountDetail(account);
    }

    @And("on Terminal Configuration Detail user enters {string} into Location textfield")
    public void onTerminalConfigurationDetailUserEntersIntoLocationTextfield(String location) {
        terminalConfigurationPage.enterTxtLocationDetail(location);
    }

    @And("on Terminal Configuration Detail user selects {string} from Branch Name dropdown")
    public void onTerminalConfigurationDetailUserSelectsFromBranchNameDropdown(String brName) {
        terminalConfigurationPage.selectDDBranchDetail(brName);
    }

    @And("on Terminal Configuration Detail user selects {string} from Terminal Make dropdown")
    public void onTerminalConfigurationDetailUserSelectsFromTerminalMakeDropdown(String terminalMake) {
        terminalConfigurationPage.selectDDTerminalMakeDetail(terminalMake);
    }

    @And("on Terminal Configuration Detail user selects {string} from No of Cassette dropdown")
    public void onTerminalConfigurationDetailUserSelectsFromNoOfCassetteDropdown(String cassette) {
        terminalConfigurationPage.selectDDNoOfCassetteDetail(cassette);
    }

    @And("on Terminal Configuration Detail user selects {string} Outsource checkbox")
    public void onTerminalConfigurationDetailUserSelectsOutsourceCheckbox(String yesNo) {
        terminalConfigurationPage.clickChkOutsource(yesNo);
    }

    @And("on Terminal Configuration Detail user selects {string} from Outsourcing Agent dropdown")
    public void onTerminalConfigurationDetailUserSelectsFromOutsourcingAgentDropdown(String outAgent) {
        terminalConfigurationPage.selectDDOutsourcingAgentDetail(outAgent);
    }

    @And("on Terminal Configuration Detail user selects {string} from Terminal Type dropdown")
    public void onTerminalConfigurationDetailUserSelectsFromTerminalTypeDropdown(String terType) {
        terminalConfigurationPage.selectDDTerminalTypeDetail(terType);
    }

    @And("on Terminal Configuration Detail user clicks on Save button")
    public void onTerminalConfigurationDetailUserClicksOnSaveButton() {
        terminalConfigurationPage.clickBtnSaveDetail();
    }

//    @Then("on Terminal Configuration Detail displays {string} message")
//    public void onTerminalConfigurationDetailDisplaysMessage(String displayedMessage) {
////        terminalConfigurationPage.
//    }

    @And("user clicks on Merchant Configuration submenu")
    public void userClicksOnMerchantConfigurationSubmenu() {
        merchantConfigurationPage=tenantDashboardPage.clickLinkMerchantConfiguration();
    }

    @Then("system displays Merchant Configuration page")
    public void systemDisplaysMerchantConfigurationPage() {
        Assert.assertEquals(merchantConfigurationPage.getURL(),Config.merchantConfigurationPageURL);
    }

    @And("on Merchant Configuration page user clicks on Merchant Configuration tab")
    public void onMerchantConfigurationPageUserClicksOnMerchantConfigurationTab() {
        merchantConfigurationPage.clickTabMerchantConfiguration();
    }

    @And("on Merchant Configuration user clicks on New button")
    public void onMerchantConfigurationUserClicksOnNewButton() {
        merchantConfigurationPage.clickBtnNewMerchantConfig();
    }

    @And("on Merchant Configuration user selects {string} from Financial Name dropdown option")
    public void onMerchantConfigurationUserSelectsFromFinancialNameDropdownOption(String finName) {
        merchantConfigurationPage.selectDDFinancialNameMerchantConfig(finName);
    }

    @And("on Merchant Configuration user enters {string} into Merchant Category ID textfield")
    public void onMerchantConfigurationUserEntersIntoMerchantCategoryIDTextfield(String merchantCat) {
        merchantConfigurationPage.enterTxtMerchantCategoryIDMerchantConfig(merchantCat);
    }

    @And("on Merchant Configuration user enters {string} into Merchant Name textfield")
    public void onMerchantConfigurationUserEntersIntoMerchantNameTextfield(String merchantName) {
        merchantConfigurationPage.enterTxtMerchantNameMerchantConfig(merchantName);
    }

    @And("on Merchant Configuration user enters {string} into Merchant Account Number textfield")
    public void onMerchantConfigurationUserEntersIntoMerchantAccountNumberTextfield(String merchantAcc) {
        merchantConfigurationPage.enterTxtMerchantAccountNumberMerchantConfig(merchantAcc);
    }

    @And("on Merchant Configuration user selects {string} from Currency Code dropdown")
    public void onMerchantConfigurationUserSelectsFromCurrencyCodeDropdown(String currencyCode) {
        merchantConfigurationPage.selectDDCurrencyCodeMerchantConfig(currencyCode);
    }
    @And("on Merchant Configuration user enters {string} into Merchant Rentaintion one textfield")
    public void onMerchantConfigurationUserEntersIntoMerchantRentaintionOneTextfield(String ret1) {
        merchantConfigurationPage.enterTxtMerchantRentaintion1MerchantConfig(ret1);
    }

    @And("on Merchant Configuration user enters {string} into Merchant Rentaintion two textfield")
    public void onMerchantConfigurationUserEntersIntoMerchantRentaintionTwoTextfield(String ret2) {
        merchantConfigurationPage.enterTxtMerchantRentaintion2MerchantConfig(ret2);
    }

    @And("on Merchant Configuration user enters {string} into Merchant Category Code textfield")
    public void onMerchantConfigurationUserEntersIntoMerchantCategoryCodeTextfield(String merchantCatCode) {
        merchantConfigurationPage.enterTxtMerchantCategoryCodeMerchantConfig(merchantCatCode);
    }

    @And("on Merchant Configuration user clicks {string} from Status checkbox")
    public void onMerchantConfigurationUserClicksFromStatusCheckbox(String status) {
        merchantConfigurationPage.clickChkStatusMerchantConfig(status);
    }

    @And("on Merchant Configuration user clicks on Rank checkbox")
    public void onMerchantConfigurationUserClicksOnRankCheckbox() {
        merchantConfigurationPage.clickChkRankMerchantConfig();
    }

    @And("on Merchant Configuration user enters {string} into Commission textfield")
    public void onMerchantConfigurationUserEntersIntoCommissionTextfield(String commission) {
        merchantConfigurationPage.enterTxtCommissionMerchantConfig(commission);
    }

    @And("on Merchant Configuration user clicks on Save button")
    public void onMerchantConfigurationUserClicksOnSaveCheckbox() {
        merchantConfigurationPage.clickBtnSaveMerchantConfig();
    }

    @Then("Merchant Configuration page displays a success message {string}")
    public void merchantConfigurationPageDisplaysASuccessMessage(String msg) {
        Assert.assertEquals(merchantConfigurationPage.getErrorSuccessMsgMake(),msg);
    }

    @And("on Merchant Configuration page user clicks on Select button")
    public void onMerchantConfigurationPageUserClicksOnSelectButton() {
        merchantConfigurationPage.clickBtnSelectMerchantConfig();
    }

    @And("on Merchant Configuration page user clicks on Update button")
    public void onMerchantConfigurationPageUserClicksOnUpdateButton() {
        merchantConfigurationPage.clickBtnUpdateMerchantConfig();
    }

    @Then("Merchant Configuration page displays an alert message containing {string}")
    public void merchantConfigurationPageDisplaysAnAlertMessageContaining(String partOfAlertMessage) {
        Assert.assertTrue(merchantConfigurationPage.getAlertMessage().contains(partOfAlertMessage));
    }

    @Then("on Merchant Configuration page user clicks on Merchant Pos_ID Configuration tab")
    public void on_Merchant_Configuration_page_user_clicks_on_Merchant_Pos_ID_Configuration_tab() {
        merchantConfigurationPage.clickTabMerchantPOS_IDConfiguration();
    }

    @Then("on Merchant Configuration page user selects {string} from Financial Name dropdown")
    public void on_Merchant_Configuration_page_user_selects_from_Financial_Name_dropdown(String finName) {
        merchantConfigurationPage.selectDDFinancialNamePosConfig(finName);
    }

    @Then("on Merchant Configuration page user selects {string} from Merchant ID dropdown")
    public void on_Merchant_Configuration_page_user_selects_from_Merchant_ID_dropdown(String merchantID) {
        merchantConfigurationPage.selectDDMerchantIDPosConfig(merchantID);
    }

    @Then("on Merchant Configuration page user enters {string} into POS ID textfield")
    public void on_Merchant_Configuration_page_user_enters_into_POS_ID_textfield(String posID) {
        merchantConfigurationPage.enterTxtPosIDPosConfig(posID);
    }

    @Then("on Merchant Configuration page user clicks on Save button")
    public void on_Merchant_Configuration_page_user_clicks_on_Save_button() {
        merchantConfigurationPage.clickBtnSavePosConfig();
    }

    @Then("Merchant Configuration page displays an alert message {string}")
    public void merchantConfigurationPageDisplaysAnAlertMessage(String alertMsg) {
        Assert.assertEquals(merchantConfigurationPage.getAlertMessage(),alertMsg);
    }

    @And("on Merchant POS Configuration page tab user clicks on Edit button")
    public void onMerchantPOSConfigurationPageTabUserClicksOnEditButton() {
        merchantConfigurationPage.clickBtnSelectPosConfig();
    }

    @And("on Merchant POS Configuration page tab user clicks on Update button")
    public void onMerchantPOSConfigurationPageTabUserClicksOnUpdateButton() {
        merchantConfigurationPage.clickBtnUpdatePosConfig();
    }

    @Then("on Merchant POS Configuration page displays an alert message {string}")
    public void onMerchantPOSConfigurationPageDisplaysAnAlertMessage(String successMsg) {
        Assert.assertEquals(merchantConfigurationPage.getAlertMessage(),successMsg);
    }
}