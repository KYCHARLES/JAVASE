package thread;

import controller.impl.DishManageControllerImpl;
import pojo.Merchant;
import util.Console;

import java.util.Scanner;

public class MerchantFunctionThread implements Runnable{
    private Merchant merchant;
    public MerchantFunctionThread(Merchant merchant) {
        this.merchant = merchant;
    }
    @Override
    public void run() {
        System.out.println("\n" + "这里是商家的功能页面:");
        Console.console_merchant_functions();
        Scanner scanner = new Scanner(System.in);
        DishManageControllerImpl dishManageControllerImpl = new DishManageControllerImpl();
        int choice = 0;
        while ((choice = scanner.nextInt()) != 5){
            switch (choice) {
                case 1:
                    System.out.println(merchant.getId());
                    dishManageControllerImpl.launchNewDishes(merchant.getId());
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;

            }
            Console.console_merchant_functions();
        }
    }
}
