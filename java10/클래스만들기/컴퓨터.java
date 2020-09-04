package 클래스만들기;

public class 컴퓨터 {
	//상태정의 => 멤버변수 , 전역변수(global변수 , 글로벌 변수)
	//겍체 생성후 , 멤버변수는 객체마다 다 별도로 복사 되게 된다
	//복사된 멤버변수에는 생성된 객체의 실제값이 들어가게 된다
	//멤버변수는 실제값이 들어가는 변수 ("인스턴스 변수")
	//전역변수 => 클래스 전체 영역에서 사용 가능
	//변수는 선언의 위치가 중요
	//선언의 위치가 이 변수를 쓸 수 있는 범위를 경정
	
	public int price; //가격 //public : package상이할경우 // 접근제어
	public String company; // 제조회사
	public int size;
	
	//동작정의 => 멤버메서드
	public void internet() {
		System.out.println("인터넷하다");
	}
	
	public void doc() {
		System.out.println("문서작성하다");
	}

	//원래 toSting()는 기초형이면 기초형값 , 참조형이면 주소를 찍어주는 참조형값
	//toString()은 내가 원하는 프린트모양대로 변경해서 사용할 수 있다
	//코드 자동생성
	//System.out.println(com1); //주소입력시 츨력됨
	//System.out.println(com2);
	@Override //source : toString : @override : 덮어씀
	public String toString() {
		return "price=" + price + ", company=" + company + ", size=" + size ;
	}
}
