package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.company.Main.custom;

public class Custom extends Vehicle {
    private Scanner input = new Scanner(System.in);

    public Custom(String make, String model, int year) {
        super(make, model, year);

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

    }

    public String getMake() {
        return make;
    }

    public void setMake() {
        System.out.println("What brand of Car would you like?");
        make = input.nextLine();
    }

    public String getModel() {
        return model;
    }

    public void setModel() {
        System.out.println("What model of car would you like?");
        model = input.nextLine();
    }

    public int getYear() {
        return year;
    }

    public void setYear() {
        System.out.println("What is the year of the car you would like?");
        try {
            year = input.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("please enter a number for your cars year.");
            setYear();
        }
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

        Scanner scanner = new Scanner(System.in);

        Vehicle vehicle = new Vehicle(make, model, year);
        System.out.println("1. Accelerate \n2. Decelerate \n3.Fill up the gas tank \n4.Exit");

        try {



            switch (scanner.nextInt()) {

                case 1:
                    custom.moveCar();
                    //                    accelerate
                    break;

                case 2:
                    custom.getCarInfo();
                    custom.driveCar2();

                    //                      decelerate
                    break;
                case 3:
                    custom.getCarInfo();
                    custom.fillGas();
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

    public void moveCar() {

        for (int seconds = 0; seconds <= 5; seconds++) {
//            get current gas
//                    get current speed
            custom.setSpeed(custom.getSpeed() + 1);
            custom.setGas(custom.getGas() - 1);

            System.out.println("The car " + custom.getMake() + " " + custom.getModel() + " is going " + custom.getSpeed() + " Mph and has " + getGas() + "% of fuel remaining!");
        }

    }

    public void driveCar2() {
        for (int seconds = 0; seconds <= 5; seconds++) {
            custom.setSpeed(custom.getSpeed() - 1);
            custom.setGas(custom.getGas() - 1);

            System.out.println("The car " + custom.getMake() + " " + custom.getModel() + " is going " + custom.getSpeed() + " Mph and has " + getGas() + "% of fuel remaining!");

        }

    }

    public void fillGas() {
        custom.setGas(100);

        System.out.println("Your " + custom.getMake() + " " + custom.getModel() + " " + "has been refueled");

    }

}