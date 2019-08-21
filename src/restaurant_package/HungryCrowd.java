package restaurant_package;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class HungryCrowd {
    private int breakTimeBetweenOrders;
    private int orderedAmount;
    private Dish dish;
    public static int i = 0;


    public HungryCrowd() {
    }

    public HungryCrowd(int breakTimeBetweenOrders, int orderedAmount, Dish dish) {
        this.breakTimeBetweenOrders = breakTimeBetweenOrders;
        this.orderedAmount = orderedAmount;
        this.dish = dish;
    }

    protected synchronized HungryCrowd crowdEntery() {
        Random random = new Random();

//        try {
////            int time = random.nextInt(4)+1;
////            int orders = random.nextInt(5)+2;
////            HungryCrowd hCrowd = new HungryCrowd(time,orders,Dish.getRandomDish());
////            Thread.sleep(time*1000);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
        Timer timerC = new Timer();
        int time = random.nextInt(4) + 1;
        HungryCrowd hCrowd = new HungryCrowd();
        timerC.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                //time = random.nextInt(4) + 1;

                int orders = random.nextInt(5) + 2;
                hCrowd.setBreakTimeBetweenOrders(time);
                hCrowd.setOrderedAmount(orders);
                hCrowd.setDish(Dish.getRandomDish());
                System.out.println(hCrowd.getBreakTimeBetweenOrders()+" "+hCrowd.getOrderedAmount()+" "+hCrowd.getDish());;
                ++i;
                if (i == 4) {
                    synchronized (Main.start) {
                        Main.start.notify();
                    }
                }
            }

        }, time * 1000, time * 1000);
        return hCrowd;
    }


    public int getBreakTimeBetweenOrders() {
        return breakTimeBetweenOrders;
    }

    public void setBreakTimeBetweenOrders(int breakTimeBetweenOrders) {
        this.breakTimeBetweenOrders = breakTimeBetweenOrders;
    }

    public int getOrderedAmount() {
        return orderedAmount;
    }

    public void setOrderedAmount(int orderedAmount) {
        this.orderedAmount = orderedAmount;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }
}
