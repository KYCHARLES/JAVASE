package controller;

import pojo.*;

import java.util.List;

public interface GetInformationController {
    public void getAllMerchant();
    public List<Merchant> getMerchantUnaudited();

    public List<MerchantView> getAllMerchantView(String merchantName);

    public List<Dish> getDishUnaudited();
    public List<DishView> getAllDishView(String dishName);
    public List<DishView> getDishViewByMerchantId(int merchantId);

    public List<Address> getAddressByCustomerId(int customerId);

    public List<Dish> getDishByMerchantId(int merchantId);

    public List<Orders> getAllOrdersByMerchantId(int merchantId);

    public List<Delivery> getDeliveryUnaudited();

    public void getAllDelivery();
}
