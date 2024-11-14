package thread.delivery;

import controller.impl.LoginControllerImpl;
import controller.impl.RegisterControllerImpl;
import pojo.Delivery;
import thread.delivery.Function.DeliveryFunction;
import util.Console;

import java.util.Scanner;

public class DeliveryThread implements Runnable {

    @Override
    public void run() {
        System.out.println("这里是骑手的登录功能:");
        Console.console_delivery();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while ((choice =scanner.nextInt()) != 3) {
            switch (choice) {
                case 1:
                    LoginControllerImpl loginController = new LoginControllerImpl();
                    Delivery delivery = loginController.loginDelivery();
                    if (delivery != null) {
                        DeliveryFunction deliveryFunction = new DeliveryFunction(delivery);
                        deliveryFunction.deliveryFunction();
                    }
                    break;
                case 2:
                    RegisterControllerImpl registerController = new RegisterControllerImpl();
                    registerController.registerDelivery();
                    break;
            }
            Console.console_delivery();
        }
    }
}
