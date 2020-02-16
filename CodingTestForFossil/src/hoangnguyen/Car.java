/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoangnguyen;

/**
 *
 * @author Hoang
 */
public class Car {

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

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.maxSpeed);
        }
    }

    public void showInfo() {
        System.out.println(String.format("Wheels = %d \nDoors = %d \nSeats = %d \nMax Speeds = %d",
                            this.wheels, this.doors, this.seats, this.maxSpeed));
    }
}
