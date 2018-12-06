package cn.tcbd.service;

import cn.tcbd.dao.StudentMapper;
import cn.tcbd.entity.Student;
import com.github.pagehelper.PageInfo;

public interface StudentService {

    PageInfo<Student> getStudent(int pageNum, int pageSize);

    PageInfo<Student> getStudentByGradeId(int gradeId, int pageNum, int pageSize);

}
