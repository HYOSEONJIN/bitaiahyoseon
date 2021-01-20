package com.aia.firstspring.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


public class GuestMessage2 {


	private int id;
	private String message;
	private Date regDate;
	
	
	public GuestMessage2() {
	}

	public GuestMessage2(int id, String message, Date regDate) {
		this.id = id;
		this.message = message;
		this.regDate = regDate;
	}
	
	
}
