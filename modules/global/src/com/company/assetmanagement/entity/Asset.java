package com.company.assetmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "ASSETMANAGEMENT_ASSET")
@Entity(name = "assetmanagement$Asset")
public class Asset extends StandardEntity {
    private static final long serialVersionUID = -8033035030421179300L;

    @Column(name = "NAME", nullable = false, length = 55)
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}