package 제어문;

public class 반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0; //초기값설정 //int count : count++ : 쓰레기값
		for(int i=0; i<100; i++) {
			//System.out.println(i % 2 == 0); // 조건확인
			if (i % 4 == 0) { //짝수만표시해라 //% 짝수 == 0
				System.out.println(i);
				count++;
				
			}
		}
	}

}
