package dao;

import pojo.*;

import java.util.List;

public interface GetInformation {

    public List<Merchant> getAllMerchant();
    public List<Merchant> getMerchantUnaudited();
    public List<MerchantView> getAllMerchantView(String merchantName);
    public List<Dish> getDishUnaudited();
    public List<DishView> getAllDishView(String dishName);
    public List<DishView> getDishViewByMerchantId(int merchantId);
    public List<Address> getAddressByCustomerId(int CustomerId);

    public List<Dish> getAllDishByMerchantId(int merchantId);

    public List<Orders> getAllOrdersByMerchantId(int merchantId);
}
