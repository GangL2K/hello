package f;

public class AllCar {
	
	AllCar(String name) {
		System.out.println("�θ� AllCar ������" + name);
	}
	
	
	
	String carname;
	String color = "������";
	int velocity; //�ӵ�
	
	void speedUp() {
		velocity += 5;
		System.out.println(carname + "����ӵ� : " + velocity);
	}
	
	void speedDown() {
		velocity -= 5;
		System.out.println(carname + "����ӵ� : " + velocity);
	}
	
	void print() {
		System.out.println(carname + color);
	}

}
