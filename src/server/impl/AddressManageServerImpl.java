package server.impl;

import dao.impl.AddressManageImpl;
import server.AddressManageServer;

public class AddressManageServerImpl implements AddressManageServer {
    @Override
    public void addAddress(int customerId, String recipient, String phoneNumber, String location) {
        AddressManageImpl addressManage = new AddressManageImpl();
        boolean result = addressManage.addAddress(customerId, recipient, phoneNumber, location);
        if (result) {
            System.out.println("添加成功!");
        }else
            System.out.println("添加失败,请检查信息!");
    }
}
