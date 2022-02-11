package com.example.study.service;

import com.example.study.mapper.StudyMapper;
import com.example.study.model.StudyModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudyService {
    
    @Autowired
    private StudyMapper studyMapper;

    @Transactional
    public void userCreate(){

        StudyModel userdata = new StudyModel();
        userdata.setAge(18);
        userdata.setGender("M");
        userdata.setUserid("tester1");
       
        // System.out.println(userdata);

        studyMapper.insert(userdata);

    }

}
