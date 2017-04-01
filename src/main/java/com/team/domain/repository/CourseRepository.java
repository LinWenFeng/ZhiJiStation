package com.team.domain.repository;

import com.team.domain.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Created by LWF on 2017/3/29.
 */
public interface CourseRepository extends JpaRepository<Course,String> {
}
