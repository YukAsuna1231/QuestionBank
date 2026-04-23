package com.antiquemall.questionbank.entity;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Question {
    private Long id;
    private String title;
    private String content;
    private String tags;
    private String answer;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private Long typeId;
}
