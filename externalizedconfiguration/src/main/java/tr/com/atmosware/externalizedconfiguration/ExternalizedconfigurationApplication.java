package tr.com.atmosware.externalizedconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@ConfigurationPropertiesScan
public class ExternalizedconfigurationApplication {

    public static void main(String[] args) {
        //SpringApplication springApplication = new SpringApplication(ExternalizedconfigurationApplication.class);
        //springApplication.setAddCommandLineProperties(false);
        //springApplication.run();
        SpringApplication.run(ExternalizedconfigurationApplication.class, args);
    }

}
