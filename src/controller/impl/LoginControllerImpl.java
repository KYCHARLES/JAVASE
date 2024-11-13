package controller.impl;

import controller.LoginController;
import pojo.Customer;
import pojo.Merchant;
import server.impl.LoginServerImpl;

import java.util.Scanner;

public class LoginControllerImpl implements LoginController {
    @Override
    public Customer loginCustomer() {
        LoginServerImpl loginServer = new LoginServerImpl();
        System.out.println("请依次输入你的顾客用户名和密码:");
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        String password = sc.next();
        return loginServer.loginCustomer(username, password);
    }

    @Override
    public Merchant loginMerchant() {
        LoginServerImpl loginServer = new LoginServerImpl();
        System.out.println("请依次输入你的商家用户名和密码:");
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        String password = sc.next();
        return loginServer.loginMerchant(username, password);
    }

    @Override
    public boolean loginManager() {
        LoginServerImpl loginServer = new LoginServerImpl();
        System.out.println("请依次输入你的管理员用户名和密码:");
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        String password = sc.next();
        return loginServer.loginManager(username, password);
    }
}
