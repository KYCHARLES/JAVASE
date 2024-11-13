package controller.impl;

import controller.AddressManageController;
import pojo.Customer;
import server.impl.AddressManageServerImpl;

import java.util.Scanner;

public class AddressManageControllerImpl implements AddressManageController {
    @Override
    public void addAddress(Customer customer) {
        System.out.println("请依次输入你的收货人名称,收货人电话,收货地址");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String phoneNumber = scanner.next();
        String Location = scanner.next();

        AddressManageServerImpl addressManageServer = new AddressManageServerImpl();
        addressManageServer.addAddress(customer.getId(), name, phoneNumber, Location);
    }
}
