package dao.impl;

import config.JdbcConfig;
import dao.Login;
import pojo.Customer;
import pojo.Manager;
import pojo.Merchant;
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

    @Override
    public int loginMerchant(String username, String password) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "select * from merchant where merchant_username=? and merchant_password=?";
        List<Merchant> merchantList = new ArrayList<>();

        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url, JdbcConfig.username, JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) {
                merchantList.add(new Merchant(rs.getInt("merchant_id"),
                        rs.getString("merchant_name"),
                        rs.getString("merchant_username"),
                        rs.getString("merchant_password"),
                        rs.getInt("merchant_status"),
                        rs.getInt("merchant_unfinishedorder"),
                        rs.getInt("merchant_completedorder"),
                        rs.getInt("merchant_cancelledorder"),
                        rs.getInt("merchant_score"),
                        rs.getDate("create_date").toLocalDate(),
                        rs.getDate("update_date").toLocalDate()));
            }

            if (merchantList.isEmpty()) {
                return -1;
            }else if (merchantList.getFirst().getStatus() == 0) {
                return 0;
            }else if (merchantList.getFirst().getStatus() == 1) {
                return 1;
            }else
                return 2;
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

    @Override
    public boolean loginManager(String username, String password) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "select * from manager where manager_username=? and manager_password=?";

        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url, JdbcConfig.username, JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();

            List<Manager> managerList = new ArrayList<>();
            if (rs.next()) {
                managerList.add(new Manager(rs.getInt("manager_id"),
                                            rs.getString("manager_name"),
                                            rs.getString("manager_username"),
                                            rs.getString("manager_password"),
                                            rs.getInt("manager_status"),
                                            rs.getDate("create_date").toLocalDate(),
                                            rs.getDate("update_date").toLocalDate()));
            }
            return !managerList.isEmpty();
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
