package net.setlog.cloud.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod() {
        return "User Service is taking longer than Expected. Please try again later";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBack() {
        return "Department Service is taking longer than Expected. Please try again later";
    }

}
