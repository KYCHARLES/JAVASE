package thread.customer.Function;

import controller.impl.AddressManageControllerImpl;
import controller.impl.GetInformationControllerImpl;
import dao.impl.AddressManageImpl;
import pojo.Address;
import pojo.Customer;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CustomerViewAddress {
    private Customer customer;
    public CustomerViewAddress(Customer customer) {
        this.customer = customer;
    }

    public void customerViewAddress() {
        GetInformationControllerImpl getInformationController = new GetInformationControllerImpl();
        AddressManageControllerImpl addressManageController = new AddressManageControllerImpl();

        List<Address> addressList = getInformationController.getAddressByCustomerId(customer.getId());

        System.out.println("\n" + "请输入你要执行的功能:add添加地址,remove移除地址,update修改地址,esc退出");
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!Objects.equals(input = scanner.next(), "esc")) {
            //控制台打印地址
            for (int i = 0; i < addressList.size(); i++) {
                if (addressList.get(i).getStatus() == 1) System.out.println(i + " " + addressList.get(i));
            }

            if (input.equals("add")) {
                addressManageController.addAddress(customer);
                addressList = getInformationController.getAddressByCustomerId(customer.getId());
            }
            else if (input.equals("remove")) {
                int choice = 0;
                System.out.println("请输入你删除的地址的索引(输入-1退出删除功能):");
                while ((choice = scanner.nextInt()) != -1 && choice <= addressList.size()){
                    addressManageController.deleteAddress(addressList.get(choice));
                    addressList = getInformationController.getAddressByCustomerId(customer.getId());
                    System.out.println("请输入你删除的地址的索引(输入-1退出删除功能):");
                }
            }else if (input.equals("update")){
                int choice = 0;
                System.out.println("请输入你要修改的地址的索引(输入-1退出删除功能):");
                while ((choice = scanner.nextInt()) != -1 && choice <= addressList.size()){
                    addressManageController.deleteAddress(addressList.get(choice));
                    addressList = getInformationController.getAddressByCustomerId(customer.getId());
                    System.out.println("请输入你要修改的地址的索引(输入-1退出删除功能):");
                }
            }else
                System.out.println("无法识别你输入的信息!");
            addressList.clear();
            System.out.println("\n" + "请输入你要执行的功能:add添加地址,remove移除地址,update修改地址,esc退出");
        }
    }
}
