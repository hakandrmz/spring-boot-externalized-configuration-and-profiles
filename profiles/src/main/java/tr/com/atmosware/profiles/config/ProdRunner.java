package tr.com.atmosware.profiles.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Profile("prod")
public class ProdRunner implements CommandLineRunner {

    @Value("${message}")
    private String message;

    @Override
    public void run(String... args) throws Exception {
        log.warn(message);
    }
}
