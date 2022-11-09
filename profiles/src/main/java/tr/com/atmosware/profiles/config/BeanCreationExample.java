package tr.com.atmosware.profiles.config;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Slf4j
@Configuration
public class BeanCreationExample {

    @Profile ("dev")
    @Bean
    public ModelMapper modelMapper() {
        log.warn("ModelMapper bean created.");
        return new ModelMapper();
    }
}
