package cn.tcbd.dao;

import cn.tcbd.entity.Grade;

import java.util.List;

public interface GradeMapper {

    List<Grade> getGrade();

    Grade getDetail(int id);

    int deleteGradeById(int id);
}
