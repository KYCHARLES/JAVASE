package dao.impl;

import config.JdbcConfig;
import dao.AddressManage;
import util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddressManageImpl implements AddressManage {
    @Override
    public boolean addAddress(int customerId, String location, String recipient, String phoneNumber) {
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
}
