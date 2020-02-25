package com.hero78.todo.jpa.modal;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "m_task")
public class MTask extends BaseModal {
    private String name;
    private String description;
    private MUser userId;
    private Date createdOn;
    @Column(name = "name",nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name = "description",nullable = false)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @JoinColumn(name = "user_id", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    public MUser getUserId() {
        return userId;
    }

    public void setUserId(MUser userId) {
        this.userId = userId;
    }
    @Column(name = "created_on",nullable = false)
    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}
