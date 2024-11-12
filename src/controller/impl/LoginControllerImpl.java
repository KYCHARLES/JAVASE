package controller.impl;

import controller.LoginController;
import server.impl.LoginServerImpl;

import java.util.Scanner;

public class LoginControllerImpl implements LoginController {
    @Override
    public boolean loginCustomer() {
        LoginServerImpl loginServer = new LoginServerImpl();
        System.out.println("请依次输入你的用户名和密码:");
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        String password = sc.next();
        return loginServer.loginCustomer(username, password);
    }

    @Override
    public boolean loginMerchant() {
        LoginServerImpl loginServer = new LoginServerImpl();
        System.out.println("请依次输入你的用户名和密码:");
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        String password = sc.next();
        return loginServer.loginMerchant(username, password);
    }
}
