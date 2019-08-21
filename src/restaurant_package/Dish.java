package restaurant_package;

import java.util.Random;

public enum Dish {

    ICE_CREAM("Ice cream",8),
    GYROS("Gyros",12),
    TORTILLA("Tortilla",13),
    PIZZA("Pizza",18),
    STEAK("Steak",30);

    private String dishName;
    private int dishPrice;

    Dish(String dishName, int dishPrice) {
        this.dishName = dishName;
        this.dishPrice = dishPrice;
    }

    public static Dish getRandomDish() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    public String getDishName() {
        return dishName;
    }

    public int getDishPrice() {
        return dishPrice;
    }

}
