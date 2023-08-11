package com.example.jwtauthenticationexample.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPageController {

    @GetMapping("/index")
    public ResponseEntity<String> index() {
        return ResponseEntity.ok("Index Sayfası");
    }

    @GetMapping("dashboard")
    public ResponseEntity<String> dashboard() {
        return ResponseEntity.ok("Dashboard Sayfası");
    }
}
