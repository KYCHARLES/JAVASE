package dao.impl;

import config.JdbcConfig;
import dao.Login;
import pojo.Customer;
import util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoginImpl implements Login {
    @Override
    public boolean loginCustomer(String username, String password) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "select * from customer where customer_username=? and customer_password=?";

        List<Customer> customerList = new ArrayList<>();
        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url, JdbcConfig.username, JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) {
                customerList.add(new Customer(rs.getInt("customer_id"),
                                                rs.getString("customer_name"),
                                                rs.getString("customer_username"),
                                                rs.getString("customer_password"),
                                                rs.getInt("customer_status"),
                                                rs.getDate("create_date").toLocalDate(),
                                                rs.getDate("update_date").toLocalDate()));
            }
            return !customerList.isEmpty();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                JdbcUtil.close(conn, ps, rs);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
