package com.online.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.entity.User;
@Repository("userRepo")
public interface UserRepo extends JpaRepository<User ,Integer> {

}
