package com.example.study.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.example.study.model.StudyModel;

@Mapper
public interface StudyMapper {
    public int insert(StudyModel studyModel);
}
