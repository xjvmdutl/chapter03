package ch10;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	public void startCar() {
		System.out.println("�õ��� �մϴ�");
	}
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�");
	}
	public void washCar() {//�ش� �޼ҵ�� �߻�޼ҵ尡 �ƴ϶� ���� ������ �ȵȰ��̴�//���� ����.
		//�ʿ��� ��쿡�� �����Ǹ� �ؼ� ���� �Ѵ�.
		//hook�޼ҵ�
	}
	final public void run() {
		//�ش� �帧�� ����Ǹ� �ȵǱ� ������ final ����
		//�ش� �ö󸮿��� ���α׷��Ӱ� ������ �Ұ����ϰ� �� ������ Ŭ������ ��ӹ��� Ŭ�������� �����Ѵ�.
		startCar();
		drive();
		wiper();//�߰� �޼ҵ�//������ �߻�//�߻�޼ҵ带 �߰��� �����ؾߵȴ�
		stop();
		turnOff();
		washCar();
	}
}
