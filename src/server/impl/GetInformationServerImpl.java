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

    @Override
    public List<Orders> getAllOrdersByMerchantId(int merchantId) {
        List<Orders> ordersList = getInformation.getAllOrdersByMerchantId(merchantId);
        if (ordersList != null) {
            for (int i = 0; i < ordersList.size(); i++) {
                System.out.println(i + " " + ordersList.get(i));
            }
        }else
            System.out.println("没有订单");
        return ordersList;
    }

    @Override
    public List<Delivery> getDeliveryUnaudited() {
        List<Delivery> deliveryList = getInformation.getDeliveryUnaudited();
        if (deliveryList != null) {
            for (int i = 0; i < deliveryList.size(); i++) {
                System.out.println(i + " " + deliveryList.get(i));
            }
        }else
            System.out.println("搜索异常,请稍后重试");
        return deliveryList;
    }

    @Override
    public void getAllDelivery() {
        List<Delivery> deliveryList = getInformation.getAllDelivery();
        if (deliveryList != null) {
            for(Delivery delivery : deliveryList){
                System.out.println(delivery);
            }
        }else
            System.out.println("没有相关信息");
    }

    @Override
    public List<Orders> getNewOrdersByMerchantId(int merchantId) {
        List<Orders> ordersList = getInformation.getNewOrdersByMerchantId(merchantId);
        if (ordersList != null) {
            for (int i = 0; i < ordersList.size(); i++) {
                System.out.println(i + " " + ordersList.get(i));
            }
        }else
            System.out.println("无结果");
        return ordersList;
    }

    @Override
    public void getAllOrderByDeliveryId(int deliveryId) {
        List<Orders> ordersList = getInformation.getAllOrderByDeliveryId(deliveryId);
        if (ordersList != null) {
            for (int i = 0; i < ordersList.size(); i++) {
                System.out.println(i + " " + ordersList.get(i));
            }
        }else
            System.out.println("无结果");
    }

    @Override
    public List<Orders> getOrderWaitingDeliveryAccept() {
        List<Orders> ordersList  = getInformation.getOrderWaitingDeliveryAccept();
        if (ordersList != null) {
            for (int i = 0; i < ordersList.size(); i++) {
                System.out.println(i + " " + ordersList.get(i));
            }
        }else
            System.out.println("没有查询结果,请重试!");
        return ordersList;
    }

    @Override
    public void getAllOrdersViewByCustomerId(int customerId) {
        List<OrdersView> ordersViews = getInformation.getAllOrdersViewByCustomerId(customerId);
        if (ordersViews != null) {
            for (int i = 0; i < ordersViews.size(); i++) {
                System.out.println(i + " " + ordersViews.get(i));
                System.out.println();
            }
        }else
            System.out.println("没有查询结果,请重试!");
    }

    @Override
    public MerchantView getMerchantViewById(int merchantId) {
        List<MerchantView> merchantViewList = getInformation.getMerchantViewById(merchantId);
        if (merchantViewList != null) return merchantViewList.getFirst();
        else
            return null;
    }

    @Override
    public List<OrdersView> getNewOrdersViewByDeliveryId(int DeliveryId) {
        List<OrdersView> ordersViewList = getInformation.getNewOrdersViewByDeliveryId(DeliveryId);
        if (ordersViewList != null) {
            for (int i = 0; i < ordersViewList.size(); i++) {
                System.out.println(i + " " + ordersViewList.get(i));
            }
        }else
            System.out.println("没有正在进行的订单!");
        return ordersViewList;
    }
}
