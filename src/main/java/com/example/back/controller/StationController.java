package com.example.back.controller;

import com.example.back.result.Result;
import com.example.back.result.ResultFactory;
import com.example.back.service.CommonQuestionsService;
import com.example.back.service.ExecutorListService;
import com.example.back.service.RecentPostsService;
import com.example.back.service.TicketsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StationController {
    @Autowired
    CommonQuestionsService commonQuestionsService;
    @Autowired
    ExecutorListService executorListService;
    @Autowired
    RecentPostsService recentPostsService;
    @Autowired
    TicketsService ticketsService;

    @GetMapping("/api/common_questions")
    @ResponseBody
    public Result listCommonQuestions() {
        return ResultFactory.buildSuccessResult(commonQuestionsService.list());
    }

    @GetMapping("/api/executor_list")
    @ResponseBody
    public Result listExecutorList() {
        return ResultFactory.buildSuccessResult(executorListService.list());
    }

    @GetMapping("/api/recent_posts")
    @ResponseBody
    public Result listRecentPosts() {
        return ResultFactory.buildSuccessResult(recentPostsService.list());
    }

    @GetMapping("/api/tickets")
    @ResponseBody
    public Result listTickets() {
        return ResultFactory.buildSuccessResult(ticketsService.list());
    }
}
