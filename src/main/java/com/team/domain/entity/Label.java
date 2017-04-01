package com.team.domain.entity;

import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by JC on 2017/3/13.
 */
@Entity
public class Label extends BaseEntity{


    private String  label;

    private String add_user;

    private Date add_time;

    private String update_user;

    private Date update_time;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getAdd_user() {
        return add_user;
    }

    public void setAdd_user(String add_user) {
        this.add_user = add_user;
    }

    public Date getAdd_time() {
        return add_time;
    }

    public void setAdd_time(Date add_time) {
        this.add_time = add_time;
    }

    public String getUpdate_user() {
        return update_user;
    }

    public void setUpdate_user(String update_user) {
        this.update_user = update_user;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}
