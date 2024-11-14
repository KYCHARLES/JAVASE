package thread.delivery;

import controller.impl.RegisterControllerImpl;
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
                    break;
                case 2:
                    RegisterControllerImpl registerController = new RegisterControllerImpl();
                    registerController.registerDelivery();
                    break;
            }
        }
    }
}
