package tr.com.atmosware.externalizedconfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebsiteConfiguration {
    @Value("${spring.application.name}")
    private String websiteUrl;

    @Value("${spring.application.port}")
    private String websitePort;

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getWebsitePort() {
        return websitePort;
    }

    public void setWebsitePort(String websitePort) {
        this.websitePort = websitePort;
    }

    @Override
    public String toString() {
        return "WebsiteConfiguration{" +
                "websiteUrl='" + websiteUrl + '\'' +
                ", websitePort='" + websitePort + '\'' +
                '}';
    }
}
