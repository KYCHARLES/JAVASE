package thread;

import controller.impl.AuditInformationControllerImpl;
import controller.impl.GetInformationControllerImpl;
import pojo.Dish;

import java.util.List;
import java.util.Scanner;

public class ManagerAuditDishThread implements Runnable {
    private List<Dish> dishes;
    public ManagerAuditDishThread(List<Dish> dishes) {
        this.dishes = dishes;
    }
    @Override
    public void run() {
        System.out.println("\n" + "这里是管理员审核菜品的功能:");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入确认通过的菜品的索引信息(输入-1退出)");

        AuditInformationControllerImpl auditInformationController = new AuditInformationControllerImpl();
        GetInformationControllerImpl getInformationController = new GetInformationControllerImpl();
        int dishChoice = 0;
        while ((dishChoice = sc.nextInt()) != -1) {
            auditInformationController.AuditDish(dishes.get(dishChoice).getId());

            dishes.clear();
            dishes = getInformationController.getDishUnaudited();
            System.out.println("请输入确认通过的菜品的索引信息(输入-1退出)");
        }
        System.out.println("退出管理员审核菜品的功能!");
    }
}
