package com.example.back.service;

import com.example.back.dao.RecentPostsDao;
import com.example.back.pojo.RecentPosts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecentPostsService {
    @Autowired
    RecentPostsDao recentPostsDao;
    public List<RecentPosts> list() {
        return recentPostsDao.findAll();
    }
}
