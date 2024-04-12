package my.edu.sfgdi2024;

import my.edu.sfgdi2024.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDi2024Application {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDi2024Application.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);
	}

}
