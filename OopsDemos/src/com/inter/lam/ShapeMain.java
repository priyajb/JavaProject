package com.inter.lam;

public class ShapeMain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();

        //create a reference of IShape

        IShape shape=new Recttangle();
        //pass this as parameter
        shapeFactory.printArea(shape,10,30);

        //using anonymous inner class
        shapeFactory.printArea(new IShape() {
            @Override
            public void area(int x, int y) {
                System.out.println("calculating area");
                System.out.println(".................");
                System.out.println("tri"+(x*y*0.5));
                System.out.println("***************");
            }
        }, 10, 7);

        shapeFactory.printArea((int x,int y)->{
            System.out.println("calculating sqyare");
            System.out.println("sqa"+(x*y));},3,7);
    }
}
