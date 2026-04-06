package org.example.jenkinsprac01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class JenController {
    @GetMapping("jen")
    public String test() {
        return "v1";
    }
}
