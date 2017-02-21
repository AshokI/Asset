package com.company.assetmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Table(name = "ASSETMANAGEMENT_SELECTASSET")
@Entity(name = "assetmanagement$Selectasset")
public class Selectasset extends StandardEntity {
    private static final long serialVersionUID = -2034764393380642289L;

    @Column(name = "REQUESTED")
    protected String requested;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NAME_ID")
    protected AddAsset name;

    @Column(name = "BRANCH")
    protected String branch;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ASSETID_ID")
    protected AddAsset assetid;

    public void setRequested(String requested) {
        this.requested = requested;
    }

    public String getRequested() {
        return requested;
    }

    public void setName(AddAsset name) {
        this.name = name;
    }

    public AddAsset getName() {
        return name;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setAssetid(AddAsset assetid) {
        this.assetid = assetid;
    }

    public AddAsset getAssetid() {
        return assetid;
    }


}