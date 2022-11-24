package config;

import java.sql.*;


public class UnlockLockedUser {
    private String dbConnectionProperty = "";
    private String superUser = Config.superUser;
    private String makerUserName = Config.makerUserName;
    private String checkerUserName = Config.checkerUserName;
    private String directUserName = Config.directUserName;

    public static void unlockAllUsers() {
        Connection con = null;
        Statement st = null;
        String sql = "UPDATE RECON_USER_INFORMATION SET USER_LOGINSTATUS=0 " +
                "where USER_NAME IN('" + Config.superUser + "','" + Config.checkerUserName + "','" +
                Config.makerUserName + "','" + Config.directUserName + "') " +
                "and USER_LOGINSTATUS=1;";

        try {
            System.out.println("I am in unlock method and just in try block");
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@//192.168.20.41:1521:rec", "reccon", "reccon123");
            st = con.createStatement();
            System.out.println("I am here just before running a query");
            st.execute(sql);
            st.execute("COMMIT;");
            System.out.println("I am here after running unlock class");
        } catch (Exception e) {
            System.out.println("Exception info: " + e.getStackTrace());
            try {
                st.close();
                con.close();
            } catch (Exception ex) {
            }
        }
    }
}