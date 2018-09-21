package com.leanin.controller;

import com.leanin.pojo.Users;
import com.leanin.repository.UsersJpaRepository;
import com.leanin.service.UsersService;
import com.leanin.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;


@RestController("/user")
public class UserController {

    @Autowired
    private UsersJpaRepository userJpa;

    @Autowired
    private UsersService usersService;

    @ResponseBody
    @GetMapping("findByUserNameStartingWith")
    public Result findByUserNameStartingWith(String userName, @PageableDefault(sort = "userId", direction = Sort.Direction.DESC) Pageable pageable) {
        return Result.ok(userJpa.findByUserNameContaining(userName, pageable));
    }

    @ResponseBody
    @PostMapping("save")
    public Result save(Users users) {
        return Result.ok(userJpa.save(users));
    }


    @ResponseBody
    @GetMapping("findByUserPhone")
    public Result findByUserPhone(@RequestParam String userPhone) {
        return Result.ok(userJpa.findByUserPhone(userPhone));
    }

    @ResponseBody
    @GetMapping("findById")
    public Result findById(Long userId) {
        return Result.ok(userJpa.findById(userId));
    }

    @ResponseBody
    @GetMapping("findAll")
    public Result findAll() {
        return Result.ok(userJpa.findAll(Sort.by("userId")));
    }

    @ResponseBody
    @PostMapping("deleteById")
    public void deleteById(@RequestParam Long userId) {
        userJpa.deleteById(userId);
    }

    @ResponseBody
    @PostMapping("findByPageAndParams")
    public Result findByPageAndParams(Users users, @PageableDefault Pageable pageable) {
        return Result.ok(usersService.findByPageAndParams(users, pageable));
    }
}
