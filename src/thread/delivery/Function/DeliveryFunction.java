package thread.delivery.Function;

import controller.impl.GetInformationControllerImpl;
import pojo.Delivery;
import util.Console;

import java.util.Scanner;

public class DeliveryFunction {

    private Delivery delivery;
    public DeliveryFunction(Delivery delivery) {
        this.delivery = delivery;
    }
    public void deliveryFunction() {
        System.out.println("\n" + "这里是骑手的功能页面");
        Console.console_delivery_functions();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while ((choice = scanner.nextInt()) != 4){
            switch (choice) {
                case 1:
                    GetInformationControllerImpl getInformationController = new GetInformationControllerImpl();
                    getInformationController.getAllOrderByDeliveryId(delivery.getId());
                    break;
                case 2:
                    DeliveryOrdersManage deliveryOrdersManage = new DeliveryOrdersManage(delivery);
                    deliveryOrdersManage.deliveryOrdersManage();
                    break;
                case 3:
                    DeliverySnatchOrders deliverySnatchOrders = new DeliverySnatchOrders(delivery);
                    deliverySnatchOrders.deliverySnatchOrder();
                    break;
            }
            Console.console_delivery_functions();
        }
        System.out.println("退出骑手的功能页面");
    }
}
