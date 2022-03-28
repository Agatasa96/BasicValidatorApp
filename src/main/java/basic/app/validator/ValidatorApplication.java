package basic.app.validator;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ValidatorApplication {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(ValidatorApplication.class);
        builder.headless(false);
        ConfigurableApplicationContext context = builder.run(args);
    }

}
