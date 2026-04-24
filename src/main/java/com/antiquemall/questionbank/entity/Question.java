package com.antiquemall.questionbank.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@TableName("question")
public class Question {
    private Long id;
    private String title;
    private String content;
    private Long typeId;
    private String tags;
    private String difficulty;
    private String answer;
    private String optionsJson;
    private String inputExample;
    private String outputExample;
    private String codeTemplate;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
