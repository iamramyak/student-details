package com.example.student.details.service;

import com.example.student.details.entity.Course;
import com.example.student.details.repoisitory.CourseRepoistory;
import com.example.student.details.response.CourseResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;


@Service
public class CourseService {
    private CourseRepoistory courseRepoistory;
    @Autowired
     private ModelMapper mapper;

     public CourseResponse getCourseByID(int id){
         Optional<Course> course= courseRepoistory.findById((long) id);
         CourseResponse courseResponse=  mapper.map(course, CourseResponse.class);
                 return courseResponse;
     }

}
