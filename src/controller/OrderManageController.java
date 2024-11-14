package controller;

import pojo.*;

import java.util.List;
import java.util.Map;

public interface OrderManageController {
    public void addOrder(Customer customer, MerchantView merchantView, Address address, List<Map.Entry<DishView, Integer>> order);
}