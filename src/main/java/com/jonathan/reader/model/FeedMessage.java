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
public class FeedMessage implements Serializable{
    
    private Long id;
    private String guid;
    private String title;
    private String description;
    private String link;
    private Date pubDate;
    private String category;
    private String font;
    private String author;
    private Date readDateTime;
    private Long feedId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getReadDateTime() {
        return readDateTime;
    }

    public void setReadDateTime(Date readDateTime) {
        this.readDateTime = readDateTime;
    }

    public Long getFeedId() {
        return feedId;
    }

    public void setFeedId(Long feedId) {
        this.feedId = feedId;
    }

    @Override
    public String toString() {
        return "FeedMessage{" + "title=" + title + ", link=" + link + ", feedId=" + feedId + '}';
    }
        
}
