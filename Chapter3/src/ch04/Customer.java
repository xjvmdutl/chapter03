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
	//���� ��ȯ�ϴ� ���� ������ �ؾ��Ѵ�.
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	public String showCustomerInfo() {
		return customeName + "���� ����� " + customeGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";  
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
