package thread;

import controller.impl.LoginControllerImpl;
import controller.impl.RegisterControllerImpl;
import util.Console;

import java.util.Scanner;

public class CustomerThread implements Runnable {

    @Override
    public void run() {
        System.out.println("这里是顾客登录线程线程:");
        Console.console_customer();
        Scanner sc = new Scanner(System.in);
        int customerChoice;
        while ((customerChoice = sc.nextInt()) != 3) {
            switch (customerChoice) {
                case 1:
                    LoginControllerImpl loginController = new LoginControllerImpl();
                    boolean resultLogin = loginController.loginCustomer();
                    if (resultLogin) {
                        System.out.println("顾客登录以后的逻辑!!!!!");
                    }
                    break;
                case 2:
                    RegisterControllerImpl registerController = new RegisterControllerImpl();
                    registerController.registerCustomer();
                    break;
            }
            Console.console_customer();
        }
        System.out.println("顾客登录的线程结束啦");
    }
}
