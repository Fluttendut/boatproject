package com.example.ellaboatproject.restcontroller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class RestIndex {
    @GetMapping("/")
    public String index(){return "index";}

}
