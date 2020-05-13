package com.techreturners.apiservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class CourseDayController {

    @Autowired
    protected CourseDayService courseDayService = null;
    Logger logger = LoggerFactory.getLogger(CourseDayController.class);

    @GetMapping("/course-day")
	public CourseDay getCourseDay(@RequestParam(defaultValue = "1") String day) {
      logger.info("getCourseDay() - START");
      CourseDay courseDay = courseDayService.getDay(Integer.parseInt(day));
      logger.info("getCourseDay() - END");
      return courseDay;
	}
}
