package com.example.back.dao;

import com.example.back.pojo.CommonQuestions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommonQuestionsDao extends JpaRepository<CommonQuestions, Integer> {
    List<CommonQuestions> findAll();
}
