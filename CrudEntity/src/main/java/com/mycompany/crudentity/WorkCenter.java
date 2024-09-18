/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudentity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "work_center")
@NamedQueries({
    @NamedQuery(name = "WorkCenter.findAll", query = "SELECT w FROM WorkCenter w"),
    @NamedQuery(name = "WorkCenter.findById", query = "SELECT w FROM WorkCenter w WHERE w.id = :id"),
    @NamedQuery(name = "WorkCenter.findByNameCity", query = "SELECT w FROM WorkCenter w WHERE w.nameCity = :nameCity")})
public class WorkCenter implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name_city")
    private String nameCity;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idWorkcenter", fetch = FetchType.LAZY)
    private List<Employees> employeesList;

    public WorkCenter() {
    }

    public WorkCenter(Integer id) {
        this.id = id;
    }

    public WorkCenter(Integer id, String nameCity) {
        this.id = id;
        this.nameCity = nameCity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public List<Employees> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(List<Employees> employeesList) {
        this.employeesList = employeesList;
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
        if (!(object instanceof WorkCenter)) {
            return false;
        }
        WorkCenter other = (WorkCenter) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.crudentity.WorkCenter[ id=" + id + " ]";
    }
    
}
