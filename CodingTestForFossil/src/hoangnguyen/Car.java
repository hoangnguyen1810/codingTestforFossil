
package hoangnguyen;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hoang
 */
public class Car implements Runnable{

    private int wheels;
    private int doors;
    private int seats;
    private int maxSpeed;

    public Car(int wheels, int doors, int seats, int maxSpeed) {
        this.wheels = wheels;
        this.doors = doors;
        this.seats = seats;
        this.maxSpeed = maxSpeed;
    }

    public Car(int maxSpeed) {
        this.wheels = DefaultValues.WHEELS;
        this.doors = DefaultValues.DOORS;
        this.seats = DefaultValues.SEATS;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(this.maxSpeed);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void showInfo() {
        System.out.println(String.format("Wheels = %d \nDoors = %d \nSeats = %d \nMax Speeds = %d",
                            this.wheels, this.doors, this.seats, this.maxSpeed));
    }
}
