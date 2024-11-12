package util;

import java.sql.*;

public class JdbcUtil {
    public static Connection getConnection( String url, String username, String password) throws SQLException {
       return DriverManager.getConnection(url, username, password);
    }

    public static void close(Connection conn,  PreparedStatement ps, ResultSet rs) throws SQLException {
        if (rs != null) rs.close();
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    }

    public static void close(Connection conn, PreparedStatement ps) throws SQLException {
        if (conn != null)conn.close();
        if (ps != null)ps.close();
    }
}
