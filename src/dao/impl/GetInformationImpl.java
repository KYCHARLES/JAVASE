package dao.impl;

import config.JdbcConfig;
import dao.GetInformation;
import pojo.Merchant;
import util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GetInformationImpl implements GetInformation {
    @Override
    public List<Merchant> getAllMerchant() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "select * from merchant";

        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url, JdbcConfig.username, JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            List<Merchant> merchantList = new ArrayList<>();
            while (rs.next()) {
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
            return merchantList;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                JdbcUtil.close(conn, ps, rs);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Override
    public List<Merchant> getMerchantUnaudited() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "select * from merchant where merchant_status=1";

        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url, JdbcConfig.username, JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            List<Merchant> merchantList = new ArrayList<>();
            while (rs.next()) {
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
            return merchantList;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                JdbcUtil.close(conn, ps, rs);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
