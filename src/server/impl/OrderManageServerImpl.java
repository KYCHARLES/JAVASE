package server.impl;

import dao.impl.OrderManageImpl;
import server.OrderManageServer;

public class OrderManageServerImpl implements OrderManageServer {
    OrderManageImpl orderManage = new OrderManageImpl();
    @Override
    public void addOrder(int customerId, int merchantId, String dishDescription, String address, double customerPaid) {

        boolean result = orderManage.addOrder(customerId, merchantId, dishDescription, address, customerPaid);
        if (result) {
            System.out.println("等待商家接单中...");
        }else
            System.out.println("系统错误,请重试");
    }

    @Override
    public void merchantUpdateOrderStatus(int orderId, int status) {
        boolean result = orderManage.merchantUpdateOrderStatus(orderId, status);
        if (result) {
            if (status == 2) {
                System.out.println("成功接单!");
            }
            if (status == 3) {
                System.out.println("已经出餐,正在召唤骑手!");
            }
        }else
            System.out.println("系统错误,请重试");
    }

    @Override
    public synchronized boolean deliverySnatchOrder(int orderId) {
        boolean result = orderManage.deliverySnatchOrder(orderId);
        if (result) {
            System.out.println("抢单成功!");
        }else
            System.out.println("抢单失败,订单状态可能发生改变!");
        return result;
    }


}
