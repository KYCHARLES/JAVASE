package thread.customer;

import controller.impl.GetInformationControllerImpl;
import pojo.DishView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CustomerSearchDishThread implements Runnable {

    List<DishView> dishViewList = new ArrayList<>();
    @Override
    public void run() {
        GetInformationControllerImpl getInformationController = new GetInformationControllerImpl();
        System.out.println("\n" + "这里是顾客搜索菜品的功能:");
        System.out.println("请你输入要搜索的菜(输入esc退出该功能):");
        Scanner scanner = new Scanner(System.in);
        String input ="";

        while (!Objects.equals(input = scanner.next(), "esc")) {

            dishViewList.clear();
            dishViewList = getInformationController.getAllDishView(input);

            System.out.println("输入sa重新搜索,输入en可以选择要进入的店铺:");
            String choice = scanner.next();
            if (Objects.equals(choice, "esc")) break;
            if (Objects.equals(choice, "sa")) {
                System.out.println("请你输入要搜索的店名(输入esc退出该功能):");
            }
            else if (Objects.equals(choice, "en")) {

            }else{
                System.out.println("你的输入有误,无法识别你要选择的功能,系统默认你要重新搜索!");
            }
        }
        System.out.println("顾客搜索菜品的功能退出");
    }
}
