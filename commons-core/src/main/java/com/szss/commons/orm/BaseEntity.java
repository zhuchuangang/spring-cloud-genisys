package com.szss.commons.orm;

import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by zcg on 15/11/24.
 */
@MappedSuperclass
public class BaseEntity implements Serializable {
    private Boolean deleted = Boolean.FALSE;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated = new Date();
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdated;

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
