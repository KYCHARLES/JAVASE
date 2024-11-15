package server;

import pojo.Customer;
import pojo.Delivery;
import pojo.Merchant;

public interface LoginServer {
    public Customer loginCustomer(String username, String password);

    public Merchant loginMerchant(String username, String password);

    public boolean loginManager(String username, String password);

    public Delivery loginDelivery(String username, String password);
}
