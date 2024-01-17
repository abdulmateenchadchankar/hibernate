package com.zettamine.hibernate.entity;

public class Employee {
	private Integer eId;
	private String eName;
	private Double eSal;
	public Employee(Integer eId, String eName, Double eSal) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSal = eSal;
	}
	
	
	
	public Employee(Integer eId) {
		super();
		this.eId = eId;
	}



	public Employee(String eName, Double eSal) {
		super();
		this.eName = eName;
		this.eSal = eSal;
	}



	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSal=" + eSal + "]";
	}



	public Integer geteId() {
		return eId;
	}
	public void seteId(Integer eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Double geteSal() {
		return eSal;
	}
	public void seteSal(Double eSal) {
		this.eSal = eSal;
	}
	
	

}
