package com.torryharris.driver;

import com.torryharris.exception.InsufficientFundsException;
import com.torryharris.exception.WithDrawLimitExceedException;
import com.torryharris.model.Person;

public class CustomExceptionDemo {
        public static void main(String[] args) {
            Person ram = new Person("Ram", 103666, 50000);
            try {
                ram.withdrawAmount(10000);
                ram.withdrawAmount(20000);
                ram.withdrawAmount(30000);
            } catch (WithDrawLimitExceedException | InsufficientFundsException ex) {
                System.out.println(ex);
            }
        }
    }

