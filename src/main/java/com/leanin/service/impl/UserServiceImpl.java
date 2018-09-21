package com.leanin.service.impl;

import com.google.common.base.Strings;
import com.leanin.pojo.Users;
import com.leanin.repository.UsersJpaRepository;
import com.leanin.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UsersService {

    @Autowired
    private UsersJpaRepository userJpa;

    public Page<Users> findByPageAndParams(final Users users, Pageable pageable) {
        Specification<Users> specification = (Specification<Users>) (root, criteriaQuery, builder) -> {
            if (!Strings.isNullOrEmpty(users.getUserName())) {
                builder.like(root.get("userName").as(String.class), "%" + users.getUserName() + "%");
            }
            return criteriaQuery.getRestriction();
        };
        return userJpa.findAll(specification, pageable);
    }

}
