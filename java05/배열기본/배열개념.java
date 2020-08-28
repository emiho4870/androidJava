package 배열기본;

public class 배열개념 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//많은 양의 데이터를 한꺼번에 다룰 때 편리
		int[] jumsu = new int[1000]; //int공간 1000개 설정 // int +int +int +int +int +int +int +int +....int //기본형변수 1000개 //int[] jumsu : jumsu배열
		//참조형 주소 = 기본형 배열
		System.out.println(jumsu);//2F같은 주소가 들어감.
		//int변수 1000개가 모두 이름이 jumsu
        //jumsu를 인덱스(위치값)로 구분
		//첫번째 jumsu는 index는 0! => jumsu[0]
		//두번째 jumsu의 index는 1! => jumsu[1]
		//마지막 jumsu의 index는 전체개수-1 => jumsu[전체개수-1]
		//기본형 변수 : primitive변수 : 기본형 데이터만 저장된 변수
		//						   => 기본형 변수는 변수 안에 해당 타입의 값!이 저장
		//char[] gender //gender배열  = new char[500]; //char + char +char +char +char +char....char
		jumsu[0] = 100;
		jumsu[10] = 200; //9번째 집
		jumsu[999] = 1000; //9번째 집
		//jumsu[1000]은 존재하지 않음.
		System.out.println("첫번째 값: " + jumsu[0]);
		System.out.println("11번째 값: " + jumsu[10]);
		System.out.println("마지막번째 값: " + jumsu[999]);
		System.out.println("500번째 값: " + jumsu[499]);
		for (int i = 0; i < jumsu.length; i++) {
		System.out.println(i + " : " + jumsu[i]);	
		}
		//배열은 자동초기화가 됨!
		String[] names = new String[1000]; //names라는 배열 선언
		System.out.println(names[0]);//null //초기화
		System.out.println(names.length);
		//System.out.println(names[names.length-0]);
		
		
		
		
		//일주일간 온도를 넣은 공간을 만들어서 
				//데이터를 넣고,
				//전체 출력
//				String[] temp = new String[7];
//				
//				temp[0] = "1도";
//				temp[1] = "2도";
//				temp[2] = "3도";
//				temp[3] = "4도";
//				temp[4] = "5도";
//				temp[5] = "6도";
//				temp[6] = "7도";
//				//temp[7] = "8도"; //배열은 6번째까지만 가능
//						
//				System.out.println("월요일온도" + temp[0]);
//				System.out.println("화요일온도" + temp[1]);
//				System.out.println("수요일온도" + temp[2]);
//				System.out.println("목요일온도" + temp[3]);
//				System.out.println("금요일온도" + temp[4]);
//				System.out.println("토요일온도" + temp[5]);
//				System.out.println("일요일온도" + temp[6]);
	}

}










