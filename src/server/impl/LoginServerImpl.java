package server.impl;

import dao.impl.LoginImpl;
import server.LoginServer;

public class LoginServerImpl implements LoginServer {
    @Override
    public boolean loginCustomer(String username, String password) {
        LoginImpl loginImpl = new LoginImpl();
        boolean loginResult = loginImpl.loginCustomer(username, password);
        if (loginResult) {
            System.out.println("登录成功!");
            return true;
        }
        else {
            System.out.println("登录失败,请检查你的用户信息!");
            return false;
        }

    }

    @Override
    public boolean loginMerchant(String username, String password) {

        LoginImpl loginImpl = new LoginImpl();
        int loginResult = loginImpl.loginMerchant(username, password);
        switch (loginResult) {
            case -1:
                System.out.println("登录失败,请检查你的用户信息.");
            case 0:
                System.out.println("登录失败,你的账号已经被封禁!");
                return false;
            case 1:
                System.out.println("你的账号等待管理员审核中,请耐心等候");
                return false;
            case 2:
                System.out.println("登录成功");
                break;
        }
        return true;
    }
}
