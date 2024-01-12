package com.example.student.details.controller;

import com.example.student.details.response.CourseResponse;
import com.example.student.details.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping
    public ResponseEntity<CourseResponse> getCoursedetails(@PathVariable("id") int id){
        CourseResponse course= courseService.getCourseByID(id);
        return ResponseEntity.status(HttpStatus.OK).body(course);
    }
}
