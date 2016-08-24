/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jonathan.reader.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author jonathan
 */
public class Feed implements Serializable{
    
    private Long id;
    private String title;
    private String description;
    private String url;
    private Date createdDate;
    private Long userId;
    private Boolean active;
    private Boolean automaticUpdate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean isAutomaticUpdate() {
        return automaticUpdate;
    }

    public void setAutomaticUpdate(Boolean automaticUpdate) {
        this.automaticUpdate = automaticUpdate;
    }

    @Override
    public String toString() {
        return "Feed{" + "title=" + title + ", url=" + url + ", active=" + active + '}';
    }
}
