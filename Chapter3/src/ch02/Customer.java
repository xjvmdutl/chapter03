package ch02;

public class Customer {
	//�� ���(���, �Ϲ�), ���ʽ� ����Ʈ
	protected int customerID;//�߿������̱� ������ private -> ���� Ŭ�������� ���� �Ҽ� ������ �ܺο��� ���� ���ϰ� ����
	protected String customerName; 
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	//String agentID;
	//double saleRatio;//�ش� ����� �߰��ؾ��Ѵ�.(�� �� Ŭ������ �Ϲ� ���� ���� Ŭ������ �ƴϰ� �ȴ�.)

	public Customer() {
		customerGrade = "SILVER";
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
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";  
	}
	public int getCustomerID() {//private�� ��������� ���δ�
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
}
