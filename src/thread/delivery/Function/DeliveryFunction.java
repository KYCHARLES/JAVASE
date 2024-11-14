package thread.delivery.Function;

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
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
            Console.console_delivery_functions();
        }
        System.out.println("退出骑手的功能页面");
    }
}
