package com.antiquemall.questionbank.dto;

import lombok.Data;

@Data
public class QuestionAddRequest {
    private String title;
    private String content;
    private String tags;
    private String answer;
    private Long typeId;
}
