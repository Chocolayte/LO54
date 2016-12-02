package com.catalogue.core.entity;

public class Location {

    private int id;
    private String city;

    public Location() {

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
     * Récupère le city
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Met en place la city
     * @param city la city
     */
    public void setCity(String city) {
        this.city = city;
    }
}
