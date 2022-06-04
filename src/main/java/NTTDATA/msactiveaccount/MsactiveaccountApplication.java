package NTTDATA.msactiveaccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsactiveaccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsactiveaccountApplication.class, args);
	}

}
