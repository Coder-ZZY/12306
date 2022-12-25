package com.example.back.service;

import com.example.back.dao.CommonQuestionsDao;
import com.example.back.pojo.CommonQuestions;
import com.example.back.pojo.RecentPosts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CommonQuestionsService {
    @Autowired
    CommonQuestionsDao commonQuestionsDao;
    public List<CommonQuestions> list() {
        return commonQuestionsDao.findAll();
    }

    public List<Map<String, String>> search(String wd) {
        List<CommonQuestions> l = commonQuestionsDao.findByContentContaining(wd);
        List<Map<String, String>> all = new ArrayList<>();
        for(CommonQuestions r:l) {
            Map<String, String> m = new HashMap<>();
            m.put("value", r.getContent());
            m.put("url", r.getUrl());
            all.add(m);
        }
        return all;
    }
}
