package ch11;

public class CalculatorTest {

	public static void main(String[] args) {
		//�ڹٿ����� ���߻���� �Ұ���(��ȣ���� �߻�)
		//�������̽��� �����ڵ尡 ���� ������ ���߱����� �����ϴ�.
		int num1 = 10;
		int num2 = 2;
		Calc calc = new CompleteCalc();//���������̽��� ������ ���̰� �ش�Ÿ���̴�.
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		//Calc�� ���Ե� �޼ҵ常 �̿��Ҽ� �ִ�.
		//���� CompleteCalc������ �����ߴٸ� showInfo()�޼ҵ嵵 ȣ���Ҽ� �ִ�.
	}

}
