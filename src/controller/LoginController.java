package controller;

import pojo.Customer;
import pojo.Merchant;

public interface LoginController {
    public Customer loginCustomer();
    public Merchant loginMerchant();
    public boolean loginManager();
}
