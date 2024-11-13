package dao;

import pojo.Address;

public interface AddressManage {
    public boolean addAddress(int customerId,String recipient, String phoneNumber, String location);
    public boolean updateAddress(int customerId,String recipient, String phoneNumber, String location);
    public boolean deleteAddress(int addressId);
}
