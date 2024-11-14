package thread.merchant.Function;

import controller.impl.DishManageControllerImpl;
import controller.impl.GetInformationControllerImpl;
import pojo.Dish;
import pojo.Merchant;

import java.util.List;
import java.util.Scanner;

public class MerchantDishManage {

    private Merchant merchant;
    public MerchantDishManage(Merchant merchant) {
        this.merchant = merchant;
    }
    public void merchantDishManage(){
        System.out.println("这里是商家管理菜品的系统:");
        GetInformationControllerImpl getInformationController = new GetInformationControllerImpl();
        List<Dish> dishList = getInformationController.getDishByMerchantId(merchant.getId());

        System.out.println("如果你想下架菜品,请输入remove,否则输入任意退出");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if(input.equals("remove")){
            System.out.println("请输入菜品的索引来下架菜品,输入-1结束");
            int index = 0;
            while((index = scanner.nextInt()) != -1){
                DishManageControllerImpl dishManageController = new DishManageControllerImpl();
                dishManageController.removeDishByDishId(dishList.get(index).getId());
                dishList.clear();
                dishList = getInformationController.getDishByMerchantId(merchant.getId());
                System.out.println("请输入菜品的索引来下架菜品,输入-1结束");
            }
        }

    }
}
