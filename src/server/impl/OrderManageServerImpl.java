package server.impl;

import dao.impl.OrderManageImpl;
import server.OrderManageServer;

public class OrderManageServerImpl implements OrderManageServer {

    @Override
    public void addOrder(int customerId, int merchantId, String dishDescription, String address, double customerPaid) {
        OrderManageImpl orderManage = new OrderManageImpl();
        boolean result = orderManage.addOrder(customerId, merchantId, dishDescription, address, customerPaid);
        if (result) {
            System.out.println("等待商家接单中...");
        }else
            System.out.println("系统错误,请重试");
    }
}
