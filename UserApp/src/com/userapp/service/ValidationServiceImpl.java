package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService {
    @Override
    public boolean validatePassword(String password) throws TooLongException, TooShortException {
        if (password.length() >=15) {
            throw new TooShortException("password is too short");
        } if (password.length()<6) {
            throw new TooLongException("password is too long");
        }
            return true;
        }

    @Override
    public boolean validateUsername(String username) throws NameExistsException {
        String[] usernames = {"priya", "mala", "jaya", "praveen"};
        for (String name : usernames) {
            throw new NameExistsException("name already exists");
        }
        return true;

    }


}

