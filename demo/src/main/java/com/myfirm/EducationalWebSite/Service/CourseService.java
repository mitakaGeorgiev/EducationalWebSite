package com.myfirm.EducationalWebSite.Service;

import com.myfirm.EducationalWebSite.Dto.CourseTextDto;
import com.myfirm.EducationalWebSite.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> findAll();

    void add(Course course);

    void update(CourseTextDto ob);

    void DeleteById(int id);
}
