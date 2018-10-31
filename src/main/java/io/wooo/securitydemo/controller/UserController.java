package io.wooo.securitydemo.controller;

import io.wooo.securitydemo.entity.User;
import io.wooo.securitydemo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: wushuaiping
 * @date: 2018-10-31 16:40
 * @description:
 */
@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping
    public List<User> getUserList() {
        return userService.getUserList();
    }

    @PostMapping
    public void insertUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @PutMapping
    public void updateUser(@RequestBody User user) {
        userService.saveUser(user);
    }

}
