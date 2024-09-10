package com.example.e_commerce.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.e_commerce.entities.User;

@Repository
public interface UserRepositry extends JpaRepository<User, Long> {


    User findByUserNameAndMobileNumber(String userName, Long mobileNumber);

    User findByUserName(String username);

}
