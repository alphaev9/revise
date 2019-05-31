package com.revise.domain.model;

import javax.validation.constraints.Future;
import javax.validation.constraints.Size;
import java.sql.Date;
public class Book {
    private Integer id;
    @Size(max = 20)
    private String title;
    @Size(max = 10)
    private String author;

    @Size(max = 20)
    private String press;
    @Future
    private Date pubDate;



    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }
    public String getTitle() {
        return title;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }




    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }
}
