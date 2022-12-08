package com.craftsman.training.tablas;

public class Departamento {

	private int deptno;
	private String dname;
	private String loc;

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Departamento(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public Departamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Departamento [deptno=" + deptno + ", dname=" + dname + ", loc="
				+ loc + "]";
	}

}
