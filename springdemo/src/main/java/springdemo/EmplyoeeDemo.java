package springdemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmplyoeeDemo {
public static void main(String[] args) {
	ApplicationContext at=new ClassPathXmlApplicationContext("spring.xml");
	EmplyoeeDB eDB=at.getBean("emp", EmplyoeeDB.class);
	Emplyoee e=new Emplyoee(10, "akshatha", 30000);
	Emplyoee e1=new Emplyoee(11, "rama", 30000);
	Emplyoee e2=new Emplyoee(12, "sita", 30000);
	Emplyoee e3=new Emplyoee(13, "geeta", 30000);
	System.out.println(eDB.addEmplyoee(e));
	System.out.println(eDB.addEmplyoee(e1));
	System.out.println(eDB.addEmplyoee(e2));
	System.out.println(eDB.addEmplyoee(e3));
	
	List<Emplyoee> le=eDB.getEmplyoeeDetails();
	for(Emplyoee es:le) {
		System.out.println(es.getEid()+","+es.getEname()+","+es.getSalary());
	}
}
}
