package pojo;

public class DishView {
    private int dishId;
    private int merchantId;
    private String dishName;
    private String dishDescription;
    private int dishPrice;
    private String merchantName;
    private int merchantStatus;

    public DishView() {
    }

    public DishView(int dishId, int merchantId, String dishName, String dishDescription, int dishPrice, String merchantName, int merchantStatus) {
        this.dishId = dishId;
        this.merchantId = merchantId;
        this.dishName = dishName;
        this.dishDescription = dishDescription;
        this.dishPrice = dishPrice;
        this.merchantName = merchantName;
        this.merchantStatus = merchantStatus;
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

    public int getMerchantStatus() {
        return merchantStatus;
    }

    public void setMerchantStatus(int merchantStatus) {
        this.merchantStatus = merchantStatus;
    }

    @Override
    public String toString() {
        if (getMerchantStatus() == 2)
            return "dishName='" + dishName + '\'' + ", dishDescription='" + dishDescription + '\'' + ", dishPrice=" + dishPrice + ", merchantName='" + merchantName + '\'' + "店铺正在营业";
        else
            return "dishName='" + dishName + '\'' + ", dishDescription='" + dishDescription + '\'' + ", dishPrice=" + dishPrice + ", merchantName='" + merchantName + '\'' + "店铺已经休息";
    }
}
