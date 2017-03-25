package com.scms.entity;

import java.util.List;

public class GrantCourse {
    private Integer grantCourseId;

    private Long teacherId;

    private Long courseId;

    private String takeTime;

    private String startEndWeek;

    private Integer capacity;

    private Integer margin;

    private Integer status;

    private Course course;

    private List<CourseSelection> courseSelectionList;

    private Teacher teacher;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<CourseSelection> getCourseSelectionList() {
        return courseSelectionList;
    }

    public void setCourseSelectionList(List<CourseSelection> courseSelectionList) {
        this.courseSelectionList = courseSelectionList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Integer getGrantCourseId() {
        return grantCourseId;
    }

    public void setGrantCourseId(Integer grantCourseId) {
        this.grantCourseId = grantCourseId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getTakeTime() {
        return takeTime;
    }

    public void setTakeTime(String takeTime) {
        this.takeTime = takeTime == null ? null : takeTime.trim();
    }

    public String getStartEndWeek() {
        return startEndWeek;
    }

    public void setStartEndWeek(String startEndWeek) {
        this.startEndWeek = startEndWeek == null ? null : startEndWeek.trim();
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getMargin() {
        return margin;
    }

    public void setMargin(Integer margin) {
        this.margin = margin;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}