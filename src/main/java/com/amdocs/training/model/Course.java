package com.amdocs.training.model;

public class Course {
	private int course_id;
	private String c_name;
	private double c_fees;
	private String c_desp;
	private String c_resource;
	public Course(int course_id, String c_name, double c_fees, String c_desp, String c_resource) {
		super();
		this.course_id = course_id;
		this.c_name = c_name;
		this.c_fees = c_fees;
		this.c_desp = c_desp;
		this.c_resource = c_resource;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public double getC_fees() {
		return c_fees;
	}
	public void setC_fees(double c_fees) {
		this.c_fees = c_fees;
	}
	public String getC_desp() {
		return c_desp;
	}
	public void setC_desp(String c_desp) {
		this.c_desp = c_desp;
	}
	public String getC_resource() {
		return c_resource;
	}
	public void setC_resource(String c_resource) {
		this.c_resource = c_resource;
	}
}
