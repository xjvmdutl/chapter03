package ch03;

public class VIPCustomer extends Customer {
//	���� ��� Ȯ���� ���� ���� ������ ����� �޴°� ����.

	double salesRatio;
	String agentID;
	/*
	public VIPCustomer() {
		//Customer�� ��ӹޱ� ������ ���� Ŭ������ �����ڸ� ȣ���Ѵ�(����Ʈ ������) = super() 
		//super();//���� Ŭ������ ���� Ŭ������ �ν��Ͻ��� ���� ���� ������
		//���� Ŭ���� ������ ȣ���ϴ� �ڵ尡 ���� ��� super()�� �ڵ� ȣ��
		//���� Ŭ������ defualt �����ڰ� �ƴҰ�� ������ ���� super() �޼ҵ带 ȣ���ؾ��Ѵ�.
		//super(customerID, agentID);
		//���� Ŭ������ �����ڸ� ��������� ȣ���ؾ� �ȴ�.
		super(0,"no name");
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customeGrade = "VIP";
		
		System.out.println("VIPCustomer() Call");//�α�

	}
	*/
	
	public VIPCustomer(int customerID, String customeName) {
		super(customerID, customeName);
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customeGrade = "VIP";
		System.out.println("VIP(int,String) call");
	}
	public String getAgentID() {
		return agentID;
	}
}
