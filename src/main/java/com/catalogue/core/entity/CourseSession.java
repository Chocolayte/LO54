package com.catalogue.core.entity;

import java.sql.Date;

public class CourseSession {

    private int id;
    private Date startDate;
    private Date endDate;
    private String courseCode;
    private int locationId;

    public CourseSession() {

    }

    /**
     * Récupère le id
     * @return id
     */
    public int getId() {
        return this.id;
    }

    /**
     * Met en place le id
     * @param id le id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Récupère le startDate
     * @return startDate
     */
    public Date getStartDate() {
        return this.startDate;
    }

    /**
     * Met en place le startDate
     * @param date le startDate
     */
    public void setStartDate(Date date) {
        this.startDate = date;
    }

    /**
     * Récupère le endDate
     * @return endDate
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Met en place le endDate
     * @param date le endDate
     */
    public void setEndDate(Date date) {
        this.endDate = date;
    }

    /**
     * Récupère le courseCode
     * @return courseCode
     */
    public String getCourseCode() {
        return this.courseCode;
    }

    /**
     * Met en place le courseCode
     * @param code le courseCode
     */
    public void setCourseCode(String code) {
        this.courseCode = code;
    }

    /**
     * Récupère le locationId
     * @return locationId
     */
    public int getLocationId() {
        return this.locationId;
    }

    /**
     * Met en place le locationId
     * @param id le locationId
     */
    public void setLocationId(int id) {
        this.locationId = id;
    }
}
