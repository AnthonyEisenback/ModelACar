package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    private Vehicle vehicle;


    protected void createcarmenu() {
        Custom custom = new Custom();
        custom.getCarInfo();
        menu(custom);
        menu(vehicle);

    }

    public void menu2(){
        try{
            System.out.println("Would you like to use a prebuilt car or build your own?");
            System.out.println("1. Prebuilt Car");
            System.out.println("2. Custom car");
            scanner.nextInt();
        }catch (InputMismatchException ime){
            System.out.println("please input a number");
        }
        if(scanner.nextInt() == 2) {

        }
    }

    public void menu(Custom custom) {

        System.out.println("What would you like to do with the " + custom.getMake() + " " + custom.getModel() + "?");
        System.out.println("1. Accelerate \n2. Decelerate \n3.Fill up the gas tank \n4.Exit");

        try {
            switch (scanner.nextInt()) {
                case 1:
                    custom.driveCar(custom);

//                    accelerate
                    System.out.println(custom.getGas());
                    break;

                case 2:
                    custom.driveCar2(custom);
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
                        menu(custom);


            }
        } catch (InputMismatchException ime) {
            System.out.println("Please enter a number between one and four.");
        }

    }


}
