package ch14;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calc calc = new CompleteCalc();
		
		calc.description();//����Ʈ �޼ҵ� ���
		//�ν��Ͻ� ������ ������ ��� ����
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));//�������̽� �̸����� �ٷ� ����ϸ�ȴ�
	}

}
