package tr.com.atmosware.actuator.actuatorUtil;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Component;

@Component
public class RequestCounterMeter {
    private final Counter requestCount;

    public RequestCounterMeter(MeterRegistry meterRegistry) {
        Counter counter = Counter.builder("api_request_count")
                .description("Number of hello requests")
                .register(meterRegistry);
        requestCount = counter;
    }

    public void increment() {
        requestCount.increment();
    }
}
