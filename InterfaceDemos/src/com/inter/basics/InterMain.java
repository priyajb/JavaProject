package com.inter.basics;

public class InterMain {
    public static void main(String[] args) {
        IEntertainment entertainment = new ManagerDetails();
        entertainment.showActivity();
        entertainment.showGames("indoor");
        System.out.println("................");
        entertainment = new DeveloperDetails();
        entertainment.showGames("outdoor");
        entertainment.showActivity();
    }
}