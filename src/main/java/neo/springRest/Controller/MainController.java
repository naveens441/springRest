package neo.springRest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/neo")
public class MainController {

    @GetMapping("/greet/{name}")
    public String greet(String name){
        return "Hello! "+name;
    }

}
