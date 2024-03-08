package com.oops.overriding;

public class OverrrideDemo {
    public static void main(String[] args) {
        String choice="indoor";

        Sports sports = null;
        if(choice.equals("indoor"))
        {
            sports=new Indoor();
        } else if (choice.equals("outdoor")) {
            sports=new Outdoor();
        }
        else {
            sports=new Sports();
        }
        String[] games = sports.showTypes();
        /*for (String game : inGames) {
            System.out.println(game);
        }*/

        //sports = new Outdoor();
        String[] outGames = sports.showTypes();
        if(games!=null)
        for (String game :games ) {
            System.out.println(game);
        }
    }
}
