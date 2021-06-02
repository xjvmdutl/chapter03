package ch04;

public class Customer {

	protected int customerID;
	protected String customeName; 
	protected String customeGrade;
	int bonusPoint;
	double bonusRatio;
	/*
	public Customer() {
		customeGrade = "SILVER";
		bonusRatio = 0.01;
	}*/
	public Customer(int customerID,String customeName) {
		this.customerID = customerID;
		this.customeName = customeName;
	}
	//고객이 반환하는 값을 재정의 해야한다.
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	public String showCustomerInfo() {
		return customeName + "님의 등급은 " + customeGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";  
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomeName() {
		return customeName;
	}
	public void setCustomeName(String customeName) {
		this.customeName = customeName;
	}
	public String getCustomeGrade() {
		return customeGrade;
	}
	public void setCustomeGrade(String customeGrade) {
		this.customeGrade = customeGrade;
	}
	
}
