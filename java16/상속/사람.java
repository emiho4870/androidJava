package 상속;

public class 사람 extends Object{
	/*
	 * 멤버변수 , 멤버메서드
	 * 
	 */
	
	String name;
	int age;
	
	public 사람(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	/*
	 * 파라미터생성자 :
	 * 파라미터있는 생성자를 정의하게되면
	 * 파라미터없는 기본생성자는 자동으로 만들어지지 않는다
	 * new 사람(); : 불가 : 파라미터없는 생성자
	 */

	
	/*
	 * name : age
	 */
	
	public void eat() {
		System.out.println("먹다");
	}
	/*
	 * public : eat : 생성
	 */

	@Override
	public String toString() {
		return "사람 [name=" + name + ", age=" + age + "]";
	}
	/*
	 *toString : 재정의 : return
	 */

}
