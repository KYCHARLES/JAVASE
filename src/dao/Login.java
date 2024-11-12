package dao;

public interface Login {
    public boolean loginCustomer(String username, String password);
    public int loginMerchant(String username, String password);
    public boolean loginManager(String username, String password);
}
