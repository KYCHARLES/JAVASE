package server.impl;

import dao.impl.AddressManageImpl;
import server.AddressManageServer;

public class AddressManageServerImpl implements AddressManageServer {
    AddressManageImpl addressManage = new AddressManageImpl();
    @Override
    public void addAddress(int customerId, String recipient, String phoneNumber, String location) {

        boolean result = addressManage.addAddress(customerId, recipient, phoneNumber, location);
        if (result) {
            System.out.println("添加成功!");
        }else
            System.out.println("添加失败,请检查信息!");
    }

    @Override
    public void updateAddress(int addressId, String recipient, String phoneNumber, String location) {
        boolean result = addressManage.updateAddress(addressId, recipient, phoneNumber, location);
        if (result) {
            System.out.println("修改成功!");
        }else
            System.out.println("修改失败,请检查信息!");
    }

    @Override
    public void deleteAddress(int addressId) {
        boolean result = addressManage.deleteAddress(addressId);
        if (result) {
            System.out.println("删除成功!");
        }else
            System.out.println("删除失败!");
    }
}
