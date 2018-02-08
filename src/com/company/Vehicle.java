
package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.company.Main.custom;

public class Vehicle {
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("The current car is a " + getYear() + " " + getMake() + " " + getModel() + ". It is going " + getSpeed() + "mph and has " + getGas() + "% of it's gas left.");


        Vehicle vehicle = new Vehicle(make, model, year);
        System.out.println("1. Accelerate \n2. Decelerate \n3.Fill up the gas tank \n4.Exit");

        try {


            switch (scanner.nextInt()) {

                case 1:
                    vehicle.driveCar2(vehicle);
                    //                    accelerate
                    break;

                case 2:
                    vehicle.getCarInfo();
                    vehicle.driveCar3(vehicle);

                    //                      decelerate
                    break;
                case 3:
                    vehicle.getGas();
                    System.out.println("Your " + vehicle.getMake() + " " + vehicle.getModel() + " " + "has been refueled");
                    //                      Fill gas tank
                    break;
                case 4:
                    //                    exit program
                    System.exit(0);

                default:
                    System.out.println("Please enter a number between one and four.");


            }
        } catch (InputMismatchException ime) {
            System.out.println("Please enter a number between one and four.");
        }
    }

    public void driveCar2(com.company.Vehicle vehicle) {

        for (int seconds = 0; seconds <= 5; seconds++) {
//            get current gas
//                    get current speed
            vehicle.setSpeed(vehicle.getSpeed() + 1);
            vehicle.setGas(vehicle.getGas() - 1);

            System.out.println("The car " + vehicle.getMake() + " " + vehicle.getModel() + " is going " + vehicle.getSpeed() + " Mph and has " + getGas() + "% of fuel remaining!");
        }
    }

    public void driveCar3(com.company.Vehicle vehicle) {
        Menu menu = new Menu();
        Vehicle vehicle2 = new Vehicle(make, model, year);
        for (int seconds = 0; seconds <= 5; seconds++) {
            vehicle.setSpeed(vehicle.getSpeed() - 1);
            vehicle.setGas(vehicle.getGas() - 1);

            System.out.println("The car " + vehicle.getMake() + " " + vehicle.getModel() + " is going " + vehicle.getSpeed() + " Mph and has " + getGas() + "% of fuel remaining!");
            menu.menu2(custom);

        }
    }

    public void getGas(Vehicle vehicle) {
        vehicle.setGas(100);

        System.out.println("Your " + vehicle.getMake() + " " + vehicle.getModel() + " " + "has been refueled");
        Vehicle vehicle1 = new Vehicle("Nissan", "Alitma", 1997);


    }

}

