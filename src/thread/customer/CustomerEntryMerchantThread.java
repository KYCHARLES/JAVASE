package thread.customer;

import controller.impl.GetInformationControllerImpl;
import pojo.DishView;
import pojo.Merchant;
import pojo.MerchantView;

import java.util.*;

public class CustomerEntryMerchantThread implements Runnable {
    private MerchantView merchantView;
    public CustomerEntryMerchantThread(MerchantView merchantView) {
        this.merchantView = merchantView;
    }

    @Override
    public void run() {
        System.out.println("--------------------欢迎来到" + merchantView.getName()+ "--------------------");
        GetInformationControllerImpl getInformationController = new GetInformationControllerImpl();
        List<DishView> dishViewList = getInformationController.getDishViewByMerchantId(merchantView.getId());
        System.out.println("\n"+"进入点餐功能:输入add添加菜品,输入remove删除菜品,输入check查看所有在购物车的商品,输入submit提交订单,输入esc退出:");
        Scanner scanner = new Scanner(System.in);
        String input = "";
        Map<DishView, Integer> orders = new HashMap<>();
        while (!"esc".equals(input = scanner.next())) {

            if ("add".equals(input)) {
                System.out.println("\n"+"输入菜品的索引将菜品添加到购物车(输入-1退出)");
                int choice = 0;
                while ((choice = scanner.nextInt()) != -1) {
                    orders.put(dishViewList.get(choice), orders.getOrDefault(dishViewList.get(choice), 0) + 1);
                    System.out.println(choice + "号菜品添加成功");
                }
            }

            if ("remove".equals(input)) {
                System.out.println("\n"+"输入菜品的索引将菜品移出购物车(输入-1退出)");
                int choice = 0;
                while ((choice = scanner.nextInt()) != -1) {
                    orders.remove(dishViewList.get(choice));
                    System.out.println(choice + "号菜品移除成功");
                }
            }

            if ("check".equals(input)) {
               getOrderedDish(orders);
            }
            if ("submit".equals(input)) {
                getOrderedDish(orders);


            }

            System.out.println("选择功能:输入add添加菜品,输入remove删除菜品,输入check查看所有在购物车的商品,输入submit提交订单,输入esc退出");

        }
        System.out.println("退出店铺!");
    }

    public static void getOrderedDish(Map<DishView, Integer> orders) {
        System.out.println("\n"+"你已经加入购物车的菜品:");
        List<Map.Entry<DishView, Integer>> orderList = orders.entrySet().stream().toList();
        int count = 0;
        for (Map.Entry<DishView, Integer> entry : orderList) {
            System.out.println(entry);
            count += entry.getKey().getDishPrice() * entry.getValue();
        }
        System.out.println("购物车菜品的总价格为:" + count);
    }
}
