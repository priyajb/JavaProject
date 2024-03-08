package com.oops.inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        InEmployee inEmployee=new InEmployee("arpi",9);
        inEmployee.getDetails();

        InManager inManager=new InManager("priya",89,3999);
        inManager.getDetails();
        inManager.printBonus(4000);

        }

    }

