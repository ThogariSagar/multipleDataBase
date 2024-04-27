package com.example.demo.Orderenity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="baggaes")
public class Order {
	@Id
	int id;
	
	private Date orderdate;
	private String location;
	
	public Order() {
		
	}
	public Order(int id, Date orderdate, String location) {
		super();
		this.id = id;
		this.orderdate = orderdate;
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

}
