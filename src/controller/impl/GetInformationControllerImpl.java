package controller.impl;

import controller.GetInformationController;
import pojo.*;
import server.GetInformationServer;
import server.impl.GetInformationServerImpl;

import java.util.List;

public class GetInformationControllerImpl implements GetInformationController {
    GetInformationServer getInformationServer = new GetInformationServerImpl();
    @Override
    public void getAllMerchant() {
        System.out.println("\"--------------------所有的商家信息--------------------\"");
        getInformationServer.getAllMerchant();
    }

    @Override
    public List<Merchant> getMerchantUnaudited() {
        System.out.println("\"--------------------所有未审核的商家信息--------------------\"");
        return getInformationServer.getMerchantUnaudited();
    }

    @Override
    public List<MerchantView> getAllMerchantView(String merchantName) {
        System.out.println("\"--------------------所有的商家信息--------------------\"");
        return getInformationServer.getAllMerchantView(merchantName);
    }

    @Override
    public List<Dish> getDishUnaudited() {
        System.out.println("\"--------------------所有未审核的菜品信息--------------------\"");
        return getInformationServer.getDishUnaudited();
    }

    @Override
    public List<DishView> getAllDishView(String dishName) {
        System.out.println("\"--------------------所有的菜品信息--------------------\"");
        return getInformationServer.getAllDishView(dishName);
    }

    @Override
    public List<DishView> getDishViewByMerchantId(int merchantId) {
        System.out.println("\"--------------------所有的菜品信息--------------------\"");
        return getInformationServer.getDishViewByMerchantId(merchantId);
    }

    @Override
    public List<Address> getAddressByCustomerId(int customerId) {
        System.out.println("\"--------------------所有的地址信息--------------------\"");
        return getInformationServer.getAddressByCustomerId(customerId);
    }

    @Override
    public List<Dish> getDishByMerchantId(int merchantId) {
        System.out.println("\"--------------------所有的菜品信息--------------------\"");
        return getInformationServer.getAllDishByMerchantId(merchantId);
    }

    @Override
    public List<Orders> getAllOrdersByMerchantId(int merchantId) {
        System.out.println("\"--------------------所有的订单信息--------------------\"");
        return getInformationServer.getAllOrdersByMerchantId(merchantId);
    }

    @Override
    public List<Delivery> getDeliveryUnaudited() {
        System.out.println("\"--------------------所有未审核的骑手信息--------------------\"");
        return getInformationServer.getDeliveryUnaudited();
    }

    @Override
    public void getAllDelivery() {
        System.out.println("\"--------------------所有的骑手信息--------------------\"");
        getInformationServer.getAllDelivery();
    }


}
