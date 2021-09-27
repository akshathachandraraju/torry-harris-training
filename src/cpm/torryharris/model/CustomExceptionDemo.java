package cpm.torryharris.model;

import com.torryharris.driver.Person;
import com.torryharris.exception.WithDrawLimitExceedException;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        Person ram = new Person("Ram", 123666, 50000);
        try {
            ram.withdrawAmount(10000);
            ram.withdrawAmount(20000);
            ram.withdrawAmount(15000);
        } catch (WithDrawLimitExceedException ex) {
            System.out.println(ex);
        }
    }
}
