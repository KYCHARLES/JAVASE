package server.impl;

import dao.impl.DishManageImpl;
import server.DishManageServer;

public class DishManageServerImpl implements DishManageServer {
    DishManageImpl dishManageImpl = new DishManageImpl();
    @Override
    public void launchNewDishes(int merchantId, String dishName, String dishDescription, int dishPrice, int dishType) {

        boolean result = dishManageImpl.launchNewDishes(merchantId, dishName, dishDescription, dishPrice, dishType);
        if(result)
            System.out.println("商品等待系统审核中,请耐心等待");
        else
            System.out.println("商品信息错误,请重试");
    }

    @Override
    public void removeDishByDishId(int dishId) {
        boolean result = dishManageImpl.removeDishByDishId(dishId);
        if (result)
            System.out.println("商品已经下架!");
        else
            System.out.println("系统错误,请稍后重试");
    }
}
