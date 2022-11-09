package tr.com.atmosware.actuator.actuatorUtil;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Endpoint(id = "features")
@Component
public class CustomEndpoints {

    Map<String,String> features = new ConcurrentHashMap<>();

    @ReadOperation
    public Map<String,String> greet() {
        features.put("key","value");
        features.put("website","atmosware.com.tr");
        return features;
    }


    @WriteOperation
    public void configureFeature(@Selector String name, String feature) {
        features.put(name, feature);
    }

}
