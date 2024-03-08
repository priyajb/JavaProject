package com.util.maps;

import java.util.*;

public class MapStudent {
    public static void main(String[] args) {
        Map<Department, List<Student>> map = new HashMap<>();
        Department department1 = new Department("priya", 1, "ise");
        Department department2 = new Department("mala", 2, "mech");
        Department department3 = new Department("jaya", 5, "cse");

        map.put(department1, Arrays.asList(new Student("priya", "bangalore"),
                new Student("praveen", "davangere"),
                new Student("vinutha", "hubbali")));

        map.put(department2, Arrays.asList(new Student("prajwal", "bidar"),
                new Student("sudeep", "shivamogga"),
                new Student("sachin", "haveri")));

        map.put(department3, Arrays.asList(new Student("hema", "harihar"),
                new Student("kavya", "davangere"),
                new Student("bhanu", "ranebennur")));
        Set<Department> departments = map.keySet();
        for (Department department : departments) {
            System.out.println(department);

            List<Student> students = map.get(department);
            for (Student student : students) {
                System.out.println(student.getStudName());
            }

            //System.out.println(map.get(department1));
            //System.out.println(map.get(department2));
        }
    }
}
