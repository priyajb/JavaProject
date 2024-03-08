package com.inter.lam;

public class CourseLambda {
    public static void main(String[] args) {

        ICourse iCourse = () -> {
            String[] web = {"html", "css", "bootstrap"};
            return web;
        };
        String[] web=iCourse.showCourses();
        for(String webc:web)
            System.out.println(webc);
        ICourse cloud= () -> new String[] {"aws", "googletest", "azure"};
        for(String cloudc:cloud.showCourses())
            System.out.println(cloud);


        };
    }

