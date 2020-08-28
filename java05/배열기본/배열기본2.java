package 배열기본;

public class 배열기본2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열은 일반적으로 같은 타입을 묶을 때 사용! // string 자료형 이나 char등 다른 기본형은 배열에 사용잘안함
		//다양한 타입을 묶을 때는 배열을 쓰지 않음!
		//배열은 고정된 크기를 가진다(크기 조절 불가능) // 고정된크기 : 단일타입
		int[] temp = new int[7];
		temp[0] = 10;
		temp[1] = 20;
		temp[2] = 30;
		temp[3] = 40;
		temp[4] = 50;
		temp[5] = 60;
		temp[6] = 70;
		
		for (int i = 0; i < temp.length; i++) {// temp.length : 읽기전용변수
			System.out.println((i + 1) + "일차: " + temp[i]); //자동
			
		}
		
		
		String s ="홍길동"; // s : 주소 
		System.out.println(s.charAt(0));
		
		
		
		
	}

}
