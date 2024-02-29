package stepDef;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pageObj.AbstractPage;
import pageObj.DailyInteroperableDisputeTransactionsReportPage;
import pageObj.LoginPage;

public class ReportsSetDef extends AbstractPage {
    private WebDriver driver;
    private LoginPage loginPage;
    private  DailyInteroperableDisputeTransactionsReportPage dailyInteroperableDisputeTransactionsReportPage;

    public ReportsSetDef(){
        this.driver=super.driver;
        this.loginPage=super.loginPage;
    }

    @And("user opens Daily Interoperable Dispute Transactions report")
    public void userOpensDailyInteroperableDisputeTransactionsReport() {
        dailyInteroperableDisputeTransactionsReportPage = superAdminDashboard.clickLinkReports();
        dailyInteroperableDisputeTransactionsReportPage.getReport();
    }
}
