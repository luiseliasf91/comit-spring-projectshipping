package org.comit.spring.bean;


public class Admin {
	
	int idAdmin;
	String nameAdmin;
	String descripcionAdmin;
	String statusAdmin;

	public int getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}

	public String getNameAdmin() {
		return nameAdmin;
	}

	public void setNameAdmin(String nameAdmin) {
		this.nameAdmin = nameAdmin;
	}

	public String getDescripcionAdmin() {
		return descripcionAdmin;
	}

	public void setDescripcionAdmin(String descripcionAdmin) {
		this.descripcionAdmin = descripcionAdmin;
	}

	public String getStatusAdmin() {
		return statusAdmin;
	}

	public void setStatusAdmin(String statusAdmin) {
		this.statusAdmin = statusAdmin;
	}
	@Override
	public String toString() {
		return "Admin [idAdmin=" + idAdmin + ", nameAdmin=" + nameAdmin + ", descripcionAdmin=" + descripcionAdmin
				+ ", statusAdmin=" + statusAdmin + "]";
	}
		

}
