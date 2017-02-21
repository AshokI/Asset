package com.company.assetmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;
import java.util.Set;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %s %s %s %s %s %s %s %s|name,company,cost,modelname,name,purchasedate,serialno,status,suplier")
@Table(name = "ASSETMANAGEMENT_ADD_ASSET")
@Entity(name = "assetmanagement$AddAsset")
public class AddAsset extends StandardEntity {
    private static final long serialVersionUID = 6734203038649054754L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NAME_ID")
    protected Asset name;

    @Column(name = "ASSETID", nullable = false, unique = true)
    protected Integer assetid;

    @Column(name = "COMPANY", nullable = false, length = 55)
    protected String company;

    @Column(name = "MODELNAME", nullable = false, length = 55)
    protected String modelname;

    @Column(name = "SERIALNO")
    protected Integer serialno;

    @Column(name = "STATUS", nullable = false)
    protected Integer status;

    @Column(name = "COST")
    protected Integer cost;

    @Temporal(TemporalType.DATE)
    @Column(name = "PURCHASEDATE")
    protected Date purchasedate;

    @JoinTable(name = "ASSETMANAGEMENT_ADD_ASSET_SUPLIER_LINK",
        joinColumns = @JoinColumn(name = "ADD_ASSET_ID"),
        inverseJoinColumns = @JoinColumn(name = "SUPLIER_ID"))
    @ManyToMany
    protected Set<Suplier> suplier;

    public Asset getName() {
        return name;
    }

    public void setName(Asset name) {
        this.name = name;
    }



    public Set<Suplier> getSuplier() {
        return suplier;
    }

    public void setSuplier(Set<Suplier> suplier) {
        this.suplier = suplier;
    }



    public Status getStatus() {
        return status == null ? null : Status.fromId(status);
    }

    public void setStatus(Status status) {
        this.status = status == null ? null : status.getId();
    }


    public void setAssetid(Integer assetid) {
        this.assetid = assetid;
    }

    public Integer getAssetid() {
        return assetid;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public String getModelname() {
        return modelname;
    }

    public void setSerialno(Integer serialno) {
        this.serialno = serialno;
    }

    public Integer getSerialno() {
        return serialno;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getCost() {
        return cost;
    }

    public void setPurchasedate(Date purchasedate) {
        this.purchasedate = purchasedate;
    }

    public Date getPurchasedate() {
        return purchasedate;
    }


}