package com.example.back.service;

import com.example.back.dao.CommonQuestionsDao;
import com.example.back.pojo.CommonQuestions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonQuestionsService {
    @Autowired
    CommonQuestionsDao commonQuestionsDao;
    public List<CommonQuestions> list() {
        return commonQuestionsDao.findAll();
    }
}
