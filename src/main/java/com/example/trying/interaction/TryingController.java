package com.example.trying.interaction;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
public class TryingController {


    @GetMapping("trying")
    public ResponseEntity getMessage(){
        return new ResponseEntity<>("Hi World", HttpStatus.OK);
    }
}
