package tr.com.atmosware.externalizedconfiguration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.Properties;
@ConfigurationPropertiesScan
@SpringBootApplication
public class ExternalizedconfigurationApplication implements CommandLineRunner {

    public static void main(String[] args) {
        /*SpringApplication springApplication = new SpringApplication();
        springApplication.setAddCommandLineProperties(false);
        springApplication.run(ExternalizedconfigurationApplication.class);*/
        SpringApplication.run(ExternalizedconfigurationApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

    }
}