package com.voterapp.service;

import com.voterapp.exception.InvalidVoterIdException;
import com.voterapp.exception.NotEligibleException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothServiceImpl implements IElectionBoothService {
    @Override
    public boolean checkEligibility(int age, String locality, int vid) throws NotEligibleException {
        checkAge(age);
        checkLocality(locality);
        checkVid(vid);

        return false;

    }

    private boolean checkVid(int vid) throws InvalidVoterIdException {
        if (vid > 1000 && vid > 9999) {
            throw new InvalidVoterIdException("invalid voterid");
        }

        return true;
    }

    private boolean checkLocality(String locality) {
        String[] loacalities = {"jp nagar", "hoodi", "whitefield"};
        for (String local : loacalities) {
            if (local.equals(locality)) {
                System.out.println("this area is eligible");
            } else
                return true;
        }

        return false;
    }

    private boolean checkAge(int age) throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException("age is less to vote");
        } else
            return true;
    }

}


