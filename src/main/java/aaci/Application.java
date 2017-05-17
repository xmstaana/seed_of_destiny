package aaci;

/**
 * Created by Nico on 3/8/17.
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
@EnableAutoConfiguration
public class Application{

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
            SpringApplication.run(Application.class, args);
    }


}
