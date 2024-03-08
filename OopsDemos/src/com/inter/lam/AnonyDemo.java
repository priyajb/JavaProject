package com.inter.lam;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class AnonyDemo {
    public static void main(String[] args) {
        //using a class that implements the interface
        IGreeter iGreeter=new GreeterImpl();
        iGreeter.greetMessage("hello,welcome to lambda");

        /*IGreeter iGreeter1=new IGreeter() {
            @Override
            public void greetMessage(String message) {

            };
            //call the method


        */
    }
}
