package thread.customer.Function;

import controller.impl.AddressManageControllerImpl;
import controller.impl.GetInformationControllerImpl;
import controller.impl.OrderManageControllerImpl;
import pojo.Address;
import pojo.Customer;
import pojo.DishView;
import pojo.MerchantView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CustomerConfirmOrder {
    private List<Map.Entry<DishView, Integer>> orderList;
    private Customer customer;
    private MerchantView merchantView;
    public CustomerConfirmOrder(List<Map.Entry<DishView, Integer>> orderList, Customer customer, MerchantView merchantView) {
        this.orderList = orderList;
        this.customer = customer;
        this.merchantView = merchantView;
    }

    public void customerConfirmOrder() {
        GetInformationControllerImpl getInformationController = new GetInformationControllerImpl();
        List<Address> addressList = getInformationController.getAddressByCustomerId(customer.getId());
        if (addressList.isEmpty()) {
            System.out.println("你还没有地址信息,请先添加地址信息!");
            AddressManageControllerImpl addressManageController = new AddressManageControllerImpl();
            addressManageController.addAddress(customer);
            addressList = getInformationController.getAddressByCustomerId(customer.getId());
        }

        System.out.println("请输入你要选择的地址:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        System.out.println("--------------------你的订单信息--------------------");
        System.out.println("地址:");
        System.out.println(addressList.get(choice));
        System.out.println("菜品信息:");
        int count = 0;
        for (Map.Entry<DishView, Integer> entry : orderList) {
            System.out.println(entry);
            count += entry.getKey().getDishPrice() * entry.getValue();
        }
        System.out.println("总价格为:" + count);
        System.out.println("-------------------------------------------------");
        System.out.println("请确认你的订单信息,如若无误输入confirm确认提交,否则可以输入任意字符取消");
        String confirm = "";
        if ((confirm = scanner.next()).equals("confirm")) {
            OrderManageControllerImpl orderManageController = new OrderManageControllerImpl();
            orderManageController.addOrder(customer, merchantView, addressList.get(choice),orderList);
        }
    }
}
