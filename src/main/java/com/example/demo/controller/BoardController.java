package com.example.demo.controller;

import com.example.demo.database.user.Users;
import com.example.demo.service.BoardService;
import com.example.demo.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("")
@RequiredArgsConstructor
@CrossOrigin("*")
public class BoardController {

    private final BoardService boardService;


    @GetMapping("/board")
    public Map<String, Object> getUser() {
        Map<String, Object> map = new HashMap<>();
        map.put("rr", "rr");
        return map;
    }
}