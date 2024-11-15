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

    public void getAllOrdersByMerchantId(int merchantId);

    public List<Delivery> getDeliveryUnaudited();

    public void getAllDelivery();

    public List<Orders> getNewOrdersByMerchantId(int merchantId);

    public void getAllOrderByDeliveryId(int deliveryId);

    public List<Orders> getOrderWaitingDeliveryAccept();

    public void getAllOrdersViewByCustomerId(int customerId);
}
