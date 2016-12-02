package com.catalogue.core.entity;

public class Course {

    private String code;
    private String title;

    public Course() {

    }

    /**
     * Récupère le code
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Met en place le code
     * @param code le code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Récupère le title
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Met en place le title
     * @param title le title
     */
    public void setTitle(String title) {
        this.title = title;
    }
}
