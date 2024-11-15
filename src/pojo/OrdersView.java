package pojo;

import java.time.LocalDate;

public class OrdersView {

    private int id;
    private int customerId;
    private int deliveryId;
    private String deliveryName;
    private String deliveryPhoneNumber;
    private int merchantId;
    private String merchantName;
    private String merchantPhoneNumber;
    private String dishDescription;
    private String addressInformation;
    private int customerPaid;
    private int deliveryFee;
    private int status;
    private LocalDate updateDate;

    public OrdersView(int id, int customerId, int deliveryId, String deliveryName, String deliveryPhoneNumber, int merchantId, String merchantName, String merchantPhoneNumber, String dishDescription, String addressInformation, int customerPaid, int deliveryFee, int status, LocalDate updateDate) {
        this.id = id;
        this.customerId = customerId;
        this.deliveryId = deliveryId;
        this.deliveryName = deliveryName;
        this.deliveryPhoneNumber = deliveryPhoneNumber;
        this.merchantId = merchantId;
        this.merchantName = merchantName;
        this.merchantPhoneNumber = merchantPhoneNumber;
        this.dishDescription = dishDescription;
        this.addressInformation = addressInformation;
        this.customerPaid = customerPaid;
        this.deliveryFee = deliveryFee;
        this.status = status;
        this.updateDate = updateDate;
    }

    public OrdersView() {
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

    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    public String getDeliveryPhoneNumber() {
        return deliveryPhoneNumber;
    }

    public void setDeliveryPhoneNumber(String deliveryPhoneNumber) {
        this.deliveryPhoneNumber = deliveryPhoneNumber;
    }

    public int getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantPhoneNumber() {
        return merchantPhoneNumber;
    }

    public void setMerchantPhoneNumber(String merchantPhoneNumber) {
        this.merchantPhoneNumber = merchantPhoneNumber;
    }

    public String getDishDescription() {
        return dishDescription;
    }

    public void setDishDescription(String dishDescription) {
        this.dishDescription = dishDescription;
    }

    public String getAddressInformation() {
        return addressInformation;
    }

    public void setAddressInformation(String addressInformation) {
        this.addressInformation = addressInformation;
    }

    public int getCustomerPaid() {
        return customerPaid;
    }

    public void setCustomerPaid(int customerPaid) {
        this.customerPaid = customerPaid;
    }

    public int getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(int deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        if(getStatus() == 0)
            return "Orders [" + getDishDescription() + " " + getAddressInformation() + " 用户付款:" + getCustomerPaid() + " 配送费:" + getDeliveryFee() + "\n " +
                    " 商家信息:" + getMerchantName() +" " + getMerchantPhoneNumber() + " " + getUpdateDate() + " 用户已经取消订单";
        else if (getStatus() == 1)
            return "Orders [" + getDishDescription() + " " + getAddressInformation() + " 用户付款:" + getCustomerPaid() + " 配送费:" + getDeliveryFee() + "\n " +
                    " 商家信息:" + getMerchantName() +" " + getMerchantPhoneNumber() +  " " +  getUpdateDate() + " 用户已经下单,等待确认";
        else if (getStatus() == 2)
            return "Orders [" + getDishDescription() + " " + getAddressInformation() + " 用户付款:" + getCustomerPaid() + " 配送费:" + getDeliveryFee() + "\n " +
                    " 商家信息:" + getMerchantName() +" " + getMerchantPhoneNumber() +  " " + getUpdateDate() + " 商家已经接单";
        else if (getStatus() == 3)
            return "Orders [" + getDishDescription() + " " + getAddressInformation() + " 用户付款:" + getCustomerPaid() + " 配送费:" + getDeliveryFee() + "\n " +
                    " 商家信息:" + getMerchantName() +" " + getMerchantPhoneNumber()  + " " + getUpdateDate()+ " 商家出餐,正在召唤骑手";
        else if (getStatus() == 4)
            return  "Orders [" + getDishDescription() + " " + getAddressInformation() + " 用户付款:" + getCustomerPaid() + " 配送费:" + getDeliveryFee() + "\n " +
                    " 商家信息:" + getMerchantName() +" " + getMerchantPhoneNumber() + " 骑手信息:" + getDeliveryName() + " " + getDeliveryPhoneNumber()+ " " +  getUpdateDate() + " 骑手已经接单,正在为你配送!";
        else if (getStatus() == 5)
            return  "Orders [" + getDishDescription() + " " + getAddressInformation() + " 用户付款:" + getCustomerPaid() + " 配送费:" + getDeliveryFee() + "\n " +
                    " 商家信息:" + getMerchantName() +" " + getMerchantPhoneNumber() + " 骑手信息:" + getDeliveryName() + " " + getDeliveryPhoneNumber()+ " " +  getUpdateDate() + " 订单已经完成!";
        else
            return null;
    }
}
