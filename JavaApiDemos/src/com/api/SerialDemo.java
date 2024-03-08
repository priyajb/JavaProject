package com.api;

import com.api.serial.Student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialDemo {
    public static void main(String[] args) {
        Student student = new Student("priya", 12, "cse");
        System.out.println("serializing");
        try (
                FileOutputStream fileOutputStream = new FileOutputStream("stude.ser");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ) {
            objectOutputStream.writeObject(student);
            System.out.println("completed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
