package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Custom {
    private Scanner input = new Scanner(System.in);

    public Custom() {
        setMake();
        setModel();
        setYear();
        setSpeed(0);
        setGas(100);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake() {
        System.out.println("What brand of Car would you like?");
   make = input.nextLine();   }

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
            input.nextLine();
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
    }

    public void driveCar(Custom custom) {
        for (int seconds = 0; seconds <= 5; seconds++) {
//            get current gas
//                    get current speed
            custom.setSpeed(custom.getSpeed() + 1);
            custom.setGas(custom.getGas() - 1);

            System.out.println("The car " + custom.getMake() + " " + custom.getModel() + " is going " + custom.getSpeed() + " Mph and has " + getGas() +  "% of fuel remaining!");
        }
        Menu menu = new Menu();
        menu.menu(custom);
    }
    public void driveCar2(Custom custom) {
        for (int seconds = 0; seconds <=5; seconds++) {
            custom.setSpeed(custom.getSpeed()-1);
            custom.setGas(custom.getGas()-1);

            System.out.println("The car " + custom.getMake() + " " + custom.getModel() + " is going " + custom.getSpeed() + " Mph and has " + getGas() +  "% of fuel remaining!");

        }
        Menu menu = new Menu();
        menu.menu(custom);
    }
    public void getGas(Custom custom) {
        custom.setGas(100);

        System.out.println("Your " + custom.getMake() + " " + custom.getModel() + " " + "has been refueled");
        Menu menu = new Menu();
        menu.menu(custom);



    }

}

