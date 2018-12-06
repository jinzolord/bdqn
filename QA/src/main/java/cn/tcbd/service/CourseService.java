package cn.tcbd.service;

import cn.tcbd.entity.Course;
import com.github.pagehelper.PageInfo;

public interface CourseService {

    PageInfo<Course> getCourse(int pageNum, int pageSize);

}
