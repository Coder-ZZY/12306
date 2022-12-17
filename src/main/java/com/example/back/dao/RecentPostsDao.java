package com.example.back.dao;

import com.example.back.pojo.ExecutorList;
import com.example.back.pojo.RecentPosts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecentPostsDao extends JpaRepository<RecentPosts, Integer> {
    List<RecentPosts> findAll();
}
