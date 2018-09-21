package com.leanin.repository;


import com.leanin.pojo.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional(readOnly = true)
public interface UsersJpaRepository extends JpaSpecificationExecutor<Users>,JpaRepository<Users, Long> {

    /**
     * 根据名称模糊查询分页
     */
    Page<Users> findByUserNameContaining(String userName, Pageable pageable);


    Optional<Users> findByUserPhone(String userPhone);
}
