package dao;

public interface OrderManage {
    public boolean addOrder(int customerId, int merchantId, String dishDescription, String address, double customerPaid);
}
