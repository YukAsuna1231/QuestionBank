package com.antiquemall.questionbank.controller;


import com.antiquemall.questionbank.common.BaseResponse;
import com.antiquemall.questionbank.common.ResultUtils;
import com.antiquemall.questionbank.entity.Question;
import com.antiquemall.questionbank.service.QuestionService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
