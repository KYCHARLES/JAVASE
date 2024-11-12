package server.impl;

import dao.impl.RegisterImpl;
import server.RegisterServer;

public class RegisterServerImpl implements RegisterServer {
    @Override
    public void registerCustomer(String name, String username, String password) {
        RegisterImpl registerImpl = new RegisterImpl();
        boolean registerResult = registerImpl.registerCustomer(name, username, password);
        if (registerResult) {
            System.out.println("注册成功!");
        }else
            System.out.println("注册失败!");
    }
}
