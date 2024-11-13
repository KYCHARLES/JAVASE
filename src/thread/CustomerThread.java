package thread;

import controller.impl.LoginControllerImpl;
import controller.impl.RegisterControllerImpl;
import pojo.Customer;
import util.Console;

import java.util.Scanner;

public class CustomerThread implements Runnable {

    @Override
    public void run() {
        System.out.println("\n" + "这里是顾客登录功能:");
        Console.console_customer();
        Scanner sc = new Scanner(System.in);
        int customerChoice;
        while ((customerChoice = sc.nextInt()) != 3) {
            switch (customerChoice) {
                case 1:
                    LoginControllerImpl loginController = new LoginControllerImpl();
                    Customer resultLogin = loginController.loginCustomer();
                    if (resultLogin != null) {
                        CustomerFunctionThread customerFunction = new CustomerFunctionThread(resultLogin);
                        Thread customerFunctionThread = new Thread(customerFunction);
                        customerFunctionThread.start();

                        try {
                            customerFunctionThread.join();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 2:
                    RegisterControllerImpl registerController = new RegisterControllerImpl();
                    registerController.registerCustomer();
                    break;
            }
            Console.console_customer();
        }
        System.out.println("顾客登录的功能结束!");
    }
}
