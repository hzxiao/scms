package com.scms.entity;

public class CourseSelection {
    private Long studentId;

    private Integer grantCourseId;

    private Short grade;

    private Short ordinaryGrade;

    private Short examGrade;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Integer getGrantCourseId() {
        return grantCourseId;
    }

    public void setGrantCourseId(Integer grantCourseId) {
        this.grantCourseId = grantCourseId;
    }

    public Short getGrade() {
        return grade;
    }

    public void setGrade(Short grade) {
        this.grade = grade;
    }

    public Short getOrdinaryGrade() {
        return ordinaryGrade;
    }

    public void setOrdinaryGrade(Short ordinaryGrade) {
        this.ordinaryGrade = ordinaryGrade;
    }

    public Short getExamGrade() {
        return examGrade;
    }

    public void setExamGrade(Short examGrade) {
        this.examGrade = examGrade;
    }
}