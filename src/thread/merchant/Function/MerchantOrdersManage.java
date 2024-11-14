package thread.merchant.Function;

import controller.impl.GetInformationControllerImpl;
import controller.impl.OrderManageControllerImpl;
import pojo.Merchant;
import pojo.Orders;

import java.util.List;
import java.util.Scanner;

public class MerchantOrdersManage {
    private Merchant merchant;
    public MerchantOrdersManage(Merchant merchant) {
        this.merchant = merchant;
    }

    public void merchantOrdersManage() {
        System.out.println("\n" + "这里是商家管理订单的功能");
        GetInformationControllerImpl getInformationController = new GetInformationControllerImpl();
        OrderManageControllerImpl orderManageController = new OrderManageControllerImpl();
        List<Orders> ordersList = getInformationController.getNewOrdersByMerchantId(merchant.getId());

        System.out.println("请输入你要管理的订单索引信息(输入-1退出):");
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        while ((index = scanner.nextInt()) != -1){
            System.out.println("--------------------"+ index +"号订单--------------------");
            System.out.println(ordersList.get(index));
            System.out.println("请输入你的操作,2表示接受订单,3表示出餐,召唤骑手,任意输入表示重新选择订单进行操作:");
            int choice = scanner.nextInt();
            if (choice == 2 ){
                if (ordersList.get(index).getStatus() < 2 && ordersList.get(index).getStatus() != 0){
                    orderManageController.merchantUpdateOrderStatus(ordersList.get(index).getId(), choice);
                }else
                    System.out.println("你的操作有误!");
            }
            else if (choice == 3){
                if (ordersList.get(index).getStatus() < 3 && ordersList.get(index).getStatus() != 0){
                    orderManageController.merchantUpdateOrderStatus(ordersList.get(index).getId(), choice);
                }else
                    System.out.println("你的操作有误!");
            }
            ordersList.clear();
            ordersList = getInformationController.getNewOrdersByMerchantId(merchant.getId());
            System.out.println("请输入你的操作,2表示接受订单,3表示出餐,召唤骑手,任意输入表示重新选择订单进行操作:");
        }
    }
}
