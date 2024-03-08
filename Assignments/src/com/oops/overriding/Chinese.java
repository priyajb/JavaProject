package com.oops.overriding;

public class Chinese extends Menu {
    void showItems(String type) {
        if (type.equals("starter")) {
            System.out.println("corn soup");
            System.out.println("sandwich");
        }
        if (type.equals("lunch")) {
            System.out.println("noodles");
            System.out.println("chicken");
        } else {
            System.out.println("kunda");
            System.out.println("halwa");
        }
    }

    void printGames() {
        System.out.println("board games available");
    }
}

