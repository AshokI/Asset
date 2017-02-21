package com.company.assetmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "ASSETMANAGEMENT_REQUEST")
@Entity(name = "assetmanagement$Request")
public class Request extends StandardEntity {
    private static final long serialVersionUID = 4363375337698517819L;

}