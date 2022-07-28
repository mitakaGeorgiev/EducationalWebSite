package com.myfirm.EducationalWebSite.Repository;

import com.myfirm.EducationalWebSite.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
    Course findById(int id);

}
