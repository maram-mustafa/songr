package com.example.songer.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/") //localhost:8080  // create end point to response to get request - provided with a path
    @ResponseBody  // return the value as it is in the response body - should add it with strings and json files

    public String getHome(){
        return "Hello From Home Page";
    }
}
