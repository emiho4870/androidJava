package 상속;

public class 수퍼맨사용 {
	
	/*
	 * 손자 수퍼맨사용
	 */

	public static void main(String[] args) {
		
		수퍼맨 s = new 수퍼맨(true,10000,"클라크",1000);
		
		/*
		 * override 사용
		 */
		
		System.out.println(s);
		s.eat();
		/*
		 * 불러오기
		 */
		s.run();
		/*
		 * public void run() {
		 * eat();
		 * 부모의 메서드는 자식 클래스에서 바로 호출 가능!
		 * System.out.println("빨리달리다."); }
		 */
		s.space();

	}

}
