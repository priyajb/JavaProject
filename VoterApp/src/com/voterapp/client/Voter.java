package com.voterapp.client;

import com.voterapp.exception.NotEligibleException;
import com.voterapp.service.ElectionBoothServiceImpl;
import com.voterapp.service.IElectionBoothService;

import java.util.Scanner;

public class Voter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age:");
        int age=sc.nextInt();
        System.out.println("enter your locality:");
        String locality=sc.next();
        System.out.println("enter you vid");
        int vid=sc.nextInt();

        try {
            IElectionBoothService iElectionBoothService=new ElectionBoothServiceImpl();
            boolean eligible=iElectionBoothService.checkEligibility(age,locality,vid);
            if(eligible) {
                System.out.println("you are eligible for vote");

            }

            }
        catch (NotEligibleException e){
            System.out.println("sorry you are not eligible for voting!!"+e.getMessage());
        }
    }
}
