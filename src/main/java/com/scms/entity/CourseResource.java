package com.scms.entity;

import java.util.Date;

public class CourseResource {
    private Integer courseResourceId;

    private Integer grantCourseId;

    private String name;

    private Date uploadTime;

    private Integer size;

    private String path;

    private String desc;

    public Integer getCourseResourceId() {
        return courseResourceId;
    }

    public void setCourseResourceId(Integer courseResourceId) {
        this.courseResourceId = courseResourceId;
    }

    public Integer getGrantCourseId() {
        return grantCourseId;
    }

    public void setGrantCourseId(Integer grantCourseId) {
        this.grantCourseId = grantCourseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}