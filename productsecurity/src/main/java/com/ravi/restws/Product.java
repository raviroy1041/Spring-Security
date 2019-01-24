package com.ravi.restws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name ="product")
public class Product {

	private long id;
	private String discription;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
}
