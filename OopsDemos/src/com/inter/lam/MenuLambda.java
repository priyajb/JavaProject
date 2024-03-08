package com.inter.lam;

public class MenuLambda {
    public static void main(String[] args) {
        IMenu iMenu = () -> {
            System.out.println("indian breakfast");
            System.out.println("1.idli 2.dosa");

        };
        iMenu.showMenus();
        iMenu=()-> System.out.println("");


    }
}
