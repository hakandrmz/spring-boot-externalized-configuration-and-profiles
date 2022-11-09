package tr.com.atmosware.profiles;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles({"test","foo"})
@Slf4j
class ProfilesApplicationTests {

    @Test
    void contextLoads () {
        log.warn("Test profile active");
        Assertions.assertEquals(1,1);
    }

}
