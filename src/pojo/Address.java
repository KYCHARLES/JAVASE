package pojo;

import java.time.LocalDate;

public class Address {
    private int id;
    private int CustomerId;
    private String Location;
    private String recipient;
    private String phoneNumber;
    private int status;
    private LocalDate createDate;
    private LocalDate updateDate;

    public Address() {
    }

    public Address(int id, int customerId, String location, String recipient, String phoneNumber, int status, LocalDate createDate, LocalDate updateDate) {
        this.id = id;
        CustomerId = customerId;
        Location = location;
        this.recipient = recipient;
        this.phoneNumber = phoneNumber;
        this.status = status;
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
        return CustomerId;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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
        return "Address{" +
                "recipient='" + recipient + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", Location='" + Location + '\'' +
                '}';
    }
}
