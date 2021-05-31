package ch02;

public class Customer {
	//고객 등급(우수, 일반), 보너스 포인트
	protected int customerID;//중요정보이기 떄문에 private -> 하위 클래스에서 접근 할수 있지만 외부에서 접근 못하게 변경
	protected String customeName; 
	protected String customeGrade;
	int bonusPoint;
	double bonusRatio;
	
	//String agentID;
	//double saleRatio;//해당 기능을 추가해야한다.(단 이 클래스는 일반 고객에 관한 클래스가 아니게 된다.)

	public Customer() {
		customeGrade = "SILVER";
		bonusRatio = 0.01;
	}
	public int calcPrice(int price) {
		//if(customeGrade == "SILVER")
			bonusPoint += price * bonusRatio;
		//else if(customeGrade == "GOLD")
			//.. //이러한 코드들이 추가적으로 작성해야한다.(요구 조건이 추가되엇기 때문에)
			//클래스의 단일성이 무너진다.
		return price;
	}
	public String showCustomerInfo() {
		return customeName + "님의 등급은 " + customeGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";  
	}
	public int getCustomerID() {//private는 노란색으로 보인다
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomeName() {
		return customeName;
	}
	public void setCustomeName(String customeName) {
		this.customeName = customeName;
	}
	public String getCustomeGrade() {
		return customeGrade;
	}
	public void setCustomeGrade(String customeGrade) {
		this.customeGrade = customeGrade;
	}
	
}
