package tr.com.atmosware.profiles.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import tr.com.atmosware.profiles.config.DevDbConfiguration;
import tr.com.atmosware.profiles.config.ProdDbConfiguration;

import javax.annotation.PostConstruct;

@Service
@Slf4j
public class LogService {

    /*private final DevDbConfiguration devDbConfiguration;
    private final ProdDbConfiguration prodDbConfiguration;

    public LogService(DevDbConfiguration devDbConfiguration, ProdDbConfiguration prodDbConfiguration) {
        this.devDbConfiguration = devDbConfiguration;
        this.prodDbConfiguration = prodDbConfiguration;
    }

    @PostConstruct
    public void devLog() {
        log.warn(devDbConfiguration.toString());
    }

    @PostConstruct
    public void prodLog() {
        log.warn(prodDbConfiguration.toString());
    }*/
}
