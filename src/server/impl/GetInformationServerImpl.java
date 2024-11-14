package server.impl;

import dao.GetInformation;
import dao.impl.GetInformationImpl;
import pojo.*;
import server.GetInformationServer;

import java.util.List;

public class GetInformationServerImpl implements GetInformationServer {
    GetInformation getInformation = new GetInformationImpl();
    @Override
    public void getAllMerchant() {


        List<Merchant> merchantList = getInformation.getAllMerchant();
        if (merchantList != null) {
            for (Merchant merchant : merchantList) {
                System.out.println(merchant);
            }
        }else
            System.out.println("没有相关信息!");
    }

    @Override
    public List<Merchant> getMerchantUnaudited() {
        List<Merchant> merchantList = getInformation.getMerchantUnaudited();
        if (merchantList != null) {
            for (int i = 0; i < merchantList.size(); i++) {
                System.out.println(i + " " + merchantList.get(i));
            }
        }else
            System.out.println("没有相关信息!");
        return merchantList;
    }

    @Override
    public List<MerchantView> getAllMerchantView(String merchantName) {

        List<MerchantView> merchantViewList = getInformation.getAllMerchantView(merchantName);
        if (merchantViewList != null) {
            for (int i = 0; i < merchantViewList.size(); i++) {
                System.out.println(i + " " + merchantViewList.get(i));
            }
        }else
            System.out.println("搜索异常,请重新尝试!");
        return merchantViewList;
    }

    @Override
    public List<Dish> getDishUnaudited() {
        GetInformationImpl getInformation = new GetInformationImpl();
        List<Dish> dishList = getInformation.getDishUnaudited();
        if (dishList != null) {
            for (int i = 0; i < dishList.size(); i++) {
                System.out.println(i + " " + dishList.get(i));
            }
        }else
            System.out.println("没有相关信息!");
        return dishList;
    }

    @Override
    public List<DishView> getAllDishView(String dishName) {
        List<DishView> dishViewList = getInformation.getAllDishView(dishName);
        if (dishViewList != null) {
            for (int i = 0; i < dishViewList.size(); i++) {
                System.out.println(i + " " + dishViewList.get(i));
            }
        }else
            System.out.println("搜索异常,请重新尝试!");
        return dishViewList;
    }

    @Override
    public List<DishView> getDishViewByMerchantId(int merchantId) {
        List<DishView> dishViewList = getInformation.getDishViewByMerchantId(merchantId);
        if (dishViewList != null) {
            for (int i = 0; i < dishViewList.size(); i++) {
                System.out.println(i + " " + dishViewList.get(i));
            }
        }else
            System.out.println("搜索异常,请重新尝试!");
        return dishViewList;
    }

    @Override
    public List<Address> getAddressByCustomerId(int CustomerId) {
        List<Address> addressList = getInformation.getAddressByCustomerId(CustomerId);
        if (addressList != null) {
            for (int i = 0; i < addressList.size(); i++) {
                if (addressList.get(i).getStatus() == 1) System.out.println(i + " " + addressList.get(i));
            }
        }else
            System.out.println("没有查询结果!");
        return addressList;
    }

    @Override
    public List<Dish> getAllDishByMerchantId(int merchantId) {
        List<Dish> dishList = getInformation.getAllDishByMerchantId(merchantId);
        if (dishList != null) {
            for (int i = 0; i < dishList.size(); i++) {
                System.out.println(i + " " + dishList.get(i).getName() + " " + dishList.get(i).getDescription() + " " + dishList.get(i).getPrice());
            }
        }else
            System.out.println("展示没有菜品!");
        return dishList;
    }
}
