
package com.company;

import java.util.Scanner;

public class Vehicle extends Custom {
    private Scanner input = new Scanner(System.in);


    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        make = "Nissan";
        return make;
    }

    public void setMake() {
        make = "Nissan";

    }

    public String getModel() {
        return model;
    }

    public void setModel() {
        make = "Nissan";
    }

    public int getYear() {
        return year;
    }

    public void setYear() {
        year = 1997;
        }


    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private String color;

    private String make;

    private String model;

    private int year;

    private int gas = 100;

    private int speed = 0;


    public void getCarInfo() {
        System.out.println("The current car is a " + getMake() + " " + getModel() + ". It is going " + getSpeed() + "mph and has " + getGas() + "% of it's gas left.");

    }


    public void driveCar(com.company.Vehicle vehicle) {
        for (int seconds = 0; seconds <= 5; seconds++) {
//            get current gas
//                    get current speed
            vehicle.setSpeed(vehicle.getSpeed() + 1);
            vehicle.setGas(vehicle.getGas() - 1);

            System.out.println("The car " + vehicle.getMake() + " " + vehicle.getModel() + " is going " + vehicle.getSpeed() + " Mph and has " + getGas() + "% of fuel remaining!");
        }
        Menu menu = new Menu();
        menu.menu2(vehicle);
    }

    public void driveCar2(com.company.Vehicle vehicle) {
        Menu menu = new Menu();
        for (int seconds = 0; seconds <= 5; seconds++) {
            vehicle.setSpeed(vehicle.getSpeed() - 1);
            vehicle.setGas(vehicle.getGas() - 1);

            System.out.println("The car " + vehicle.getMake() + " " + vehicle.getModel() + " is going " + vehicle.getSpeed() + " Mph and has " + getGas() + "% of fuel remaining!");
            menu.menu2(vehicle);

        }
    }

    public void getGas(Vehicle vehicle) {
        vehicle.setGas(100);

        System.out.println("Your " + vehicle.getMake() + " " + vehicle.getModel() + " " + "has been refueled");
        Vehicle vehicle1 = new Vehicle("Nissan", "Alitma", 1997);


    }

}

