package tr.com.atmosware.externalizedconfiguration.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.annotation.PostConstruct;

@ConfigurationProperties(prefix = "database")
@Data
@Slf4j
public class DatabaseConfiguration {
    private String url;
    private String name;
    private String username;
    private String password;

    private final HikariSettings hikariSettings = new HikariSettings();

    @PostConstruct
    public void logDbConfig() {
        log.warn(url);
        log.warn(name);
        log.warn(username);
        log.warn(password);
        log.warn(getHikariSettings().toString());
    }
    @Data
    private static class HikariSettings {
        private Integer poolSize;
        private Integer timeout;
    }
}
