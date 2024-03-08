package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public interface IValidationService {
     boolean validatePassword(String password) throws TooLongException, TooShortException;
    /*{
        if (password.length() < 6) {
            throw new TooShortException("password is too short");
        } else if (password.length() > 15) {
            throw new TooLongException("password is too long");
        } else {
            return true;
        }
    }
*/
    boolean validateUsername(String username) throws NameExistsException ;
    /*{
        String[] usernames = {"priya", "mala", "jaya", "praveen"};
        for (String name : usernames) {
            throw new NameExistsException("name already exists");
        }
        return true;*/


    }

