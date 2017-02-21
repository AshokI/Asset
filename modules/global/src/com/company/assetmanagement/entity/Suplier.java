package com.company.assetmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import java.util.Set;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Table(name = "ASSETMANAGEMENT_SUPLIER")
@Entity(name = "assetmanagement$Suplier")
public class Suplier extends StandardEntity {
    private static final long serialVersionUID = -1712064542446168592L;

    @Column(name = "SUPLIERNAME", nullable = false, length = 55)
    protected String supliername;

    @Column(name = "STATE", nullable = false, length = 55)
    protected String state;

    @Column(name = "PLACE", length = 55)
    protected String place;

    @JoinTable(name = "ASSETMANAGEMENT_ADD_ASSET_SUPLIER_LINK",
        joinColumns = @JoinColumn(name = "SUPLIER_ID"),
        inverseJoinColumns = @JoinColumn(name = "ADD_ASSET_ID"))
    @ManyToMany
    protected Set<AddAsset> addAssets;

    public void setSupliername(String supliername) {
        this.supliername = supliername;
    }

    public String getSupliername() {
        return supliername;
    }


    public void setAddAssets(Set<AddAsset> addAssets) {
        this.addAssets = addAssets;
    }

    public Set<AddAsset> getAddAssets() {
        return addAssets;
    }


    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }


}