package com.example.study.controller;

import com.example.study.service.StudyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/study")
public class StudyControll {

    
    @Autowired
    StudyService studyService;

    @RequestMapping( value = "/user_create", method = RequestMethod.GET, produces = "application/json")
    public void userCreate(){
    // public UserListResponse userCreate(UserListRequest listRequest) throws Exception {

        studyService.userCreate();
    }


}
