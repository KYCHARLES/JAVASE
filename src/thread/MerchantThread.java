package thread;

import controller.impl.LoginControllerImpl;
import controller.impl.RegisterControllerImpl;
import dao.impl.MerchantStatusImpl;
import pojo.Merchant;
import util.Console;

import java.util.Scanner;

public class MerchantThread implements Runnable {

    @Override
    public void run() {
        System.out.println("\n" + "这里是商家登录功能:");
        Console.console_merchant();
        Scanner sc = new Scanner(System.in);
        int merchantChoice;
        while ((merchantChoice = sc.nextInt()) != 3) {
            switch (merchantChoice) {
                case 1:
                    LoginControllerImpl loginController = new LoginControllerImpl();
                    Merchant resultLogin = loginController.loginMerchant();
                    if (resultLogin != null) {
                        MerchantStatusImpl merchantStatus = new MerchantStatusImpl();
                        merchantStatus.MerchantBusiness(resultLogin.getId());

                        MerchantFunctionThread merchantFunction = new MerchantFunctionThread(resultLogin);
                        Thread merchantFunctionThread = new Thread(merchantFunction);
                        merchantFunctionThread.start();

                        try {
                            merchantFunctionThread.join();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                    }
                    break;
                case 2:
                    RegisterControllerImpl registerController = new RegisterControllerImpl();
                    registerController.registerMerchant();
                    break;
            }
            Console.console_merchant();
        }
        System.out.println("商家登录的功能结束!");
    }
}
