package com.oops;

public class VarArgsDemo {
    void calcSum(String name,int... marks)
    {
        System.out.println("welcome :"+name);
    int sum=0;
    for(int mark:marks)
        sum+=mark;
        System.out.println("sum is :"+sum);
    }
        void calcSum(String name)
        {
            System.out.println("hello:"+name);
        }


    public static void main(String[] args) {
        VarArgsDemo demo=new VarArgsDemo();
        demo.calcSum("priya",67,78,89);
        demo.calcSum("priya");
    }
}
