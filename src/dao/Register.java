package dao;

public interface Register {

    public boolean registerCustomer(String name, String username, String password);
    public boolean registerMerchant(String name, String username, String password);
}
