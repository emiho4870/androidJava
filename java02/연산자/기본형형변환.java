package 연산자;

public class 기본형형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 큰 <- 작 : 자동형변환
		int x = 100; //int는 -21억~21억 //4byte // 공간남음 byte로 사용가능 //
		byte y = 120; //1byte -128~127 //1byte
		x = y;
		System.out.println("x: " + x);
		
		int z = 127;
		//작 <- 큰 : 강제형변환 ()를 사용
		//(자르고 싶은 데이터형)
		byte w = (byte)z;
		
		int q = 1000; //1000은 2byte //int에서 byte로 형변환 불가
		//byte t = q;
		//강제형변환하는 경우는
		//강제로 변환하고자 하는 타입범위에
		//값이 들어가야한다
		
//		byte x = 100;
//		int y = x; // 자동형변환 byte < int
//
//		
//		int x = 300;
//		byte y = x ; // *자동형변환불가 byte 범위 이상임 //int > byte
//
//		
//		double x = 400;  // double : 8byte
//		int y = (int)x;  // *강제형변환 // int : 4byte
//
//		
//		
//		int x = 400;
//		double y = x; //자동형변환 // int < double

		
		
		
	}

}
