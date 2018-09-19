package com.leanin.repository;


import com.leanin.pojo.Users;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UsersJpaRepository extends JpaRepository<Users, Long> {

}
