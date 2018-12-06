package cn.tcbd.service;

import cn.tcbd.dao.CourseMapper;
import cn.tcbd.entity.Course;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public PageInfo<Course> getCourse(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<Course>(courseMapper.getCourse());
    }
}
