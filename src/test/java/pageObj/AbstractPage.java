package pageObj;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
    public static WebDriver driver;
    public static boolean folderCreated=false;
    public static boolean userLoginStatus=false;
    public static LoginPage loginPage;
    public static SuperAdminDashboard superAdminDashboard;
    public static TenantDashboardPage tenantDashboardPage;
    public static void setDriver(WebDriver driverObj){
        driver=driverObj;
    }
    //    This method is used to unlock already logged-in/locked-in user
    public static void unlockUserFromDB(){
//        write code to unload user from the database
        try{

        }catch (Exception e){

        }
    }
}