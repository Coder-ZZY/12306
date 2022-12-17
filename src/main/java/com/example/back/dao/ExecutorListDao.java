package com.example.back.dao;

import com.example.back.pojo.CommonQuestions;
import com.example.back.pojo.ExecutorList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExecutorListDao extends JpaRepository<ExecutorList, Integer> {
    List<ExecutorList> findAll();
}
