package thread.manager.Function;

import controller.impl.GetInformationControllerImpl;
import pojo.Dish;
import pojo.Merchant;
import util.Console;

import java.util.List;
import java.util.Scanner;

public class ManagerFunction {

    public void managerFunction() {
        System.out.println("\n" + "这里是管理员功能页面:");
        Console.console_manager_functions();
        Scanner scanner = new Scanner(System.in);
        GetInformationControllerImpl getInformationController = new GetInformationControllerImpl();
        int managerFunctionChoice = 0;
        while ((managerFunctionChoice = scanner.nextInt()) != 8) {
            switch (managerFunctionChoice) {
                case 1:
                    getInformationController.getAllMerchant();
                    break;
                case 2:
                    break;
                case 3:

                    List<Merchant> merchantList = getInformationController.getMerchantUnaudited();
                    ManagerAuditMerchant managerAuditMerchant = new ManagerAuditMerchant(merchantList);
                    managerAuditMerchant.managerAuditMerchant();
                    break;
                case 4:
                    break;
                case 5:
                    List<Dish> dishList = getInformationController.getDishUnaudited();
                    ManagerAuditDish managerAuditDish = new ManagerAuditDish(dishList);
                    managerAuditDish.managerAuditDish();
                    break;
                case 6:
                    break;
                case 7:
                    break;
            }

            Console.console_manager_functions();

        }
        System.out.println("退出管理员功能页面!");
    }
}