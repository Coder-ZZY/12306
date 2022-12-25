package com.example.back.service;

import com.example.back.dao.RecentPostsDao;
import com.example.back.pojo.RecentPosts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RecentPostsService {
    @Autowired
    RecentPostsDao recentPostsDao;
    public List<RecentPosts> list() {
        return recentPostsDao.findAll();
    }

    public List<Map<String, String> > search(String wd) {
        List<RecentPosts> l = recentPostsDao.findByContentContaining(wd);
        List<Map<String, String> > all = new ArrayList<>();
        for(RecentPosts r:l) {
            Map<String, String> m = new HashMap<>();
            m.put("value", r.getContent());
            m.put("url", r.getUrl());
            all.add(m);
        }
        return all;
    }
}
