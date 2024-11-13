package controller;

import pojo.Dish;
import pojo.Merchant;
import pojo.MerchantView;

import java.util.List;

public interface GetInformationController {
    public void getAllMerchant();
    public List<Merchant> getMerchantUnaudited();

    public List<MerchantView> getAllMerchantView(String merchantName);

    public List<Dish> getDishUnaudited();
}
