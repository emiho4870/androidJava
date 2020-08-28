package 클래스만들기;

public class 내방 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		휴대폰 p1 = new 휴대폰();
		//color , size , company 멤버변수 복사 => 자동초기화
		//p1변수 생성 => 멤버변수들을 가르키는 주소
		
		System.out.println(p1.color); //공간만생성시 자동초기화 : null
		System.out.println(p1.size); //공간만생성시 자동초기화 : 0
		System.out.println(p1.company); //공간만생성시 자동초기화 : null
		
//		p1.color = "흰색" ; // class 에서 타입설정완료
//		p1.size = 7;
//		p1.company = "삼성";
		
		// . : 접근연산자
		
		System.out.println("p1휴대폰의 색은"+ p1.color);
		System.out.println("p1휴대폰의 크기는"+ p1.size);
		System.out.println("p1휴대폰의 브랜드는"+ p1.company);
		
		p1.문자하다();
		
		휴대폰 p2 = new 휴대폰();
		p2.color = "빨강" ; // class 에서 타입설정완료
		p2.size = 11;
		p2.company = "애플";
		
		System.out.println("p1휴대폰의 색은"+ p2.color);
		System.out.println("p1휴대폰의 크기는"+ p2.size);
		System.out.println("p1휴대폰의 브랜드는"+ p2.company);
		
		p2.전화하다();
		
		
		
		강아지 d1 = new 강아지();
		d1.color = "갈색";
		d1.dot = 5;
		d1.gender = "암컷";
		
		System.out.println("d1강아지의 색은" + d1.color);
		System.out.println("d1강아지의 점갯수는" + d1.dot);
		System.out.println("d1강아지의 종은" + d1.gender);
		
		d1.먹다(); // class 값 받아옴
		
		
		강아지 d2 = new 강아지();
		d2.color = "블랙";
		d2.dot = 10;
		d2.gender = "수컷";
		
		System.out.println("d1강아지의 색은" + d2.color);
		System.out.println("d1강아지의 점갯수는" + d2.dot);
		System.out.println("d1강아지의 종은" + d2.gender);
		
		d2.짖는다();
	}

}
