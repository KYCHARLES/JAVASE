package controller.impl;

import controller.OrderManageController;
import pojo.*;
import server.impl.OrderManageServerImpl;

import java.util.List;
import java.util.Map;

public class OrderManageControllerImpl implements OrderManageController {
    @Override
    public void addOrder(Customer customer, MerchantView merchantView, Address address, List<Map.Entry<DishView, Integer>> order) {
        OrderManageServerImpl orderManageServer = new OrderManageServerImpl();
        int customerId = customer.getId();
        int merchantId = merchantView.getId();
        String dishDescription = "";
        int totalPrice = 0;
        for (Map.Entry<DishView, Integer> entry : order) {
            dishDescription = dishDescription + entry.getKey().getDishName() + "*" + entry.getValue() + "\n";
            totalPrice = totalPrice + entry.getKey().getDishPrice() * entry.getValue();
        }
        orderManageServer.addOrder(customerId, merchantId, dishDescription, address.toString(), totalPrice);
    }
}
