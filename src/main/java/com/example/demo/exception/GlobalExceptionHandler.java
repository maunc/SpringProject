package com.example.demo.exception;

import com.example.demo.base.BaseResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(SQLException.class)
    public BaseResponse<String> handleSQLException(SQLException e) {
        if (e instanceof SQLIntegrityConstraintViolationException) {
            return BaseResponse.error("该数据有关联数据，操作失败！");
        }
        return BaseResponse.error("数据库异常操作失败！");
    }
}
