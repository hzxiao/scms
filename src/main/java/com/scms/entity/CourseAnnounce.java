package com.scms.entity;

import java.util.Date;

public class CourseAnnounce {
    private Integer announceId;

    private Integer grantCourseId;

    private Date announceTime;

    private String content;

    public Integer getAnnounceId() {
        return announceId;
    }

    public void setAnnounceId(Integer announceId) {
        this.announceId = announceId;
    }

    public Integer getGrantCourseId() {
        return grantCourseId;
    }

    public void setGrantCourseId(Integer grantCourseId) {
        this.grantCourseId = grantCourseId;
    }

    public Date getAnnounceTime() {
        return announceTime;
    }

    public void setAnnounceTime(Date announceTime) {
        this.announceTime = announceTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}