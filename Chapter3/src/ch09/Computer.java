package ch09;

public abstract class Computer {//abstract�� �����ϰ� ������ abstract�� �����϶�� ������ ���
	public abstract void display();//�߻�޼ҵ�//���� ���� �����ű� ������ abstract�� �߰�
	public abstract void typing();
	//display,typing�� Computer�� ���� ���Ѵ�, �������� �� �޼ҵ常 �˰� �ִ�.
	//���� Ŭ�������� �� å���� �����Ѵ�.
	//computer�� �������� �ʰ� ����Ŭ�������� ������ �ض�...
	//�߻� Ŭ������ ����� ���� Ŭ�����̴�.
	
	
	public void turnOn() {//�ش� �޼ҵ�� ������ �����ϴ�.
		System.out.println("������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
