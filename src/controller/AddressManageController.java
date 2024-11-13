package controller;

import pojo.Address;
import pojo.Customer;

public interface AddressManageController {
    public void addAddress(Customer customer);
    public void updateAddress(Address address);
    public void deleteAddress(Address address);
}
