package thread.delivery.Function;

import controller.impl.GetInformationControllerImpl;
import controller.impl.OrderManageControllerImpl;
import pojo.Delivery;
import pojo.Orders;

import java.util.List;
import java.util.Scanner;

public class DeliverySnatchOrders {
    private Delivery delivery;
    public DeliverySnatchOrders(Delivery delivery) {
        this.delivery = delivery;
    }
    public void deliverySnatchOrder(){
        System.out.println("这里是骑手抢单的功能");
        GetInformationControllerImpl getInformationController = new GetInformationControllerImpl();
        List<Orders> ordersList = getInformationController.getOrderWaitingDeliveryAccept();
        OrderManageControllerImpl orderManageController = new OrderManageControllerImpl();

        System.out.println("请输入你想接单的订单编号,输入-1退出");
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        while ((index = scanner.nextInt()) != -1){
            orderManageController.deliverySnatchOrder(ordersList.get(index).getId(), delivery.getId());
            ordersList.clear();
            ordersList = getInformationController.getOrderWaitingDeliveryAccept();
            System.out.println("请输入你想接单的订单编号,输入-1退出");
        }
        System.out.println("退出骑手抢单的功能!");
    }
}
