package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<>();
		Customer customerT = new Customer(10010,"Tomas");
		Customer customerJ = new Customer(10020,"James");
		Customer customerF = new GoldCustomer(10030,"Fdward");
		Customer customerP = new GoldCustomer(10040,"Percy");
		Customer customerK = new VIPCustomer(10050,"Kim");
		customerList.add(customerT);
		customerList.add(customerJ);
		customerList.add(customerF);
		customerList.add(customerP);
		customerList.add(customerK);
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());//����Ŭ���� �޼ҵ�
		}
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);//������ ������ �ٸ��� ����Ǵ°� Ȯ���� �����ϴ�(������)
			System.out.println(customer.getCustomerName() + "���� "+cost+"�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName() + "���� ���� ���ʽ� ����Ʈ�� "+customer.bonusPoint+"�Դϴ�.");
		}
	}

}
