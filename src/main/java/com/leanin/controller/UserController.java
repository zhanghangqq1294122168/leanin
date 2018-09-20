package com.leanin.controller;

import com.leanin.pojo.Users;
import com.leanin.repository.UsersJpaRepository;
import com.leanin.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController("/user")
public class UserController {

    @Autowired
    private UsersJpaRepository userJpa;

    @ResponseBody
    @GetMapping("findByUserNameLike")
    public Result findByUserNameLike(String userName, @PageableDefault(sort = "userId", direction = Sort.Direction.DESC) Pageable pageable) {
        System.out.println(1);
        return Result.ok(userJpa.findByUserNameLike(userName, pageable));
    }

//    @ResponseBody
//    @PostMapping("")
//    public Result save(Users users){
//
//    }

}
