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
@Table(name = "employees")
@NamedQueries({
    @NamedQuery(name = "Employees.findAll", query = "SELECT e FROM Employees e"),
    @NamedQuery(name = "Employees.findById", query = "SELECT e FROM Employees e WHERE e.id = :id"),
    @NamedQuery(name = "Employees.findByNit", query = "SELECT e FROM Employees e WHERE e.nit = :nit"),
    @NamedQuery(name = "Employees.findByName", query = "SELECT e FROM Employees e WHERE e.name = :name"),
    @NamedQuery(name = "Employees.findByFirstSurname", query = "SELECT e FROM Employees e WHERE e.firstSurname = :firstSurname"),
    @NamedQuery(name = "Employees.findBySecondSurname", query = "SELECT e FROM Employees e WHERE e.secondSurname = :secondSurname"),
    @NamedQuery(name = "Employees.findByFirstLevel", query = "SELECT e FROM Employees e WHERE e.firstLevel = :firstLevel"),
    @NamedQuery(name = "Employees.findBySecondLevel", query = "SELECT e FROM Employees e WHERE e.secondLevel = :secondLevel"),
    @NamedQuery(name = "Employees.findByEntryDate", query = "SELECT e FROM Employees e WHERE e.entryDate = :entryDate"),
    @NamedQuery(name = "Employees.findByDelete", query = "SELECT e FROM Employees e WHERE e.delete = :delete"),
    @NamedQuery(name = "Employees.findByTurn", query = "SELECT e FROM Employees e WHERE e.turn = :turn"),
    @NamedQuery(name = "Employees.findBySchedule", query = "SELECT e FROM Employees e WHERE e.schedule = :schedule"),
    @NamedQuery(name = "Employees.findByRestDay", query = "SELECT e FROM Employees e WHERE e.restDay = :restDay")})
public class Employees implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "NIT")
    private String nit;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "first_surname")
    private String firstSurname;
    @Basic(optional = false)
    @Column(name = "second_surname")
    private String secondSurname;
    @Basic(optional = false)
    @Column(name = "first_level")
    private String firstLevel;
    @Basic(optional = false)
    @Column(name = "second_level")
    private String secondLevel;
    @Basic(optional = false)
    @Column(name = "entry_date")
    @Temporal(TemporalType.DATE)
    private Date entryDate;
    @Basic(optional = false)
    @Column(name = "delete")
    private String delete;
    @Basic(optional = false)
    @Column(name = "turn")
    private String turn;
    @Basic(optional = false)
    @Column(name = "schedule")
    private String schedule;
    @Column(name = "rest_day")
    private Integer restDay;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmployees", fetch = FetchType.LAZY)
    private List<Request> requestList;
    @OneToMany(mappedBy = "idEmploye", fetch = FetchType.LAZY)
    private List<HolydaysPe> holydaysPeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmployees", fetch = FetchType.LAZY)
    private List<Holydays> holydaysList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmployees", fetch = FetchType.LAZY)
    private List<Payroll> payrollList;
    @JoinColumn(name = "id_area", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Area idArea;
    @JoinColumn(name = "id_departament", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Department idDepartament;
    @JoinColumn(name = "id_position", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Position idPosition;
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Users idUser;
    @JoinColumn(name = "id_workcenter", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private WorkCenter idWorkcenter;

    public Employees() {
    }

    public Employees(Integer id) {
        this.id = id;
    }

    public Employees(Integer id, String nit, String name, String firstSurname, String secondSurname, String firstLevel, String secondLevel, Date entryDate, String delete, String turn, String schedule) {
        this.id = id;
        this.nit = nit;
        this.name = name;
        this.firstSurname = firstSurname;
        this.secondSurname = secondSurname;
        this.firstLevel = firstLevel;
        this.secondLevel = secondLevel;
        this.entryDate = entryDate;
        this.delete = delete;
        this.turn = turn;
        this.schedule = schedule;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstSurname() {
        return firstSurname;
    }

    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public String getFirstLevel() {
        return firstLevel;
    }

    public void setFirstLevel(String firstLevel) {
        this.firstLevel = firstLevel;
    }

    public String getSecondLevel() {
        return secondLevel;
    }

    public void setSecondLevel(String secondLevel) {
        this.secondLevel = secondLevel;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getDelete() {
        return delete;
    }

    public void setDelete(String delete) {
        this.delete = delete;
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public Integer getRestDay() {
        return restDay;
    }

    public void setRestDay(Integer restDay) {
        this.restDay = restDay;
    }

    public List<Request> getRequestList() {
        return requestList;
    }

    public void setRequestList(List<Request> requestList) {
        this.requestList = requestList;
    }

    public List<HolydaysPe> getHolydaysPeList() {
        return holydaysPeList;
    }

    public void setHolydaysPeList(List<HolydaysPe> holydaysPeList) {
        this.holydaysPeList = holydaysPeList;
    }

    public List<Holydays> getHolydaysList() {
        return holydaysList;
    }

    public void setHolydaysList(List<Holydays> holydaysList) {
        this.holydaysList = holydaysList;
    }

    public List<Payroll> getPayrollList() {
        return payrollList;
    }

    public void setPayrollList(List<Payroll> payrollList) {
        this.payrollList = payrollList;
    }

    public Area getIdArea() {
        return idArea;
    }

    public void setIdArea(Area idArea) {
        this.idArea = idArea;
    }

    public Department getIdDepartament() {
        return idDepartament;
    }

    public void setIdDepartament(Department idDepartament) {
        this.idDepartament = idDepartament;
    }

    public Position getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(Position idPosition) {
        this.idPosition = idPosition;
    }

    public Users getIdUser() {
        return idUser;
    }

    public void setIdUser(Users idUser) {
        this.idUser = idUser;
    }

    public WorkCenter getIdWorkcenter() {
        return idWorkcenter;
    }

    public void setIdWorkcenter(WorkCenter idWorkcenter) {
        this.idWorkcenter = idWorkcenter;
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
        if (!(object instanceof Employees)) {
            return false;
        }
        Employees other = (Employees) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.crudentity.Employees[ id=" + id + " ]";
    }
    
}
