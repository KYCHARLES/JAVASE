package server.impl;

import dao.impl.LoginImpl;
import pojo.Customer;
import pojo.Delivery;
import pojo.Merchant;
import server.LoginServer;

import java.util.ArrayList;
import java.util.List;

public class LoginServerImpl implements LoginServer {
    @Override
    public Customer loginCustomer(String username, String password) {
        LoginImpl loginImpl = new LoginImpl();
        List<Customer> customerList = loginImpl.loginCustomer(username, password);
        Customer loginResult = null;
        if (!customerList.isEmpty()) {
            System.out.println("登录成功!");
            loginResult = customerList.getFirst();
        }else
            System.out.println("登录失败,请检查你的用户信息!");
        return loginResult;
    }

    @Override
    public Merchant loginMerchant(String username, String password) {

        LoginImpl loginImpl = new LoginImpl();
        List<Merchant> merchantList = loginImpl.loginMerchant(username, password);
        Merchant loginResult = null;
        if (!merchantList.isEmpty()) {
            loginResult = merchantList.getFirst();
            switch (loginResult.getStatus()){
                case 0:
                    System.out.println("登录失败,你的账号已经被封禁!");
                    break;
                case 1:
                    System.out.println("你的账号等待管理员审核中,请耐心等候");
                    break;
                case 2:
                    System.out.println("登录成功");
                    break;
            }
        }else
            System.out.println("登录失败,请检查你的用户信息!");
        return loginResult;
    }

    @Override
    public boolean loginManager(String username, String password) {
        LoginImpl loginImpl = new LoginImpl();
        boolean loginResult = loginImpl.loginManager(username, password);
        if (loginResult)
            System.out.println("登录成功!");
        else
            System.out.println("登录失败,请检查你的用户信息");
        return loginResult;
    }

    @Override
    public Delivery loginDelivery(String username, String password) {
        LoginImpl loginImpl = new LoginImpl();
        List<Delivery> deliveryList = loginImpl.loginDelivery(username, password);
        Delivery loginResult = null;
        if (!deliveryList.isEmpty()) {
            loginResult = deliveryList.getFirst();
            switch (loginResult.getStatus()){
                case 0:
                    System.out.println("登录失败,你的账号已经被封禁!");
                    break;
                case 1:
                    System.out.println("你的账号等待管理员审核中,请耐心等候");
                    break;
                case 2:
                    System.out.println("登录成功");
                    break;
            }
        }else
            System.out.println("登录失败,请检查你的用户信息!");
        return loginResult;
    }
}
