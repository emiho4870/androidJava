package 클래스만들기; //main method

public class 계산기2 {
	//각 부품을 기능을 정의할 때는 메서드를 쓴다
	//메서드의 입력값 잠깐 저장할 용도로 선언된 변수
	//메서드의 사용과 처리의 중간 다리역할을 변수 : 매개변수 ( parameter : 파라미터)
	
	public void add(int x , int y) { //void ==  없다 : 가지고올수있는 값이 없음을 대체
		//x , y변수는 add메서드 지역에서만 쓸 수 있는 지역변수
		//local 변수 , 로컬변수
		//지역변수는 자동초기화 되지 않음 : 전역변수는 자동초기화가능 : 사용되는 범위에 따라
		
		//(int x , int y) : add안에서만 잠깐 사용
		//instance : 멤버변수 : new마다 복사
		int result = x + y; //변수설계
		System.out.println("합은 :" + result); //변수입출력
	}
	public void minus() {
	
	}
	public int mul(int x , int y) { // ( 화분 , 화분가격)
		int result = x * y;
		return result; //30000 // void삭제 : return : 타입int 
	}
	public void div() {
	
	}
}
