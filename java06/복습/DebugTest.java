package 복습;

public class DebugTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; //int 변수 초기값
		for (int i = 0 ; i < 10 ; i++) {
			sum = sum + i ; // 누적계산
		}
		System.out.println(sum); //for{} 밖
	}

}
