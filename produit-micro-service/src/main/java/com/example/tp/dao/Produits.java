package com.example.tp.dao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Produits implements Serializable {
	@Id 
	@GeneratedValue
	private Long id;
	private String designation;
	private double prix;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Produits(Long i, String designation, double prix) {
		super();
		this.id = i;
		this.designation = designation;
		this.prix = prix;
	}
	
	
	

}
