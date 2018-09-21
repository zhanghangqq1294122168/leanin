package com.leanin.service;

import com.leanin.pojo.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UsersService {

    Page<Users> findByPageAndParams(final Users users,Pageable pageable);

}
