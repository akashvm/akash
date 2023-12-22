package com.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "manager")


public class ManagerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int managerId;
	private String name;
	private int salary;
	private int exp;
	
	@OneToMany(targetEntity = StaffEntity.class,cascade=CascadeType.ALL)
    @JoinColumn(name="manager_id",referencedColumnName="managerId")
	private List<StaffEntity> staffs;

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public List<StaffEntity> getStaffs() {
		return staffs;
	}

	public void setStaffs(List<StaffEntity> staffs) {
		this.staffs = staffs;
	}
	




}
