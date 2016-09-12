package trii;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.codahale.metrics.annotation.Timed;

@RestController
public class GreetingController {

    @RequestMapping("/")
    @Timed
    public String greeting() {
        return "Hello";
    }
}
