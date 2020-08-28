package 조건문;

public class 연습문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		for(int i=1; i<=5; i++) { 
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=(5-i); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
		