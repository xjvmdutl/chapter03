package ch15;

import java.util.ArrayList;

public class Shelf {
	//������� �ڷḦ �ֱ����� Arraylist
	protected ArrayList<String> shelf;
	public Shelf() {
		shelf = new ArrayList<>();//�ɹ����� �ʱ�ȭ
	}
	public ArrayList<String> getShelf(){
		return shelf;
	}
	public int getCount() {
		return shelf.size();
	}
}
