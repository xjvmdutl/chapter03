package ch02;

public class VIPCustomer extends Customer {//���� ��� Ȯ���� ���� ���� ������ ����� �޴°� ����.
	/* �ش� �Ӽ��� �ʿ� �ϴ�. */
	//private int customerID;
	//private String customeName;
	//private String customeGrade;
	//int bonusPoint;
	//double bonusRatio;
	/* �߰� �Ӽ� */
	double salesRatio;
	String agentID;
	
	public VIPCustomer() {
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customeGrade = "VIP";//private �Ӽ��̱⶧���� ������ ����(
	}
	public String getAgentID() {
		return agentID;
	}
}
