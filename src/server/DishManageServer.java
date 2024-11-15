package server;

public interface DishManageServer {
    public void launchNewDishes(int merchantId,String dishName, String dishDescription, int dishPrice,int dishType);

    public void removeDishByDishId(int dishId);
}
