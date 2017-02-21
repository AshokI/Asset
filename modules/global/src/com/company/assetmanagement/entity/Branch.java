package com.company.assetmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "ASSETMANAGEMENT_BRANCH")
@Entity(name = "assetmanagement$Branch")
public class Branch extends StandardEntity {
    private static final long serialVersionUID = 7706229814099027831L;

    @Column(name = "BRANCHNAME", nullable = false)
    protected String branchname;

    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }

    public String getBranchname() {
        return branchname;
    }


}