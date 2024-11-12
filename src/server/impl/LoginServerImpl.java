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
}
