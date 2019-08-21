package restaurant_package;

import java.util.*;

public class Restaurant {

    private Map<Dish, Integer> resources;//how many dishes of each type
    private int earnedMoney;
    private int lostMoney;
    public static int i = 0;


    public Restaurant() {
        this.resources = new HashMap<Dish, Integer>();
        resources.put(Dish.ICE_CREAM, 3);
        resources.put(Dish.GYROS, 3);
        resources.put(Dish.TORTILLA, 3);
        resources.put(Dish.PIZZA, 3);
        resources.put(Dish.STEAK, 3);

        this.earnedMoney = 0;
        this.lostMoney = 0;
    }

    protected synchronized Map<Dish, Integer> prepareDishes() {
//        try {
//            for (int dishAmount:resources) {
//                dishAmount+=1;
//            }
//            Thread.sleep(5*1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        Timer timerR = new Timer();

        timerR.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                for (Map.Entry<Dish, Integer> dishAmount : resources.entrySet()) {
                    dishAmount.setValue(dishAmount.getValue() + 1);
                    System.out.println(dishAmount.getKey()+" "+dishAmount.getValue());
                }
                ++i;
                if (i == 4) {
                    synchronized (Main.start) {
                        Main.start.notify();
                    }
                }
            }
        }, 5 * 1000, 5 * 1000);
        return resources;
    }


//********getters and setters starts here*********

    public Map<Dish, Integer> getResources() {
        return resources;
    }

    public void setResources(Map<Dish, Integer> resources) {
        this.resources = resources;
    }

    public int getEarnedMoney() {
        return earnedMoney;
    }

    public void setEarnedMoney(int earnedMoney) {
        this.earnedMoney = earnedMoney;
    }

    public int getLostMoney() {
        return lostMoney;
    }

    public void setLostMoney(int lostMoney) {
        this.lostMoney = lostMoney;
    }
}
