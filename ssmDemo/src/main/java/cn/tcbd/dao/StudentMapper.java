package cn.tcbd.dao;

import cn.tcbd.entity.Student;

import java.util.List;

public interface StudentMapper {

    List<Student> getStudent();

    List<Student> getStudentByGradeId(int gradeId);

    int deleteStudentByGradeId(int gradeId);
}
