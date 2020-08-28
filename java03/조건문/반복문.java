package 조건문;

public class 반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			//3의 배수는 프린트를 안하고 싶음
			if (i % 3 == 0) {
				continue; //3의배수일때 건너뜀 
			}
			System.out.println(i);
		}
	}

}
