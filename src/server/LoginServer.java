package server;

public interface LoginServer {
    public boolean loginCustomer(String username, String password);
    public boolean loginMerchant(String username, String password);
    public boolean loginManager(String username, String password);
}
