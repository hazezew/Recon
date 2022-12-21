package config;

public class Config {
    public static final String browser="chrome"; // chrome, firefox
    public static final String superUser="SADMIN";
    public static final String superPassword="admin@123";
    public static final String superFinancial="ENS";
    public static final String superAdminFirstName="SUPER";
    public static final String superAdminEmail="SUPER@ENS.com";

    public static final String makerUserName="MAKERUSER";
    public static final String makerUserPassword="makeruser@321";

    public static final String checkerUserName="CHECKERUSER";
    public static final String checkerUserPassword="checkeruser@321";

    public static final String directUserName="DIRECTUSER";
    public static final String directUserPassword="directuser@321";

    public static final String checkerMakerDirectFinancial="ENS";


    public static final String baseURL="https://192.168.20.40:8080/RECONTEST/"; // The URL of the system under test (local EthSwitch test server)
    public static final String superAdminDashboard="https://192.168.20.40:8080/RECONTEST/Recon.aspx";
    public static final String loggedoutPage="https://192.168.20.40:8080/RECONTEST/Default.aspx";

    public static final String invalidPasswordMessage="Invalid Password...!";
    public static final String emptyUsernameAlertMessage="Enter User Name...!";
    public static final String emptyPasswordAlertMessage="Enter Password...!";
    public static final String emptyFinancialInstituteNameMessage="Invalid Financial...!";

    public static final String addFinancialPageURL="https://192.168.20.40:8080/RECONTEST/Config_Financial.aspx?Mode=1";
    public static final String viewFinancialPageURL="https://192.168.20.40:8080/RECONTEST/Config_Financial.aspx?Mode=6";
    public static final String addProfilePageURL="https://192.168.20.40:8080/RECONTEST/AddProfile.aspx?Mode=1";
    public static final String viewProfilePageURL="https://192.168.20.40:8080/RECONTEST/AddProfile.aspx?Mode=6";
    public static final String editProfilePageURL="https://192.168.20.40:8080/RECONTEST/AddProfile.aspx?Mode=2";

    public static final String addUserPageURL="https://192.168.20.40:8080/RECONTEST/AddUser.aspx?Mode=1";
    public static final String viewUserPageURL="https://192.168.20.40:8080/RECONTEST/AddUser.aspx?Mode=6";
    public static final String editUserPageURL="https://192.168.20.40:8080/RECONTEST/AddUser.aspx?Mode=2";

    public static final String forgottenPageURL= "https://192.168.20.40:8080/RECONTEST/ForgetPwd.aspx?Mode=1";
    public static final String addUserAllMandatoryFieldValidationMessage= "1. Please Enter the First Name. 2. Please Enter the Last Name. 3.Please Enter the password. 4.Please Enter the Confirm Password. 5.Please Enter the Mail Id. 6.Please Enter the User Description.";

    public static final String tenantDashboardPageURL="https://192.168.20.40:8080/RECONTEST/Recon.aspx";
    public static final String transactionStatusPageURL="https://192.168.20.40:8080/RECONTEST/Task_ManualReconcile.aspx";
    public static final String rollbackPageURL="https://192.168.20.40:8080/RECONTEST/Rollback.aspx";

    public static final String userConfigurationPageURL= "https://192.168.20.40:8080/RECONTEST/GeneralConfig.aspx";
    public static final String fileNameConfigurationPageURL="https://192.168.20.40:8080/RECONTEST/FileName.aspx";
    public static final String fileStructureDetailConfigurationPageURL="https://192.168.20.40:8080/RECONTEST/Config_File.aspx";
    public static final String fileFieldMappingConfigurationPageURL="https://192.168.20.40:8080/RECONTEST/Config_FileFieldMap.aspx";

    public static final String tranIDConfigurationPageURL="https://192.168.20.40:8080/RECONTEST/Config_TranID.aspx";
    public static final String entityConfigurationPageURL="https://192.168.20.40:8080/RECONTEST/Config_Entity.aspx";
    public static final String reasonCodeConfigurationPageURL="https://192.168.20.40:8080/RECONTEST/Config_ReasonCode.aspx";
    public static final String currencyCodeConfigurationPageURL="https://192.168.20.40:8080/RECONTEST/Config_Currency.aspx";

    public static final String mappingEntitiesPageURL="https://192.168.20.40:8080/RECONTEST/Config_Entity_Map.aspx";
    public static final String keyFieldConfigurationPageURL="https://192.168.20.40:8080/RECONTEST/KeyFieldConfiguration.aspx";
    public static final String branchConfigurationPageURL="https://192.168.20.40:8080/RECONTEST/Config_Branch.aspx";
    public static final String binConfigurationPageURL="https://192.168.20.40:8080/RECONTEST/Config_Bin.aspx";
    public static final String terminalConfigurationPageURL="https://192.168.20.40:8080/RECONTEST/Config_Terminal.aspx";
    public static final String merchantConfigurationPageURL="https://192.168.20.40:8080/RECONTEST/Config_Merchant_Det_Info.aspx";

    public static final String fileRenamingDetailsPageURL="https://192.168.20.40:8080/RECONTEST/ATMEJRenaming.aspx";
    public static final String  extractionAndUploadPageURL="https://192.168.20.40:8080/RECONTEST/ExtractANDUpload.aspx";
    public static final String  automaticReconciliationPageURL="https://192.168.20.40:8080/RECONTEST/Task_Reconcile.aspx";








//    public static final String landingPage="http://182.74.3.251:8094/Ethswitch/Recon.aspx";
//
//
//
////    public static final String userConfigurationPageURL="http://182.74.3.251:8094/Ethswitch/GeneralConfig.aspx";
////    public static final String fileFieldMappingConfigurationPageURL="http://182.74.3.251:8094/Ethswitch/Config_FileFieldMap.aspx";
//    public static  final String fileRenamingProcessPageURL="http://182.74.3.251:8094/Ethswitch/ATMEJRenaming.aspx";
//
//    public static final String fileStructureAndDetailConfigurationPageURL="http://182.74.3.251:8094/Ethswitch/Config_File.aspx";
////    public static final  String fileNameConfigurationPageURL="http://182.74.3.251:8094/Ethswitch/FileName.aspx";
//
//    //page URLs for pages under configuration > General configuration sub menu
//    public static final  String currencyConfigurationPageURL="http://182.74.3.251:8094/Ethswitch/Config_Currency.aspx";
//    public static final  String reasonCodeConfigurationURL="http://182.74.3.251:8094/Ethswitch/Config_ReasonCode.aspx";
//    public static final  String tranIDConfigurationPageURL="http://182.74.3.251:8094/Ethswitch/Config_TranID.aspx";
//    public static final  String entityConfigurationPageURL="http://182.74.3.251:8094/Ethswitch/Config_Entity.aspx";
//
//    public static final  String mappingEntitiesPageURL="http://182.74.3.251:8094/Ethswitch/Config_Entity_Map.aspx";
//    public static final String keyFieldConfigurationPageURL="http://182.74.3.251:8094/Ethswitch/KeyFieldConfiguration.aspx";
//    public static final String branchConfigurationPageURL="http://182.74.3.251:8094/Ethswitch/Config_Branch.aspx";
//    public static final String binConfigurationPageURL="http://182.74.3.251:8094/Ethswitch/Config_Bin.aspx";
//    public static final String terminalConfigurationPageURL="http://182.74.3.251:8094/Ethswitch/Config_Terminal.aspx";
//    public static final String merchantConfigurationPageURL="http://182.74.3.251:8094/Ethswitch/Config_Merchant_Det_Info.aspx";
//    public static final String sFTPConfigurationPageURL="http://182.74.3.251:8094/Ethswitch/Config_SFTP.aspx";
//    public static final String extractionAndUploadPageURL="http://182.74.3.251:8094/Ethswitch/ExtractANDUpload.aspx";
//    public static final String automaticReconciliationPageURL="http://182.74.3.251:8094/Ethswitch/Task_Reconcile.aspx";
////    public static final String transactionStatusPageURL="http://182.74.3.251:8094/Ethswitch/Task_ManualReconcile.aspx";
////    public static final String rollbackPageURL="http://182.74.3.251:8094/Ethswitch/Rollback.aspx";
//    public static final String eTHSWITCHFileGenerationPageURL="http://182.74.3.251:8094/Ethswitch/ETHSWITCHFileGenration.aspx";
//    public static final String userManagementReportsPageURL="http://182.74.3.251:8094/Ethswitch/ReportFields.aspx?id=49";
//    public static final String extractionReportPageURL="http://182.74.3.251:8094/Ethswitch/ReportFields.aspx?id=50";
//    public static final String uploadFileReportPageURL="http://182.74.3.251:8094/Ethswitch/ReportFields.aspx?id=51";
//    public static final String exceptionReportsPageURL="http://182.74.3.251:8094/Ethswitch/ReportFields.aspx?id=262";
//    public static final String duplicateReportsPageURL="http://182.74.3.251:8094/Ethswitch/ReportFields.aspx?id=263";
//    public static final String reconciledReportsThreeWayPageURL="http://182.74.3.251:8094/Ethswitch/ReportFields.aspx?id=114";
//    public static final String reconciledReportsTwoWayPageURL="http://182.74.3.251:8094/Ethswitch/ReportFields.aspx?id=115";
//    public static final String reconciledReportsFourWayPageURL="http://182.74.3.251:8094/Ethswitch/ReportFields.aspx?id=119";
//    public static final String threeWayUnReconReportPageURL="http://182.74.3.251:8094/Ethswitch/ReportFields.aspx?id=117";
//    public static final String twoWayUnReconReportPageURL="http://182.74.3.251:8094/Ethswitch/ReportFields.aspx?id=118";
//    public static final String fourWayUnReconReportPageURL="http://182.74.3.251:8094/Ethswitch/ReportFields.aspx?id=121";
////    public static final String addProfilePageURL="http://182.74.3.251:8094/Ethswitch/AddProfile.aspx?Mode=1";
////    public static final String viewProfilePageURL="http://182.74.3.251:8094/Ethswitch/AddProfile.aspx?Mode=6";
////    public static final String editProfilePageURL="http://182.74.3.251:8094/Ethswitch/AddProfile.aspx?Mode=2";
////    public static final String deleteProfilePageURL="http://182.74.3.251:8094/Ethswitch/AddProfile.aspx?Mode=3";
//
////    public static final String addUserPageURL="http://182.74.3.251:8094/Ethswitch/AddUser.aspx?Mode=1";
////    public static final String viewUserPageURL="http://182.74.3.251:8094/Ethswitch/AddUser.aspx?Mode=6";
////    public static final String editUserPageURL="http://182.74.3.251:8094/Ethswitch/AddUser.aspx?Mode=2";
//    public static final String deleteUserPageURL="http://182.74.3.251:8094/Ethswitch/AddUser.aspx?Mode=3";
}