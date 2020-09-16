package 상속;


public class Car extends Object{
	
	
	String name;
	int age;
	
	
	public void run() {
		System.out.println("운전하다");
	}


	@Override
	public String toString() {
		return "car [name=" + name + ", age=" + age + "]";
	}

}
