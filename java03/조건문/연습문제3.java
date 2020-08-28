package 조건문;

public class 연습문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		for (int i = 2; i < 10; i++) {
			if (i % 2 == 1) { //2로 나누었을때 몫이 1이되는 홀수단은 continue로 제외시킴
				continue;
			}

			for (int j = 1; j < 10; j++) { //for문 안에 for문 추가해서 곱해지는 수에대해 초기값 끝값 증가값을 설정 
				System.out.println(i + " * " + j + "=" + (i * j));
			}
			//System.out.println("\n");
		}
	}
}
