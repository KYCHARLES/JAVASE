package dao.impl;

import config.JdbcConfig;
import dao.Register;
import util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterImpl implements Register {


    public boolean registerCustomer(String name, String username, String password)  {
        Connection conn = null;
        PreparedStatement ps = null;

        String sql = "insert into customer(customer_id, customer_name,customer_username,customer_password,customer_status,create_date,update_date) " +
                     "values(customer_seq.nextval,?,?,?,1,sysdate,sysdate)";
        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url, JdbcConfig.username, JdbcConfig.password);
            ps = conn.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, username);
            ps.setString(3, password);
            ps.executeUpdate();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }finally {
            try {
                JdbcUtil.close(conn, ps);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
