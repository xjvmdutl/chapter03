package ch06;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
	public void eating() {//�� �޼ҵ�� ��� ����Ҽ� �ִ�. ������
		//������ : �ٸ�Ŭ�������� �������°��� �ϳ������� �پ��ϰ� ����� �����ϴ�.
		
	}
}
class Human extends Animal{
	@Override
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}
class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}
class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("�������� �ϴ��� ���� �ٴմϴ�.");
	}
	public void flying() {
		System.out.println("�������� �糯���� �� ��� ���ƴٴմϴ�.");
	}
}
public class AnimalTest {

	public static void main(String[] args) {
		//�� Ŭ�������� �������� ���� �׽�Ʈ �޼ҵ�
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
//		AnimalTest test = new AnimalTest();
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);

		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		for(Animal animal : animalList) {
			animal.move();//� animal�̳Ŀ� ���� �ٸ��� �����Ѵ�.
		}
	}
	public void moveAnimal(Animal animal) {
		//�ڵ�� ���������� � ������ ���� ���³Ŀ� ���� move�� ������ �޶�����.
		//���� Ŭ������ ����ȯ�� �Ͼ��.
		//���� Ŭ������ ����Ŭ���� �ϳ��� �ڵ鸵 �� �� �ִ�.
		//����Ŭ������ �ٲٰ� �Ǹ� ����Ŭ������ �ٲ� �� �ֱ� ������ �����ؼ� ����ؾ��Ѵ�.	
		animal.move();
		//��, human,tiger���� ���� ���� �޼ҵ�� ���Ұ���
		
	}

}
