package com.twschool.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GameController {

    @GetMapping("/game")
    public Map<String, String> guess(@RequestParam String guess) {
        String result;
        result ="4A0B";
        Map<String, String> map = new HashMap<>();
        map.put("input", guess);
        map.put("result", result);
        return map;
    }
}
