package 상속;

public class Truck extends Car {

	
	String color;

	
	public void runrun() {
		run();

		System.out.println("빨리달리다.");
	}

	@Override
	public String toString() {
		return "truck [color=" + color + ", name=" + name + ", age=" + age + "]";
	}

	
}
