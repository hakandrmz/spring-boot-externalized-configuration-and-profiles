package tr.com.atmosware.profiles;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Slf4j
public class ProfilesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProfilesApplication.class, args);
    }


    @Component
    @Profile(value = "prod | !dev")
    class MyRunner3 implements CommandLineRunner {

        @Override
        public void run(String... args) throws Exception {
            log.warn("In production");
        }
    }

}
