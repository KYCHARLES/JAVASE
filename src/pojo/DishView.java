package pojo;

public class DishView {
    private int dishId;
    private int merchantId;
    private String dishName;
    private String dishDescription;
    private int dishPrice;
    private String merchantName;

    public DishView() {
    }

    public DishView(int dishId, int merchantId, String dishName, String dishDescription, int dishPrice, String merchantName) {
        this.dishId = dishId;
        this.merchantId = merchantId;
        this.dishName = dishName;
        this.dishDescription = dishDescription;
        this.dishPrice = dishPrice;
        this.merchantName = merchantName;
    }

    public int getDishId() {
        return dishId;
    }

    public void setDishId(int dishId) {
        this.dishId = dishId;
    }

    public int getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getDishDescription() {
        return dishDescription;
    }

    public void setDishDescription(String dishDescription) {
        this.dishDescription = dishDescription;
    }

    public int getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(int dishPrice) {
        this.dishPrice = dishPrice;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    @Override
    public String toString() {
        return "DishView{" +
                "dishName='" + dishName + '\'' +
                ", dishDescription='" + dishDescription + '\'' +
                ", dishPrice=" + dishPrice +
                ", merchantName='" + merchantName + '\'' +
                '}';
    }
}
