package com.inter.lam;

public class ShapeDemo {
    public static void main(String[] args) {
        IShape iShape=new IShape() {
            @Override
            public void area(int x, int y) {
                System.out.println("first");
                System.out.println(x*y);

            }

        };
        iShape.area(3,7);

        IShape iShape1=new IShape() {
            @Override
            public void area(int x, int y) {
                System.out.println("second");
                System.out.println(x+y);

            }
        };
        iShape1.area(5,9);

    }
}
