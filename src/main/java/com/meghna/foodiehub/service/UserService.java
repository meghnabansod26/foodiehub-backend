package com.meghna.foodiehub.service;

import com.meghna.foodiehub.io.UserRequest;
import com.meghna.foodiehub.io.UserResponse;

public interface UserService {
    UserResponse registerUser(UserRequest request);
    String findByUserId();
}
