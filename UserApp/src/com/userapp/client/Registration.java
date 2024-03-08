package com.userapp.client;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the username");
        String name=sc.next();
        System.out.println("enter the password");
        String password=sc.next();
        IValidationService iValidationService=new ValidationServiceImpl();
        try {
            if(iValidationService.validatePassword(password)){
                System.out.println("welcome user u have entered correct password"+password);
            }
        }catch (TooShortException | TooLongException e)
        {
            System.out.println(e.getMessage());
        }
        try {
            if (iValidationService.validateUsername(name)) {
                System.out.println("correct username" + name);
            }
        }catch(NameExistsException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}



