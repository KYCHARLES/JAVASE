package server;

public interface OrderManageServer {
    public void addOrder(int customerId, int merchantId, String dishDescription, String address, double customerPaid);
    public void merchantUpdateOrderStatus(int orderId, int orderStatus);
    public boolean deliverySnatchOrder(int orderId);
}
