package springapp;

import org.springframework.stereotype.Component;

@Component("Accountant")
public class Accountant implements Emplyoee{

	public void doWork() {
		System.out.println("Audit the accounts");
		
	}

}
