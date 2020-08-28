package 영화예매배열;

import java.util.Scanner;

public class 올림픽순위 { //랜덤배열적용

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("++++++++++++++++++++");
		System.out.println("나라별 종목 메달을 입력하세요");
		System.out.println("금)3 은)2 동)1");
		System.out.println("++++++++++++++++++++");
		
		int count = 0;
		
		for (int i = 0; i < 3; i++) {
			
			
			System.out.print("나라이름 : ");
			String nation = scan.next();
			System.out.print("피겨메달은  :");
			int fi = scan.nextInt();
			count++;
			System.out.print("스키 메달은  :");
			int sk = scan.nextInt();
			count++;
			System.out.print("스피드스케이팅의 메달은  :");
			int sp = scan.nextInt();
			count++;
			System.out.print("쇼트트랙의 메달은  :");
			int sh = scan.nextInt();
			count++;
			System.out.print("스켈레톤의 메달은  :");
			int skel = scan.nextInt();
			count++;
			
			
			// int score = 0; score++ 조건성립시 누적되라  
			int score = fi + sk + sp + sh + skel ;
			
			System.out.println(nation + "의 메달 획득총점은" + score + "점 입니다"); //국가별 메달 점수 출력 //순위매기는기준

			if (fi != 0 || sk!= 0 || sp!= 0 || sh != 0 || skel != 0) {
				System.out.println(nation + "의 메달획득 수는"+ count + "입니다");
			}
		}
		
	

//<올림픽>
//출전국가 : 한국, 중국, 일본
//출전종목 : 피겨(figure), 스키(ski), 스피드스케이팅(speed), 쇼트트랙(short), 스켈레톤(skel)
//최종점수 :
//
//1. 종목별 순위 출력
//2. 국가별 메달 수 출력
//3. 최종 등수 출력
//
//각나라당 종목5개
//승/패 
//각나라당 이긴 종목 횟수

	}

}
