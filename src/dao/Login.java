package dao;

import pojo.Customer;
import pojo.Merchant;

import java.util.List;

public interface Login {
    public List<Customer> loginCustomer(String username, String password);
    public List<Merchant> loginMerchant(String username, String password);
    public boolean loginManager(String username, String password);
}
