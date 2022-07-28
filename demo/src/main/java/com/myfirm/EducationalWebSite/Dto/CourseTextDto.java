package com.myfirm.EducationalWebSite.Dto;

import com.sun.istack.NotNull;

import javax.persistence.Lob;

public class CourseTextDto {
    private int id;
    @Lob
    @NotNull
    private String newBody;

    public CourseTextDto() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNewBody() {
        return newBody;
    }

    public void setNewBody(String newBody) {
        this.newBody = newBody;
    }
}
