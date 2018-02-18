package com.OnGrid.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="document")
public class Document{

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Column(unique = true, nullable = false)
    private String docNumber;
	
	@Column(unique = false)
    private String fullName;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(unique = false, updatable = true)
    private Date expiry;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(unique = false, updatable = true)
    private Date issueDate;

	@Column(unique = false)
    private String fatherName;

	@Column(unique = false)
    private String address;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(unique = false, updatable = true)
    private Date dob;
	
	@ManyToOne
    private Type types;

	
	@Column(unique = false)
    private String votingState;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDocNumber() {
		return docNumber;
	}

	public void setDocNumber(String docNumber) {
		this.docNumber = docNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getExpiry() {
		return expiry;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getVotingState() {
		return votingState;
	}

	public void setVotingState(String votingState) {
		this.votingState = votingState;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Type getTypes() {
		return types;
	}

	public void setTypes(Type types) {
		this.types = types;
	}
	
}
