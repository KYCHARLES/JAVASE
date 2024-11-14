package dao;

public interface OrderManage {
    public boolean addOrder(int customerId, int merchantId, String dishDescription, String address, double customerPaid);
    public boolean merchantUpdateOrderStatus(int OrderId, int OrderStatus);
    public boolean deliverySnatchOrder(int orderId);
}
