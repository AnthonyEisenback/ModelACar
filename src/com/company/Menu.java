package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    private Vehicle vehicle;


    public void menu2(Custom custom) {
        int cus = 2;
        int pre = 1;
        try {
            System.out.println("Would you like to use a prebuilt car or build your own?");
            System.out.println("What kind of car would you like to create?");
            System.out.println("1. Custom Car \n2. Ready to go \n3. Exit");
        } catch (InputMismatchException ime) {
            System.out.println("please input a number");
        }
        try {
            switch (scanner.nextInt()) {
                case 1:
                    Custom car = new Custom();
                    car.getCarInfo();
//                    accelerate
                    menu2(custom);

                    custom.driveCar();
                    break;

                case 2:
                    Vehicle vehicle = new Vehicle();
                    vehicle.driveCar();


                    menu2(vehicle);
//                      decelerate
                    break;
                case 3:
                    System.exit(0);

                default:
                    System.out.println("Please enter a number between one and four.");
                    menu2(Main.custom);


            }
        } catch (InputMismatchException ime) {
            System.out.println("Please enter a number between one and four.");
        }

        System.out.println("1. Accelerate \n2. Decelerate \n3.Fill up the gas tank \n4.Exit");

        try {
            switch (scanner.nextInt()) {
                case 1:
                    custom.driveCar();

                    //                    accelerate
                    System.out.println(custom.getGas());
                    break;

                case 2:
                    custom.driveCar2();
                    System.out.println(custom.getGas());
                    //                      decelerate
                    break;
                case 3:
                    //                      Fill gas tank
                    custom.getGas(custom);
                    System.out.println("Your tank is now full");
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
}