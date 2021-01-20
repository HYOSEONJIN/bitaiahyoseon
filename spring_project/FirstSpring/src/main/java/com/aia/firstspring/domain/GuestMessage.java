package com.aia.firstspring.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder = {"id", "message", "regDate"})
public class GuestMessage {


	private int id;
	private String message;
	private Date regDate;
	
	
	public GuestMessage() {
	}

	public GuestMessage(int id, String message, Date regDate) {
		this.id = id;
		this.message = message;
		this.regDate = regDate;
	}
	
	
}
