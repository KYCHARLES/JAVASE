package dao.impl;

import config.JdbcConfig;
import dao.AuditInformation;
import util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AuditInformationImpl implements AuditInformation {
    @Override
    public boolean AuditMerchant(int merchantId) {
        Connection conn = null;
        PreparedStatement ps = null;

        String sql = "update merchant set merchant_status=3, update_date = sysdate where merchant_id=?";

        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url, JdbcConfig.username, JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            ps.setInt(1, merchantId);
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
    public boolean AuditDish(int dishId) {
        Connection conn = null;
        PreparedStatement ps = null;

        String sql = "update dish set dish_status = 2, update_date = sysdate where dish_id=?";

        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url, JdbcConfig.username, JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            ps.setInt(1, dishId);
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
