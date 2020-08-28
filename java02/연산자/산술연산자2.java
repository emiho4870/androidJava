package 연산자;

public class 산술연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 200;
		int y = 100;
		//더해봅시다.
		int sum = x + y;
		//자바에서는 int끼리의 계산은 무조건 int!
		double div = y / x;
		//8바이트 double : 공간이더큼 <- 4바이트 int : 넣을수 있음
		System.out.println("두수의 합은" + sum);
		System.out.println("두수의 나눗셈은" + div);
		//자바에서는 하나라도 double이면 무조건 double!
		//하나만 정수를 실수로 강제 변환해서 계산시 사용할 수 있다.
		//강제로 타입을 바꾸는것 : 타입변환(형변환)		
		double div2 = (double)y / x ; //y 를 double로 변환 100.0
		System.out.println("두 수의 나눗셈은" + div2 );
		double div3 = (double)(y / x) ; //y 를 double로 변환 100.0
		System.out.println("두 수의 나눗셈은" + div3 );
	}

}
