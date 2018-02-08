package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.company.Vehicle;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    private Vehicle vehicle;

    public void menu2(Custom custom) {
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
                    System.out.println("What is the make of your vehicle?");
                    Scanner scannerBanner = new Scanner(System.in);
                    String banner = scannerBanner.nextLine();
                    System.out.println("What is the model of your vehicle?");
                    String model = scannerBanner.nextLine();
                    System.out.println("What is the year of your Vehicle?");
                    int year = scannerBanner.nextInt();
                    Custom custom1 = new Custom(banner, model, year);
//                    accelerate
                    break;

                case 2:
                    Vehicle vehicle = new Vehicle("Nissan", "Altima", 1997);
                    vehicle.getCarInfo();

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
    }



    public void go(Menu menu) {

        System.out.println("1. Accelerate \n2. Decelerate \n3.Fill up the gas tank \n4.Exit");

        try {

            switch (scanner.nextInt()) {
                case 1:
                    vehicle.getCarInfo();
//                    vehicle.(vehicle);
                    //                    accelerate
                    break;

                case 2:
                    vehicle.getCarInfo();
                    vehicle.driveCar2(vehicle);

                    //                      decelerate
                    break;
                case 3:
                    vehicle.getCarInfo();
                    vehicle.getGas();
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
}