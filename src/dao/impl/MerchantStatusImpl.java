package dao.impl;

import config.JdbcConfig;
import dao.MerchantStatus;
import util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MerchantStatusImpl implements MerchantStatus {
    @Override
    public void merchantBusiness(int MerchantId) {
        Connection conn = null;
        PreparedStatement ps = null;

        String sql = "update merchant set merchant_status = ? where merchant_id = ?";

        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url, JdbcConfig.username, JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            ps.setInt(1, 2);
            ps.setInt(2, MerchantId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                JdbcUtil.close(conn, ps);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void merchantRest(int MerchantId) {
        Connection conn = null;
        PreparedStatement ps = null;

        String sql = "update merchant set merchant_status = ? where merchant_id = ?";

        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url, JdbcConfig.username, JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            ps.setInt(1, 3);
            ps.setInt(2, MerchantId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                JdbcUtil.close(conn, ps);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
