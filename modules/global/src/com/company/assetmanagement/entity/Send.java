package com.company.assetmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "ASSETMANAGEMENT_SEND")
@Entity(name = "assetmanagement$Send")
public class Send extends StandardEntity {
    private static final long serialVersionUID = -2429974634153830778L;

    @Column(name = "NUMBER_")
    protected Integer number;

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }


}