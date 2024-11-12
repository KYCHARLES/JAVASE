package config;

public class JdbcConfig {
    public static String url = "jdbc:oracle:thin:@localhost:1522:xe";
    public static String username = "JAVASE";
    public static String password = "123456";
    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
