package ch03;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010,"�̼���");
		customerLee.bonusPoint=1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020,"������");//VIPCustomerȣ���� Customer�� ���� ȣ��ȴ�.
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		//���� Ŭ������ �����ɶ� �ݵ�� ����Ŭ���� �����ڰ� �����ȴ�.
		//���� �����ڸ� ���� �������� ������� ����Ʈ �����ڸ� �����ϰ� �Ű������� �ִ� �����ڸ� ȣ���ϸ� ���� �����ڸ� ȣ�� ���־�� �Ѵ�.
		
		Customer vc = new VIPCustomer(12345,"noname");
		//vip�� ���������� customer �� �������� �ִ�.
		//�� Ÿ���� customer�̱� ������ customer���� ����Ҽ��ִ�.
		//�ν��Ͻ��� ��� ������ �Ǿ����� ���������� customer���̱� ������ customer���� ����Ҽ��ִ�. 
	}

}
