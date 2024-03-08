package com.oops.overriding;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice :");
        String choice = sc.next();


        Menu menu = new Chinese();
        menu.showItems("lunch");

        menu = new Indian();
        menu.showItems("breakfast");

        Chinese chinese = (Chinese) menu;
        chinese.printGames();
    }
//first we have cretaed menu then new chinrese ;and menu poi
}
