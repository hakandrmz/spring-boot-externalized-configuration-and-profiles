package tr.com.atmosware.profiles.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.dev.datasource")
@Data
@Slf4j
@Profile("dev")
public class DevDbConfiguration implements CommandLineRunner {
    private String username;
    private String password;
    private String database;
    private String url;

    @Override
    public void run(String... args) throws Exception {
        log.warn(this.toString());
    }
}
