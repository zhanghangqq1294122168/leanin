package com.leanin.repository;


import com.leanin.pojo.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UsersJpaRepository extends JpaRepository<Users, Long> {

    /**
     * 根据名称模糊查询分页
     * */
    Page<Users> findByUserNameLike(String userName, Pageable pageable);

}
