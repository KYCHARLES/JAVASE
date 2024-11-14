package dao.impl;

import config.JdbcConfig;
import dao.DishManage;
import util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DishManageImpl implements DishManage {
    @Override
    public boolean launchNewDishes(int merchantId,String dishName, String dishDescription, int dishPrice, int dishType) {
        Connection conn = null;
        PreparedStatement ps = null;

        String sql = "insert into dish(dish_id, merchant_id, dish_name,dish_description,dish_price, dish_type,dish_status,create_date,update_date) values(dish_seq.nextval,?,?,?,?,?,1,sysdate,sysdate)" ;

        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url, JdbcConfig.username, JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            ps.setInt(1, merchantId);
            ps.setString(2, dishName);
            ps.setString(3, dishDescription);
            ps.setInt(4, dishPrice);
            ps.setInt(5, dishType);

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
    public boolean removeDishByDishId(int dishId) {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "update dish set dish_status=0 where dish_id=?";

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
