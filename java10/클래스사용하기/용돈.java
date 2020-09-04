package 클래스사용하기;

import 클래스만들기.용돈계산기;

public class 용돈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기간 6개월
		//한달 용돈 100000
		
		//6개월 용돈 금액이 50 만원이 안되면 : 15 만원 +
		//6개월 용돈 금액이 50만원이 넘으면  : same
		
		
		//12개월 용돈 출력
		//상반기 : 60만원
		//하반기 : 50만원
		
		용돈계산기 pay = new 용돈계산기();
		int 개월수 = 6;
		int 용돈 = 100000;
		
		pay.mul(개월수 , 용돈); //6개월 용돈 총금액 계산 : 6 , 100000
		int sum = pay.mul(개월수, 용돈); // sum 변수에 저장 : 비교대상 변수
		if (sum < 50) {
			System.out.println("6개월 용돈이 50만원을 넘지않으므로" + (sum + 150000)+"원");
		}else {
			System.out.println("6개월 용돈이 50만원이 넘으므로"+ sum + "원");
		}
		
		pay.add(개월수, 용돈);
		
	

	}

}
