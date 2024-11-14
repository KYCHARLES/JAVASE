package dao;

import pojo.Customer;
import pojo.Delivery;
import pojo.Merchant;

import java.sql.Driver;
import java.util.List;

public interface Login {
    public List<Customer> loginCustomer(String username, String password);
    public List<Merchant> loginMerchant(String username, String password);
    public boolean loginManager(String username, String password);
    public List<Delivery> loginDelivery(String username, String password);
}
