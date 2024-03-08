package com.oops.overriding;

public class Indian extends Menu {
    void showItems(String type) {
        if (type.equals("breakfast")) {
            System.out.println("idli");
            System.out.println("dosa");
        }
        if (type.equals("lunch")) {
            System.out.println("full meals");
            System.out.println("fried rice");
        }
    }
}
