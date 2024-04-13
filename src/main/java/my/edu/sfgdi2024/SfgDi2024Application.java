package my.edu.sfgdi2024;

import my.edu.sfgdi2024.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDi2024Application {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDi2024Application.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());


		MyController myController = (MyController) ctx.getBean("myController");

//		String greeting = myController.sayHello();

		System.out.println("-".repeat(30) + " Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("-".repeat(40) + "Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx
				.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-".repeat(40) + "SetterInjected");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-".repeat(40) + "ConstructorInjected");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}

}
