package com.example.back.dao;
import com.example.back.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
    User findByUsername(String username);
    User findByUserid(String userid);
    User getByUsernameAndPassword(String username,String password);
}
