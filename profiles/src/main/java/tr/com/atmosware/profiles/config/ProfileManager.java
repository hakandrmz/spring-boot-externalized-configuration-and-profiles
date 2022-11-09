package tr.com.atmosware.profiles.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
@Slf4j
public class ProfileManager {

    private final Environment environment;

    public ProfileManager(Environment environment) {
        this.environment = environment;
    }

    @PostConstruct
    public void logProfiles() {
        String[] activeProfiles = environment.getActiveProfiles();
        log.warn("Active profiles: " + Arrays.toString(activeProfiles));
    }
}
