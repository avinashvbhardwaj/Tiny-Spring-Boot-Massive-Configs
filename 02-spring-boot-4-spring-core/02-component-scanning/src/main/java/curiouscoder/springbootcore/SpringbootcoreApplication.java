package curiouscoder.springbootcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "curiouscoder.springbootcore",
        "curiouscoder.util"})
public class SpringbootcoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootcoreApplication.class, args);
	}

}
