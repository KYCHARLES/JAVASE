package dao;

public interface Login {
    public boolean loginCustomer(String username, String password);
    public boolean loginMerchant(String username, String password);
}
