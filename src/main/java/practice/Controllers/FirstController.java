package practice.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@RequestMapping("/")
    String method() {
        return "This Applicaiton is Running";
    }

}
