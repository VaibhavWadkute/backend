package com.amdocs.training.dao;

import com.amdocs.training.model.Course;

public interface CourseDAO {
	boolean saveCourse(Course course);
	boolean updateCourse(Course course);
}
