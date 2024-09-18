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
@Table(name = "holydays")
@NamedQueries({
    @NamedQuery(name = "Holydays.findAll", query = "SELECT h FROM Holydays h"),
    @NamedQuery(name = "Holydays.findById", query = "SELECT h FROM Holydays h WHERE h.id = :id"),
    @NamedQuery(name = "Holydays.findByStartDay", query = "SELECT h FROM Holydays h WHERE h.startDay = :startDay"),
    @NamedQuery(name = "Holydays.findByFinalDay", query = "SELECT h FROM Holydays h WHERE h.finalDay = :finalDay"),
    @NamedQuery(name = "Holydays.findByTotalDays", query = "SELECT h FROM Holydays h WHERE h.totalDays = :totalDays")})
public class Holydays implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "start_day")
    @Temporal(TemporalType.DATE)
    private Date startDay;
    @Basic(optional = false)
    @Column(name = "final_day")
    @Temporal(TemporalType.DATE)
    private Date finalDay;
    @Column(name = "total_days")
    private Integer totalDays;
    @JoinColumn(name = "id_employees", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Employees idEmployees;

    public Holydays() {
    }

    public Holydays(Integer id) {
        this.id = id;
    }

    public Holydays(Integer id, Date startDay, Date finalDay) {
        this.id = id;
        this.startDay = startDay;
        this.finalDay = finalDay;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public Date getFinalDay() {
        return finalDay;
    }

    public void setFinalDay(Date finalDay) {
        this.finalDay = finalDay;
    }

    public Integer getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(Integer totalDays) {
        this.totalDays = totalDays;
    }

    public Employees getIdEmployees() {
        return idEmployees;
    }

    public void setIdEmployees(Employees idEmployees) {
        this.idEmployees = idEmployees;
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
        if (!(object instanceof Holydays)) {
            return false;
        }
        Holydays other = (Holydays) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.crudentity.Holydays[ id=" + id + " ]";
    }
    
}
