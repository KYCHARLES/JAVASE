package thread.merchant;

import controller.impl.LoginControllerImpl;
import controller.impl.MerchantStatusControllerImpl;
import controller.impl.RegisterControllerImpl;
import dao.impl.MerchantStatusImpl;
import pojo.Merchant;
import thread.merchant.Function.MerchantFunction;
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
                        MerchantStatusControllerImpl merchantStatusController = new MerchantStatusControllerImpl();
                        merchantStatusController.merchantBusiness(resultLogin.getId());

                        MerchantFunction merchantFunction = new MerchantFunction(resultLogin);
                        merchantFunction.merchantFunction();

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
