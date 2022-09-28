package com.example.studentmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="course")
public class Course 
{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String coursename;
	private int duration;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Course(Long id, String coursename, int duration) {
		super();
		this.id = id;
		this.coursename = coursename;
		this.duration = duration;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", coursename=" + coursename + ", duration=" + duration + "]";
	}
	
	
	
}
