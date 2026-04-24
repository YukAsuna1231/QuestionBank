package com.antiquemall.questionbank.service;

import com.antiquemall.questionbank.dto.QuestionAddRequest;
import com.antiquemall.questionbank.entity.Question;
import java.util.List;

public interface QuestionService{
    List<Question> getQuestionList();
    Question getQuestionById(Long id);
    boolean addQuestion(QuestionAddRequest question);
}
