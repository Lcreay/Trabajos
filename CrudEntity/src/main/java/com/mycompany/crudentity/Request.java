/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudentity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author User
 */
@Entity
@Table(name = "request")
@NamedQueries({
    @NamedQuery(name = "Request.findAll", query = "SELECT r FROM Request r"),
    @NamedQuery(name = "Request.findById", query = "SELECT r FROM Request r WHERE r.id = :id"),
    @NamedQuery(name = "Request.findByDateRequest", query = "SELECT r FROM Request r WHERE r.dateRequest = :dateRequest"),
    @NamedQuery(name = "Request.findByDateStart", query = "SELECT r FROM Request r WHERE r.dateStart = :dateStart"),
    @NamedQuery(name = "Request.findByDateFinal", query = "SELECT r FROM Request r WHERE r.dateFinal = :dateFinal")})
public class Request implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "date_request")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRequest;
    @Basic(optional = false)
    @Lob
    @Column(name = "comment")
    private String comment;
    @Column(name = "date_start")
    @Temporal(TemporalType.DATE)
    private Date dateStart;
    @Basic(optional = false)
    @Column(name = "date_final")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFinal;
    @JoinColumn(name = "id_employees", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Employees idEmployees;
    @JoinColumn(name = "id_tipe_request", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TypeRequest idTipeRequest;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRequest", fetch = FetchType.LAZY)
    private List<ApplicationLog> applicationLogList;

    public Request() {
    }

    public Request(Integer id) {
        this.id = id;
    }

    public Request(Integer id, Date dateRequest, String comment, Date dateFinal) {
        this.id = id;
        this.dateRequest = dateRequest;
        this.comment = comment;
        this.dateFinal = dateFinal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateRequest() {
        return dateRequest;
    }

    public void setDateRequest(Date dateRequest) {
        this.dateRequest = dateRequest;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateFinal() {
        return dateFinal;
    }

    public void setDateFinal(Date dateFinal) {
        this.dateFinal = dateFinal;
    }

    public Employees getIdEmployees() {
        return idEmployees;
    }

    public void setIdEmployees(Employees idEmployees) {
        this.idEmployees = idEmployees;
    }

    public TypeRequest getIdTipeRequest() {
        return idTipeRequest;
    }

    public void setIdTipeRequest(TypeRequest idTipeRequest) {
        this.idTipeRequest = idTipeRequest;
    }

    public List<ApplicationLog> getApplicationLogList() {
        return applicationLogList;
    }

    public void setApplicationLogList(List<ApplicationLog> applicationLogList) {
        this.applicationLogList = applicationLogList;
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
        if (!(object instanceof Request)) {
            return false;
        }
        Request other = (Request) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.crudentity.Request[ id=" + id + " ]";
    }
    
}
