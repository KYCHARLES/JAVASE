package dao;

public interface DishManage {
    public boolean launchNewDishes(int merchantId,String dishName, String dishDescription, int dishPrice,int dishType);
    public boolean removeDishByDishId(int dishId);
}
