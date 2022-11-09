package tr.com.atmosware.actuator.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.com.atmosware.actuator.actuatorUtil.RequestCounterMeter;

@Slf4j
@RestController
@RequestMapping ("/api")
public class ApiController {

    private final RequestCounterMeter requestCounterMeter;

    public ApiController(RequestCounterMeter requestCounterMeter) {
        this.requestCounterMeter = requestCounterMeter;
    }

    @GetMapping
    public ResponseEntity<Object> get() {
        requestCounterMeter.increment();
        return new ResponseEntity<>("Get response body", HttpStatus.ACCEPTED);
    }

    @PostMapping ("/register")
    public void post(@RequestBody User user) {
        log.info(user.toString());
    }

}
