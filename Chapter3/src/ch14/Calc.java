package ch14;

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;
	int add(int num1,int num2);
	int substract(int num1,int num2);
	int times(int num1,int num2);
	int divide(int num1,int num2);
	
	//default�޼ҵ� ����
	//��Ģ������ �Ϸ��� �ؾߵǴ� ����� �ۼ�
	default void description() {
		System.out.println("������ ��Ģ������ �����մϴ�.");
		myMethod();
	}
	//static �޼ҵ� ����
	static int total(int[] arr) {//�迭�� ������ �迭�� �Ѱ��
		int total = 0;
		for(int num : arr) {
			total += num;
		}
		myStaticMethod();
		return total;
	}
	//private �޼ҵ�
	private void myMethod() {//private �޼ҵ�� ������ �Ҽ� ����
		System.out.println("myMethod");
	}
	//static private �޼ҵ� 
	private static void myStaticMethod() {
		System.out.println("myStaticMethod");
	}
}
