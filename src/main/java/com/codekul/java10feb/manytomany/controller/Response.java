package com.codekul.java10feb.manytomany.controller;

import com.codekul.java10feb.manytomany.domain.Teacher;

//DTO:data transfer object
public class Response {
    private  String message;

    private Teacher result;

    private  Integer statusCode;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Teacher getResult() {
        return result;
    }

    public void setResult(Teacher result) {
        this.result = result;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }
}
