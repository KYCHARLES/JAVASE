package thread.merchant.Function;

import controller.impl.DishManageControllerImpl;
import controller.impl.GetInformationControllerImpl;
import controller.impl.MerchantStatusControllerImpl;
import dao.impl.MerchantStatusImpl;
import pojo.Merchant;
import util.Console;

import java.util.Scanner;

public class MerchantFunction{
    private Merchant merchant;
    GetInformationControllerImpl getInformationControllerImpl = new GetInformationControllerImpl();
    public MerchantFunction(Merchant merchant) {
        this.merchant = merchant;
    }

    public void merchantFunction() {
        System.out.println("\n" + "这里是商家的功能页面:");
        Console.console_merchant_functions();
        Scanner scanner = new Scanner(System.in);
        DishManageControllerImpl dishManageControllerImpl = new DishManageControllerImpl();
        int choice = 0;
        while ((choice = scanner.nextInt()) != 6){
            switch (choice) {
                case 1:
                    dishManageControllerImpl.launchNewDishes(merchant.getId());
                    break;
                case 2:
                    MerchantDishManage merchantDishManage = new MerchantDishManage(merchant);
                    merchantDishManage.merchantDishManage();
                    break;
                case 3:
                    getInformationControllerImpl.getDishViewByMerchantId(merchant.getId());
                    break;
                case 4:
                    getInformationControllerImpl.getAllOrdersByMerchantId(merchant.getId());
                    break;
                case 5:
                    MerchantOrdersManage merchantOrdersManage = new MerchantOrdersManage(merchant);
                    merchantOrdersManage.merchantOrdersManage();
                    break;

            }
            Console.console_merchant_functions();
        }
        MerchantStatusControllerImpl merchantStatusControllerImpl = new MerchantStatusControllerImpl();
        merchantStatusControllerImpl.merchantRest(merchant.getId());
        System.out.println("退出商家功能页面!");
    }
}
