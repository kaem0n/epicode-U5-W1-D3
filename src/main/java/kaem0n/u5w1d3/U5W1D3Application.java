package kaem0n.u5w1d3;

import kaem0n.u5w1d3.entities.Menu;
import kaem0n.u5w1d3.entities.Table;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5W1D3Application {

	public static void main(String[] args) {
		SpringApplication.run(U5W1D3Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1D3Application.class);

		Menu menu = ctx.getBean(Menu.class);
		System.out.println();
		System.out.println(menu);
		Table tableTest = ctx.getBean(Table.class);
		Table tableTest1 = ctx.getBean(Table.class);
		System.out.println(tableTest);
		System.out.println(tableTest1);
	}
}
