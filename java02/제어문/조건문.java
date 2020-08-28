package 제어문;

public class 조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//조건이 여러개 일 때, if~else if~....~else
		//				 if,if,if,if,...
		int jumsu = 88;
		if (jumsu >= 90) {
			System.out.println("A");
		}else if (jumsu >= 80) {
			System.out.println("B");
			
		}else if (jumsu >= 70) {
			System.out.println("C");
			
		}else if (jumsu >= 60) {
			System.out.println("D");
		}else { //else(조건생략:나머지)
			System.out.println("F");
		}
	}

}
