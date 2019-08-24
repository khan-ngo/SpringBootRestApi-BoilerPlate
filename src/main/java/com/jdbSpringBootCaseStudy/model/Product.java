package com.jdbSpringBootCaseStudy.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table
//@NamedQueries ({
//@NamedQuery (query="SELECT p FROM Product p", name="queryAllProducts"),
//@NamedQuery(query="SELECT p FROM Product p WHERE p.pCategory = :category", name="queryProductsByCategory")
//})

public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column 
	private int pId;
	private String pCategory;
	private String pDescription;
    private String pImage;
	private String pName;
	private double pPrice;
	private String pServing;
	private String pSummary;
	private String pSize;
	private String pWeight;
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpCategory() {
		return pCategory;
	}
	public void setpCategory(String pCategory) {
		this.pCategory = pCategory;
	}
	public String getpDescription() {
		return pDescription;
	}
	public void setpDescription(String pDescription) {
		this.pDescription = pDescription;
	}
	public String getpImage() {
		return pImage;
	}
	public void setpImage(String pImage) {
		this.pImage = pImage;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getpPrice() {
		return pPrice;
	}
	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	public String getpServing() {
		return pServing;
	}
	public void setpServing(String pServing) {
		this.pServing = pServing;
	}
	public String getpSummary() {
		return pSummary;
	}
	public void setpSummary(String pSummary) {
		this.pSummary = pSummary;
	}
	public String getpSize() {
		return pSize;
	}
	public void setpSize(String pSize) {
		this.pSize = pSize;
	}
	public String getpWeight() {
		return pWeight;
	}
	public void setpWeight(String pWeight) {
		this.pWeight = pWeight;
	}
	
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pCategory=" + pCategory + ", pDescription=" + pDescription + ", pImage="
				+ pImage + ", pName=" + pName + ", pPrice=" + pPrice + ", pServing=" + pServing + ", pSummary="
				+ pSummary + ", pSize=" + pSize + ", pWeight=" + pWeight + "]";
	}
	
	
	
	
}
