package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class UnlockLockedUser {
    private static String dbConnectionString= "jdbc:oracle:thin:@192.168.20.41:1521:rec";
    private static String dbUsername="RECCON";
    private static String dbPassword="reccon123";

    public static void unlockAllUsers() {
        Connection con = null;
        Statement st = null;
        PreparedStatement ps;
        String sql ="UPDATE RECON_USER_INFORMATION SET USER_LOGINSTATUS=0 " +
                "where USER_NAME IN('" + Config.superUser + "','" + Config.checkerUserName + "','" +
                Config.makerUserName + "','" + Config.directUserName + "') " +
                "and USER_LOGINSTATUS<>0";
        try {
            DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
            con = DriverManager.getConnection(dbConnectionString, dbUsername,dbPassword);
            con.setAutoCommit(true);
            st = con.createStatement();
            ps=con.prepareStatement(sql);
            ps.executeUpdate(sql);
            System.out.println("Unlock user completed successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Exception: " + e.getStackTrace());
            try {
                st.close();
                con.close();
            } catch (Exception ex) {
            }
        }
    }
}