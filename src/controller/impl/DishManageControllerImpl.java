package controller.impl;

import controller.DishManageController;
import server.impl.DishManageServerImpl;

import java.util.Scanner;

public class DishManageControllerImpl implements DishManageController {
    @Override
    public void launchNewDishes(int merchantId) {
        System.out.println("请依次输入商品的名称,描述,价格,类型");
        Scanner scanner = new Scanner(System.in);
        String dishName = scanner.next();
        String dishDescription = scanner.next();
        int dishPrice = scanner.nextInt();
        int dishType = scanner.nextInt();

        DishManageServerImpl dishManageServer = new DishManageServerImpl();
        dishManageServer.launchNewDishes(merchantId, dishName, dishDescription, dishPrice, dishType);
    }
}
