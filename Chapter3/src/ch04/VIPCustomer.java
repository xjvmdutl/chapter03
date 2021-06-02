package ch04;

public class VIPCustomer extends Customer {

	double salesRatio;
	String agentID;
	/*
	public VIPCustomer() {
		super(0,"no name");
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customeGrade = "VIP";
		
	}
	*/
	
	public VIPCustomer(int customerID, String customeName) {
		super(customerID, customeName);
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customeGrade = "VIP";
	}
	
	
	public String getAgentID() {
		return agentID;
	}
	//override ��� 1) copy 2) source->overriding(��Ŭ���� ����)
	@Override//������̼�, �� �޼ҵ�� �������̵� �޼ҵ�, �����Ϸ��� �������̵� �޼ҵ带 ������ִ°�
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;//������ ����� ���� ����Ѵ�.
	}
	

}
