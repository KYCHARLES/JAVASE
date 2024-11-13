package pojo;

import java.time.LocalDate;

public class Dish {
    private int id;
    private int merchant_id;
    private String name;
    private String description;
    private int price;
    private int type;
    private int status;
    private LocalDate createDate;
    private LocalDate updateDate;

    public Dish() {
    }

    public Dish(int id, int merchant_id, String name, String description, int price, int type, int status, LocalDate createDate, LocalDate updateDate) {
        this.id = id;
        this.merchant_id = merchant_id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.type = type;
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

    public int getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(int merchant_id) {
        this.merchant_id = merchant_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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
        return "dish{" +
                "id=" + id +
                ", merchant_id=" + merchant_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", status=" + status +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
