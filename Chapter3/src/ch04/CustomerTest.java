package ch04;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010,"�̼���");
		customerLee.bonusPoint=1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo() + price);
		
		VIPCustomer customerKim = new VIPCustomer(10020,"������");//VIPCustomerȣ���� Customer�� ���� ȣ��ȴ�.
		customerKim.bonusPoint = 10000;
		price = customerKim.calcPrice(1000);
		System.out.println(customerKim.showCustomerInfo() + price);
		
		Customer vc = new VIPCustomer(12345, "noname");
		
		System.out.println(vc.calcPrice(1000));//�ش� �Լ��� � �޼ҵ带 ȣ���ұ�?
		//�ν��Ͻ��� �޼ҵ带 ȣ���Ѵ�. //�����Լ�,����޼ҵ�
		
	}

}
