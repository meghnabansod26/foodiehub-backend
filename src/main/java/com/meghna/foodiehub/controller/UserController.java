package com.meghna.foodiehub.controller;

import com.meghna.foodiehub.io.UserRequest;
import com.meghna.foodiehub.io.UserResponse;
import com.meghna.foodiehub.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api")

public class UserController {
    private UserService userService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse register(@RequestBody UserRequest request){
        return userService.registerUser(request);


    }
}
