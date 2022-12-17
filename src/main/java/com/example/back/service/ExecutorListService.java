package com.example.back.service;

import com.example.back.dao.ExecutorListDao;
import com.example.back.pojo.ExecutorList;
import com.example.back.result.Result;
import com.example.back.result.ResultFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExecutorListService {
    @Autowired
    ExecutorListDao executorListDao;
    public List<ExecutorList> list() {
        return executorListDao.findAll();
    }
}
