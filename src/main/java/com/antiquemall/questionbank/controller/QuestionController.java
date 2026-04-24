package com.antiquemall.questionbank.controller;


import com.antiquemall.questionbank.common.BaseResponse;
import com.antiquemall.questionbank.common.ResultUtils;
import com.antiquemall.questionbank.dto.QuestionAddRequest;
import com.antiquemall.questionbank.entity.Question;
import com.antiquemall.questionbank.service.QuestionService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Resource
    private QuestionService questionService;

    @RequestMapping("/list")
    public BaseResponse <List<Question>> getQuestionList() {
        List<Question> list = questionService.getQuestionList();
        return ResultUtils.success(list);
    }

    @GetMapping("/{id}")
    public BaseResponse <Question> getQuestionById(@PathVariable Long id) {
        Question question = questionService.getQuestionById(id);
        return ResultUtils.success(question);
    }

    @PostMapping("/add")
    public BaseResponse <Boolean> addQuestion(@RequestBody QuestionAddRequest request) {
        boolean result = questionService.addQuestion(request);
        return ResultUtils.success(result);
    }
}
