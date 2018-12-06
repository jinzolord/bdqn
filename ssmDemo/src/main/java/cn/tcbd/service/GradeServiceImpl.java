package cn.tcbd.service;

import cn.tcbd.dao.GradeMapper;
import cn.tcbd.dao.StudentMapper;
import cn.tcbd.entity.Grade;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeServiceImpl implements GradeService {

    @Autowired
    private GradeMapper gradeMapper;
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public PageInfo<Grade> getGrade(int pageNum, int pageSize) {
//        PageInfo<Grade> pageInfo =
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<Grade>(gradeMapper.getGrade());
    }

    @Override
    public Grade getDetail(int id) {
        return gradeMapper.getDetail(id);
    }

    @Override
    public int deleteGrade(int gradeId) {
        int result = studentMapper.deleteStudentByGradeId(gradeId);
        if (result > 0) {
            System.out.println("12345");
            throw new RuntimeException();
        }
        return gradeMapper.deleteGradeById(gradeId);
    }
}
