package springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext appcontext=new ClassPathXmlApplicationContext("applicationContext.xml");
		Emplyoee emp1 = (Emplyoee) appcontext.getBean("Accountant");
		emp1.doWork();
		Emplyoee emp2 = (Emplyoee) appcontext.getBean("Manager");
		emp2.doWork();
		appcontext.close();
	}

}
