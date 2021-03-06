package org.example.cqrs.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @Value("${message}")
    private String message = "test message";

    @GetMapping(value = "/message")
    String message() {
        return this.message;
    }
}
