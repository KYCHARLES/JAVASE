package dao.impl;

import config.JdbcConfig;
import dao.AddressManage;
import util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddressManageImpl implements AddressManage {
    @Override
    public boolean addAddress(int customerId,String recipient, String phoneNumber, String location) {
        Connection conn = null;
        PreparedStatement ps = null;

        String sql = "insert into address(address_id, customer_id,address_location,address_recipient,address_phonenumber,address_status,create_date,update_date)"+
                " values(address_seq.nextval,?,?,?,?,1,sysdate,sysdate)";

        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url, JdbcConfig.username, JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            ps.setInt(1, customerId);
            ps.setString(2, location);
            ps.setString(3, recipient);
            ps.setString(4, phoneNumber);

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
    public boolean updateAddress(int addressId, String recipient, String phoneNumber, String location) {
        Connection conn = null;
        PreparedStatement ps = null;

        String sql = "update address set address_recipient = ?, address_phoneNumber = ?, address_location = ? where address_id = ?";

        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url, JdbcConfig.username, JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            ps.setString(1, recipient);
            ps.setString(2, phoneNumber);
            ps.setString(3, location);
            ps.setInt(4, addressId);
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
    public boolean deleteAddress(int addressId) {
        Connection conn = null;
        PreparedStatement ps = null;

        String sql = "update address set  address_status = ? where address_id = ?";

        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url, JdbcConfig.username, JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            ps.setInt(1, 0);
            ps.setInt(2, addressId);

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
