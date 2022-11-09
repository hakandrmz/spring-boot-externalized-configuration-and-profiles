package tr.com.atmosware.externalizedconfiguration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Slf4j
public class LogService {

    private final WebsiteConfiguration websiteConfiguration;
    private final TypeSafeConfiguration typeSafeConfiguration;
    private final MailServiceConfiguration mailServiceConfiguration;

    public LogService(WebsiteConfiguration websiteConfiguration, TypeSafeConfiguration typeSafeConfiguration, MailServiceConfiguration mailServiceConfiguration) {
        this.websiteConfiguration = websiteConfiguration;
        this.typeSafeConfiguration = typeSafeConfiguration;
        this.mailServiceConfiguration = mailServiceConfiguration;
    }

    @PostConstruct
    public void logWebsiteConfiguration() {
        log.warn(websiteConfiguration.toString());
        log.warn(typeSafeConfiguration.toString());
        log.warn(mailServiceConfiguration.toString());
    }
}
