package tr.com.atmosware.externalizedconfiguration.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.annotation.PostConstruct;
import java.util.Map;

@ConfigurationProperties("mail")
@Slf4j
@Data
public class MapConfigurationTest {
    private Map<String, String> service;

    @PostConstruct
    public void log() {
        log.warn(service.get("url"));
        log.warn(service.get("username"));
        log.warn(service.get("password"));
    }
}
