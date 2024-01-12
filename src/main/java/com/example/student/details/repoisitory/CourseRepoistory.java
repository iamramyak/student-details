package com.example.student.details.repoisitory;

import com.example.student.details.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepoistory extends JpaRepository<Course, Long> {
}
