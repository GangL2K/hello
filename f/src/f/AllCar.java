package f;

public class AllCar {
	
	AllCar(String name) {
		System.out.println("부모 AllCar 생성자" + name);
	}
	
	
	
	String carname;
	String color = "검정색";
	int velocity; //속도
	
	void speedUp() {
		velocity += 5;
		System.out.println(carname + "현재속도 : " + velocity);
	}
	
	void speedDown() {
		velocity -= 5;
		System.out.println(carname + "현재속도 : " + velocity);
	}
	
	void print() {
		System.out.println(carname + color);
	}

}
