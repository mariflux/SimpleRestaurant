package restaurant_package;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    protected static Main start;

    public static void main(String[] args) throws InterruptedException {

        start = new Main();
        Timer timer = new Timer();
        Restaurant myRestaurant = new Restaurant();
        myRestaurant.prepareDishes();
        HungryCrowd letCrowdIn = new HungryCrowd();
        letCrowdIn.crowdEntery();

        System.out.println("po");


        synchronized (start) {
            //make the main thread wait
            start.wait();

            //once timer has scheduled the task 4 times,
            //main thread resumes
            //and terminates the timer
            timer.cancel();

            //purge is used to remove all cancelled
            //tasks from the timer'stak queue
            System.out.println(timer.purge());
        }


    }
}


























