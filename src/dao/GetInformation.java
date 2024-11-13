package dao;

import pojo.Dish;
import pojo.DishView;
import pojo.Merchant;
import pojo.MerchantView;

import java.util.List;

public interface GetInformation {

    public List<Merchant> getAllMerchant();
    public List<Merchant> getMerchantUnaudited();
    public List<MerchantView> getAllMerchantView(String merchantName);
    public List<Dish> getDishUnaudited();
    public List<DishView> getAllDishView(String dishName);
}
