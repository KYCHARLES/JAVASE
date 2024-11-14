package pojo;

import java.time.LocalDate;

public class Orders {
    private int id;
    private int customerId;
    private int deliveryId;
    private int merchantId;
    private String dishDescription;
    private String address;
    private int status;
    private double customerPaid;
    private double deliveryFee;
    private LocalDate createDate;
    private LocalDate updateDate;

    public Orders() {
    }

    public Orders(int id, int customerId, int deliveryId, int merchantId, String dishDescription, String address, int status, double customerPaid, double deliveryFee, LocalDate createDate, LocalDate updateDate) {
        this.id = id;
        this.customerId = customerId;
        this.deliveryId = deliveryId;
        this.merchantId = merchantId;
        this.dishDescription = dishDescription;
        this.address = address;
        this.status = status;
        this.customerPaid = customerPaid;
        this.deliveryFee = deliveryFee;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public int getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }

    public String getDishDescription() {
        return dishDescription;
    }

    public void setDishDescription(String dishDescription) {
        this.dishDescription = dishDescription;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getCustomerPaid() {
        return customerPaid;
    }

    public void setCustomerPaid(double customerPaid) {
        this.customerPaid = customerPaid;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", deliveryId=" + deliveryId +
                ", merchantId=" + merchantId +
                ", dishDescription='" + dishDescription + '\'' +
                ", address='" + address + '\'' +
                ", status=" + status +
                ", customerPaid=" + customerPaid +
                ", deliveryFee=" + deliveryFee +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
