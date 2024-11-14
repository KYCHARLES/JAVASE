package server;

public interface OrderManageServer {
    public void addOrder(int customerId, int merchantId, String dishDescription, String address, double customerPaid);
}
