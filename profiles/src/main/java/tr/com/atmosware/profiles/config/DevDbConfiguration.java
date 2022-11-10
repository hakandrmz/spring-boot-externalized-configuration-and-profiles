package tr.com.atmosware.profiles.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;

@Configuration("devDbConfiguration")
@ConfigurationProperties("spring.dev.datasource")
@Data
@Slf4j
@Profile("dev")
@Qualifier("devDbConfiguration")
public class DevDbConfiguration implements DbConfig{
    private String username;
    private String password;
    private String database;
    private String url;

    @Override
    public String toString() {
        return "DevDbConfiguration -> " +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", database='" + database + '\'' +
                ", url='" + url + '\'';
    }

    @Override
    public void setup() {
        log.warn("Development db active. -> " + this);
    }

    @PostConstruct
    public void log() {
        setup();
    }
}
