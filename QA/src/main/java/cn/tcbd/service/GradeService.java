package cn.tcbd.service;

import cn.tcbd.entity.Grade;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

@Service
public interface GradeService {

    PageInfo<Grade> getGrade(int pageNum, int pageSize);

    Grade getDetail(int id);

    int deleteGrade(int gradeId);
}
