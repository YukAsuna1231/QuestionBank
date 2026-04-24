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
    private String tags;
    private String answer;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private Long typeId;
}
