package ch09;

public class Desktop extends Computer{
	//2���� �߻� �޼ҵ带 �����ؾ� �Ѵ�.//������ ���ҰŸ� �ش� Ŭ������ abstract�� �Ǿߵȴ�.
	//��� �����Ǿ� �ִµ� �߻�Ŭ������ ������ ��� new�� �����Ҽ� ����.
	//��� �����Ǿ� �ִµ� �߻�Ŭ������ ������ ��쿡�� ��ӱ�ɸ��� ���� Ŭ�����̱� ������ ���� �Ұ���(�ν��Ͻ� ���� �Ұ���)
	@Override
	public void display() {
		System.out.println("Desktop display");
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");
	}
	//�̹� ���� Ŭ������ ���ǵ� �޼ҵ带 ������ �ص� �������.
	@Override
	public void turnOff() {
		System.out.println("Desktop turnOff");
	}
	

}
