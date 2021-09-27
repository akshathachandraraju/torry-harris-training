package com.torryharris.driver;

import com.torryharris.exception.CLLimitExceedException;
import com.torryharris.exception.InvalidCLRequestException;
import com.torryharris.model.Emplyoee;
import com.torryharris.model.HRDept;

public class EmplyoeeDemo {
    public static void main(String[] args) throws CLLimitExceedException, InvalidCLRequestException {
        Emplyoee emp = new Emplyoee(10, "ram", "Trainee");
        HRDept hr = new HRDept();
        try {
            hr.requestCL(emp,3);
            hr.requestCL(emp,3);
            hr.requestCL(emp,4);

        } catch (CLLimitExceedException | InvalidCLRequestException ex) {
            System.out.println(ex);
        }
    }
}
