package ch02;

public class Customer {
	//�� ���(���, �Ϲ�), ���ʽ� ����Ʈ
	protected int customerID;//�߿������̱� ������ private -> ���� Ŭ�������� ���� �Ҽ� ������ �ܺο��� ���� ���ϰ� ����
	protected String customeName; 
	protected String customeGrade;
	int bonusPoint;
	double bonusRatio;
	
	//String agentID;
	//double saleRatio;//�ش� ����� �߰��ؾ��Ѵ�.(�� �� Ŭ������ �Ϲ� ���� ���� Ŭ������ �ƴϰ� �ȴ�.)

	public Customer() {
		customeGrade = "SILVER";
		bonusRatio = 0.01;
	}
	public int calcPrice(int price) {
		//if(customeGrade == "SILVER")
			bonusPoint += price * bonusRatio;
		//else if(customeGrade == "GOLD")
			//.. //�̷��� �ڵ���� �߰������� �ۼ��ؾ��Ѵ�.(�䱸 ������ �߰��Ǿ��� ������)
			//Ŭ������ ���ϼ��� ��������.
		return price;
	}
	public String showCustomerInfo() {
		return customeName + "���� ����� " + customeGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";  
	}
	public int getCustomerID() {//private�� ��������� ���δ�
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
