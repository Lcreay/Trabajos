/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudentity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author User
 */
@Entity
@Table(name = "application_log")
@NamedQueries({
    @NamedQuery(name = "ApplicationLog.findAll", query = "SELECT a FROM ApplicationLog a"),
    @NamedQuery(name = "ApplicationLog.findById", query = "SELECT a FROM ApplicationLog a WHERE a.id = :id"),
    @NamedQuery(name = "ApplicationLog.findByDateCreation", query = "SELECT a FROM ApplicationLog a WHERE a.dateCreation = :dateCreation"),
    @NamedQuery(name = "ApplicationLog.findByDateAprov", query = "SELECT a FROM ApplicationLog a WHERE a.dateAprov = :dateAprov"),
    @NamedQuery(name = "ApplicationLog.findByIdStatus", query = "SELECT a FROM ApplicationLog a WHERE a.idStatus = :idStatus"),
    @NamedQuery(name = "ApplicationLog.findByLevelAprov", query = "SELECT a FROM ApplicationLog a WHERE a.levelAprov = :levelAprov")})
public class ApplicationLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "date_creation")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    @Column(name = "date_aprov")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAprov;
    @Basic(optional = false)
    @Column(name = "id_status")
    private int idStatus;
    @Column(name = "level_aprov")
    private Integer levelAprov;
    @JoinColumn(name = "id_request", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Request idRequest;

    public ApplicationLog() {
    }

    public ApplicationLog(Integer id) {
        this.id = id;
    }

    public ApplicationLog(Integer id, Date dateCreation, int idStatus) {
        this.id = id;
        this.dateCreation = dateCreation;
        this.idStatus = idStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateAprov() {
        return dateAprov;
    }

    public void setDateAprov(Date dateAprov) {
        this.dateAprov = dateAprov;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public Integer getLevelAprov() {
        return levelAprov;
    }

    public void setLevelAprov(Integer levelAprov) {
        this.levelAprov = levelAprov;
    }

    public Request getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(Request idRequest) {
        this.idRequest = idRequest;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ApplicationLog)) {
            return false;
        }
        ApplicationLog other = (ApplicationLog) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.crudentity.ApplicationLog[ id=" + id + " ]";
    }
    
}