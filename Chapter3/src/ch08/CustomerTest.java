package ch08;

import java.util.ArrayList;

import ch06.Customer;
import ch06.GoldCustomer;
import ch06.VIPCustomer;

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
		if(customerF instanceof VIPCustomer) {//�ش� �ν��Ͻ��� VIPCustomer���� �����.
			//�ش� �ν��Ͻ��� ���� �ν��Ͻ������� Ȯ���ϴ� ����
			VIPCustomer vc = (VIPCustomer)customerF;//Gold������ VIP�� ��ȯ�Ҽ��� ���� (�����Ϸ��� ������ ����)
			System.out.println();
		}
	}

}
