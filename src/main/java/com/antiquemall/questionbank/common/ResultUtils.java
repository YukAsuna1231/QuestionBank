package com.antiquemall.questionbank.common;

public class ResultUtils {
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

    public static BaseResponse<?> error(String message) {
        return new BaseResponse<>(-1, null, message);
    }
}
