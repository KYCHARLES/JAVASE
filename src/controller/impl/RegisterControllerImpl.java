package controller.impl;

import controller.RegisterController;
import server.impl.RegisterServerImpl;

import java.util.Scanner;

public class RegisterControllerImpl implements RegisterController {
    @Override
    public void registerCustomer() {
        RegisterServerImpl registerServer = new RegisterServerImpl();
        System.out.println("您好,尊敬的顾客,请依次输入您的姓名,用户名(电话号码),用户密码:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String username = scanner.next();
        String password = scanner.next();
        registerServer.registerCustomer(name, username, password);
    }

    @Override
    public void registerMerchant() {
        RegisterServerImpl registerServer = new RegisterServerImpl();
        System.out.println("您好,尊敬的商家,请依次输入您的姓名,用户名(电话号码),用户密码:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String username = scanner.next();
        String password = scanner.next();
        registerServer.registerMerchant(name, username, password);
    }

    @Override
    public void registerDelivery() {
        RegisterServerImpl registerServer = new RegisterServerImpl();
        System.out.println("您好,尊敬的同志,请依次输入您的姓名,用户名(电话号码),用户密码");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String username = scanner.next();
        String password = scanner.next();
        registerServer.registerDelivery(name, username, password);
    }
}
