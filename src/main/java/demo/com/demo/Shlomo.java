package demo.com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Shlomo {

    private static String CRAB = "crab";

    @GetMapping
    public String crab() {
        return CRAB;
    }

}
