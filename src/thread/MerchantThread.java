package thread;

import controller.impl.LoginControllerImpl;
import controller.impl.RegisterControllerImpl;
import util.Console;

import java.util.Scanner;

public class MerchantThread implements Runnable {
    @Override
    public void run() {
        System.out.println("这里是商家登录线程线程:");
        Console.console_merchant();
        Scanner sc = new Scanner(System.in);
        int customerChoice;
        while ((customerChoice = sc.nextInt()) != 3) {
            switch (customerChoice) {
                case 1:
                    LoginControllerImpl loginController = new LoginControllerImpl();
                    boolean resultLogin = loginController.loginMerchant();
                    if (resultLogin) {
                        System.out.println("商家登录以后的逻辑!!!!!");

                    }
                    break;
                case 2:
                    RegisterControllerImpl registerController = new RegisterControllerImpl();
                    registerController.registerMerchant();
                    break;
            }
            Console.console_merchant();
        }
        System.out.println("商家登录的线程结束啦,回到主线程!");
    }
}
