package com.catalogue.core.entity;

public class Client {

    private int id;
    private String lastname;
    private String firstname;
    private String address;
    private String phone;
    private String email;
    private int courseSessionId;

    public Client() {

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
     * Récupère le lastname
     * @return lastname
     */
    public String getLastname() {
        return this.lastname;
    }

    /**
     * Met en place le lastname
     * @param name le lastname
     */
    public void setLastname(String name) {
        this.lastname = name;
    }

    /**
     * Récupère le firstname
     * @return firstname
     */
    public String getFirstname() {
        return this.firstname;
    }

    /**
     * Met en place le firstname
     * @param name le firstname
     */
    public void setFirstName(String name) {
        this.firstname = name;
    }

    /**
     * Récupère le address
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Met en place le address
     * @param address le address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Récupère le phone
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Met en place le phone
     * @param phone le phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Récupère le email
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Met en place le email
     * @param email le email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Récupère le course_session_id
     * @return course_session_id
     */
    public int getCourseSessionId() {
        return this.courseSessionId;
    }

    /**
     * Met en place le course_session_id
     * @param id le course_session_id
     */
    public void setCourseSessionId(int id) {
        this.courseSessionId = id;
    }
}