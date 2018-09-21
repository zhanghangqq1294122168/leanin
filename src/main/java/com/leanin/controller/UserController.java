package com.leanin.controller;

import com.leanin.pojo.Users;
import com.leanin.repository.UsersJpaRepository;
import com.leanin.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController("/user")
public class UserController {

    @Autowired
    private UsersJpaRepository userJpa;

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

}
