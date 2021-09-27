package com.torryharris.model;

import com.torryharris.exception.CLLimitExceedException;
import com.torryharris.exception.InvalidCLRequestException;

public class HRDept  {
    public void requestCL(Emplyoee emplyoee,int noOfDays) throws InvalidCLRequestException, CLLimitExceedException {
        if (noOfDays > 3) {
            throw new InvalidCLRequestException("Invalid CL Request!");
        }
        if (emplyoee.getBalanceCL()<noOfDays ) {
            throw new CLLimitExceedException("CL Limit is Exceed!");
        }
        else
                System.out.println("CL Approved");
        emplyoee.setBalanceCL(emplyoee.getBalanceCL()-noOfDays);
        System.out.println("Balance CL is:"+emplyoee.getBalanceCL());
            }
            }
