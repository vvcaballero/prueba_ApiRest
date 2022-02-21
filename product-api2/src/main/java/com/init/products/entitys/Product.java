package com.init.products.entitys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//######   CLASE Product ######
@Entity
@Table(name="productos")
public class Product {

	// implements Serializable 
	//esto es opcional puede ir enseguida de la clase para que nos de una serial version ID
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id")
	private Long id;
	
	
	
	//@Column(length = 50)
	@Column(name="name", nullable=false,length=30)
	private String name;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name; 
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
