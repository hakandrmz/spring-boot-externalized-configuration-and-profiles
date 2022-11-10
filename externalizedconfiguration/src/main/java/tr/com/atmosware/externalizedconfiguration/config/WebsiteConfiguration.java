package tr.com.atmosware.externalizedconfiguration.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
@Data
public class WebsiteConfiguration {

    @Value("${fileName}")
    private String fileName;
    @Value("${website.url}")
    private String url;
    @Value("${website.status}")
    private String status;

    @PostConstruct
    public void logWebsiteConfiguration() {
        log.warn(fileName);
        log.warn(url);
        log.warn(status);
    }
}
