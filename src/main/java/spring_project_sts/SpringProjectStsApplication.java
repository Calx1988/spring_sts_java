package spring_project_sts;

import java.util.Collections;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProjectStsApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(SpringProjectStsApplication.class);
		springApplication.setDefaultProperties(Collections.singletonMap("server.port", "8080"));
		springApplication.run(args);
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
	}

}
