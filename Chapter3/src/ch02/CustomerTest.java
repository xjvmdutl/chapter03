package ch02;

public class CustomerTest {

	public static void main(String[] args) {
		/*
			Customer customerLee = new Customer();
			customerLee.setCustomeName("�̼���");
			customerLee.setCustomerID(10010);
			customerLee.bonusPoint = 1000;
			System.out.println(customerLee.showCustomerInfo());
		*/
		
		VIPCustomer customerKim = new VIPCustomer();//VIP�� ���µ��� ����� �ִ�(�޸𸮿� Customer�� ������ ��ٴ� ���̴�)
		customerKim.setCustomerName("������");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());//customer������ ����� �޾� ��밡��
	}

}
