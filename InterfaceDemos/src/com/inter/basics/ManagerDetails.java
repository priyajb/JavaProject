package com.inter.basics;

public class ManagerDetails implements IEntertainment {
    @Override
    public void showGames(String type) {
        if (type.equals("indoor")) {
            System.out.println("chess and teable tennis available");
        } else {
            System.out.println("footbll");
        }
    }

    @Override
    public void showActivity() {
        System.out.println("monthly trip with developers");
    }

}
