package com.company;


import java.util.Scanner;

public class Main {

    public static Custom custom;

    public static void main(String[] args) {
        // write your code here
        Menu menu = new Menu();
        menu.menu2(custom);
        menu.go(menu);


    }
}