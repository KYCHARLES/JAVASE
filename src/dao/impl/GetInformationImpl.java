package dao.impl;

import config.JdbcConfig;
import dao.GetInformation;
import pojo.*;
import util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static oracle.net.aso.C00.p;
import static oracle.net.aso.C00.r;

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

    @Override
    public List<MerchantView> getAllMerchantView(String merchantName) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from merchant_view where merchant_status > 1 and merchant_name like ?";

        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url, JdbcConfig.username, JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + merchantName + "%");
            rs = ps.executeQuery();
            List<MerchantView> merchantViewList = new ArrayList<>();
            while (rs.next()) {
                merchantViewList.add(new MerchantView(rs.getInt("merchant_id"),
                                                        rs.getString("merchant_name"),
                                                        rs.getInt("merchant_status")));
            }
            return merchantViewList;
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
    public List<Dish> getDishUnaudited() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "select * from dish where dish_status = 1";

        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url, JdbcConfig.username, JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            List<Dish> dishList = new ArrayList<>();
            while (rs.next()){
                dishList.add(new Dish(rs.getInt("dish_id"),
                                        rs.getInt("merchant_id"),
                                        rs.getString("dish_name"),
                                        rs.getString("dish_description"),
                                        rs.getInt("dish_price"),
                                        rs.getInt("dish_type"),
                                        rs.getInt("dish_status"),
                                        rs.getDate("create_date").toLocalDate(),
                                        rs.getDate("update_date").toLocalDate()));
            }
            return dishList;
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
    public List<DishView> getAllDishView(String dishName) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from dish_view where dish_name like ?";

        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url, JdbcConfig.username, JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + dishName + "%");
            rs = ps.executeQuery();
            List<DishView> dishViewList = new ArrayList<>();
            while (rs.next()) {
                dishViewList.add(new DishView(rs.getInt("dish_id"),
                                                rs.getInt("merchant_id"),
                                                rs.getString("dish_name"),
                                                rs.getString("dish_description"),
                                                rs.getInt("dish_price"),
                                                rs.getString("merchant_name"),
                                                rs.getInt("merchant_status")));
            }
            return dishViewList;
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
    public List<DishView> getDishViewByMerchantId(int merchantId) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from dish_view where merchant_id = ?";

        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url, JdbcConfig.username, JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            ps.setInt(1, merchantId);
            rs = ps.executeQuery();
            List<DishView> dishViewList = new ArrayList<>();
            while (rs.next()) {
                dishViewList.add(new DishView(rs.getInt("dish_id"),
                        rs.getInt("merchant_id"),
                        rs.getString("dish_name"),
                        rs.getString("dish_description"),
                        rs.getInt("dish_price"),
                        rs.getString("merchant_name"),
                        rs.getInt("merchant_status")));
            }
            return dishViewList;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Address> getAddressByCustomerId(int CustomerId) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from address where customer_id = ?";

        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url, JdbcConfig.username, JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            ps.setInt(1, CustomerId);
            rs = ps.executeQuery();
            List<Address> addressList = new ArrayList<>();
            while (rs.next()) {
                addressList.add(new Address(rs.getInt("address_id"),
                                            rs.getInt("customer_id"),
                                            rs.getString("address_location"),
                                            rs.getString("address_recipient"),
                                            rs.getString("address_phoneNumber"),
                                            rs.getInt("address_status"),
                                            rs.getDate("create_date").toLocalDate(),
                                            rs.getDate("update_date").toLocalDate()));
            }
            return addressList;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Dish> getAllDishByMerchantId(int merchantId) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from dish where merchant_id = ? and dish_status = 2";
        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url, JdbcConfig.username, JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            ps.setInt(1, merchantId);
            rs = ps.executeQuery();

            List<Dish> dishList = new ArrayList<>();
            while (rs.next()){
                dishList.add(new Dish(rs.getInt("dish_id"),
                        rs.getInt("merchant_id"),
                        rs.getString("dish_name"),
                        rs.getString("dish_description"),
                        rs.getInt("dish_price"),
                        rs.getInt("dish_type"),
                        rs.getInt("dish_status"),
                        rs.getDate("create_date").toLocalDate(),
                        rs.getDate("update_date").toLocalDate()));
            }
            return dishList;
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
    public List<Orders> getAllOrdersByMerchantId(int merchantId) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from orders where merchant_id = ? order by update_date desc";

        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url, JdbcConfig.username, JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            ps.setInt(1, merchantId);
            rs = ps.executeQuery();
            List<Orders> ordersList = new ArrayList<>();
            while (rs.next()) {
                ordersList.add(new Orders(rs.getInt("orders_id"),
                                          rs.getInt("customer_id"),
                                          rs.getInt("delivery_id"),
                                          rs.getInt("merchant_id"),
                                          rs.getString("dish_description"),
                                          rs.getString("address_information"),
                                          rs.getInt("orders_status"),
                                          rs.getInt("orders_costomerPaid"),
                                          rs.getInt("orders_deliveryFee"),
                                          rs.getDate("create_date").toLocalDate(),
                                          rs.getDate("update_date").toLocalDate()));
            }
            return ordersList;
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
    public List<Delivery> getDeliveryUnaudited() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from delivery where delivery_status = 1";

        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url, JdbcConfig.username, JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            List<Delivery> deliveryList = new ArrayList<>();
            while (rs.next()) {
                deliveryList.add(new Delivery(rs.getInt("delivery_id"),
                                              rs.getString("delivery_name"),
                                              rs.getString("delivery_username"),
                                              rs.getString("delivery_password"),
                                              rs.getInt("delivery_status"),
                                              rs.getInt("delivery_unfinishedorder"),
                                              rs.getInt("delivery_completedorder"),
                                              rs.getInt("delivery_cancelledorder"),
                                              rs.getInt("delivery_score"),
                                              rs.getDate("create_date").toLocalDate(),
                                              rs.getDate("update_date").toLocalDate()));
            }
            return deliveryList;
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
    public List<Delivery> getAllDelivery() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from delivery";

        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url, JdbcConfig.username, JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            List<Delivery> deliveryList = new ArrayList<>();
            while (rs.next()) {
                deliveryList.add(new Delivery(rs.getInt("delivery_id"),
                        rs.getString("delivery_name"),
                        rs.getString("delivery_username"),
                        rs.getString("delivery_password"),
                        rs.getInt("delivery_status"),
                        rs.getInt("delivery_unfinishedorder"),
                        rs.getInt("delivery_completedorder"),
                        rs.getInt("delivery_cancelledorder"),
                        rs.getInt("delivery_score"),
                        rs.getDate("create_date").toLocalDate(),
                        rs.getDate("update_date").toLocalDate()));
            }
            return deliveryList;
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
    public List<Orders> getNewOrdersByMerchantId(int merchantId) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "select * from orders where merchant_id = ? and orders_status < 5 and orders_status > 0 order by update_date desc";

        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url, JdbcConfig.username, JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            ps.setInt(1, merchantId);
            rs = ps.executeQuery();
            List<Orders> ordersList = new ArrayList<>();
            while (rs.next()) {
                ordersList.add(new Orders(rs.getInt("orders_id"),
                        rs.getInt("customer_id"),
                        rs.getInt("delivery_id"),
                        rs.getInt("merchant_id"),
                        rs.getString("dish_description"),
                        rs.getString("address_information"),
                        rs.getInt("orders_status"),
                        rs.getInt("orders_costomerPaid"),
                        rs.getInt("orders_deliveryFee"),
                        rs.getDate("create_date").toLocalDate(),
                        rs.getDate("update_date").toLocalDate()));
            }
            return ordersList;
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
    public List<Orders> getAllOrderByDeliveryId(int deliveryId) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "select * from orders where delivery_id = ? and ORDERS_STATUS = 5";

        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url, JdbcConfig.username,JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            ps.setInt(1, deliveryId);
            rs = ps.executeQuery();
            List<Orders> ordersList = new ArrayList<>();
            while (rs.next()) {
                ordersList.add(new Orders(rs.getInt("orders_id"),
                        rs.getInt("customer_id"),
                        rs.getInt("delivery_id"),
                        rs.getInt("merchant_id"),
                        rs.getString("dish_description"),
                        rs.getString("address_information"),
                        rs.getInt("orders_status"),
                        rs.getInt("orders_costomerPaid"),
                        rs.getInt("orders_deliveryFee"),
                        rs.getDate("create_date").toLocalDate(),
                        rs.getDate("update_date").toLocalDate()));
            }
            return ordersList;
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
    public List<Orders> getOrderWaitingDeliveryAccept() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "select * from orders where orders_status = 3";

        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url,JdbcConfig.username,JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            List<Orders> ordersList = new ArrayList<>();
            while (rs.next()) {
                ordersList.add(new Orders(rs.getInt("orders_id"),
                        rs.getInt("customer_id"),
                        rs.getInt("delivery_id"),
                        rs.getInt("merchant_id"),
                        rs.getString("dish_description"),
                        rs.getString("address_information"),
                        rs.getInt("orders_status"),
                        rs.getInt("orders_costomerPaid"),
                        rs.getInt("orders_deliveryFee"),
                        rs.getDate("create_date").toLocalDate(),
                        rs.getDate("update_date").toLocalDate()));
            }
            return ordersList;
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
    public List<OrdersView> getAllOrdersViewByCustomerId(int customerId) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "select * from orders_view where customer_id = ? order by UPDATE_DATE desc ";

        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url, JdbcConfig.username, JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            ps.setInt(1, customerId);
            rs = ps.executeQuery();
            List<OrdersView> ordersViewsList = new ArrayList<>();

            while (rs.next()) {
                ordersViewsList.add(new OrdersView( rs.getInt("orders_id"),
                                                    rs.getInt("customer_id"),
                                                    rs.getInt("delivery_id"),
                                                    rs.getString("delivery_name"),
                                                    rs.getString("delivery_username"),
                                                    rs.getInt("merchant_id"),
                                                    rs.getString("merchant_name"),
                                                    rs.getString("merchant_username"),
                                                    rs.getString("dish_description"),
                                                    rs.getString("address_information"),
                                                    rs.getInt("orders_costomerpaid"),
                                                    rs.getInt("orders_deliveryfee"),
                                                    rs.getInt("orders_status"),
                                                    rs.getDate("update_date").toLocalDate()));
            }
            return ordersViewsList;
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
    public List<MerchantView> getMerchantViewById(int merchantId) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from merchant where merchant_id = ?";

        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url, JdbcConfig.username, JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            ps.setInt(1, merchantId);
            rs = ps.executeQuery();
            List<MerchantView> merchantViewList = new ArrayList<>();
            while (rs.next()) {
                merchantViewList.add(new MerchantView(rs.getInt("merchant_id"),
                        rs.getString("merchant_name"),
                        rs.getInt("merchant_status")));
            }
            return merchantViewList;
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
    public List<OrdersView> getNewOrdersViewByDeliveryId(int DeliveryId) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "select * from orders_view where delivery_id = ? and orders_status = 4 order by UPDATE_DATE desc ";

        try {
            conn = JdbcUtil.getConnection(JdbcConfig.url,JdbcConfig.username,JdbcConfig.password);
            ps = conn.prepareStatement(sql);
            ps.setInt(1, DeliveryId);
            rs = ps.executeQuery();
            List<OrdersView> ordersViewList = new ArrayList<>();
            while (rs.next()) {
                ordersViewList.add(new OrdersView( rs.getInt("orders_id"),
                        rs.getInt("customer_id"),
                        rs.getInt("delivery_id"),
                        rs.getString("delivery_name"),
                        rs.getString("delivery_username"),
                        rs.getInt("merchant_id"),
                        rs.getString("merchant_name"),
                        rs.getString("merchant_username"),
                        rs.getString("dish_description"),
                        rs.getString("address_information"),
                        rs.getInt("orders_costomerpaid"),
                        rs.getInt("orders_deliveryfee"),
                        rs.getInt("orders_status"),
                        rs.getDate("update_date").toLocalDate()));
            }
            return ordersViewList;
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
