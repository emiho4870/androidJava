package 배열응용;


public class 배열정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] 나이 = { 99, 65, 65, 76, 100, 88, 33, 24, 10 };
		// 배열 복사할때는 clone()함수 사용 // 자바 : 함수 : 메서드
		// 깊은복사, 배열은 깊은복사를 해야한다
		int[] 나이2 = 나이.clone(); // = : ram에 넘겨 저장 // clone : 복제
		// 총 변수 갯수 20개

		for (int x : 나이) { // tab
			System.out.println(x + "");
		}
		System.out.println();
		
		나이2[0] = 999; // 깊은복사를 해야 배열이 따로따로 만들어진다
		
		for (int x : 나이2) {
			System.out.println(x + "");
		}
		System.out.println("\n------------------------------------");

		
		
		
		
		
//		// ---------------------------------------------------------
//
//		Arrays.sort(나이); // 오름정렬
//		// 파괴함수(0), 비파괴함수
//		// 기능 : function : 함수
//
//		for (int x : 나이) { // foreach
//			System.out.println(x + ""); // + "" : 줄바꿈
//		}
	}

}
