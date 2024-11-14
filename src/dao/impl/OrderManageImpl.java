package dao.impl;

import config.JdbcConfig;
import dao.OrderManage;
import util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderManageImpl implements OrderManage {
    @Override
    public boolean addOrder(int customerId, int merchantId, String dishDescription, String address, double customerPaid) {
        Connection conn = null;
        PreparedStatement ps = null;
        double deliveryFee = customerPaid * 0.08;

        String sql = "insert into orders(orders_id, customer_id,delivery_id,merchant_id,dish_description,address_information,orders_status,orders_costomerpaid,orders_deliveryfee,create_date,update_date)" +
                " values(orders_seq.nextval,?,0,?,?,?,1,?,?,sysdate,sysdate)";

        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url, JdbcConfig.username, JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            ps.setInt(1, customerId);
            ps.setInt(2, merchantId);
            ps.setString(3, dishDescription);
            ps.setString(4, address);
            ps.setDouble(5, customerPaid);
            ps.setDouble(6, deliveryFee);
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

    @Override
    public boolean merchantUpdateOrderStatus(int OrderId, int OrderStatus) {
        Connection conn = null;
        PreparedStatement ps = null;

        String sql = "update orders set orders_status=?, update_date = sysdate where orders_id=?";

        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url, JdbcConfig.username, JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            ps.setInt(1, OrderStatus);
            ps.setInt(2, OrderId);
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
