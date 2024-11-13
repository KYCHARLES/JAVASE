package thread.manager;

import controller.impl.LoginControllerImpl;
import thread.manager.Function.ManagerFunction;
import util.Console;

import java.util.Scanner;

public class ManagerThread implements Runnable {
    @Override
    public void run() {
        System.out.println("\n" + "这里是管理员登录功能:");
        Console.console_manager();
        Scanner sc = new Scanner(System.in);
        int managerChoice;
        while ((managerChoice = sc.nextInt()) != 2) {
            switch (managerChoice) {
                case 1:
                    LoginControllerImpl loginController = new LoginControllerImpl();
                    boolean resultLogin = loginController.loginManager();
                    if (resultLogin) {
                        System.out.println("管理员登录以后的逻辑!!!!!");
                        ManagerFunction managerFunction = new ManagerFunction();
                        managerFunction.managerFunction();
                    }
                    break;

            }
            Console.console_manager();
        }
        System.out.println("管理员登录的功能结束!");
    }
}
