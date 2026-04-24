package com.antiquemall.questionbank.service.impl;

import com.antiquemall.questionbank.entity.Question;
import com.antiquemall.questionbank.mapper.QuestionMapper;
import com.antiquemall.questionbank.service.QuestionService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QuestionServiceImpl  implements QuestionService {
    @Resource
    private QuestionMapper questionMapper;

    @Override
    public List<Question> getQuestionList() {
        return questionMapper.selectList(null);
    }
    @Override
    public  Question getQuestionById(Long id) {
        return questionMapper.selectById(id);
    }
}
