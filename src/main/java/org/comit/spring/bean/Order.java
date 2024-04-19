package org.comit.spring.bean;

import java.util.Date;

public class Order {
	
	int idOrder;
	Date orderDate;
	Date shippedDate;
	int idCustormer;
	int idShipMethod;
	int idOrderStatus;
	
	public int getIdOrder() {
		return idOrder;
	}
	
	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}
	
	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	public int getIdCustormer() {
		return idCustormer;
	}

	public void setIdCustormer(int idCustormer) {
		this.idCustormer = idCustormer;
	}

	public int getIdShipMethod() {
		return idShipMethod;
	}

	public void setIdShipMethod(int idShipMethod) {
		this.idShipMethod = idShipMethod;
	}

	public int getIdOrderStatus() {
		return idOrderStatus;
	}

	public void setIdOrderStatus(int idOrderStatus) {
		this.idOrderStatus = idOrderStatus;
	}
	@Override
	public String toString() {
		return "Order [idOrder=" + idOrder + ", orderDate=" + orderDate + ", shippedDate=" + shippedDate
				+ ", idCustormer=" + idCustormer + ", idShipMethod=" + idShipMethod + ", idOrderStatus=" + idOrderStatus
				+ "]";
	}
	
	
}
