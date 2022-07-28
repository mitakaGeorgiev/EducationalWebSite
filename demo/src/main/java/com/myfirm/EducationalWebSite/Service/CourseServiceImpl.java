package com.myfirm.EducationalWebSite.Service;

import com.myfirm.EducationalWebSite.Dto.CourseTextDto;
import com.myfirm.EducationalWebSite.Repository.CourseRepository;
import com.myfirm.EducationalWebSite.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> findAll() {
        return this.courseRepository.findAll();
    }

    @Override
    public void add(Course course) {
        courseRepository.save(course);
    }

    @Override
    public void update(CourseTextDto ob) {
        try {
            Course newCourse = courseRepository.findById(ob.getId());
            newCourse.setBody(ob.getNewBody());
            courseRepository.save(newCourse);
        } catch (NullPointerException e) {
            System.out.println("No course with this id exists");
        }
    }

    @Override
    public void DeleteById(int id) {
        try {
            this.courseRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            System.out.println("No course with this id exists");
        }
    }
}
