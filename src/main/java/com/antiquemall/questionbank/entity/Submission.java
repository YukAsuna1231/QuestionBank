package com.antiquemall.questionbank.entity;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Submission {
    private Long id;
    private Long userId;
    private Long questionId;
    private String codeContent;
    private String status;
    private LocalDateTime createTime;
}
