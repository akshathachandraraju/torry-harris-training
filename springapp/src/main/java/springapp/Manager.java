package springapp;

import org.springframework.stereotype.Component;

@Component("Manager")
public class Manager implements Emplyoee{

	public void doWork() {
		System.out.println("Manage the main branch office");
		
	}
	

}
