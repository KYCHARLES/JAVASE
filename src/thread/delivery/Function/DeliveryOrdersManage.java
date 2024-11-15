package thread.delivery.Function;

import controller.impl.GetInformationControllerImpl;
import controller.impl.OrderManageControllerImpl;
import pojo.Delivery;
import pojo.OrdersView;

import java.util.List;
import java.util.Scanner;

public class DeliveryOrdersManage {
    private Delivery delivery;
    public DeliveryOrdersManage(Delivery delivery) {
        this.delivery = delivery;
    }

    public void deliveryOrdersManage() {
        System.out.println("\n" + "这里是骑手管理订单的功能:");
        GetInformationControllerImpl getInformationController = new GetInformationControllerImpl();
        List<OrdersView> ordersViewList = getInformationController.getNewOrdersViewByDeliveryId(delivery.getId());
        OrderManageControllerImpl orderManageController = new OrderManageControllerImpl();
        System.out.println("请输入你要操作的订单的索引,输入-1退出:");
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        while ( (index = scanner.nextInt()) != -1) {
            System.out.println("输入5,确认订单已经完成");
            orderManageController.deliveryFinishOrder(ordersViewList.get(index).getId(), delivery.getId());
            ordersViewList.clear();
            ordersViewList = getInformationController.getNewOrdersViewByDeliveryId(delivery.getId());
            System.out.println("请输入你要操作的订单的索引,输入-1退出:");
        }
        System.out.println("退出骑手管理订单的功能");
    }
}
