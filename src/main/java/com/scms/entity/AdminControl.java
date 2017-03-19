package com.scms.entity;

public class AdminControl {
    private String ifCommentCourse;

    private String ifSelectCourse;

    private String ifRecordResults;

    public String getIfCommentCourse() {
        return ifCommentCourse;
    }

    public void setIfCommentCourse(String ifCommentCourse) {
        this.ifCommentCourse = ifCommentCourse == null ? null : ifCommentCourse.trim();
    }

    public String getIfSelectCourse() {
        return ifSelectCourse;
    }

    public void setIfSelectCourse(String ifSelectCourse) {
        this.ifSelectCourse = ifSelectCourse == null ? null : ifSelectCourse.trim();
    }

    public String getIfRecordResults() {
        return ifRecordResults;
    }

    public void setIfRecordResults(String ifRecordResults) {
        this.ifRecordResults = ifRecordResults == null ? null : ifRecordResults.trim();
    }
}