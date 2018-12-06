package cn.tcbd.service;

import cn.tcbd.dao.StudentMapper;
import cn.tcbd.entity.Student;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public PageInfo<Student> getStudent(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<Student>(studentMapper.getStudent());
    }

    @Override
    public PageInfo<Student> getStudentByGradeId(int gradeId, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<Student>(studentMapper.getStudentByGradeId(gradeId));
    }
}
