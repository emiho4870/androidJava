package 형변환Casting;

import java.util.ArrayList;

public class 참조형형변환 {

	public static void main(String[] args) {
		//상속관계에서만 형변환 가능(Casting, 캐스팅) 가능
		//Car(부모, 수퍼) <- Truck(자식, 서브) 상속
		//클래스간의 대소비교할 때ㅐ는 개념적으로 접근
		// 부모클래스가 크고, 자식클래스가 작다
		ArrayList a = new ArrayList();
		//모든 타입을 묶을 수 있음. 크기가 유동
		a.add("홍길동");
		// Object(큰) <- String(작) : 자동형변환
		//업캐스팅 (UpCasting)
		a.add(100);
		a.add(11.22);
		a.add(true);
		a.add('A');
		a.add(new VO());
		
		System.out.println("목록 내용 : " + a);
		
		//업캐스팅(자동형변환)으로 String을 Object으로 형변환하여 넣은 것은
		//꺼냈을 때 Object꺼내면 String에서 추가된 기능을 쓸 수 없다.
		//꺼낼 때, String(작은)으로 형변환하여 꺼내야한다.
		//강제형변환, down casting(다운캐스팅)
		String s =(String) a.get(0);
		int age = (Integer) a.get(1);
		//기본형 <- 오토언박싱 <- Integer <- 다운캐스팅 <- Object
	}

}
