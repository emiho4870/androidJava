package 상속;

public class 맨 extends 사람 {
	/*
	 * 자식이 부모클래스상속받음
	 */
	
	int power;
	/*
	 * 
	 */
	
	
	public 맨(String name, int age, int power) {
		super(name, age);
		this.power = power;
	}
	
	public void run() {
		eat();
		/*
		 * 부모의 메서드는 자식 클래스에서 바로 호출 가능!
		 */
		System.out.println("빨리달리다.");
	}


	@Override
	public String toString() {
		return "맨 [power=" + power + ", name=" + name + ", age=" + age + "]";
	}

}
