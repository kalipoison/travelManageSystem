package com.gohb.travels.service;

import com.gohb.travels.entity.User;

public interface UserService {



    User login(User user);

    void register(User user);
}
