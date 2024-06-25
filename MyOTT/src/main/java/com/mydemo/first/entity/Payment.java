package com.mydemo.first.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name = "payment")
public class Payment {
	

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	@Id
	private String cardName;
	private String cardNumber;
	private int cvv;
	
	public Payment() {
	}

	
	public Payment(int pid, String cardName, String cardNumber, int cvv) {
		super();
		this.pid = pid;
		this.cardName = cardName;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
	}


	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	@Override
	public String toString() {
		return "Payment [pid=" + pid + ", cardName=" + cardName + ", cardNumber=" + cardNumber + ", cvv=" + cvv+" ]";
	}
	
	
	
}
