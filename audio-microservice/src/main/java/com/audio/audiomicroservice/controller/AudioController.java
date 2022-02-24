package com.audio.audiomicroservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AudioController {

    @GetMapping("/message")
    public String getMessage() {
        return "Hello World!";
    }

    @GetMapping("/name")
    public String getName() {
        return "TODO: Add peoples names here";
    }
}
